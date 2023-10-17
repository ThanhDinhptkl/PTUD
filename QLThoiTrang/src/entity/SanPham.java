package entity;

public class SanPham {
	private String maSP;
	private NhaCungCap nhaCungCap;
	private String tenSP;
	private String hinhAnh;
	private String loai;
	private int soLuong;
	private String chatLieu;
	private String mauSac;
	private Double donGia;
	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SanPham(String maSP, NhaCungCap nhaCungCap, String tenSP, String hinhAnh, String loai, int soLuong,
			String chatLieu, String mauSac, Double donGia) {
		super();
		this.maSP = maSP;
		this.nhaCungCap = nhaCungCap;
		this.tenSP = tenSP;
		this.hinhAnh = hinhAnh;
		this.loai = loai;
		this.soLuong = soLuong;
		this.chatLieu = chatLieu;
		this.mauSac = mauSac;
		this.donGia = donGia;
	}
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public NhaCungCap getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(NhaCungCap nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getChatLieu() {
		return chatLieu;
	}
	public void setChatLieu(String chatLieu) {
		this.chatLieu = chatLieu;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	public Double getDonGia() {
		return donGia;
	}
	public void setDonGia(Double donGia) {
		this.donGia = donGia;
	}
	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", nhaCungCap=" + nhaCungCap + ", tenSP=" + tenSP + ", hinhAnh=" + hinhAnh
				+ ", loai=" + loai + ", soLuong=" + soLuong + ", chatLieu=" + chatLieu + ", mauSac=" + mauSac
				+ ", donGia=" + donGia + "]";
	}
	
}
