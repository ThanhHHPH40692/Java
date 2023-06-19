package TEST1;

import java.io.Serializable;

public class DienThoai implements Serializable{
    private String TenSP;
    private int Hang;
    private float GiaSP;

    public DienThoai() {
    }

    public DienThoai(String TenSP, int Hang, float GiaSP) {
        this.TenSP = TenSP;
        this.Hang = Hang;
        this.GiaSP = GiaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getHang() {
        return Hang;
    }

    public void setHang(int Hang) {
        this.Hang = Hang;
    }

    public float getGiaSP() {
        return GiaSP;
    }

    public void setGiaSP(float GiaSP) {
        this.GiaSP = GiaSP;
    }
    
    public String getStatus(){
        if(GiaSP >10000){
            return "Tốt";
        }
        return "Bình thường";
    }
}
