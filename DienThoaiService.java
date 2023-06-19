/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class DienThoaiService {

    private ArrayList<DienThoai> listDT = new ArrayList<>();

    public ArrayList<DienThoai> fakeData() {
        listDT.add(new DienThoai("DT1", "Apple", "Đen", 8000, "256"));
        listDT.add(new DienThoai("DT1", "Apple", "Đen", 8000, "256"));
        listDT.add(new DienThoai("DT1", "Apple", "Đen", 8000, "256"));
        listDT.add(new DienThoai("DT1", "Apple", "Đen", 8000, "256"));
        listDT.add(new DienThoai("DT1", "Apple", "Đen", 8000, "256"));
        return listDT;
    }

    public String addDienThoai(DienThoai DT) {
        if (DT != null && listDT.add(DT)) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }
}
