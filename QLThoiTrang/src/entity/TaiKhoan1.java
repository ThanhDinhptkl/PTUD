package entity;

import java.util.Objects;

public class TaiKhoan1 {
	private String maDangNhap;
	private String matKhau;
	private String phanQuyen;
	public TaiKhoan1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TaiKhoan1(String maDangNhap, String matKhau, String phanQuyen) {
		super();
		this.maDangNhap = maDangNhap;
		this.matKhau = matKhau;
		this.phanQuyen = phanQuyen;
	}
	public String getMaDangNhap() {
		return maDangNhap;
	}
	public void setMaDangNhap(String maDangNhap) {
		this.maDangNhap = maDangNhap;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getPhanQuyen() {
		return phanQuyen;
	}
	public void setPhanQuyen(String phanQuyen) {
		this.phanQuyen = phanQuyen;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maDangNhap);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaiKhoan1 other = (TaiKhoan1) obj;
		return Objects.equals(maDangNhap, other.maDangNhap);
	}
	@Override
	public String toString() {
		return "TaiKhoan [maDangNhap=" + maDangNhap + ", matKhau=" + matKhau + ", phanQuyen=" + phanQuyen + "]";
	}
	
}
