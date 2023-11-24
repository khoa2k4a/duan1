/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import model.HoaDon;
import model.KhachHang;
import model.NhanVien;
import model.Voucher;
import model.VoucherCT;
import utility.DBConnect;

/**
 *
 * @author admin
 */
public class VoucherService {

    Connection conn = null;
    PreparedStatement ps = null;

    public ArrayList<VoucherCT> getAll() {
        ArrayList<VoucherCT> list = new ArrayList<>();
        String sql = """
                   select MaNV, TenNV, MaKH, MaHD, TenChienDich, VOUCHER.StartDate, VOUCHER.EndDate, VOUCHER_CT.GiaTriGiam, VOUCHER_CT.DonViGiam,
                   VOUCHER_CT.SoLuong, VOUCHER_CT.TrangThai
                   from VOUCHER_CT join VOUCHER on VOUCHER_CT.ID_Voucher = VOUCHER.ID_Voucher
                   join NHANVIEN on NHANVIEN.ID_NV = VOUCHER.ID_NV
                   join HOADON on HOADON.ID_NV = NHANVIEN.ID_NV
                   join KHACHHANG on KHACHHANG.ID_KH = HOADON.ID_KH
                     """;
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                VoucherCT vct = new VoucherCT();
                KhachHang k = new KhachHang();
                k.setMaKH(rs.getString(3));
                vct.setK(k);
                Voucher v = new Voucher();
                v.setTenCD(rs.getString("TenChienDich"));
                v.setStartDate(rs.getDate("StartDate"));
                v.setEndDate(rs.getDate("EndDate"));
                NhanVien n = new NhanVien();
                n.setMaNV(rs.getString("MaNV"));
                n.setTenNV(rs.getString("TenNV"));
                v.setN(n);
                vct.setV(v);
                HoaDon h = new HoaDon();
                h.setMaHD(rs.getString(4));
                vct.setH(h);
                vct.setGtGiam(rs.getInt("GiaTriGiam"));
                vct.setDvGiam(rs.getString("DonViGiam"));
                vct.setSoLuong(rs.getInt("SoLuong"));
                vct.setTrangThai(rs.getBoolean("TrangThai"));
                list.add(vct);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
