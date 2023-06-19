/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NYLV2;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class NguoiYeuC2 {

    private String name;
    private Date birthday;
    private String gender;
    private double vong1;
    private double vong2;
    private double vong3;

    public NguoiYeuC2() {
    }

    public NguoiYeuC2(String name, Date birthday, String gender, double vong1, double vong2, double vong3) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.vong1 = vong1;
        this.vong2 = vong2;
        this.vong3 = vong3;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getVong1() {
        return vong1;
    }

    public void setVong1(double vong1) {
        this.vong1 = vong1;
    }

    public double getVong2() {
        return vong2;
    }

    public void setVong2(double vong2) {
        this.vong2 = vong2;
    }

    public double getVong3() {
        return vong3;
    }

    public void setVong3(double vong3) {
        this.vong3 = vong3;
    }
    
    
}
