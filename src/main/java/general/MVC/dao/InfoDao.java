
package general.MVC.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import general.MVC.bean.Info;

public class InfoDao {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	

	public int getSoPageInfo() throws SQLException {
		int soPage = 0;
		try {
			conn = new DBConnect().getConnection();

			String query = "select count(1) \n" + "from \n"
					+ "KHACHHANG kh  join SUDUNGMAY sdm ON kh.MaKH = sdm.MaKH \n"
					+ " join MAY m  ON m.MaMay = sdm.MaMay \n"
					+ "left join SUDUNGDICHVU sddv ON sdm.NgayBatDauSuDung=sddv.NgaySuDung \n"
					+ "left join DICHVU dv ON dv.MaDV = sddv.MaDV";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				soPage = rs.getInt(1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}

		}
		return soPage / 4 + 1;
	}

	public ArrayList<Info> getInfobyPage(int page) throws SQLException {
		int startItem = (page - 1) * 4;
		ArrayList<Info> listInfo = new ArrayList<Info>();
		try {
			conn = new DBConnect().getConnection();

			String query = "SELECT  kh.MaKH, TenKH, m.MaMay, ViTri, TrangThai, NgayBatDauSuDung, GioBatDauSuDung, ThoiGianSuDung, \r\n" + 
					"					 dv.MaDV, NgaySuDung, GioSuDung, SoLuong, (SoLuong*DonGia) AS TongTien FROM \r\n" + 
					"					KHACHHANG kh  join SUDUNGMAY sdm ON kh.MaKH = sdm.MaKH \r\n" + 
					"					 left join SUDUNGDICHVU sddv ON sdm.NgayBatDauSuDung=sddv.NgaySuDung\r\n" + 
					"					  join MAY m  ON m.MaMay = sdm.MaMay\r\n" + 
					"					  left join DICHVU dv ON dv.MaDV = sddv.MaDV \r\n" + 
					"					ORDER BY kh.MaKH OFFSET ? ROWS FETCH NEXT 4 ROWS ONLY";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, startItem);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
			
				
				if(rs.getDate(10)!=null) {
					listInfo.add(new Info(rs.getNString(1), rs.getNString(2), rs.getNString(3), rs.getNString(4),
							rs.getNString(5), new java.util.Date(rs.getDate(6).getTime()),
							new java.sql.Time(rs.getTime(7).getTime()), rs.getInt(8), rs.getNString(9),
							new java.util.Date(rs.getDate(10).getTime()),
							new java.sql.Time(rs.getTime(11).getTime()),
							rs.getInt(12), rs.getLong(13)));
				}
				else {
					listInfo.add(new Info(rs.getNString(1), rs.getNString(2), rs.getNString(3), rs.getNString(4),
							rs.getNString(5), new java.util.Date(rs.getDate(6).getTime()),
							new java.sql.Time(rs.getTime(7).getTime()), rs.getInt(8)));
				}
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}

		}
		return listInfo;
	}
}

