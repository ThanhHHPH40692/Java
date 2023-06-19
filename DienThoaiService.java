package TEST1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DienThoaiService {

    private ArrayList<DienThoai> listDT = new ArrayList<>();

    public ArrayList<DienThoai> fakedata() {
        listDT.add(new DienThoai("Nokia 1", 2, 3000));
        listDT.add(new DienThoai("Samsung 1", 1, 12000));
        listDT.add(new DienThoai("Nokia 2", 2, 5000));
        listDT.add(new DienThoai("Samsung 2", 1, 16000));
        return listDT;
    }

    public String addDienThoai(DienThoai dt) {
        return (dt != null && listDT.add(dt) ? "Thêm thành công" : "Thêm thất bại");
    }

    public String ghiFile(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileOutputStream fos = new FileOutputStream(file); 
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (DienThoai dt : listDT) {
                    oos.writeObject(dt);
                }
            }
            return "Ghi file thành công";
        } catch (Exception e) {
            return "Ghi file thất bại";
        }

    }
    
    public String docFile(String path){
        File file = new File(path);
        try {
            if(!file.exists()){
                return "Không tìm thấy file";
            }
            try(FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis)){
                while(fis.available()>0){
                    listDT.add((DienThoai)ois.readObject());
                }
            }
             return "Đọc file thành công";
        } catch (Exception e) {
             return "Đọc file thất bại";
        }
    }
}
