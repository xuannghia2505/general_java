/*
 * (C) Copyright 2022 Fresher Academy. All Rights Reserved
 *
 * @author NghiaHX
 * @birthDate 25/05/2000
 * @date 2022-03-18
 * version 1.0
 */
package general.MVC.bean;

public class DichVu {
	private String maDV;
	private String tenDV;
	private String donvitinh;
	private long dongia;
	public DichVu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DichVu(String maDV, String tenDV, String donvitinh, long dongia) {
		super();
		this.maDV = maDV;
		this.tenDV = tenDV;
		this.donvitinh = donvitinh;
		this.dongia = dongia;
	}
	public String getMaDV() {
		return maDV;
	}
	public void setMaDV(String maDV) {
		this.maDV = maDV;
	}
	public String getTenDV() {
		return tenDV;
	}
	public void setTenDV(String tenDV) {
		this.tenDV = tenDV;
	}
	public String getDonvitinh() {
		return donvitinh;
	}
	public void setDonvitinh(String donvitinh) {
		this.donvitinh = donvitinh;
	}
	public long getDongia() {
		return dongia;
	}
	public void setDongia(long dongia) {
		this.dongia = dongia;
	}
	
}


