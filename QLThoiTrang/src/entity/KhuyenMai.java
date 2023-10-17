package entity;

import java.time.LocalDate;

public class KhuyenMai {
	private String maKM;
	private LocalDate ngayBatDau;
	private LocalDate ngayKetThuc;
	private Double mucGiamGia;
	public KhuyenMai() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KhuyenMai(String maKM, LocalDate ngayBatDau, LocalDate ngayKetThuc, Double mucGiamGia) {
		super();
		this.maKM = maKM;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.mucGiamGia = mucGiamGia;
	}
	String getMaKM() {
		return maKM;
	}
	void setMaKM(String maKM) {
		this.maKM = maKM;
	}
	LocalDate getNgayBatDau() {
		return ngayBatDau;
	}
	void setNgayBatDau(LocalDate ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}
	LocalDate getNgayKetThuc() {
		return ngayKetThuc;
	}
	void setNgayKetThuc(LocalDate ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}
	Double getMucGiamGia() {
		return mucGiamGia;
	}
	void setMucGiamGia(Double mucGiamGia) {
		this.mucGiamGia = mucGiamGia;
	}
	@Override
	public String toString() {
		return "KhuyenMai [maKM=" + maKM + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc=" + ngayKetThuc
				+ ", mucGiamGia=" + mucGiamGia + "]";
	}
	
}
