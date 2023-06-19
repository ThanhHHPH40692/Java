/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLX;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class Sach implements Serializable{

    private String id;
    private String name;
    private String theLoai;
    private String tacGia;
    private Integer namSX;

    public Sach() {
    }

    public Sach(String id, String name, String theLoai, String tacGia, Integer namSX) {
        this.id = id;
        this.name = name;
        this.theLoai = theLoai;
        this.tacGia = tacGia;
        this.namSX = namSX;
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

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public Integer getNamSX() {
        return namSX;
    }

    public void setNamSX(Integer namSX) {
        this.namSX = namSX;
    }

}
