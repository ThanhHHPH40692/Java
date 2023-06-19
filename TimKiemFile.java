/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DocGhiFile;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author ADMIN
 */
public class TimKiemFile {
    // Tìm kiếm file
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        if(file.isFile()){
            System.out.println("File : " + file.getAbsolutePath());
            // tìm kiếm vị trí của file : file.getAbsolutePath()
            
        }else{
            System.out.println("Not found");
            file.createNewFile();
        }
    }
}
