/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De4;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class DongVat implements Serializable{
    private String id;
    private String name;
    private String loai;
    private String gender;

    public DongVat() {
    }

    public DongVat(String id, String name, String loai, String gender) {
        this.id = id;
        this.name = name;
        this.loai = loai;
        this.gender = gender;
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

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
