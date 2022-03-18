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
	
	public ArrayList<May> getAllSinhvien() throws SQLException {
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
		
		rs.close();
		ps.close();
		conn.close();
    	
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


