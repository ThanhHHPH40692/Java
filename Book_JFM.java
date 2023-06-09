/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QLX;

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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class Book_JFM extends javax.swing.JFrame {

    private ArrayList<Sach> list = new ArrayList<>();
    private DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form Book_JFM
     */
    public Book_JFM() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnDOc = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtTheLoai = new javax.swing.JTextField();
        txtTacgia = new javax.swing.JTextField();
        txtNam = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lí Sách");

        jLabel2.setText("ID");

        txtTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        txtTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtTable);

        jLabel3.setText("Tên Sách");

        jLabel4.setText("Thể Loại");

        jLabel5.setText("Tác Giả");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnDOc.setText("Đọc");
        btnDOc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDOcActionPerformed(evt);
            }
        });

        btnGhi.setText("Ghi");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        jLabel6.setText("Năm Sản Xuất");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(btnThem)
                            .addGap(41, 41, 41)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnXoa)
                                    .addGap(45, 45, 45)
                                    .addComponent(btnDOc)
                                    .addGap(32, 32, 32)
                                    .addComponent(btnGhi))
                                .addComponent(txtNam)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtID)
                                        .addComponent(txtName)
                                        .addComponent(txtTheLoai)
                                        .addComponent(txtTacgia, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnDOc)
                    .addComponent(btnGhi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        Sach sach = new Sach();
        // Lấy giá trị người dùng nhập vào
        sach.setId(txtID.getText());
        sach.setName(txtName.getText());
        sach.setTheLoai(txtTheLoai.getText());
        sach.setTacGia(txtTacgia.getText());
        sach.setNamSX(Integer.parseInt(txtNam.getText()));
        // Thêm dữ liệu 
        list.add(sach);
        // Cập nhật
        loadTable();
        // Xóa dữ liệu
        txtID.setText("");
        txtName.setText("");
        txtTheLoai.setText("");
        txtTacgia.setText("");
        txtNam.setText("");
    }//GEN-LAST:event_btnThemActionPerformed

    private void loadTable() {
        DefaultTableModel model = (DefaultTableModel) txtTable.getModel();
        model.setColumnCount(0);
        model.addColumn("ID");
        model.addColumn("Tên");
        model.addColumn("Thể loại");
        model.addColumn("Tác Giả");
        model.addColumn("Năm Sáng Tác");
        model.setRowCount(0);
        for (Sach sc : list) {
            Object[] row = new Object[]{
                sc.getId(),
                sc.getName(),
                sc.getTheLoai(),
                sc.getTacGia(),
                sc.getNamSX()
            };
            model.addRow(row);
        }
    }

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int row = txtTable.getSelectedRow();

        if (row != -1) {
            list.remove(row);
            loadTable();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        FileOutputStream fos = null;
        try {
            String id = txtID.getText();
            String name = txtName.getText();
            String theLoai = txtTheLoai.getText();
            String tacGia = txtTacgia.getText();
            Integer nam = Integer.parseInt(txtNam.getText());
            // Khởi tạo
            Sach sh = new Sach();
            sh.setId(id);
            sh.setName(name);
            sh.setTheLoai(theLoai);
            sh.setTacGia(tacGia);
            sh.setNamSX(nam);
            fos = new FileOutputStream("PH40692.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            DefaultTableModel model = (DefaultTableModel) txtTable.getModel();
            Object[] row = new Object[]{
                id, name, theLoai, tacGia, nam
            };
            System.out.println("Ghi thanh cong");
            // thoát
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("File khong ton tai ");
        } catch (IOException ex) {
            System.out.println("Loi doc ghi");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnGhiActionPerformed

    private void txtTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTableMouseClicked
        // TODO add your handling code here:
        int choice = txtTable.getSelectedRow();
        if (choice == -1) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa lựa chọn");
            return;
        }
        String id = txtTable.getValueAt(choice, 0).toString();
        String name = txtTable.getValueAt(choice, 1).toString();
        String theLoai = txtTable.getValueAt(choice, 2).toString();
        String tacGia = txtTable.getValueAt(choice, 3).toString();
        Object namStr = txtTable.getValueAt(choice, 4).toString();
        Integer nam = Integer.parseInt(namStr.toString());

        txtID.setText(id);
        txtName.setText(name);
        txtTheLoai.setText(theLoai);
        txtTacgia.setText(tacGia);
        txtNam.setText(nam.toString());
    }//GEN-LAST:event_txtTableMouseClicked

    private void btnDOcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDOcActionPerformed
        FileInputStream fis = null;
        try {
            // TODO add your handling code here:
            fis = new FileInputStream("PH40692.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Sach sh = (Sach) ois.readObject();
            txtID.setText(sh.getId());
            txtName.setText(sh.getName());
            txtTheLoai.setText(sh.getTheLoai());
            txtTacgia.setText(sh.getTacGia());
            txtNam.setText(Integer.toString(sh.getNamSX()));
        } catch (FileNotFoundException ex) {
            System.out.println("Khong tim thay file");
        } catch (IOException ex) {
            System.out.println("Khong doc duoc");
        } catch (ClassNotFoundException ex) {
            System.out.println("Khong tim thay class");
        }
    }//GEN-LAST:event_btnDOcActionPerformed

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
            java.util.logging.Logger.getLogger(Book_JFM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book_JFM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book_JFM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book_JFM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_JFM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDOc;
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNam;
    private javax.swing.JTextField txtName;
    private javax.swing.JTable txtTable;
    private javax.swing.JTextField txtTacgia;
    private javax.swing.JTextField txtTheLoai;
    // End of variables declaration//GEN-END:variables
}
