package general.MVC.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

public class SuDungMayDao {
	Connection conn =null;
	PreparedStatement ps = null;
	ResultSet rs= null;
	public int  DangKySuDungMay(String mamay, String makh, Date ngaydbds, Time giobdsd, int thoigiansd) throws SQLException {
		int flag=-1;
		String query = "insert into SUDUNGMAY(MaKH, MaMay,NgayBatDauSuDung,GioBatDauSuDung, ThoiGianSuDung)\r\n" + 
				"values(?,?,?,?,?)";
		try {
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(query);
			ps.setNString(1, makh);
			ps.setNString(2, mamay);
			ps.setDate(3, ngaydbds);
			ps.setTime(4, giobdsd);
			ps.setInt(5, thoigiansd);
			
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
