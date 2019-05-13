/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import LopDoiTuong.ExcelHelper;
import LopDoiTuong.KetNoiQLBH;
import LopDoiTuong.MayTinh;
import LopDoiTuong.WordHelper;
import com.sun.webkit.perf.WCFontPerfLogger;
import java.io.File;
import java.io.IOException;
import java.security.cert.CRLReason;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hantr
 */
public class MayTinhF extends javax.swing.JFrame {

    /**
     * Creates new form MayTinhF
     */
    //ArrayList<MayTinh> listMayTinhs; 
    KetNoiQLBH ketNoiQLlBH = null;
    Connection connection = null;
    ArrayList<MayTinh> listMayTinhs = MayTinh.getlistMaytinh();

    public MayTinhF() throws ClassNotFoundException, SQLException {
        ketNoiQLlBH = new KetNoiQLBH();
        connection = ketNoiQLlBH.getJDBCConnect();
        initComponents();
        loadData();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        bangmaytinh = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mamaytinh = new javax.swing.JTextField();
        tenmaytinh = new javax.swing.JTextField();
        nhasanxuat = new javax.swing.JTextField();
        namsx = new javax.swing.JTextField();
        tgbh = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        machon = new javax.swing.JRadioButton();
        tenchon = new javax.swing.JRadioButton();
        nhasanxuatchon = new javax.swing.JRadioButton();
        namsxchon = new javax.swing.JRadioButton();
        timkiem = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bangmaytinh.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(bangmaytinh);

        jButton1.setText("Rfresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Thêm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã máy tính: ");

        jLabel2.setText("Tên máy tính: ");

        jLabel3.setText("Nhà sản xuất: ");

        jLabel4.setText("Năm sản xuất: ");

        jLabel5.setText("Thời gian bảo hành (tháng): ");

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Sửa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Xóa");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Thống kê ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Quay lại ");

        jButton8.setText("Thêm 1 file ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Xuất 1 file");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel6.setText("Tìm kiếm ");

        buttonGroup1.add(machon);
        machon.setText("Mã máy tính");

        buttonGroup1.add(tenchon);
        tenchon.setText("Tên máy tính");

        buttonGroup1.add(nhasanxuatchon);
        nhasanxuatchon.setText("Nhà sản xuất ");

        buttonGroup1.add(namsxchon);
        namsxchon.setText("Năm sản xuất ");

        jButton10.setText("Tìm kiếm ");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel7.setText("Nhập thông tin:");

