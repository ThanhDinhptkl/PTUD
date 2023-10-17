package entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class HoaDonNhapHang {
	private String maHDNhap;
	private NhaCungCap nhaCungCap;
	private NhanVien nhanVien;
	private LocalDate ngayNhap;
	private ArrayList<ChiTietHoaDonNhapHang>chiTietHDNhap;
	public HoaDonNhapHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public HoaDonNhapHang(String maHDNhap, NhaCungCap nhaCungCap, NhanVien nhanVien, LocalDate ngayNhap) {
		super();
		this.maHDNhap = maHDNhap;
		this.nhaCungCap = nhaCungCap;
		this.nhanVien = nhanVien;
		this.ngayNhap = ngayNhap;
	}

	public HoaDonNhapHang(String maHDNhap, NhaCungCap nhaCungCap, NhanVien nhanVien, LocalDate ngayNhap,
			ArrayList<ChiTietHoaDonNhapHang> chiTietHDNhap) {
		super();
		this.maHDNhap = maHDNhap;
		this.nhaCungCap = nhaCungCap;
		this.nhanVien = nhanVien;
		this.ngayNhap = ngayNhap;
		this.chiTietHDNhap = chiTietHDNhap;
	}
	String getMaHDNhap() {
		return maHDNhap;
	}
	void setMaHDNhap(String maHDNhap) {
		this.maHDNhap = maHDNhap;
	}
	NhaCungCap getNhaCungCap() {
		return nhaCungCap;
	}
	void setNhaCungCap(NhaCungCap nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	NhanVien getNhanVien() {
		return nhanVien;
	}
	void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	LocalDate getNgayNhap() {
		return ngayNhap;
	}
	void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	ArrayList<ChiTietHoaDonNhapHang> getChiTietHDNhap() {
		return chiTietHDNhap;
	}
	void setChiTietHDNhap(ArrayList<ChiTietHoaDonNhapHang> chiTietHDNhap) {
		this.chiTietHDNhap = chiTietHDNhap;
	}

	@Override
	public String toString() {
		return "HoaDonNhapHang [maHDNhap=" + maHDNhap + ", nhaCungCap=" + nhaCungCap + ", nhanVien=" + nhanVien
				+ ", ngayNhap=" + ngayNhap + ", chiTietHDNhap=" + chiTietHDNhap + "]";
	}
	
}
