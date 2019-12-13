package model;


import java.sql.ResultSet;
import java.sql.SQLException;

public class ThongSoKyThuat {
    private String manHinh;
    private String heDieuHanh;
    private String CPU;
    private String RAM;
    private String PIN;
    public  ThongSoKyThuat(){}
    public ThongSoKyThuat(String manHinh, String heDieuHanh, String CPU, String RAM, String CAMERA, String PIN) {
        this.manHinh = manHinh;
        this.heDieuHanh = heDieuHanh;
        this.CPU = CPU;
        this.RAM = RAM;
        this.PIN = PIN;
    }

    public String getManHinh() {
        return manHinh;
    }

    public void setManHinh(String manHinh) {
        this.manHinh = manHinh;
    }

    public String getHeDieuHanh() {
        return heDieuHanh;
    }

    public void setHeDieuHanh(String heDieuHanh) {
        this.heDieuHanh = heDieuHanh;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public ThongSoKyThuat addTSKT(ThongSoKyThuat tskt, ResultSet rs) throws SQLException {
        tskt.setManHinh(rs.getString("manhinh"));
        tskt.setHeDieuHanh(rs.getString("hedieuhanh"));
        tskt.setCPU(rs.getString("cpu"));
        tskt.setRAM(rs.getString("ram"));
        tskt.setPIN(rs.getString("pin"));
        return  tskt;
    }
}
