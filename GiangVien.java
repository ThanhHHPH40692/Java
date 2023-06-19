/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLiX;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class GiangVien implements Serializable{
    private String id;
    private String name;
    private String boMon;
    private double bacLuong;
    private int soLop;

    public GiangVien() {
    }

    public GiangVien(String id, String name, String boMon, double bacLuong, int soLop) {
        this.id = id;
        this.name = name;
        this.boMon = boMon;
        this.bacLuong = bacLuong;
        this.soLop = soLop;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBoMon() {
        return boMon;
    }

    public void setBoMon(String boMon) {
        this.boMon = boMon;
    }

    public double getBacLuong() {
        return bacLuong;
    }

    public void setBacLuong(double bacLuong) {
        this.bacLuong = bacLuong;
    }

    public int getSoLop() {
        return soLop;
    }

    public void setSoLop(int soLop) {
        this.soLop = soLop;
    }
    
    
}
