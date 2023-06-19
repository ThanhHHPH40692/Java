/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GhiFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

// b1
//        String name = "Nguyễn Thị A";
//        String arr[] = {"Nguyễn Văn X", "Nguyễn Văn Y", "Nguyễn Văn Z"};
//        try {
//            // có 2 hàm khởi tạo 
//                // Hàm đầu tiên sẽ chỉ có 1 tham số sau khi lưu xong tạo hàm mới sẽ xóa dữ liệu cũ
//                // Hàm thứ 2 sẽ có thêm 1 tham số true để lưu file mà kh xóa dữ liệu cũ
//            FileWriter fw = new FileWriter("date.txt", true);
//            BufferedWriter  bw = new BufferedWriter(fw);
//            for (String o : args) {
//                bw.write(o);
//                bw.newLine(); // Xuống dòng tạo 1 dòng mới 
//            }
//            bw.write(name);
//            bw.close();
//            fw.close();
//        } catch (Exception e) {
//            
//        }
public class WriterFile {

    public static void main(String[] args) {
        // b2
        try {
            // có 2 hàm khởi tạo 
            // Hàm đầu tiên sẽ chỉ có 1 tham số sau khi lưu xong tạo hàm mới sẽ xóa dữ liệu cũ
            // Hàm thứ 2 sẽ có thêm 1 tham số true để lưu file mà kh xóa dữ liệu cũ
            //Vd về list object
            Student s1 = new Student("Nguyễn Bá Khá", 25, 9.5);
            Student s2 = new Student("Trần Thị An", 23, 8.8);
            Student s3 = new Student("Lê Văn Bình", 22, 9.2);
            Student s4 = new Student("Phạm Thị Cường", 24, 8.5);
            Student s5 = new Student("Hoàng Minh Đức", 21, 9.0);
            List<Student> list = new ArrayList<Student>();
            list.add(s1);
            list.add(s2);
            list.add(s3);
            list.add(s4);
            list.add(s5);
            FileWriter fw = new FileWriter("date.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (Student s : list) {
                bw.write(s.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }
}