        jButton11.setText("Xem chi tiết");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(nhasanxuatchon)
                                                    .addComponent(machon))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tenchon)
                                                    .addComponent(namsxchon)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addComponent(jButton10)))
                                        .addGap(115, 115, 115)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(namsx, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                                    .addComponent(nhasanxuat, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tgbh))
                                                .addGap(28, 28, 28)
                                                .addComponent(jButton3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(tenmaytinh, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                                    .addComponent(mamaytinh)))
                                            .addComponent(jLabel7)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jButton8)
                                        .addGap(49, 49, 49)
                                        .addComponent(jButton9)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jScrollPane1)))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(32, 32, 32)
                        .addComponent(jButton5)
                        .addGap(26, 26, 26)
                        .addComponent(jButton11)
                        .addGap(28, 28, 28)
                        .addComponent(jButton6)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(mamaytinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tenmaytinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nhasanxuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(namsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tgbh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6)
                            .addComponent(jButton11)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(machon)
                            .addComponent(tenchon))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nhasanxuatchon, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(namsxchon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(jButton9))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton7)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            themMayTinh();
        } catch (SQLException ex) {
            Logger.getLogger(MayTinhF.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadData();
        JOptionPane.showMessageDialog(this, "Thêm máy tính thành công!");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        reset();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            suaMayTinh();
        } catch (SQLException ex) {
            Logger.getLogger(MayTinhF.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadData();
        JOptionPane.showMessageDialog(this, "Sửa máy tính thành công!");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int chose = JOptionPane.showConfirmDialog(null, "Xác nhận", "Thêm", 0);
        if (chose == 0) {
            try {
                xoaMayTinh();
            } catch (SQLException ex) {
                Logger.getLogger(MayTinhF.class.getName()).log(Level.SEVERE, null, ex);
            }
            loadData();
            JOptionPane.showMessageDialog(this, "Xóa máy tính thành công!");
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if (machon.isSelected()) {

            try {
                loadListTimKiemTheoMa();
            } catch (SQLException ex) {
                Logger.getLogger(MayTinhF.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MayTinhF.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (tenchon.isSelected()) {
            try {
                loadListTimKiemTheoTen();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MayTinhF.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(MayTinhF.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (nhasanxuatchon.isSelected()) {
            try {
                loadListTiemKiemTheoNSX();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MayTinhF.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(MayTinhF.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (namsxchon.isSelected()) {
            try {
                loadListTimKiemTheoNamSX();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MayTinhF.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(MayTinhF.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        try {
            // TODO add your handling code here:
            new MayTinhChiTietF().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MayTinhF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MayTinhF.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            // TODO add your handling code here:
            new ThongKeMayTinh().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MayTinhF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser = new JFileChooser();
        if (jFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            String type = file.getName().substring(file.getName().lastIndexOf(".") + 1);
            System.out.println(type);

            if (type.equals("xls") || type.equals("xlsx")) {
                try {
                    ArrayList<MayTinh> list = ExcelHelper.readMayTinh(file);
                    int re = -1;
                    for (MayTinh o : list) {
                        re = MayTinh.add(o);
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
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser = new JFileChooser();
        if (jFileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();

            try {
                WordHelper.writeMayTinh(file, listMayTinhs, "THÔNG TIN MÁY TÍNH");
                JOptionPane.showMessageDialog(null, "Xuất file thành công");

            } catch (IOException ex) {
                Logger.getLogger(MayTinhF.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Xuất file thất bại!");
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
            java.util.logging.Logger.getLogger(MayTinhF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MayTinhF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MayTinhF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MayTinhF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    try {
                        new MayTinhF().setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(MayTinhF.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MayTinhF.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bangmaytinh;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton machon;
    public static javax.swing.JTextField mamaytinh;
    private javax.swing.JTextField namsx;
    private javax.swing.JRadioButton namsxchon;
    private javax.swing.JTextField nhasanxuat;
    private javax.swing.JRadioButton nhasanxuatchon;
    private javax.swing.JRadioButton tenchon;
    private javax.swing.JTextField tenmaytinh;
    private javax.swing.JTextField tgbh;
    private javax.swing.JTextField timkiem;
    // End of variables declaration//GEN-END:variables

    private void reset() {

        mamaytinh.setText("");
        tenmaytinh.setText("");
        nhasanxuat.setText("");
        namsx.setText("");
        tgbh.setText("");
    }

    private void loadListTimKiemTheoMa() throws ClassNotFoundException, SQLException {
        int input = Integer.parseInt(timkiem.getText());
        String sql = "select * from maytinh where maMaytinh ='" + input + "'; ";

        thucThiSqlTimKiem(sql);
    }

    public void loadListTimKiemTheoTen() throws ClassNotFoundException, SQLException {
        String input = timkiem.getText().toString();
        String sql = "select * from maytinh where tenMayTinh='" + input + "'; ";
        thucThiSqlTimKiem(sql);

    }

    public void loadListTiemKiemTheoNSX() throws ClassNotFoundException, SQLException {
        String input = timkiem.getText().toString();
        String sql = "select * from maytinh where nhaSanXuat='" + input + "'; ";
        thucThiSqlTimKiem(sql);
    }

    private void loadListTimKiemTheoNamSX() throws ClassNotFoundException, SQLException {
        int input = Integer.parseInt(timkiem.getText());
        String sql = "select * from maytinh where namSanXuat ='" + input + "'; ";
        thucThiSqlTimKiem(sql);
    }

    private void thucThiSqlTimKiem(String sql) {
        String[] columns = {"Mã máy tính", "Tên máy tính", "Nhà sản xuất", "Năm sản xuất", "Thời gian bảo hành"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
//                JOptionPane.showMessageDialog(null, resultSet.getDouble("giaTien"));
                Vector vector = new Vector();
                vector.add(resultSet.getInt("maMayTinh"));
                vector.add(resultSet.getString("tenMayTinh"));
                vector.add(resultSet.getString("nhaSanXuat"));
                vector.add(resultSet.getInt("namSanXuat"));
                vector.add(resultSet.getInt("thoiGianBaoHanh"));

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        bangmaytinh.setModel(model);
        bangmaytinh.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (bangmaytinh.getSelectedRow() >= 0) {
                    mamaytinh.setText(bangmaytinh.getValueAt(bangmaytinh.getSelectedRow(), 0).toString());
                    tenmaytinh.setText(bangmaytinh.getValueAt(bangmaytinh.getSelectedRow(), 1).toString());
                    nhasanxuat.setText(bangmaytinh.getValueAt(bangmaytinh.getSelectedRow(), 2).toString());
                    namsx.setText(bangmaytinh.getValueAt(bangmaytinh.getSelectedRow(), 3).toString());
                    tgbh.setText(bangmaytinh.getValueAt(bangmaytinh.getSelectedRow(), 4).toString());

                }
            }
        });
    }

    private void loadData() {
        bangmaytinh.removeAll();
        String sql = "select * from maytinh ; ";
        String[] columns = {"Mã máy tính", "Tên máy tính", "Nhà sản xuất", "Năm sản xuất", "Thời gian bảo hành"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
//                JOptionPane.showMessageDialog(null, resultSet.getDouble("giaTien"));
                Vector vector = new Vector();
                vector.add(resultSet.getInt("maMayTinh"));
                vector.add(resultSet.getString("tenMayTinh"));
                vector.add(resultSet.getString("nhaSanXuat"));
                vector.add(resultSet.getInt("namSanXuat"));
                vector.add(resultSet.getInt("thoiGianBaoHanh"));

                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        bangmaytinh.setModel(model);
        bangmaytinh.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (bangmaytinh.getSelectedRow() >= 0) {
                    mamaytinh.setText(bangmaytinh.getValueAt(bangmaytinh.getSelectedRow(), 0).toString());
                    tenmaytinh.setText(bangmaytinh.getValueAt(bangmaytinh.getSelectedRow(), 1).toString());
                    nhasanxuat.setText(bangmaytinh.getValueAt(bangmaytinh.getSelectedRow(), 2).toString());
                    namsx.setText(bangmaytinh.getValueAt(bangmaytinh.getSelectedRow(), 3).toString());
                    tgbh.setText(bangmaytinh.getValueAt(bangmaytinh.getSelectedRow(), 4).toString());

                }
            }
        });
    }

    private void themMayTinh() throws SQLException {
        //doc id
        String ma = mamaytinh.getText();
        int maMayTinh = Integer.parseInt(ma);

        //doc ten 
        String tenMayTinh = tenmaytinh.getText();
        //
        String nhaSanXuat = nhasanxuat.getText();
        //
        String nam = namsx.getText();
        int namSanXuat = Integer.parseInt(nam);
        //
        String tgbaohanh = tgbh.getText();
        int thoiGianBaoHanh = Integer.parseInt(tgbaohanh);

        String sql = "insert into maytinh (maMayTinh, tenMayTinh, nhaSanXuat, namSanXuat, thoiGianBaoHanh) values ('" + maMayTinh + "','" + tenMayTinh + "', '" + nhaSanXuat + "', '" + namSanXuat + "', '" + thoiGianBaoHanh + "');";
        Statement statement = null;
        ResultSet resultSet = null;

        statement = connection.createStatement();
        statement.executeUpdate(sql);
    }

    private void suaMayTinh() throws SQLException {
        //doc id
        String ma = mamaytinh.getText();
        int maMayTinh = Integer.parseInt(ma);

        //doc ten 
        String tenMayTinh = tenmaytinh.getText();
        //
        String nhaSanXuat = nhasanxuat.getText();
        //
        String nam = namsx.getText();
        int namSanXuat = Integer.parseInt(nam);
        //
        String tgbaohanh = tgbh.getText();
        int thoiGianBaoHanh = Integer.parseInt(tgbaohanh);

        String sql = "update  maytinh set   tenMayTinh='" + tenMayTinh + "', nhaSanXuat='" + nhaSanXuat + "',namSanXuat='" + namSanXuat + "',thoiGianBaoHanh='" + thoiGianBaoHanh + "'   where maMayTinh='" + maMayTinh + "';";

        Statement statement = null;
        ResultSet resultSet = null;

        statement = connection.createStatement();
        statement.executeUpdate(sql);
    }

    private void xoaMayTinh() throws SQLException {
        String ma = mamaytinh.getText();
        int maMayTinh = Integer.parseInt(ma);

        String sql = "delete from maytinh where maMayTinh = " + maMayTinh;
        Statement statement = null;
        ResultSet resultSet = null;

        statement = connection.createStatement();
        statement.executeUpdate(sql);
    }

    public static int docMaMayTinh() {
        int a = 0;
        a = Integer.parseInt(mamaytinh.getText());
        return a;
    }
}
