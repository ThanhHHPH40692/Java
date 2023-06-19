/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GhiFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ReadFile {

    public void writeToFile(List<Student> list) {
        try {
            // có 2 hàm khởi tạo 
            // Hàm đầu tiên sẽ chỉ có 1 tham số sau khi lưu xong tạo hàm mới sẽ xóa dữ liệu cũ
            // Hàm thứ 2 sẽ có thêm 1 tham số true để lưu file mà kh xóa dữ liệu cũ
            //Vd về list object
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

    public List<Student> readFormFile() {
        List<Student> list = new ArrayList<Student>();
        try {
            FileReader fr = new FileReader("date.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String txt [] = line.split("\\s+");
                String name = txt[0];
                int age = Integer.parseInt(txt[1]);
                double mark = Double.parseDouble(txt[2]);
                list.add(new Student(name, age, mark));
                System.out.println(line);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public static void main(String[] args) {
        // b2
        ReadFile rf = new ReadFile();
        List<Student> list = rf.readFormFile();
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
