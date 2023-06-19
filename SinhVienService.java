/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De3;

import java.io.EOFException;
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
public class SinhVienService {

    private ArrayList<SinhVien> listSV = new ArrayList<>();

    public ArrayList<SinhVien> fakeData() {
        listSV.add(new SinhVien("SV1", "Nguyễn Thị A", "Nữ", 2009));
        listSV.add(new SinhVien("SV2", "Nguyễn Linh B", "Nữ", 2010));
        listSV.add(new SinhVien("SV3", "Nguyễn Quang C", "Nam", 2005));
        listSV.add(new SinhVien("SV4", "Nguyễn Hoàng D", "Nam", 2004));
        listSV.add(new SinhVien("SV5", "Nguyễn Bình P", "Nam", 2000));
        return listSV;
    }

    // thêm 
    public String addSinhVien(SinhVien sv) {
        if (sv != null && listSV.add(sv)) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    // xóa 
    public String deleteSinhVien(int viTri) {
        if (viTri >= 0 && listSV.remove(viTri) != null) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }

    // ghi
    public String writeSinhVien(int vitri, String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (
                     FileOutputStream fos = new FileOutputStream(file);
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                SinhVien sv = listSV.get(vitri);
                oos.writeObject(sv);
            }
            return "Ghi file thành công";
        } catch (Exception e) {
            return "Ghi file thất bại";
        }
    }

    // đọc
    public String readSinhVien(String path) {
        File file = new File(path);
        try {
            // nếu file fl chưa tồn tại sẽ return luôn về file không tồn tại
            if (!file.exists()) {
                return "File không tồn tại";
            }
            try (
                     FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis)) {
                while (true) {
                    try {
                        SinhVien sv = (SinhVien) ois.readObject();
                        listSV.add(sv);
                    } catch (EOFException e) {
                    }
                    return "Đọc thành công";
                }

            }
        } catch (Exception e) {
            return "Đọc thất bại";
        }
    }
}
