package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.NhanVien;
import interfaces.I_NhanVien;

public class DAO_NhanVien implements I_NhanVien {
	public DAO_NhanVien() {
		
	}
	@Override
	public ArrayList<NhanVien> getAllNhanVien(){
		ArrayList<NhanVien> dsNV = new ArrayList<NhanVien>();
		try {
			Connection con = ConnectDB.getInstance().getConnection();
			String sql = "Select * from NhanVien";
			Statement sta = con.createStatement();
			
			ResultSet rs = sta.executeQuery(sql);
			while(rs.next()) {
				String maNV = rs.getString("MANV");
				String tenNV = rs.getString("TENNV");
				Date ngaySinh = rs.getDate("NGAYSINH");
				boolean gioiTinh = rs.getBoolean("GIOITINH");
				String sDT = rs.getString("SDT");
				String diaChi = rs.getString("DIACHI");
				String email = rs.getString("EMAIL");
				
				NhanVien nv = new NhanVien(maNV, tenNV, ngaySinh, gioiTinh, sDT, diaChi, email);
				dsNV.add(nv);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dsNV;
	}
	//tim kiem theo maNV
	@Override
	public NhanVien getTheoMaNV(String maNv) {
		NhanVien nv = null;
		PreparedStatement sta = null;
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sql = "Select * from NhanVien where MANV = ?";
			sta = con.prepareStatement(sql);
			sta.setString(1, maNv);
			ResultSet rs = sta.executeQuery();
			while(rs.next()) {
				String maNV = rs.getString("MANV");
				String tenNV = rs.getString("TENNV");
				Date ngaySinh = rs.getDate("NGAYSINH");
				boolean gioiTinh = rs.getBoolean("GIOITINH");
				String sDT = rs.getString("SDT");
				String diaChi = rs.getString("DIACHI");
				String email = rs.getString("EMAIL");
				
				nv = new NhanVien(maNV, tenNV, ngaySinh, gioiTinh, sDT, diaChi, email);
			}
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				sta.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return nv;
	}
	//tim kiem theo tenNV
	@Override
	public NhanVien getTheoTenNV(String tenNv) {
		NhanVien nv = null;
		PreparedStatement sta = null;
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sql = "Select * from NhanVien where TENNV = ?";
			sta = con.prepareStatement(sql);
			sta.setString(1, tenNv);
			ResultSet rs = sta.executeQuery();
			while(rs.next()) {
				String maNV = rs.getString("MANV");
				String tenNV = rs.getString("TENNV");
				Date ngaySinh = rs.getDate("NGAYSINH");
				boolean gioiTinh = rs.getBoolean("GIOITINH");
				String sDT = rs.getString("SDT");
				String diaChi = rs.getString("DIACHI");
				String email = rs.getString("EMAIL");
				
				nv = new NhanVien(maNV, tenNV, ngaySinh, gioiTinh, sDT, diaChi, email);
			}
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				sta.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return nv;
	}
	//tim kiem theo sDT
	@Override
	public ArrayList<NhanVien> getTheoSDT(String sdt) {
		ArrayList<NhanVien> dsNV = new ArrayList<NhanVien>();
		PreparedStatement sta = null;
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sql = "Select * from NhanVien where SDT = ?";
			sta = con.prepareStatement(sql);
			sta.setString(1, sdt);
			ResultSet rs = sta.executeQuery();
			while(rs.next()) {
				String maNV = rs.getString("MANV");
				String tenNV = rs.getString("TENNV");
				Date ngaySinh = rs.getDate("NGAYSINH");
				boolean gioiTinh = rs.getBoolean("GIOITINH");
				String sDT = rs.getString("SDT");
				String diaChi = rs.getString("DIACHI");
				String email = rs.getString("EMAIL");
				
				NhanVien nv = new NhanVien(maNV, tenNV, ngaySinh, gioiTinh, sDT, diaChi, email);
				dsNV.add(nv);
			}
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				sta.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return dsNV;
	}
	//themNV
	@Override
	public boolean themNV(NhanVien nv) {
		PreparedStatement sta = null;
		int n = 0;
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sql = "insert into NhanVien values (?,?,?,?,?,?,?) ";
			sta = con.prepareStatement(sql);
			
			sta.setString(1, nv.getMaNV());
			sta.setString(2, nv.getTenNV());
			sta.setDate(3, (Date) nv.getNgaySinh());
			sta.setBoolean(4, nv.getGioiTinh());
			sta.setString(5, nv.getsDT());
			sta.setString(6, nv.getDiaChi());
			sta.setString(7, nv.getEmail());
			n = sta.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				sta.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return n > 0;
	}
	//suaNV
	@Override
	public boolean suaNV(NhanVien nv) {
		PreparedStatement sta = null;
		int n = 0;
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sql = "update NhanVien set TENNV = ?,NGAYSINH= ?, GIOITINH = ?, SDT =?, DIACHI = ?, EMAIL = ? where MANV = ? ";
			sta = con.prepareStatement(sql);
			
			
			sta.setString(1, nv.getTenNV());
			sta.setDate(2, (Date) nv.getNgaySinh());
			sta.setBoolean(3, nv.getGioiTinh());
			sta.setString(4, nv.getsDT());
			sta.setString(5, nv.getDiaChi());
			sta.setString(6, nv.getEmail());
			sta.setString(7, nv.getMaNV());
			n = sta.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				sta.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return n > 0;
	}
	//xoaNV
	@Override
	public boolean xoa(String maNv) {
		PreparedStatement sta = null;
		int n = 0;
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();

			String sql = "delete from NhanVien where MANV = ?";
			sta = con.prepareStatement(sql);

			sta.setString(1, maNv);
			n = sta.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
}
