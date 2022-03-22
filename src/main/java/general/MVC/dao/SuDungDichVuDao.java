package general.MVC.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

public class SuDungDichVuDao {
	Connection conn =null;
	PreparedStatement ps = null;
	ResultSet rs= null;
	public int  DangKySuDungDichVu(String madv, String makh, Date ngaysd, Time giosd, int soluong) throws SQLException {
		int flag=-1;
		String query = "insert into SUDUNGDICHVU(MaKH, MaDV,NgaySuDung,GioSuDung, SoLuong)\r\n" + 
				"values(?,?,?,?,?)";
		try {
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(query);
			ps.setNString(1, makh);
			ps.setNString(2, madv);
			ps.setDate(3, ngaysd);
			ps.setTime(4, giosd);
			ps.setInt(5, soluong);
			
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



