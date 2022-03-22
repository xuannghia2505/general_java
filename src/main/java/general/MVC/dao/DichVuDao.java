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

import general.MVC.bean.DichVu;

public class DichVuDao {
	Connection conn =null;
	PreparedStatement ps = null;
	ResultSet rs= null;
	
	public ArrayList<DichVu> getAllDichVu() throws SQLException {
		ArrayList<DichVu> listDV= new ArrayList<DichVu>();
	try {
		conn =  new DBConnect().getConnection();

		String query = "select * from DICHVU";
		PreparedStatement ps = conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			listDV.add(new DichVu(rs.getNString(1),rs.getNString(2),rs.getNString(3),rs.getLong(4)));
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
	return listDV;
	}
	public DichVu getDichVuById(String madv) throws SQLException {
		DichVu dichvu= null;
	try {
		
		conn =  new DBConnect().getConnection();
		String query = "select * from DICHVU where MaDV=?";

		ps = conn.prepareStatement(query);
		ps.setNString(1, madv);
		rs = ps.executeQuery();
		if(rs.next()) {
			dichvu= new DichVu(rs.getNString(1), rs.getNString(2),rs.getNString(3), rs.getLong(4));
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
	return dichvu;
	
	}
	public int getSoPageDV() throws SQLException {
		int soPage=0;
	try {
		conn =  new DBConnect().getConnection();

		String query = "select count(1) from DICHVU";
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
	public int getSoPageDVOfKey(String key) throws SQLException {
		int soPage=0;
	try {
		conn =  new DBConnect().getConnection();

		String query = "select count(1) from DICHVU where MaDV like ? ";
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
	public ArrayList<DichVu> getDVbyPage(int page,String key) throws SQLException {
		int startItem= (page-1)*4;
		ArrayList<DichVu> listDV= new ArrayList<DichVu>();
	try {
		conn =  new DBConnect().getConnection();

		String query = "SELECT * FROM DICHVU  WHERE MaDV like ?  ORDER BY MaDV OFFSET ? ROWS FETCH NEXT 4 ROWS ONLY";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, "%"+key+"%");
		ps.setInt(2, startItem);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			listDV.add(new DichVu(rs.getNString(1),rs.getNString(2),rs.getNString(3),rs.getLong(4)));
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
	return listDV;
	}
	public int  insertDichVu(String madv, String tendv, String donvitinh,long dongia) throws SQLException {
		int flag= -1;
		String query = "insert into DICHVU(MaDV,TenDV,DonViTinh,DonGia)\r\n" + 
				"values(?,?,?,?)";
		try {
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(query);
			ps.setNString(1, madv);
			ps.setNString(2, tendv);
			ps.setNString(3, donvitinh);
			ps.setLong(4,dongia);
			
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


