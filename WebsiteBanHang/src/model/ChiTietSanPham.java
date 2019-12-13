package	model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ChiTietSanPham {
    private String maSanPham;
    private String tenSanPham;
    private String nhaCungCap;
    private double giaDaGiam;
    private double giaBan;
    private String hinhAnh;
    private int danhGia;
    private double xepHang;
    private String quaTang;
    private ThongSoKyThuat thongSoKyThuat;
    public ChiTietSanPham(){}

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public double getGiaDaGiam() {
        return giaDaGiam;
    }

    public void setGiaDaGiam(double giaDaGiam) {
        this.giaDaGiam = giaDaGiam;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public int getDanhGia() {
        return danhGia;
    }

    public void setDanhGia(int danhGia) {
        this.danhGia = danhGia;
    }

    public double getXepHang() {
        return xepHang;
    }

    public void setXepHang(double xepHang) {
        this.xepHang = xepHang;
    }

    public String getQuaTang() {
        return quaTang;
    }

    public void setQuaTang(String quaTang) {
        this.quaTang = quaTang;
    }

    public ThongSoKyThuat getThongSoKyThuat() {
        return thongSoKyThuat;
    }

    public void setThongSoKyThuat(ThongSoKyThuat thongSoKyThuat) {
        this.thongSoKyThuat = thongSoKyThuat;
    }
    public ChiTietSanPham addCTSP(ChiTietSanPham ctsp, ResultSet rs) throws SQLException {
        ctsp.setMaSanPham(rs.getString("masanpham"));
        ctsp.setTenSanPham(rs.getString("tensanpham"));
        ctsp.setNhaCungCap(rs.getString("nhacungcap"));
        ctsp.setGiaDaGiam(rs.getDouble("giadagiam"));
        ctsp.setGiaBan(rs.getDouble("giaban"));
        ctsp.setHinhAnh(rs.getString("hinhanh"));
        ctsp.setDanhGia(rs.getInt("danhgia"));
        ctsp.setXepHang(rs.getDouble("xephang"));
        ctsp.setQuaTang(rs.getString("quatang"));
        ThongSoKyThuat tskt = new ThongSoKyThuat();
        ctsp.setThongSoKyThuat(tskt.addTSKT(tskt,rs));
        return  ctsp;
    }
}
