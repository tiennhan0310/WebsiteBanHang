package dao;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import model.ThanhVien;
import model.connectToDatabase;
public class KhachHangDao {
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
	public static void main(String[] args) {
		KhachHangDao tvDao = new KhachHangDao();
		System.out.println(tvDao.mapThanhVien);
		 System.out.println(tvDao.checkLogin("hiendi","hiendi11"));
		 System.out.println(tvDao.checkLogin("hiendi1","hiendi11"));
		 System.out.println(tvDao.checkLogin("hiendi","hiendi12"));
		 
		
	}
}
