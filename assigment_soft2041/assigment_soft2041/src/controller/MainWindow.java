/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package controller;

/**
 *
 * @author admin
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemChuyenDe = new javax.swing.JMenuItem();
        jMenuItemKhoaHoc = new javax.swing.JMenuItem();
        jMenuItemNguoiHoc = new javax.swing.JMenuItem();
        jMenuItemHocVien = new javax.swing.JMenuItem();
        jMenuItemNhanVien = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuTKBangDiem = new javax.swing.JMenuItem();
        jMenuItemTKNguoiHoc = new javax.swing.JMenuItem();
        jMenuItemTKChuyenDe = new javax.swing.JMenuItem();
        jMenuItemTKDoanhThu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Hệ thống");

        jMenuItem1.setText("Đăng nhập");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Đăng xuất");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Đổi mật khẩu");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Kết thúc");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        jMenuItemChuyenDe.setText("Chuyên đề");
        jMenu2.add(jMenuItemChuyenDe);

        jMenuItemKhoaHoc.setText("Khóa học");
        jMenu2.add(jMenuItemKhoaHoc);

        jMenuItemNguoiHoc.setText("Người học");
        jMenu2.add(jMenuItemNguoiHoc);

        jMenuItemHocVien.setText("Học viên");
        jMenuItemHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHocVienActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemHocVien);

        jMenuItemNhanVien.setText("Nhân viên");
        jMenuItemNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNhanVienActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemNhanVien);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Thống kê");

        jMenuTKBangDiem.setText("Bảng điểm");
        jMenuTKBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTKBangDiemActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuTKBangDiem);

        jMenuItemTKNguoiHoc.setText("Lượng người học");
        jMenuItemTKNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTKNguoiHocActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemTKNguoiHoc);

        jMenuItemTKChuyenDe.setText("Điểm chuyên đề");
        jMenuItemTKChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTKChuyenDeActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemTKChuyenDe);

        jMenuItemTKDoanhThu.setText("Doanh thu");
        jMenu3.add(jMenuItemTKDoanhThu);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNhanVienActionPerformed
        NhanVienJDialog dlg = new NhanVienJDialog(this, true);
        dlg.setVisible(true);
    }//GEN-LAST:event_jMenuItemNhanVienActionPerformed

    private void jMenuItemHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHocVienActionPerformed
        HocVienJDialog dlg = new HocVienJDialog(this, true);
        dlg.setVisible(true);
    }//GEN-LAST:event_jMenuItemHocVienActionPerformed

    private void jMenuItemTKChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTKChuyenDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemTKChuyenDeActionPerformed

    private void jMenuTKBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTKBangDiemActionPerformed
        ThongKeJDialog dlg = new ThongKeJDialog(this, true);
        dlg.setTab(0);
        dlg.setVisible(true);
    }//GEN-LAST:event_jMenuTKBangDiemActionPerformed

    private void jMenuItemTKNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTKNguoiHocActionPerformed
        ThongKeJDialog dlg = new ThongKeJDialog(this, true);
        dlg.setTab(1);
        dlg.setVisible(true);
    }//GEN-LAST:event_jMenuItemTKNguoiHocActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItemChuyenDe;
    private javax.swing.JMenuItem jMenuItemHocVien;
    private javax.swing.JMenuItem jMenuItemKhoaHoc;
    private javax.swing.JMenuItem jMenuItemNguoiHoc;
    private javax.swing.JMenuItem jMenuItemNhanVien;
    private javax.swing.JMenuItem jMenuItemTKChuyenDe;
    private javax.swing.JMenuItem jMenuItemTKDoanhThu;
    private javax.swing.JMenuItem jMenuItemTKNguoiHoc;
    private javax.swing.JMenuItem jMenuTKBangDiem;
    // End of variables declaration//GEN-END:variables
}
