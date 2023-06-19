/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThi1;

/**
 *
 * @author ADMIN
 */
public class DongVat {
    private String id, name, gioiTinh, loai;
    private Double canNang;

    public DongVat() {
    }

    public DongVat(String id, String name, String gioiTinh, String loai, Double canNang) {
        this.id = id;
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.loai = loai;
        this.canNang = canNang;
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public Double getCanNang() {
        return canNang;
    }

    public void setCanNang(Double canNang) {
        this.canNang = canNang;
    }
    
    
}
