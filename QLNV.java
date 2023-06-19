package view;

import model.NhanVien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class QLNV extends javax.swing.JFrame {

    private ArrayList<NhanVien> list = new ArrayList<NhanVien>();
    // private DefaultComboBoxModel model = new DefaultComboBoxModel();

    /**
     * Creates new form QLNV
     */
    public QLNV() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void initThanNien() {
        String[] thanNien = new String[100];
        for (int i = 1; i <= 100; i++) {
            txtThamNien.addItem(i + "");
        }
        DefaultComboBoxModel<String> cbb = new DefaultComboBoxModel<>(thanNien);
        txtThamNien.setModel(cbb);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnRadio1 = new javax.swing.JRadioButton();
        btnRadio2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtThamNien = new javax.swing.JComboBox<>();
        txtAdd = new javax.swing.JButton();
        txtUpdate = new javax.swing.JButton();
        txtDelete = new javax.swing.JButton();
        txtSelect = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lí Nhân Viên");

        jLabel2.setText("Mã Nhân Viên");

        jLabel3.setText("Tên Nhân Viên");

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

        jLabel4.setText("Giới Tính");

        buttonGroup1.add(btnRadio1);
        btnRadio1.setSelected(true);
        btnRadio1.setText("Nam");

        buttonGroup1.add(btnRadio2);
        btnRadio2.setText("Nữ");

        jLabel5.setText("Thâm niên");

        txtThamNien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        txtThamNien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThamNienActionPerformed(evt);
            }
        });

        txtAdd.setText("Thêm ");
        txtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddActionPerformed(evt);
            }
        });

        txtUpdate.setText("Sửa");
        txtUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateActionPerformed(evt);
            }
        });

        txtDelete.setText("Xóa");
        txtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeleteActionPerformed(evt);
            }
        });

        txtSelect.setText("Hiển Thị");
        txtSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelectActionPerformed(evt);
            }
        });

        jLabel6.setText("tháng");

        time.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        time.setForeground(new java.awt.Color(255, 51, 51));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("00:00:00 AM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(txtAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtID)
                                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtThamNien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtUpdate)
                                    .addComponent(btnRadio1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRadio2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDelete)
                                        .addGap(39, 39, 39)
                                        .addComponent(txtSelect)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnRadio1)
                    .addComponent(btnRadio2))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtThamNien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdd)
                    .addComponent(txtUpdate)
                    .addComponent(txtDelete)
                    .addComponent(txtSelect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddActionPerformed
        // TODO add your handling code here:
        NhanVien nv = new NhanVien();
        nv.setMaNV(txtID.getText());
        nv.setTenNV(txtName.getText());
        if (btnRadio1.isSelected()) {
            nv.setGioiTinh(true);
        } else if (btnRadio2.isSelected()) {
            nv.setGioiTinh(false);
        }
        nv.setThamNien(Integer.parseInt(txtThamNien.getSelectedItem().toString()));
        list.add(nv);
        boolean check = true;
        loadTable();
        if (check == true) {
            JOptionPane.showMessageDialog(rootPane, "Bạn đã thêm thành công");
        } else {
            this.dispose();
        }
        // Xóa dữ liệu ở text fied
        txtID.setText("");
        txtName.setText("");
        buttonGroup1.clearSelection();
        txtThamNien.setSelectedIndex(0);
    }//GEN-LAST:event_txtAddActionPerformed


    private void txtUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateActionPerformed
        // TODO add your handling code here:
        int row = txtTable.getSelectedRow();
        boolean check = true;
        if (row != -1) {
            String maNV = txtID.getText();
            String tenNV = txtName.getText();
            boolean gioiTinh = true;    // Mặc định true là nam
            if (btnRadio2.isSelected()) {
                gioiTinh = false; // false là nữ
            }
            String thamNien = (String) txtThamNien.getSelectedItem();

            NhanVien nv = list.get(row);
            nv.setMaNV(nv.getMaNV());
            nv.setTenNV(nv.getTenNV());
            nv.setGioiTinh(nv.getGioiTinh());
            nv.setThamNien(nv.getThamNien());

            // Cập nhật lại dữ liệu trong table
            DefaultTableModel model = (DefaultTableModel) txtTable.getModel();
            model.setValueAt(maNV, row, 0);
            model.setValueAt(tenNV, row, 1);
            model.setValueAt(gioiTinh ? "Nam" : "Nữ", row, 2);
            model.setValueAt(thamNien, row, 3);
        }
        if (check == true) {
            JOptionPane.showMessageDialog(rootPane, "Bạn đã cập nhật thành công");
        } else {
            this.dispose();
        }
        // Xóa dữ liệu ở text fied
        txtID.setText("");
        txtName.setText("");
        buttonGroup1.clearSelection();
        txtThamNien.setSelectedIndex(0);
    }//GEN-LAST:event_txtUpdateActionPerformed

    private void loadTable() {
        DefaultTableModel model = (DefaultTableModel) txtTable.getModel();
        //Thay đổi cột
        model.setColumnCount(0);
        model.addColumn("Mã Nhân Viên");
        model.addColumn("Tên Nhân Viên");
        model.addColumn("Giới Tính");
        model.addColumn("Thâm Niên");
        model.addColumn("Khen Thưởng");
        // Thay đổi dòng
        model.setRowCount(0);
        for (NhanVien nv : list) {
            Object[] box = new Object[]{
                nv.getMaNV(),
                nv.getTenNV(),
                nv.getGioiTinh(),
                nv.getThamNien(),
                nv.tinhThuong(),};
            model.addRow(box);
        }
    }

    private void txtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeleteActionPerformed
        // TODO add your handling code here:
        int row = txtTable.getSelectedRow();
        boolean check = true;
        if (row != -1) {
            list.remove(row);
            loadTable();
        }
        if (check == true) {
            JOptionPane.showMessageDialog(rootPane, "Bạn đã xóa thành công");
        } else {
            this.dispose();
        }
    }//GEN-LAST:event_txtDeleteActionPerformed

    private void txtSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelectActionPerformed
        // TODO add your handling code here:
        //NhanVien nv = new NhanVien();
        list.add(new NhanVien("KHv@1", "Nguyễn Thúy Hằng", false, 2));
        list.add(new NhanVien("KHv@2", "Trần Tuấn Phong", true, 14));
        list.add(new NhanVien("KHv@3", "Vũ Văn Nguyên", true, 13));
        list.add(new NhanVien("KHv@4", "Nguyễn Hoàng Tiến", true, 1));
        list.add(new NhanVien("KHv@5", "Chu Thị Ngân", false, 5));
        loadTable();
    }//GEN-LAST:event_txtSelectActionPerformed

    private void txtThamNienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThamNienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThamNienActionPerformed

    private void txtTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTableMouseClicked
        // TODO add your handling code here:
        int choice = txtTable.getSelectedRow();
        if (choice == -1) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa lựa chọn");
            return;
        }
        Object idStr = txtTable.getValueAt(choice, 0);
        Object tenStr = txtTable.getValueAt(choice, 1);
        Object gioiTinhStr = txtTable.getValueAt(choice, 2);
        Object thamNienStr = txtTable.getValueAt(choice, 3);

        String ma = idStr.toString();
        String ten = tenStr.toString();
        boolean gioiTinh = Boolean.parseBoolean(gioiTinhStr.toString());
        Integer thamNien = Integer.parseInt(thamNienStr.toString());

        txtID.setText(ma);
        txtName.setText(ten);
        if (gioiTinh) {
            btnRadio1.setSelected(true); // Nam
        } else {
            btnRadio2.setSelected(true); // Nữ
        }
        txtThamNien.setSelectedIndex(thamNien - 1);
    }//GEN-LAST:event_txtTableMouseClicked

    public Integer tinhThuong(int thamNien) {
        if (thamNien > 12) {
            return 500000;
        } else {
            return 200000;
        }
    }

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
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnRadio1;
    private javax.swing.JRadioButton btnRadio2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel time;
    private javax.swing.JButton txtAdd;
    private javax.swing.JButton txtDelete;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JButton txtSelect;
    private javax.swing.JTable txtTable;
    private javax.swing.JComboBox<String> txtThamNien;
    private javax.swing.JButton txtUpdate;
    // End of variables declaration//GEN-END:variables

//    private void showComboData() {
//        List<Integer> data = txtThamNien.getData();
//        for (int i = 0; i < 10; i++) {
//            txtThamNien.addItem(i);
//        }
//    }
}
