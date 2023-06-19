/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThi2;

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
public class GiangVienServise {

    private ArrayList<GiangVien> listGV = new ArrayList<>();

    public ArrayList<GiangVien> fakeData() {
        listGV.add(new GiangVien("GV001", "Nguyễn Thị A", "UDPM", "Nữ", 2001));
        listGV.add(new GiangVien("GV002", "Nguyễn Thị B", "MOB", "Nam", 2000));
        listGV.add(new GiangVien("GV003", "Nguyễn Thị C", "WEB", "Nữ", 1998));
        listGV.add(new GiangVien("GV004", "Nguyễn Thị D", "PTPM", "Nam", 1995));
        listGV.add(new GiangVien("GV005", "Nguyễn Thị E", "WEB", "Nữ", 1997));

        return listGV;
    }

    // thêm 
    public String addGiangVien(GiangVien gv) {
        if (gv != null && listGV.add(gv)) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    // Ghi
    public String ghiGiangVien(int viTri, String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (
                     FileOutputStream fos = new FileOutputStream(file);  ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                GiangVien gv = listGV.get(viTri);
                oos.writeObject(gv);
            }
            return "Ghi file thành công";
        } catch (Exception e) {
            return "Ghi file thất bại";
        }
    }

    // Đọc
    public String docGiangVien(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                return "File không tồn tại";
            }
            try (
                    FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis)) 
            {
                while (true) {
                    try {
                        GiangVien gv = (GiangVien) ois.readObject();
                        listGV.add(gv);
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
