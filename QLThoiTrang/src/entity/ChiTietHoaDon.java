package entity;

public class ChiTietHoaDon {
	private HoaDon hoaDon;
	private KhuyenMai khuyenMai;
	private SanPham sanPham;
	private int soLuong;
	private Double donGia;
	public ChiTietHoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChiTietHoaDon(HoaDon hoaDon, KhuyenMai khuyenMai, SanPham sanPham, int soLuong, Double donGia) {
		super();
		this.hoaDon = hoaDon;
		this.khuyenMai = khuyenMai;
		this.sanPham = sanPham;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}
	HoaDon getHoaDon() {
		return hoaDon;
	}
	void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}
	KhuyenMai getKhuyenMai() {
		return khuyenMai;
	}
	void setKhuyenMai(KhuyenMai khuyenMai) {
		this.khuyenMai = khuyenMai;
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
	Double getDonGia() {
		return donGia;
	}
	void setDonGia(Double donGia) {
		this.donGia = donGia;
	}
	@Override
	public String toString() {
		return "ChiTietHoaDon [hoaDon=" + hoaDon + ", khuyenMai=" + khuyenMai + ", sanPham=" + sanPham + ", soLuong="
				+ soLuong + ", donGia=" + donGia + "]";
	}
	
}
