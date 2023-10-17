package entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class HoaDon {
	private String maHD;
	private NhanVien nhanVien;
	private KhachHang khachHang;
	private LocalDate ngayLapHD;
	private ArrayList<ChiTietHoaDon> chiTietHD;
	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoaDon(String maHD, NhanVien nhanVien, KhachHang khachHang, LocalDate ngayLapHD) {
		super();
		this.maHD = maHD;
		this.nhanVien = nhanVien;
		this.khachHang = khachHang;
		this.ngayLapHD = ngayLapHD;
	}
	public HoaDon(String maHD, NhanVien nhanVien, KhachHang khachHang, LocalDate ngayLapHD,
			ArrayList<ChiTietHoaDon> chiTietHD) {
		super();
		this.maHD = maHD;
		this.nhanVien = nhanVien;
		this.khachHang = khachHang;
		this.ngayLapHD = ngayLapHD;
		this.chiTietHD = chiTietHD;
	}
	String getMaHD() {
		return maHD;
	}
	void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	NhanVien getNhanVien() {
		return nhanVien;
	}
	void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	KhachHang getKhachHang() {
		return khachHang;
	}
	void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	LocalDate getNgayLapHD() {
		return ngayLapHD;
	}
	void setNgayLapHD(LocalDate ngayLapHD) {
		this.ngayLapHD = ngayLapHD;
	}
	ArrayList<ChiTietHoaDon> getChiTietHD() {
		return chiTietHD;
	}
	void setChiTietHD(ArrayList<ChiTietHoaDon> chiTietHD) {
		this.chiTietHD = chiTietHD;
	}
	@Override
	public String toString() {
		return "HoaDon [maHD=" + maHD + ", nhanVien=" + nhanVien + ", khachHang=" + khachHang + ", ngayLapHD="
				+ ngayLapHD + ", chiTietHD=" + chiTietHD + "]";
	}
	
	
	
}
