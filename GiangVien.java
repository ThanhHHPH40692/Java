/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De5;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class GiangVien implements Serializable{
    private String id;
    private String name;
    private Integer age;
    private String gender;
    private String chuyenNganh;

    public GiangVien() {
    }

    public GiangVien(String id, String name, Integer age, String gender, String chuyenNganh) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.chuyenNganh = chuyenNganh;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    
    
}
