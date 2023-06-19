/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThi2;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class GiangVien implements Serializable{
    private String id;
    private String name;
    private String cn;
    private String gender;
    private int age;

    public GiangVien() {
    }

    public GiangVien(String id, String name, String cn, String gender, int age) {
        this.id = id;
        this.name = name;
        this.cn = cn;
        this.gender = gender;
        this.age = age;
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

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
