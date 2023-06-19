/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class GiangVienServise {

    private ArrayList<GiangVien> listGV = new ArrayList<>();

    public ArrayList<GiangVien> fakeData() {
        listGV.add(new GiangVien("GV001", "Vũ Hoàng N", 2004, "Nam", "MOB"));
        listGV.add(new GiangVien("GV002", "Trần Tuấn L", 2000, "Nam", "UDPM"));
        listGV.add(new GiangVien("GV003", "Nguyễn Thị Q", 2002, "Nữ", "WEB"));
        listGV.add(new GiangVien("GV004", "Đinh Bá H", 1995, "Nam", "PTPM"));
        listGV.add(new GiangVien("GV005", "Hoàng Hồng N", 1997, "Nữ", "MOB"));
        return listGV;
    }

    public String updateGiangVien(int Vitri, GiangVien gv) {
        if (Vitri >= 0) {
            if (gv != null) {
                listGV.set(Vitri, gv);
                return "Cập nhật thành công";
            }
            return "Cập nhật thất bại";
        }
        return "Vui lòng nhập vị tri cần update";
    }

    public String writeGiangVien(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (
                    FileOutputStream fos = new FileOutputStream(file);
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (GiangVien gv : listGV) {
                    oos.writeObject(gv);
                }
            }
            return "Ghi file thành công";
        } catch (Exception e) {
            return "Ghi file thất bại";
        }
    }
}
