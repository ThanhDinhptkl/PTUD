package entity;

public class ChiTietPhieuDatHang {
	private PhieuDatHang phieuDatHang;
	private SanPham sanPham;
	private int soLuong;
	public ChiTietPhieuDatHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChiTietPhieuDatHang(PhieuDatHang phieuDatHang, SanPham sanPham, int soLuong) {
		super();
		this.phieuDatHang = phieuDatHang;
		this.sanPham = sanPham;
		this.soLuong = soLuong;
	}
	PhieuDatHang getPhieuDatHang() {
		return phieuDatHang;
	}
	void setPhieuDatHang(PhieuDatHang phieuDatHang) {
		this.phieuDatHang = phieuDatHang;
	}
	SanPham getSanPham() {
		return sanPham;
	}
	void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
	int getSoLuong() {
		return soLuong;
	}
	void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		return "ChiTietPhieuDatHang [phieuDatHang=" + phieuDatHang + ", sanPham=" + sanPham + ", soLuong=" + soLuong
				+ "]";
	}
	
}
