package Buoi3;

import Buoi2.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class KhachHangService {

    private final ArrayList<KhachHang> listKH = new ArrayList<>();

    //Tạo fake data
    public ArrayList<KhachHang> fakeData() {
        //add vào list
        listKH.add(new KhachHang("Phạm", "Quang Anh", 20, "Hà Nội"));
        listKH.add(new KhachHang("Nguyễn", "Văn Nam", 18, "Ninh Bình"));
        listKH.add(new KhachHang("Nguyễn", "Thị Duyên", 21, "TP Hồ Chí Minh"));
        return listKH;
    }

    //Thêm
    public String addKhachHang(KhachHang kh) {
        if (kh != null && listKH.add(kh)) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    //Sửa 
    public String updateKhachHang(int Vitri, KhachHang kh) {
        if (Vitri >= 0) {
            if (kh != null) {
                listKH.set(Vitri, kh);
                return "Cập nhật thành công";
            }
            return "Vui lòng nhập thông tin khách hàng";
        }
        return "Vui lòng nhập vị trí update";
    }

    //Xóa
    public String removeKhachHang(int Vitri) {
        if (Vitri >= 0 && listKH.remove(Vitri) != null) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }

    //Ghi
    public String ghiFile(String path) {
        File file = new File("todo.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (
            FileOutputStream fos = new FileOutputStream(file); 
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (KhachHang kh : listKH) {
                    oos.writeObject(kh);
                }
            }
            return "Ghi file thành công";
        } catch (Exception e) {
            return "Ghi file thất bại";
        }
    }
    
    //Đọc
    public String docFile(String path){
        File file = new File(path);
        try {
            if(!file.exists()){
                return "File không tồn tại";
            }
            try(
              FileInputStream fis = new FileInputStream(file);
               ObjectInputStream ois = new ObjectInputStream(fis)){
                while(fis.available()>0){
                    listKH.add((KhachHang) ois.readObject());
                }
            }
            return "Đọc thành công";
        } catch (Exception e) {
            return "Đọc thất bại";
        }
    }
}
