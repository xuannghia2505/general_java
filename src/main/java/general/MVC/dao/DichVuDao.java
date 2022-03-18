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


