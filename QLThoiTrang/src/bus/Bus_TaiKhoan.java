package bus;

import java.util.ArrayList;

import dao.DAO_TaiKhoan;
import entity.TaiKhoan1;
import interfaces.I_TaiKhoan;

public class Bus_TaiKhoan implements I_TaiKhoan {
private DAO_TaiKhoan dao_tk = new DAO_TaiKhoan();
	
	@Override
	public ArrayList<TaiKhoan1> getAllTaiKhoan() {
		return dao_tk.getAllTaiKhoan();
	}

	@Override
	public TaiKhoan1 getTheoMaTK(String maTK) {
		return dao_tk.getTheoMaTK(maTK);
	}

	@Override
	public boolean them(TaiKhoan1 tk) {
		return dao_tk.them(tk);
	}

	@Override
	public boolean sua(TaiKhoan1 tk) {
		return dao_tk.sua(tk);
	}

	@Override
	public boolean xoa(String maTK) {
		return dao_tk.xoa(maTK);
	}
}
