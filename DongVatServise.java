/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThi1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DongVatServise {

    private ArrayList<DongVat> listDV = new ArrayList<>();

    // hiển thị
    public ArrayList<DongVat> fakeData() {
        listDV.add(new DongVat("DV01", "Chó", "Đực", "Gia Xúc", 13.2));
        listDV.add(new DongVat("DV02", "Gà", "Cái", "Gia Cầm", 3.2));
        listDV.add(new DongVat("DV03", "Vịt", "Đực", "Gia Cầm", 4.7));
        listDV.add(new DongVat("DV04", "Trâu", "Cái", "Gia Xúc", 13.2));
        listDV.add(new DongVat("DV05", "Lợn", "Đực", "Gia Xúc", 13.2));
        return listDV;
    }

    // Xóa
    public String deleteDongVat(int Vitri) {
        if (Vitri >= 0 && listDV.remove(Vitri) != null) {
            return "Xoá thành công";
        } else {
            return "Xóa thất bại";
        }
    }

    // Ghi
    public String writeDongVat(int vitri, String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (
                     FileOutputStream fos = new FileOutputStream(file);  ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                DongVat dv = listDV.get(vitri);
                oos.writeObject(dv);
            }
            return "Ghi file thành công";
        } catch (IOException e) {
            return "Ghi file thất bại";
        }
    }

    // Đọc
    public String readDongVat(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                return "file không tồn tại";
            }
            try (
                     FileInputStream fis = new FileInputStream(file);  ObjectInputStream ois = new ObjectInputStream(fis)) {
                while (true) {
                    try {
                        DongVat dv = (DongVat) ois.readObject();
                        listDV.add(dv);
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
