/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TEST2;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class NhanVien implements Serializable{
    private String ten;
    private String chucVu;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String ten, String chucVu, double luong) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.luong = luong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
}
