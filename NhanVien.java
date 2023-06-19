package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class NhanVien {

    private String maNV;
    private String tenNV;
    private Boolean gioiTinh;
    private Integer thamNien;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, Boolean gioiTinh, Integer thamNien) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.thamNien = thamNien;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public Object[] toRowTable() {
        return new Object[]{maNV, tenNV, ((gioiTinh) ? "Nam" : "Nữ"), thamNien};
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Integer getThamNien() {
        return thamNien;
    }

    public void setThamNien(Integer thamNien) {
        this.thamNien = thamNien;
    }

    public Integer tinhThuong() {
        if (thamNien > 12) {
            return 500000;
        } else {
            return 200000;
        }
    }
}
