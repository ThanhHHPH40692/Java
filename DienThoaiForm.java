package TEST1;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DienThoaiForm extends javax.swing.JFrame {

    private DefaultTableModel dtm = new DefaultTableModel();
    private DienThoaiService sv = new DienThoaiService();
    private ArrayList<DienThoai> list = new ArrayList<>();
    private String path = "DienThoai.txt";

    public DienThoaiForm() {
        initComponents();
        dtm = (DefaultTableModel) tblDienThoai.getModel();
        list = sv.fakedata();
        showData(list);
        
    }

    public void showData(ArrayList<DienThoai> l) {
        dtm.setRowCount(0);
        for (DienThoai d : l) {
            dtm.addRow(new Object[]{
                d.getTenSP(),
                //(1 hoặc 2)== 1 ? Thực hiện nếu đúng : Thực hiện nếu  
                d.getHang() == 1 ? "Samsung" : "Nokia" ,
                d.getGiaSP(),
                d.getStatus()
            });
        }
    }

    public void fillData(DienThoai dt) {
        txtTen.setText(dt.getTenSP());
        if (dt.getHang() == 1) {
            cbbHang.setSelectedItem("Samsung");
        } else {
            cbbHang.setSelectedItem("Nokia");
        }
        txtGia.setText(dt.getGiaSP() + "");
    }

    public void clear() {
        txtTen.setText("");
        txtGia.setText("");
    }

    public DienThoai getDaTa() {
        String tenDT = txtTen.getText().trim();
        String hangDT = cbbHang.getSelectedItem().toString();
        String giaDT = txtGia.getText().trim();
        float gia;
        int hang;
        if (hangDT.equalsIgnoreCase("samsung")) {
            hang = 1;
        } else {
            hang = 2;
        }
        if (tenDT.isEmpty() || giaDT.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống dữ liệu");
            return null;
        }

        try {
            gia = Float.parseFloat(giaDT);
            if (gia < 0) {
                JOptionPane.showMessageDialog(this, "Giá phải là số dương");
                return null;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Giá phải là số");
            return null;
        }
        DienThoai dt = new DienThoai(tenDT, hang, gia);
        return dt;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        cbbHang = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnMo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDienThoai = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ ĐIỆN THOẠI");

        jLabel2.setText("Tên ");

        jLabel3.setText("Hãng");

        jLabel4.setText("Giá");

        cbbHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Samsung", "Nokia" }));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnGhi.setText("Ghi");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnMo.setText("Mở");
        btnMo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoActionPerformed(evt);
            }
        });

        tblDienThoai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên", "Hãng", "Giá", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDienThoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDienThoaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDienThoai);
        if (tblDienThoai.getColumnModel().getColumnCount() > 0) {
            tblDienThoai.getColumnModel().getColumn(0).setResizable(false);
            tblDienThoai.getColumnModel().getColumn(1).setResizable(false);
            tblDienThoai.getColumnModel().getColumn(2).setResizable(false);
            tblDienThoai.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTen)
                    .addComponent(txtGia)
                    .addComponent(cbbHang, 0, 218, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem)
                    .addComponent(btnGhi)
                    .addComponent(btnMo))
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnGhi, btnMo, btnThem});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbbHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGhi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        DienThoai dt = getDaTa();
        JOptionPane.showMessageDialog(this, sv.addDienThoai(dt));
        showData(list);
        clear();
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblDienThoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDienThoaiMouseClicked
        int vitri = tblDienThoai.getSelectedRow();
        DienThoai dt = list.get(vitri);
        fillData(dt);
    }//GEN-LAST:event_tblDienThoaiMouseClicked

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        JOptionPane.showMessageDialog(this, sv.ghiFile(path));
    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnMoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoActionPerformed
        list.clear();
        JOptionPane.showMessageDialog(this, sv.docFile(path));
        showData(list);
        tblDienThoai.setRowSelectionInterval(1, 1);
        DienThoai dt = list.get(1);
        fillData(dt);
    }//GEN-LAST:event_btnMoActionPerformed

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
            java.util.logging.Logger.getLogger(DienThoaiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DienThoaiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DienThoaiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DienThoaiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DienThoaiForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnMo;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cbbHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDienThoai;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
