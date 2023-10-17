package interfaces;

import java.util.ArrayList;

import entity.NhanVien;

public interface I_NhanVien {

	public ArrayList<NhanVien> getAllNhanVien();
	public NhanVien getTheoMaNV(String maNv);
	public NhanVien getTheoTenNV(String tenNv) ;
	public ArrayList<NhanVien> getTheoSDT(String sdt);
	public boolean themNV(NhanVien nv);
	public boolean suaNV(NhanVien nv);
	public boolean xoa(String maNv);
}
