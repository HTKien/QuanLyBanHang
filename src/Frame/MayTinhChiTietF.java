/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import LopDoiTuong.ExcelHelper;
import LopDoiTuong.KetNoiQLBH;
import LopDoiTuong.MayTinh;
import LopDoiTuong.MayTinhChiTiet;
import com.sun.webkit.perf.WCFontPerfLogger;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hantr
 */
public class MayTinhChiTietF extends javax.swing.JFrame {

    KetNoiQLBH ketNoiQLlBH = null;
    Connection connection = null;
    /**
     * Creates new form MayTinhChiTietF
     */

    ArrayList<MayTinhChiTiet> listMayTinhChiTiets = MayTinhChiTiet.getList();

    public MayTinhChiTietF() throws ClassNotFoundException, SQLException {
        ketNoiQLlBH = new KetNoiQLBH();
        connection = ketNoiQLlBH.getJDBCConnect();
        initComponents();
        this.setLocationRelativeTo(null);

        comboboxMaMayTinhChiTiet();
        comboboxGiaBan();
        comboboxGiaNhap();
        comboboxMauSac();
        mamaytinhtt.setText("" + MayTinhF.docMaMayTinh());
        loadData();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        bangmaytinhchitiet = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mamaytinhtt = new javax.swing.JTextField();
        machitiettt = new javax.swing.JTextField();
        motatt = new javax.swing.JTextField();
        gianhaptt = new javax.swing.JTextField();
        giabantt = new javax.swing.JTextField();
        cauhinhtt = new javax.swing.JTextField();
        mausactt = new javax.swing.JTextField();
        tonkhott = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        mamaytinhchitietR = new javax.swing.JRadioButton();
        gianhapR = new javax.swing.JRadioButton();
        giabanR = new javax.swing.JRadioButton();
        mausacR = new javax.swing.JRadioButton();
        mamaytinhchitietI = new javax.swing.JComboBox();
        gianhapcbb = new javax.swing.JComboBox();
        giabancbb = new javax.swing.JComboBox();
        maucbb = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bangmaytinhchitiet.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(bangmaytinhchitiet);

        jLabel1.setText("Nhập thông tin máy tính chi tiết: ");

        jLabel2.setText("Mã máy tính chi tiết: ");

        jLabel3.setText("Mô tả: ");

        jLabel4.setText("Giá nhập :");

        jLabel5.setText("Giá bán: ");

        jLabel6.setText("Cấu hình: ");

        jLabel7.setText("Màu sắc: ");

        jLabel8.setText("Số lượng tồn kho: ");

        jLabel9.setText("Danh sách máy tính chi tiết của mã máy tính: ");

        jButton1.setText("Reset ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Quay lại ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel10.setText("Tìm kiếm ");

        buttonGroup1.add(mamaytinhchitietR);
        mamaytinhchitietR.setText("Mã máy tính chi tiết ");

        buttonGroup1.add(gianhapR);
        gianhapR.setText("Giá nhập ");

        buttonGroup1.add(giabanR);
        giabanR.setText("Giá bán ");

        buttonGroup1.add(mausacR);
        mausacR.setText("Màu sắc");

        jButton5.setText("Tìm kiếm ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Thêm ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Sửa");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Xóa");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Thêm file");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Xuất file");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mamaytinhtt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(460, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(224, 224, 224))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mamaytinhchitietR)
                                        .addGap(18, 18, 18)
                                        .addComponent(mamaytinhchitietI, 0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(gianhapR)
                                        .addGap(68, 68, 68)
                                        .addComponent(gianhapcbb, 0, 1, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(giabanR)
                                        .addGap(74, 74, 74)
                                        .addComponent(giabancbb, 0, 1, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mausacR)
                                        .addGap(74, 74, 74)
                                        .addComponent(maucbb, 0, 1, Short.MAX_VALUE)))
                                .addGap(188, 188, 188))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(machitiettt)
                                    .addComponent(motatt)
                                    .addComponent(gianhaptt)
                                    .addComponent(giabantt)
                                    .addComponent(cauhinhtt)
                                    .addComponent(mausactt)
                                    .addComponent(tonkhott, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton7)
                                .addGap(79, 79, 79)
                                .addComponent(jButton8)
                                .addGap(68, 68, 68)
                                .addComponent(jButton1)
                                .addGap(46, 46, 46))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(mamaytinhchitietI, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(machitiettt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mamaytinhchitietR)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(motatt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(gianhaptt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(giabantt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cauhinhtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(mausactt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tonkhott, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton7)
                            .addComponent(jButton8)
                            .addComponent(jButton10)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gianhapR)
                            .addComponent(gianhapcbb, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(giabanR)
                            .addComponent(giabancbb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maucbb, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mausacR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(mamaytinhtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        loadData();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        reset();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            try {
                // TODO add your handling code here:
                new MayTinhF().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(MayTinhChiTietF.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MayTinhChiTietF.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (mamaytinhchitietR.isSelected()) {

            timKiemTheoMaMayTinhChiTiet();
        } else if (gianhapR.isSelected()) {

            timKiemTheoGiaNhap();
        } else if (giabanR.isSelected()) {

            timKiemTheoGiaBan();
        } else if (mausacR.isSelected()) {
            timKiemTheoMauSac();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            // TODO add your handling code here:
            themMayTinhChiTiet();
        } catch (SQLException ex) {
            Logger.getLogger(MayTinhChiTietF.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadData();
        JOptionPane.showMessageDialog(this, "Thêm máy tính chi tiết thành công!");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try {
            suaMayTinhChiTiet();
        } catch (SQLException ex) {
            Logger.getLogger(MayTinhF.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadData();
        JOptionPane.showMessageDialog(this, "Sửa máy tính thành công!");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        int chose = JOptionPane.showConfirmDialog(null, "Xác nhận", "Thêm", 0);
        if (chose == 0) {
            try {
                xoaMayTinhChiTiet();
            } catch (SQLException ex) {
                Logger.getLogger(MayTinhF.class.getName()).log(Level.SEVERE, null, ex);
            }
            loadData();
            JOptionPane.showMessageDialog(this, "Xóa máy tính thành công!");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser = new JFileChooser();
        if (jFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            String type = file.getName().substring(file.getName().lastIndexOf(".") + 1);
            System.out.println(type);

            if (type.equals("xls") || type.equals("xlsx")) {
                try {
                    ArrayList<MayTinhChiTiet> list = ExcelHelper.readMayTinhChiTiet(file);
                    int re = -1;
                    for (MayTinhChiTiet o : list) {
                        re = MayTinhChiTiet.add(o);
                        if (re != 1) {
                            break;
                        }
                    }
                    if (re == 1) {
                        loadData();
                        JOptionPane.showMessageDialog(null, "Thêm thành công");
                    } else {
                        JOptionPane.showMessageDialog(null, "Thêm thất bại");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Thêm thất bại");
                    Logger.getLogger(MayTinh.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(MayTinhChiTietF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MayTinhChiTietF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MayTinhChiTietF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MayTinhChiTietF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MayTinhChiTietF().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MayTinhChiTietF.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(MayTinhChiTietF.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bangmaytinhchitiet;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cauhinhtt;
    private javax.swing.JRadioButton giabanR;
    private javax.swing.JComboBox giabancbb;
    private javax.swing.JTextField giabantt;
    private javax.swing.JRadioButton gianhapR;
    private javax.swing.JComboBox gianhapcbb;
    private javax.swing.JTextField gianhaptt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField machitiettt;
    private javax.swing.JComboBox mamaytinhchitietI;
    private javax.swing.JRadioButton mamaytinhchitietR;
    private javax.swing.JTextField mamaytinhtt;
    private javax.swing.JComboBox maucbb;
    private javax.swing.JRadioButton mausacR;
    private javax.swing.JTextField mausactt;
    private javax.swing.JTextField motatt;
    private javax.swing.JTextField tonkhott;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        bangmaytinhchitiet.removeAll();
        String[] columns = new String[]{"Mã máy tính chi tiết", "Mã máy tính", "Mô tả", "Giá nhập", "Giá bán", "Cấu hình", "Màu sắc", "Số lượng tồn kho"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        String sql = "select * from maytinhchitiet where maMayTinh = '" + MayTinhF.docMaMayTinh() + "'; ";

        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
//                JOptionPane.showMessageDialog(null, resultSet.getDouble("giaTien"));
                Vector vector = new Vector();
                vector.add(resultSet.getInt("maMayTinhChiTiet"));
                vector.add(resultSet.getInt("maMayTinh"));
                vector.add(resultSet.getString("moTa"));
                vector.add(resultSet.getDouble("giaNhap"));
                vector.add(resultSet.getDouble("giaBan"));
                vector.add(resultSet.getString("cauHinh"));
                vector.add(resultSet.getString("mauSac"));
                vector.add(resultSet.getInt("soLuongTonKho"));

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        bangmaytinhchitiet.setModel(model);

        bangmaytinhchitiet.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (bangmaytinhchitiet.getSelectedRow() >= 0) {
                    machitiettt.setText(bangmaytinhchitiet.getValueAt(bangmaytinhchitiet.getSelectedRow(), 0).toString());
                    mamaytinhtt.setText(bangmaytinhchitiet.getValueAt(bangmaytinhchitiet.getSelectedRow(), 1).toString());
                    motatt.setText(bangmaytinhchitiet.getValueAt(bangmaytinhchitiet.getSelectedRow(), 2).toString());
                    gianhaptt.setText(bangmaytinhchitiet.getValueAt(bangmaytinhchitiet.getSelectedRow(), 3).toString());
                    giabantt.setText(bangmaytinhchitiet.getValueAt(bangmaytinhchitiet.getSelectedRow(), 4).toString());
                    cauhinhtt.setText(bangmaytinhchitiet.getValueAt(bangmaytinhchitiet.getSelectedRow(), 5).toString());
                    mausactt.setText(bangmaytinhchitiet.getValueAt(bangmaytinhchitiet.getSelectedRow(), 6).toString());
                    tonkhott.setText(bangmaytinhchitiet.getValueAt(bangmaytinhchitiet.getSelectedRow(), 7).toString());

                }
            }
        });
    }

    private void reset() {
        machitiettt.setText("");
        motatt.setText("");
        gianhaptt.setText("");
        giabantt.setText("");
        cauhinhtt.setText("");
        mausactt.setText("");
        tonkhott.setText("");

    }

    public void comboboxMaMayTinhChiTiet() {

        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (int i = 0; i < listMayTinhChiTiets.size(); i++) {
            if (listMayTinhChiTiets.get(i).getMaMayTinh() == MayTinhF.docMaMayTinh()) {
                model.addElement(listMayTinhChiTiets.get(i).getMaMayTinhChiTiet());
            }
        }
        mamaytinhchitietI.setModel(model);

    }

    public void comboboxGiaNhap() {

        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (int i = 0; i < listMayTinhChiTiets.size(); i++) {
            if (listMayTinhChiTiets.get(i).getMaMayTinh() == MayTinhF.docMaMayTinh()) {
                model.addElement(listMayTinhChiTiets.get(i).getGiaNhap());
            }
        }
        gianhapcbb.setModel(model);

    }

    public void comboboxGiaBan() {

        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (int i = 0; i < listMayTinhChiTiets.size(); i++) {
            if (listMayTinhChiTiets.get(i).getMaMayTinh() == MayTinhF.docMaMayTinh()) {
                model.addElement(listMayTinhChiTiets.get(i).getGiaBan());
            }
        }
        giabancbb.setModel(model);

    }

    public void comboboxMauSac() {

        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (int i = 0; i < listMayTinhChiTiets.size(); i++) {
            if (listMayTinhChiTiets.get(i).getMaMayTinh() == MayTinhF.docMaMayTinh()) {
                model.addElement(listMayTinhChiTiets.get(i).getMauSac());
            }
        }
        maucbb.setModel(model);

    }

    private void timKiemTheoMaMayTinhChiTiet() {
        String sql = "select * from maytinhchitiet where maMayTinhChiTiet =" + mamaytinhchitietI.getSelectedItem();
        thucThiSqlTimKiem(sql);
    }

    private void timKiemTheoGiaNhap() {
        String sql = "select * from maytinhchitiet where giaNhap =" + gianhapcbb.getSelectedItem()+"and maMayTinh="+MayTinhF.docMaMayTinh()+";";
        thucThiSqlTimKiem(sql);
    }

    private void timKiemTheoGiaBan() {
        String sql = "select * from maytinhchitiet where giaBan =" + giabancbb.getSelectedItem()+"and maMayTinh="+MayTinhF.docMaMayTinh()+";";
        thucThiSqlTimKiem(sql);
    }

    private void timKiemTheoMauSac() {
        String sql = "select * from maytinhchitiet where mauSac ='" + maucbb.getSelectedItem()+"' and maMayTinh="+MayTinhF.docMaMayTinh()+";";
        thucThiSqlTimKiem(sql);
    }

    private void thucThiSqlTimKiem(String sql) {
        String[] columns = new String[]{"Mã máy tính chi tiết", "Mã máy tính", "Mô tả", "Giá nhập", "Giá bán", "Cấu hình", "Màu sắc", "Số lượng tồn kho"};

        DefaultTableModel model = new DefaultTableModel(columns, 0);

        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
//                JOptionPane.showMessageDialog(null, resultSet.getDouble("giaTien"));
                Vector vector = new Vector();
                vector.add(resultSet.getInt("maMayTinhChiTiet"));
                vector.add(resultSet.getInt("maMayTinh"));
                vector.add(resultSet.getString("moTa"));
                vector.add(resultSet.getDouble("giaNhap"));
                vector.add(resultSet.getDouble("giaBan"));
                vector.add(resultSet.getString("cauHinh"));
                vector.add(resultSet.getString("mauSac"));
                vector.add(resultSet.getInt("soLuongTonKho"));

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        bangmaytinhchitiet.setModel(model);
        bangmaytinhchitiet.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (bangmaytinhchitiet.getSelectedRow() >= 0) {
                    machitiettt.setText(bangmaytinhchitiet.getValueAt(bangmaytinhchitiet.getSelectedRow(), 0).toString());
                    mamaytinhtt.setText(bangmaytinhchitiet.getValueAt(bangmaytinhchitiet.getSelectedRow(), 1).toString());
                    motatt.setText(bangmaytinhchitiet.getValueAt(bangmaytinhchitiet.getSelectedRow(), 2).toString());
                    gianhaptt.setText(bangmaytinhchitiet.getValueAt(bangmaytinhchitiet.getSelectedRow(), 3).toString());
                    giabantt.setText(bangmaytinhchitiet.getValueAt(bangmaytinhchitiet.getSelectedRow(), 4).toString());
                    cauhinhtt.setText(bangmaytinhchitiet.getValueAt(bangmaytinhchitiet.getSelectedRow(), 5).toString());
                    mausactt.setText(bangmaytinhchitiet.getValueAt(bangmaytinhchitiet.getSelectedRow(), 6).toString());
                    tonkhott.setText(bangmaytinhchitiet.getValueAt(bangmaytinhchitiet.getSelectedRow(), 7).toString());

                }
            }
        });
    }

    private void themMayTinhChiTiet() throws SQLException {
        //doc id
        String ma = machitiettt.getText();
        int maMayTinhChiTiet = Integer.parseInt(ma);

        //doc ten 
        String moTa = motatt.getText();
        //
        String gianhap = gianhaptt.getText();
        Double giaNhap = Double.parseDouble(gianhap);
        //
        String giaban = giabantt.getText();
        Double giaBan = Double.parseDouble(giaban);
        //
        String cauHinh = cauhinhtt.getText();
        //
        String mauSac = mausactt.getText();
        int maMayTinh = MayTinhF.docMaMayTinh();

        //
        String soluongtonkho = tonkhott.getText();
        int soLuongTonKho = Integer.parseInt(soluongtonkho);

        String sql = "insert into maytinhchitiet (maMayTinhChiTiet, maMayTinh,moTa, giaNhap, giaBan, cauHinh,mauSac , soLuongTonKho ) values ('" + maMayTinhChiTiet + "','" + maMayTinh + "', '" + moTa + "', '" + giaNhap + "', '" + giaBan + "', '" + cauHinh + "', '" + mauSac + "', '" + soLuongTonKho + "');";
        Statement statement = null;
        ResultSet resultSet = null;

        statement = connection.createStatement();
        statement.executeUpdate(sql);
    }

    private void suaMayTinhChiTiet() throws SQLException {
        //doc id
        String ma = machitiettt.getText();
        int maMayTinhChiTiet = Integer.parseInt(ma);

        //doc ten 
        String moTa = motatt.getText();
        //
        String gianhap = gianhaptt.getText();
        Double giaNhap = Double.parseDouble(gianhap);
        //
        String giaban = giabantt.getText();
        Double giaBan = Double.parseDouble(giaban);
        //
        String cauHinh = cauhinhtt.getText();
        //
        String mauSac = mausactt.getText();
        int maMayTinh = MayTinhF.docMaMayTinh();

        //
        String soluongtonkho = tonkhott.getText();
        int soLuongTonKho = Integer.parseInt(soluongtonkho);

        String sql = "update  maytinhchitiet set   moTa='" + moTa + "', giaNhap='" + giaNhap + "',giaBan='" + giaBan + "',cauHinh='" + cauHinh + "',mauSac='" + mauSac + "',soLuongTonKho='" + soLuongTonKho + "'   where maMayTinhChiTiet='" + maMayTinhChiTiet + "';";

        Statement statement = null;
        ResultSet resultSet = null;

        statement = connection.createStatement();
        statement.executeUpdate(sql);
    }

    private void xoaMayTinhChiTiet() throws SQLException {
        String ma = machitiettt.getText();
        int maMayTinhChiTiet = Integer.parseInt(ma);

        String sql = "delete from maytinhchitiet where maMayTinhChiTiet = " + maMayTinhChiTiet;
        Statement statement = null;
        ResultSet resultSet = null;

        statement = connection.createStatement();
        statement.executeUpdate(sql);
    }
}
