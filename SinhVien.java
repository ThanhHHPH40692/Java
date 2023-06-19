/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThi3;

/**
 *
 * @author ADMIN
 */
public class SinhVien {
   private String id;
   private String name;
   private String gender;
   private String namSinh;
   private double canNang;

    public SinhVien() {
    }

    public SinhVien(String id, String name, String gender, String namSinh, double canNang) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.namSinh = namSinh;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }
   
   
}
