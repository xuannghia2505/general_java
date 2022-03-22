/*
 * (C) Copyright 2022 Fresher Academy. All Rights Reserved
 *
 * @author NghiaHX
 * @birthDate 25/05/2000
 * @date 2022-03-16
 * version 1.0
 */
package general.MVC.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import general.MVC.bean.May;

public class MayDao {
	
	Connection conn =null;
	PreparedStatement ps = null;
	ResultSet rs= null;
	
	public ArrayList<May> getAllMay() throws SQLException {
		ArrayList<May> listMay= new ArrayList<May>();
	try {
		conn =  new DBConnect().getConnection();

		String query = "select * from MAY";
		PreparedStatement ps = conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			listMay.add(new May(rs.getNString(1),rs.getNString(2),rs.getNString(3)));
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
	return listMay;
	}
	public May getMayById(String mamay) throws SQLException {
		May may= null;
	try {
		
		conn =  new DBConnect().getConnection();
		String query = "select * from MAY where MaMay=?";

		PreparedStatement ps = conn.prepareStatement(query);
		ps.setNString(1, mamay);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			may= new May(rs.getNString(1), rs.getNString(2), rs.getNString(3));
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
	return may;
	
	}
	public int getSoPageMay() throws SQLException {
		int soPage=0;
	try {
		conn =  new DBConnect().getConnection();

		String query = "select count(1) from MAY";
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
	public int getSoPageMayOfKey(String key) throws SQLException {
		int soPage=0;
	try {
		conn =  new DBConnect().getConnection();

		String query = "select count(1) from MAY where MaMay like ? ";
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
	public ArrayList<May> getMaybyPage(int page,String key) throws SQLException {
		int startItem= (page-1)*4;
		ArrayList<May> listMay= new ArrayList<May>();
	try {
		conn =  new DBConnect().getConnection();

		String query = "SELECT * FROM MAY  WHERE MaMay like ?  ORDER BY MaMay OFFSET ? ROWS FETCH NEXT 4 ROWS ONLY";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, "%"+key+"%");
		ps.setInt(2, startItem);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			listMay.add(new May(rs.getNString(1),rs.getNString(2),rs.getNString(3)));
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
	return listMay;
	}
	public int  insertMay(String mamay, String vitri, String trangthai) throws SQLException {
		int flag=-1;
		String query = "insert into MAY(MaMay,ViTri,TrangThai)\r\n" + 
				"values(?,?,?)";
		try {
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(query);
			ps.setNString(1, mamay);
			ps.setNString(2, vitri);
			ps.setNString(3, trangthai);
			
			flag=ps.executeUpdate();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
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


