package interfaces;

import java.util.ArrayList;

import entity.TaiKhoan;

public interface I_TaiKhoan {
	
	public ArrayList<TaiKhoan> getAllTaiKhoan();
	
	public TaiKhoan getTheoMaTK(String maTK);
	
	public boolean them(TaiKhoan tk);
	
	public boolean sua(TaiKhoan tk);
	
	public boolean xoa(String maTK);
}
