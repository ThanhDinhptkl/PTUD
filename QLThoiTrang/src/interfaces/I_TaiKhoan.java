package interfaces;

import java.util.ArrayList;

import entity.TaiKhoan1;

public interface I_TaiKhoan {
	
	public ArrayList<TaiKhoan1> getAllTaiKhoan();
	
	public TaiKhoan1 getTheoMaTK(String maTK);
	
	public boolean them(TaiKhoan1 tk);
	
	public boolean sua(TaiKhoan1 tk);
	
	public boolean xoa(String maTK);
}
