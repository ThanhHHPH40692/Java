package NYLV1;

import java.io.Serializable;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class NguoiYeuC1 implements Serializable{
    private String name;
    private Date birthday;
    private String address;
    private Boolean gender;

    public NguoiYeuC1() {
    }

    public NguoiYeuC1(String name, Date birthday, String address, Boolean gender) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.gender = gender;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }
    
}
