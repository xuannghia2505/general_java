package general.MVC.bean;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Info {
	private String maKH;
	private String tenKH;
	private String mamay;
	private String vitri;
	private String trangthai;
	private Date ngaysdm;
	private Time giosdm;
	private int thoigiansd;
	private String maDV;
	private Date ngaysddv;
	private Time giosddv;
	private int soluong;
	private long tongtien;
	
	public Info() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Info(String maKH, String tenKH, String mamay, String vitri, String trangthai, Date ngaysdm, Time giosdm,
			int thoigiansd, String maDV, Date ngaysddv, Time giosddv, int soluong, long tongtien) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.mamay = mamay;
		this.vitri = vitri;
		this.trangthai = trangthai;
		this.ngaysdm = ngaysdm;
		this.giosdm = giosdm;
		this.thoigiansd = thoigiansd;
		this.maDV = maDV;
		this.ngaysddv = ngaysddv;
		this.giosddv = giosddv;
		this.soluong = soluong;
		this.tongtien = tongtien;
	}
	public Info(String maKH, String tenKH, String mamay, String vitri, String trangthai, Date ngaysdm, Time giosdm,
			int thoigiansd) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.mamay = mamay;
		this.vitri = vitri;
		this.trangthai = trangthai;
		this.ngaysdm = ngaysdm;
		this.giosdm = giosdm;
		this.thoigiansd = thoigiansd;
	
		
	}
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getMamay() {
		return mamay;
	}
	public void setMamay(String mamay) {
		this.mamay = mamay;
	}
	public String getVitri() {
		return vitri;
	}
	public void setVitri(String vitri) {
		this.vitri = vitri;
	}
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	public String getNgaysdm() {
		return formatter.format(ngaysdm);
	}
	public void setNgaysdm(Date ngaysdm) {
		this.ngaysdm = ngaysdm;
	}
	public Time getGiosdm() {
		return giosdm;
	}
	public void setGiosdm(Time giosdm) {
		this.giosdm = giosdm;
	}
	public int getThoigiansd() {
		return thoigiansd;
	}
	public void setThoigiansd(int thoigiansd) {
		this.thoigiansd = thoigiansd;
	}
	public String getMaDV() {
		return maDV;
	}
	public void setMaDV(String maDV) {
		this.maDV = maDV;
	}
	public String getNgaysddv() {
		return formatter.format(ngaysddv);
	}
	public void setNgaysddv(Date ngaysddv) {
		this.ngaysddv = ngaysddv;
	}
	public Time getGiosddv() {
		return giosddv;
	}
	public void setGiosddv(Time giosddv) {
		this.giosddv = giosddv;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public long getTongtien() {
		return tongtien;
	}
	public void setTongtien(long tongtien) {
		this.tongtien = tongtien;
	}
	
	
}

