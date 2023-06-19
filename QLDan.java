/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class QLDan implements Serializable{

    private String ID;
    private String Name;
    private BigDecimal price;
    private Integer number;
    private double kichThuoc;
    private String chatLieu;

    public QLDan() {
    }

    public QLDan(String ID, String Name, BigDecimal price, Integer number, double kichThuoc, String chatLieu) {
        this.ID = ID;
        this.Name = Name;
        this.price = price;
        this.number = number;
        this.kichThuoc = kichThuoc;
        this.chatLieu = chatLieu;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public double getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(double kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

}
