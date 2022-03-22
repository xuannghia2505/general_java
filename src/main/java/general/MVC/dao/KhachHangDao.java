/*
 * (C) Copyright 2022 Fresher Academy. All Rights Reserved
 *
 * @author NghiaHX
 * @birthDate 25/05/2000
 * @date 2022-03-18
 * version 1.0
 */
package general.MVC.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import general.MVC.bean.KhachHang;



public class KhachHangDao {
	Connection conn =null;
	PreparedStatement ps = null;
	ResultSet rs= null;
	
	public ArrayList<KhachHang> getAllKhachHang() throws SQLException {
		ArrayList<KhachHang> listKH= new ArrayList<KhachHang>();
	try {
		conn =  new DBConnect().getConnection();

		String query = "select * from KHACHHANG";
		PreparedStatement ps = conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			listKH.add(new KhachHang(rs.getNString(1),rs.getNString(2),rs.getNString(3),rs.getNString(4),rs.getNString(5)));
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		if(rs!=null) {
			rs.close();
		}
		if(ps!=null) {
			ps.close();
		}
		if(conn!=null) {
			conn.close();
		}	
    	
	}
	return listKH;
	}
	public KhachHang getKHById(String makh) throws SQLException {
		KhachHang kh= null;
	try {
		conn =  new DBConnect().getConnection();

		String query = "select * from KHACHHANG where MaKH=?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, makh);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			kh=new KhachHang(rs.getNString(1), rs.getNString(2), rs.getNString(3), rs.getNString(4), rs.getNString(5));
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		if(rs!=null) {
			rs.close();
		}
		if(ps!=null) {
			ps.close();
		}
		if(conn!=null) {
			conn.close();
		}	
    	
	}
	return kh;
	}
	public int getSoPageKH() throws SQLException {
		int soPage=0;
	try {
		conn =  new DBConnect().getConnection();

		String query = "select count(1) from KHACHHANG";
		PreparedStatement ps = conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			soPage=rs.getInt(1);
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		if(rs!=null) {
			rs.close();
		}
		if(ps!=null) {
			ps.close();
		}
		if(conn!=null) {
			conn.close();
		}	
    	
	}
	return soPage/4+1;
	}
	public int getSoPageKHOfKey(String key) throws SQLException {
		int soPage=0;
	try {
		conn =  new DBConnect().getConnection();

		String query = "select count(1) from KHACHHANG where MaKH like ? ";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, "%"+key+"%");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			soPage=rs.getInt(1);
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		if(rs!=null) {
			rs.close();
		}
		if(ps!=null) {
			ps.close();
		}
		if(conn!=null) {
			conn.close();
		}	
    	
	}
	return soPage/4+1;
	}
	public ArrayList<KhachHang> getKHbyPage(int page,String key) throws SQLException {
		int startItem= (page-1)*4;
		ArrayList<KhachHang> listKH= new ArrayList<KhachHang>();
	try {
		conn =  new DBConnect().getConnection();

		String query = "SELECT * FROM KHACHHANG  WHERE MaKH like ?  ORDER BY MaKH OFFSET ? ROWS FETCH NEXT 4 ROWS ONLY";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, "%"+key+"%");
		ps.setInt(2, startItem);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			listKH.add(new KhachHang(rs.getNString(1),rs.getNString(2),rs.getNString(3),rs.getNString(4),rs.getNString(5)));
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		if(rs!=null) {
			rs.close();
		}
		if(ps!=null) {
			ps.close();
		}
		if(conn!=null) {
			conn.close();
		}	
    	
	}
	return listKH;
	}
	public int  insertKhachHang(String makh, String tenkh, String diachi,String sdt,String email) throws SQLException {
		int flag= -1;
		String query = "insert into KHACHHANG(MaKH,TenKH,DiaChi,SoDienThoai,DiaChiEmail)\r\n" + 
				"values(?,?,?,?,?)";
		try {
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(query);
			ps.setNString(1, makh);
			ps.setNString(2, tenkh);
			ps.setNString(3, diachi);
			ps.setNString(4, sdt);
			ps.setNString(5, email);
			
			flag= ps.executeUpdate();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(rs!=null) {
				rs.close();
			}
			if(ps!=null) {
				ps.close();
			}
			if(conn!=null) {
				conn.close();
			}	
		}
		return flag;
	}
}


