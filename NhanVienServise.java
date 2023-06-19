/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TEST2;

import TEST1.DienThoai;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class NhanVienServise {

    private ArrayList<NhanVien> listNV = new ArrayList<NhanVien>();

    public ArrayList<NhanVien> fakeData() {
        listNV.add(new NhanVien("Hoàng Hồng Quang", "Nhân Viên", 5000000));
        listNV.add(new NhanVien("Nguyễn Ngọc Như", "Trưởng Phòng", 9000000));
        listNV.add(new NhanVien("Đinh Bá Huy", "Phó Phòng", 8000000));
        listNV.add(new NhanVien("Trương Khả Minh", "Nhân Viên", 6000000));
        listNV.add(new NhanVien("Phùng Thị Nhung", "Phó Phòng", 7800000));
        return listNV;
    }

    // Thêm
    public String addNhanVien(NhanVien NV) {
        // C1 :  return (NV != null && listNV.add(NV) ? "Thêm Thành Công" : "Thêm Thất Bại");
        // C2
        if (NV != null && listNV.add(NV)) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    // Sửa
    public String updateNhanVien(int Vitri, NhanVien nv) {
        if (Vitri >= 0) {
            if (nv != null) {
                listNV.set(Vitri, nv);
                return "Cập nhật thành công";
            }
            return "Vui lòng nhập thông tin khách hàng";
        }
        return "Vui lòng nhập vị trí update";
    }

    // Xóa
    public String removeNhanVien(int Vitri) {
        if (Vitri >= 0 && listNV.remove(Vitri) != null) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }

}
