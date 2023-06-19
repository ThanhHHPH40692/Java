/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class DongVatServise {

    private ArrayList<DongVat> listDV = new ArrayList<>();

    public ArrayList<DongVat> fakeData() {
        listDV.add(new DongVat("DV01", "Chó", "Gia xúc", "Đực"));
        listDV.add(new DongVat("DV02", "Gà", "Gia cầm", "Cái"));
        listDV.add(new DongVat("DV03", "Mèo", "Gia xúc", "Cái"));
        listDV.add(new DongVat("DV04", "Chim", "Gia cầm", "Đực"));
        listDV.add(new DongVat("DV05", "Lợn", "Gia xúc", "Đực"));
        return listDV;
    }
    // thêm 

    public String addDongVat(DongVat dv) {
        if (dv != null && listDV.add(dv)) {
            return "Thêm Thành Công";
        } else {
            return "Thêm Thất Bại";
        }
    }
    // Xóa

    public String deleteDongVat(int ViTri) {
        if (ViTri >= 0 && listDV.remove(ViTri) != null) {
            return "Xóa Thành Công";
        } else {
            return "Xóa Thất Bại";
        }
    }
    // Ghi
    public String writeDongVat() {
        try {
            // TODO add your handling code here:
            FileOutputStream fos = new FileOutputStream("todo.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(listDV);
            oos.close();
            fos.close();
            return "Ghi file thành công";
        } catch (FileNotFoundException e) {
            System.out.println("File khong ton tai ");
        } catch (IOException ex) {
            System.out.println("Loi doc ghi");
            ex.printStackTrace();
        }
        return "Ghi file thất bại";
    }

    // Đọc 
    public String readDongVat() {
        try {
            FileInputStream fis = new FileInputStream("todo.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            listDV = (ArrayList<DongVat>) ois.readObject();
            ois.close();
            fis.close();
            return "Đọc file thành công";
        } catch (FileNotFoundException ex) {
            System.out.println("Khong tim thay file");
        } catch (IOException ex) {
            System.out.println("Khong doc duoc");
        } catch (ClassNotFoundException ex) {
            System.out.println("Khong tim thay class");
        }
        return "Đọc file thất bại";
    }
}
