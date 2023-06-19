/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DocGhiFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class Write_Input {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("test1.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Write_Input.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
