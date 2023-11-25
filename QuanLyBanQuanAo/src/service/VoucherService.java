/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

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
                   select MaNV, TenNV, MaKH, MaHD, 
                   VOUCHER.TenChienDich, VOUCHER.StartDate, VOUCHER.EndDate, 
                   VOUCHER_CT.GiaTriGiam, VOUCHER_CT.DonViGiam,
                   VOUCHER_CT.SoLuong, VOUCHER_CT.TrangThai
                   from VOUCHER_CT 
                   join VOUCHER on VOUCHER_CT.ID_Voucher = VOUCHER.ID_Voucher
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
                v.setTenCD(rs.getString(5));
                v.setStartDate(rs.getDate(6));
                v.setEndDate(rs.getDate(7));
                NhanVien n = new NhanVien();
                n.setMaNV(rs.getString(1));
                n.setTenNV(rs.getString(2));
                v.setN(n);
                vct.setV(v);
                HoaDon h = new HoaDon();
                h.setMaHD(rs.getString(4));
                vct.setH(h);
                vct.setGtGiam(rs.getInt(8));
                vct.setDvGiam(rs.getString(9));
                vct.setSoLuong(rs.getInt(10));
                vct.setTrangThai(rs.getBoolean(11));
                list.add(vct);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Integer insertV(VoucherCT vct) {
        String sql = """
                     insert into VOUCHER_CT values
                     (?,?,?,?,?,?,?,?)""";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, vct.getV().getId());
            ps.setObject(2, vct.getK().getId());
            ps.setObject(3, vct.getH().getId());
            ps.setObject(4, vct.getMaVoucherCT());
            ps.setObject(5, vct.getSoLuong());
            ps.setObject(6, vct.getGtGiam());
            ps.setObject(7, vct.getDvGiam());
            ps.setObject(8, vct.isTrangThai());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            return 0;
        }
    }
}
