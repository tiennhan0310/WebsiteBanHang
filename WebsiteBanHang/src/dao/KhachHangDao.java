package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import model.ThanhVien;
import model.connectToDatabase;
public class KhachHangDao implements ObjectDAO{
	public static Map<String,ThanhVien> mapThanhVien=loadData();
	public KhachHangDao() {
		
	}
	private static Map<String, ThanhVien> loadData() {
		Map<String , ThanhVien> mapTemp=new HashMap<>();
		try {
		ResultSet rs= new connectToDatabase().selectData("select * from TaiKhoan ");
		while(rs.next()) {
			String taiKhoan=rs.getString(1);
			String matKhau=rs.getString(2);
			String hoTen=rs.getString(3);
			String gioiTinh=rs.getString(4);
			String soDienThoai=rs.getString(5);
			String email=rs.getString(6);
			String ngaySinh=rs.getString(7);
			String diaChi=rs.getString(8);
			String soLuongMua=rs.getString(9);
			String role=rs.getString(10);
			
			
			
			ThanhVien tv= new ThanhVien(taiKhoan,matKhau,hoTen,gioiTinh,soDienThoai,email,ngaySinh,diaChi,soLuongMua,role);
			mapTemp.put(tv.getTaiKhoan(),tv);
		}
		}catch (Exception e) { 
			e.printStackTrace();
		}
		return mapTemp;
		
	}
	public boolean checkLogin(String userName,String passWord) {
		ThanhVien tv = mapThanhVien.get(userName);
		if(tv!=null) {
			if(tv.getMatKhau().equals(passWord)) {
				return true;
			}else {
				return false;
			}
		}else {
		return false;
		}
		
	}
	@Override
	public boolean add(Object obj)  {
		ThanhVien tv=(ThanhVien)obj;
		mapThanhVien.put(tv.getTaiKhoan(),tv);
		String sql="insert into TaiKhoan values (?,?,?,?,?,?,?,?,?,?)";
		Connection connect = connectToDatabase.getConnect();
		try {
			PreparedStatement ppatm = connect.prepareStatement(sql);
			ppatm.setString(1, tv.getTaiKhoan());
			ppatm.setString(2, tv.getMatKhau());
			ppatm.setString(3, tv.getHoTen());
			ppatm.setString(4, tv.getGioiTinh());
			ppatm.setString(5, tv.getSoDienThoai());
			ppatm.setString(6, tv.getEmail());
			ppatm.setString(7, tv.getNgaySinh());
			ppatm.setString(8, tv.getDiaChi());
			ppatm.setString(9, tv.getSoLuongMua());
			ppatm.setString(10, tv.getRole());
			ppatm.executeUpdate();
			return true;
			
		}catch(SQLException e) {
			System.out.println("eror khi them khach hang"+e.getMessage());
			e.printStackTrace();
		}
		return false;
		
	}
	@Override
	public boolean remove(String id) {
		mapThanhVien.remove(id);
		try {
			new connectToDatabase().excuteSql("delete from Taikhoan where taikhoan="+id+"");
			return true;
		} catch (Exception e) {
			System.out.println("eror khi xoa tai khoan"+e.getMessage());
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean edit(String id, Object obj) {
		ThanhVien tv=(ThanhVien)obj;
		mapThanhVien.replace(id,tv);
		String sql="update taikhoan set  Matkhau=?, Tenkhachhang=?, Gioitinh=?, Sodienthoai=?, Email=?, Ngaysinh=?, Diachi=?, Soluotmua=?, Role=? where Tentaikhoan="+id+"";
		Connection connect = connectToDatabase.getConnect();
		try {
			PreparedStatement ppatm = connect.prepareStatement(sql);
			ppatm.setString(1, tv.getMatKhau());
			ppatm.setString(2, tv.getHoTen());
			ppatm.setString(3, tv.getGioiTinh());
			ppatm.setString(4, tv.getSoDienThoai());
			ppatm.setString(5, tv.getEmail());
			ppatm.setString(6, tv.getNgaySinh());
			ppatm.setString(7, tv.getDiaChi());
			ppatm.setString(8, tv.getSoLuongMua());
			ppatm.setString(9, tv.getSoLuongMua());
			ppatm.setString(10, id);
			ppatm.executeUpdate();
			return true;
			
		}catch(SQLException e) {
			System.out.println("eror khi sua khach hang"+e.getMessage());
			e.printStackTrace();
		}
		return false;
		
		
	}
	public static void main(String[] args) {
		KhachHangDao tvDao = new KhachHangDao();
		System.out.println(tvDao.mapThanhVien);
		 System.out.println(tvDao.checkLogin("hiendi","hiendi11"));
		 System.out.println(tvDao.checkLogin("hiendi1","hiendi11"));
		 System.out.println(tvDao.checkLogin("hiendi","hiendi12"));
		 
		
	}
	public boolean changePass(String userName,String newPass) {
		ThanhVien tv=mapThanhVien.get(userName);
		if(tv!=null) {
			tv.setMatKhau(newPass);
			mapThanhVien.replace(tv.getTaiKhoan(),tv);
			 edit(tv.getTaiKhoan(), tv);
			 return true;
		}else {
			
		
		return false;
		}
		
	}
	
}
