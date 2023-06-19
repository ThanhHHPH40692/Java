package Buoi3;

import Buoi2.*;
import java.io.Serializable;

public class KhachHang implements Serializable{
    private String HoKH;
    private String TenKH;
    private int TuoiKH;
    private String diachi;

    public KhachHang() {
    }

    public KhachHang(String HoKH, String TenKH, int TuoiKH, String diachi) {
        this.HoKH = HoKH;
        this.TenKH = TenKH;
        this.TuoiKH = TuoiKH;
        this.diachi = diachi;
    }

    public String getHoKH() {
        return HoKH;
    }

    public void setHoKH(String HoKH) {
        this.HoKH = HoKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public int getTuoiKH() {
        return TuoiKH;
    }

    public void setTuoiKH(int TuoiKH) {
        this.TuoiKH = TuoiKH;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    
}
