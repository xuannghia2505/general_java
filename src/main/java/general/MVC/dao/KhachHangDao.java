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
			listKH.add(new KhachHang(rs.getNString(1),rs.getNString(2),rs.getNString(3),rs.getNString(3),rs.getNString(3)));
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


