/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class DienThoai implements Serializable {

    private String id;
    private String hang;
    private String mauSac;
    private Integer gia;
    private String boNho;

    public DienThoai() {
    }

    public DienThoai(String id, String hang, String mauSac, Integer gia, String boNho) {
        this.id = id;
        this.hang = hang;
        this.mauSac = mauSac;
        this.gia = gia;
        this.boNho = boNho;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public String getBoNho() {
        return boNho;
    }

    public void setBoNho(String boNho) {
        this.boNho = boNho;
    }
}
