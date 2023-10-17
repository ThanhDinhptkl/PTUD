package entity;

public class ChiTietHoaDonNhapHang {
	private HoaDonNhapHang hoaDonNhaphang;
	private SanPham sanPham;
	private int soLuong;
	private Double donGiaNhap;
	public ChiTietHoaDonNhapHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChiTietHoaDonNhapHang(HoaDonNhapHang hoaDonNhaphang, SanPham sanPham, int soLuong, Double donGiaNhap) {
		super();
		this.hoaDonNhaphang = hoaDonNhaphang;
		this.sanPham = sanPham;
		this.soLuong = soLuong;
		this.donGiaNhap = donGiaNhap;
	}
	HoaDonNhapHang getHoaDonNhaphang() {
		return hoaDonNhaphang;
	}
	void setHoaDonNhaphang(HoaDonNhapHang hoaDonNhaphang) {
		this.hoaDonNhaphang = hoaDonNhaphang;
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
	Double getDonGiaNhap() {
		return donGiaNhap;
	}
	void setDonGiaNhap(Double donGiaNhap) {
		this.donGiaNhap = donGiaNhap;
	}
	@Override
	public String toString() {
		return "ChiTietHoaDonNhapHang [hoaDonNhaphang=" + hoaDonNhaphang + ", sanPham=" + sanPham + ", soLuong="
				+ soLuong + ", donGiaNhap=" + donGiaNhap + "]";
	}
	
}
