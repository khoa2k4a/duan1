/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Dialog.java to edit this template
 */
package com.poly.ui;

import com.poly.dao.ChuyenDeDao;
import com.poly.dao.HocVienDao;
import com.poly.dao.KhoaHocDao;
import com.poly.dao.NguoiHocDao;
import com.poly.entity.ChuyenDe;
import com.poly.entity.HocVien;
import com.poly.entity.KhoaHoc;
import com.poly.entity.NguoiHoc;
import com.poly.utils.Auth;
import com.poly.utils.MsgBox;
import com.poly.utils.XImage;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Admin
 */
public class QuanLyHocVienDiaLog extends java.awt.Dialog {

    /**
     * Creates new form QuanLyHocVienDiaLog
     */
    public QuanLyHocVienDiaLog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cbxChuyenDe = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        cbxKhoaHoc = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHocVien = new javax.swing.JTable();
        btnXoaHocVien = new javax.swing.JButton();
        btnCapNhatDiem = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNguoiHoc = new javax.swing.JTable();
        btnThemKhoaHoc = new javax.swing.JButton();

        setTitle("SysEdu - Quản lý học viên");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        cbxChuyenDe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbxChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxChuyenDeActionPerformed(evt);
            }
        });
        jPanel1.add(cbxChuyenDe);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        cbxKhoaHoc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbxKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxKhoaHocActionPerformed(evt);
            }
        });
        jPanel2.add(cbxKhoaHoc);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CHUYÊN ĐỀ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("KHÓA HỌC");

        tblHocVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "TT", "MÃ HV", "MÃ NH", "HỌ TÊN", "ĐIỂM"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHocVien);

        btnXoaHocVien.setText("Xóa khỏi khóa học");
        btnXoaHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHocVienActionPerformed(evt);
            }
        });

        btnCapNhatDiem.setText("Cập nhật điểm");
        btnCapNhatDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatDiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnXoaHocVien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCapNhatDiem)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaHocVien)
                    .addComponent(btnCapNhatDiem))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        tabs.addTab("Học viên", jPanel3);

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnTim)
                .addGap(14, 14, 14))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnTim, txtTimKiem});

        tblNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã HV", "Họ và tên", "Giới tính", "Ngày sinh", "Điện thoại", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblNguoiHoc);

        btnThemKhoaHoc.setText("Thêm vào khóa học");
        btnThemKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKhoaHocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnThemKhoaHoc)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnThemKhoaHoc)
                .addContainerGap())
        );

        tabs.addTab("Người học", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void cbxChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxChuyenDeActionPerformed
        fillcomboBoxKhoaHoc();
    }//GEN-LAST:event_cbxChuyenDeActionPerformed

    private void cbxKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxKhoaHocActionPerformed
        fillTableHocVien();
    }//GEN-LAST:event_cbxKhoaHocActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        fillTableNguoiHoc();
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnThemKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemKhoaHocActionPerformed
        addHocVien();
    }//GEN-LAST:event_btnThemKhoaHocActionPerformed

    private void btnXoaHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHocVienActionPerformed
        removeHocVien();
    }//GEN-LAST:event_btnXoaHocVienActionPerformed

    private void btnCapNhatDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatDiemActionPerformed
        System.out.println("Vào hàm cập nhật...");
        updateDiem();
    }//GEN-LAST:event_btnCapNhatDiemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuanLyHocVienDiaLog dialog = new QuanLyHocVienDiaLog(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatDiem;
    private javax.swing.JButton btnThemKhoaHoc;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoaHocVien;
    private javax.swing.JComboBox<ChuyenDe> cbxChuyenDe;
    private javax.swing.JComboBox<KhoaHoc> cbxKhoaHoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblHocVien;
    private javax.swing.JTable tblNguoiHoc;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    ChuyenDeDao cddao = new ChuyenDeDao();
    KhoaHocDao khdao = new KhoaHocDao();
    NguoiHocDao nhdao = new NguoiHocDao();
    HocVienDao hvdao = new HocVienDao();

    private void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getApplImage());
        this.fillcomboBoxChuyenDe();

        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);

        TableColumnModel model = tblHocVien.getColumnModel();
        model.getColumn(0).setMaxWidth(40);
        model.getColumn(0).setMaxWidth(50);
    }

    private void fillcomboBoxChuyenDe() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbxChuyenDe.getModel();
        model.removeAllElements();
        List<ChuyenDe> list = cddao.selectAll();
        for (ChuyenDe cd : list) {
            model.addElement(cd);
        }
        this.fillcomboBoxKhoaHoc();
    }

    private void fillcomboBoxKhoaHoc() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbxKhoaHoc.getModel();
        model.removeAllElements();
        ChuyenDe chuyenDe = (ChuyenDe) cbxChuyenDe.getSelectedItem();
        if (chuyenDe != null) {
            List<KhoaHoc> list = khdao.selectByChuyenDe(chuyenDe.getMaCD());
            for (KhoaHoc kh : list) {
                model.addElement(kh);
            }
            this.fillTableHocVien();
        }
    }

    private void fillTableHocVien() {
        DefaultTableModel model = (DefaultTableModel) tblHocVien.getModel();
        model.setRowCount(0);
        KhoaHoc khoaHoc = (KhoaHoc) cbxKhoaHoc.getSelectedItem();
        if (khoaHoc != null) {
            List<HocVien> list = hvdao.selectByKhoaHoc(khoaHoc.getMaKH());
            DecimalFormat df = new DecimalFormat("#.#");
            for (int i = 0; i < list.size(); i++) {
                HocVien hv = list.get(i);
                String hoTen = nhdao.selectById(hv.getMaNH()).getHoTen();
                Object[] rowData = new Object[]{i + 1, hv.getMaHV(), hv.getMaNH(), hoTen};
                model.insertRow(i, rowData);
                double diem = hv.getDiem();
                String formattedDiem = df.format(diem);
                model.setValueAt(formattedDiem, i, 4);
            }
            this.fillTableNguoiHoc();
        }
    }

    private void fillTableNguoiHoc() {
        DefaultTableModel model = (DefaultTableModel) tblNguoiHoc.getModel();
        model.setRowCount(0);
        KhoaHoc khoaHoc = (KhoaHoc) cbxKhoaHoc.getSelectedItem();
        String keyword = txtTimKiem.getText();
        List<NguoiHoc> list = nhdao.selectNotInCourse(khoaHoc.getMaKH(), keyword);
        for (NguoiHoc nh : list) {
            model.addRow(new Object[]{nh.getMaNH(), nh.getHoTen(), nh.isGioiTinh() ? "Nam" : "Nữ", nh.getNgaySinh(), nh.getDienThoai(), nh.getEmail()});
        }
    }

    private void addHocVien() {
        KhoaHoc khoaHoc = (KhoaHoc) cbxKhoaHoc.getSelectedItem();
        for (int row : tblNguoiHoc.getSelectedRows()) {
            HocVien hv = new HocVien();
            hv.setMaKH(khoaHoc.getMaKH());
            hv.setDiem(0);
            hv.setMaNH((String) tblNguoiHoc.getValueAt(row, 0));
            hvdao.insert(hv);
        }
        this.fillTableHocVien();
        this.tabs.setSelectedIndex(0);
    }

    private void removeHocVien() {
        if (!Auth.isManager()) {
            MsgBox.altet(this, "Bạn không có quyền xóa học viên");
        } else {
            if (MsgBox.confirm(this, "Bạn có muốn xóa các học viên được chọn?")) {
                for (int row : tblHocVien.getSelectedRows()) {
                    int mahv = (Integer) tblHocVien.getValueAt(row, 1);
                    hvdao.delete(mahv);
                }
                this.fillTableHocVien();
            }
        }
    }

    private void updateDiem() {
        DefaultTableModel model = (DefaultTableModel) tblHocVien.getModel();
        boolean hasError = false;
        for (int i = 0; i < tblHocVien.getRowCount(); i++) {
            int mahv = (Integer) tblHocVien.getValueAt(i, 1);
            HocVien hv = hvdao.selectById(mahv);
            String diemStr = model.getValueAt(i, 4).toString();
            double diem = 0;
            try {
                diem = Double.parseDouble(diemStr);
                if (diem < 0 || diem > 10) {
                    MsgBox.altet(this, "Điểm không hợp lệ");
                    hasError = true;
                    break;
                }
                hv.setDiem(diem);
                hvdao.update(hv);
            } catch (NumberFormatException e) {
                MsgBox.altet(this, "Điểm phải là số");
                hasError = true;
                break;
            }
        }
        if (!hasError) {
            MsgBox.altet(this, "Cập nhật điểm thành công");
        }
    }
}
