package entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class PhieuDatHang {
	private String maPhieuDat;
	private KhachHang khachHang;
	private NhanVien nhanVien;
	private LocalDate ngayDat;
	private ArrayList<ChiTietPhieuDatHang> chiTietPhieuDatHang;
	public PhieuDatHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhieuDatHang(String maPhieuDat, KhachHang khachHang, NhanVien nhanVien, LocalDate ngayDat) {
		super();
		this.maPhieuDat = maPhieuDat;
		this.khachHang = khachHang;
		this.nhanVien = nhanVien;
		this.ngayDat = ngayDat;
	}
	
	
	public PhieuDatHang(String maPhieuDat, KhachHang khachHang, NhanVien nhanVien, LocalDate ngayDat,
			ArrayList<ChiTietPhieuDatHang> chiTietPhieuDatHang) {
		super();
		this.maPhieuDat = maPhieuDat;
		this.khachHang = khachHang;
		this.nhanVien = nhanVien;
		this.ngayDat = ngayDat;
		this.chiTietPhieuDatHang = chiTietPhieuDatHang;
	}
	String getMaPhieuDat() {
		return maPhieuDat;
	}
	void setMaPhieuDat(String maPhieuDat) {
		this.maPhieuDat = maPhieuDat;
	}
	KhachHang getKhachHang() {
		return khachHang;
	}
	void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	NhanVien getNhanVien() {
		return nhanVien;
	}
	void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	LocalDate getNgayDat() {
		return ngayDat;
	}
	void setNgayDat(LocalDate ngayDat) {
		this.ngayDat = ngayDat;
	}
	ArrayList<ChiTietPhieuDatHang> getChiTietPhieuDatHang() {
		return chiTietPhieuDatHang;
	}
	void setChiTietPhieuDatHang(ArrayList<ChiTietPhieuDatHang> chiTietPhieuDatHang) {
		this.chiTietPhieuDatHang = chiTietPhieuDatHang;
	}
	@Override
	public String toString() {
		return "PhieuDatHang [maPhieuDat=" + maPhieuDat + ", khachHang=" + khachHang + ", nhanVien=" + nhanVien
				+ ", ngayDat=" + ngayDat + ", chiTietPhieuDatHang=" + chiTietPhieuDatHang + "]";
	}
	
	
}
