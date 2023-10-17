package bus;

import java.util.ArrayList;

import dao.DAO_NhanVien;
import entity.NhanVien;
import interfaces.I_NhanVien;

public class Bus_NhanVien implements I_NhanVien {

	private DAO_NhanVien dao_nv = new DAO_NhanVien();
	@Override
	public ArrayList<NhanVien> getAllNhanVien() {
		// TODO Auto-generated method stub
		return dao_nv.getAllNhanVien();
	}
	@Override
	public NhanVien getTheoMaNV(String maNv) {
		// TODO Auto-generated method stub
		return dao_nv.getTheoMaNV(maNv);
	}
	@Override
	public NhanVien getTheoTenNV(String tenNv) {
		// TODO Auto-generated method stub
		return dao_nv.getTheoTenNV(tenNv);
	}

	@Override
	public ArrayList<NhanVien> getTheoSDT(String sdt) {
		// TODO Auto-generated method stub
		return dao_nv.getTheoSDT(sdt);
	}

	@Override
	public boolean themNV(NhanVien nv) {
		// TODO Auto-generated method stub
		return dao_nv.themNV(nv);
	}

	@Override
	public boolean suaNV(NhanVien nv) {
		// TODO Auto-generated method stub
		return dao_nv.suaNV(nv);
	}

	@Override
	public boolean xoa(String maNv) {
		// TODO Auto-generated method stub
		return dao_nv.xoa(maNv);
	}

}
