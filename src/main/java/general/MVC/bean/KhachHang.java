/*
 * (C) Copyright 2022 Fresher Academy. All Rights Reserved
 *
 * @author NghiaHX
 * @birthDate 25/05/2000
 * @date 2022-03-18
 * version 1.0
 */
package general.MVC.bean;

public class KhachHang {
	private String maKH;
	private String tenKH;
	private String diachi;
	private String sdt;
	private String email;
	public KhachHang(String maKH, String tenKH, String diachi, String sdt, String email) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.diachi = diachi;
		this.sdt = sdt;
		this.email = email;
	}
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}


