/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThi3;

import DeThi2.GiangVien;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class SinhVienServise {

    private ArrayList<SinhVien> listSV = new ArrayList<>();

    public ArrayList<SinhVien> fakeData() {
        listSV.add(new SinhVien("SV01", "Nguyễn Hoàng Nam", "Nam", "2004", 54.6));
        listSV.add(new SinhVien("SV01", "Nguyễn Quỳnh Trang", "Nữ", "2005", 44.6));
        listSV.add(new SinhVien("SV01", "Nguyễn Văn Bình", "Nam", "2006", 60.2));
        listSV.add(new SinhVien("SV01", "Nguyễn Định Bá", "Nam", "2002", 64));
        listSV.add(new SinhVien("SV01", "Nguyễn Hung Thần", "Nữ", "2000", 43.1));
        return listSV;
    }

    public String upDateSinhVien(int vitri, SinhVien sv) {
        if (vitri >= 0) {
            if (sv != null) {
                listSV.set(vitri, sv);
                return "Cập nhật thành công";
            }
            return "Cập nhật thất bại";
        }
        return "Vui lòng nhập vị tri cần update";
    }

    public String writeSinhVien(int vitri, String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (
                     FileOutputStream fos = new FileOutputStream(file);  ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                SinhVien gv = listSV.get(vitri);
                oos.writeObject(gv);
            }
            return "Ghi file thành công";
        } catch (Exception e) {
            return "Ghi file thất bại";
        }
    }

    public String readSinhVien(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                return "File không tồn tại";
            }
            try (
                     FileInputStream fis = new FileInputStream(file);  ObjectInputStream ois = new ObjectInputStream(fis)) {
                while (true) {
                    try {
                        SinhVien sv = (SinhVien) ois.readObject();
                        listSV.add(sv);
                    } catch (Exception e) {
                    }
                    return "Đọc file thành công";
                }
            }
        } catch (Exception e) {
            return "Đọc file thất bại";
        }
    }
}
