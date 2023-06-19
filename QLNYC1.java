/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NYLV1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;

/**
 *
 * @author ADMIN
 */
public class QLNYC1 extends javax.swing.JFrame {

    private SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-YYYY");

    /**
     * Creates new form QLNYC1
     */
    public QLNYC1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRead = new javax.swing.JButton();
        btnWrite = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtBirthday = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lí Người Yêu");

        jLabel2.setText("Tên Người Yêu");

        jLabel3.setText("Sinh Nhật");

        jLabel4.setText("Quê Quán ");

        jLabel5.setText("Giới Tính");

        btnRead.setText("Đọc");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnWrite.setText("Ghi");
        btnWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWriteActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdNam);
        rdNam.setSelected(true);
        rdNam.setText("Nam");

        buttonGroup1.add(rdNu);
        rdNu.setText("Nữ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(txtBirthday)
                            .addComponent(txtAddress)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdNam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(rdNu, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btnRead)
                        .addGap(71, 71, 71)
                        .addComponent(btnWrite)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rdNam)
                    .addComponent(rdNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRead)
                    .addComponent(btnWrite))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Hàm tự viết để hỗ trợ đổi từ date sang string

    private String date2String(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");

        return sdf.format(date);
    }

    // Hàm tự viết để chuyển đổi ngày tháng
    private Date parseDate(String ngayThang) {
        // Đối tượng hỗ trợ đọc kiểu dữ liệu ngày tháng
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        //String date = DateFormat.
        try {
            return sdf.parse(ngayThang);
        } catch (Exception e) {
            //Nếu lỗi trả về thời điểm hiện tại
            return new Date();
        }
    }

    private void btnWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWriteActionPerformed
        FileOutputStream fos = null;
        try {
            // B1 : Lấy thông tin người dùng nhập
            String name = txtName.getText();
            Date birthday = parseDate(txtBirthday.getText());
            String address = txtAddress.getText();
            boolean gender = rdNam.isSelected();

            // B2 : Khởi tạo đối tượng người yêu
            NguoiYeuC1 nyc = new NguoiYeuC1();
            nyc.setName(name);
            nyc.setBirthday(birthday);
            nyc.setAddress(address);
            nyc.setGender(gender);

            // B3 : Ghi file
            fos = new FileOutputStream("PH40692-b2.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(nyc);
            System.out.println("Ghi thanh cong");
            // B4 : Thoát
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("File khong ton tai ");
        } catch (IOException ex) {
            System.out.println("Loi doc ghi");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnWriteActionPerformed


    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        // TODO add your handling code here:
        FileInputStream fis = null;
        try {
            // B1 : Đọc dữ liệu từ file
            fis = new FileInputStream("PH40692-b2.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            NguoiYeuC1 ny = (NguoiYeuC1) ois.readObject();
            // B2 : Hiển thị thông tin
            txtName.setText(ny.getName());
            txtBirthday.setText(date2String(ny.getBirthday()));
            txtAddress.setText(ny.getAddress());
            if (ny.getGender()) {
                rdNam.setSelected(true);
            } else {
                rdNu.setSelected(true);
            }

            System.out.println("Doc thanh cong");
        } catch (FileNotFoundException ex) {
            System.out.println("Khong tim thay file");
        } catch (IOException ex) {
            System.out.println("Khong doc duoc");
        } catch (ClassNotFoundException ex) {
            System.out.println("Khong tim thay class");
        }
    }//GEN-LAST:event_btnReadActionPerformed

//    // Tìm kiếm theo khoảng trong trường thứ 5
//    private void searchByRange(double minValue, double maxValue) {
//        // Duyệt qua từng hàng trong bảng
//        for (int i = 0; i < txtTable.getRowCount(); i++) {
//            // Lấy giá trị trường thứ 5 của hàng
//            double value = Double.parseDouble(txtTable.getValueAt(i, 4).toString());
//
//            // Kiểm tra giá trị có nằm trong khoảng tìm kiếm hay không
//            if (value >= minValue && value <= maxValue) {
//                // Hiển thị hàng chứa kết quả tìm kiếm
//                txtTable.setRowSelectionInterval(i, i);
//            }
//        }
//    }
//
//// Tìm kiếm danh sách bản ghi theo tên
//    private void searchByName(String searchText) {
//        // Duyệt qua từng hàng trong bảng
//        for (int i = 0; i < txtTable.getRowCount(); i++) {
//            // Lấy giá trị tên trong hàng
//            String name = txtTable.getValueAt(i, 0).toString().toLowerCase();
//
//            // Kiểm tra xem tên có chứa từ khóa tìm kiếm hay không
//            if (name.contains(searchText.toLowerCase())) {
//                // Hiển thị hàng chứa kết quả tìm kiếm
//                txtTable.setRowSelectionInterval(i, i);
//            }
//        }
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLNYC1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNYC1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNYC1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNYC1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNYC1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnWrite;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}