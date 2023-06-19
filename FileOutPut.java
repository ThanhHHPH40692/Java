/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GhiFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 *
 * @author ADMIN
 */
public class FileOutPut {

    public static void main(String[] args) {
        // Tạo file
        try {
            // 
            FileOutputStream fo = new FileOutputStream("data.txt");
            String message = "Hello SD18322";
            byte[] mes = message.getBytes();
            //
            fo.write(message.getBytes());
            //
            fo.close();
        } catch (FileNotFoundException e) {
            System.out.println("File khong ton tai ");
        } catch (IOException ex) {
            System.out.println("Loi doc ghi");
        }
    }
}
