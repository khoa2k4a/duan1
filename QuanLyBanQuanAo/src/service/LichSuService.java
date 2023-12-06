/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.*;
import utility.DBConnect;

import javax.swing.*;

/**
 * @author admin
 */
public class LichSuService {

    Connection conn = null;
    PreparedStatement ps = null;

    public List<HoaDon> getH() {
        String sql = """
                SELECT HOADON.ID_HD, HOADON.MaHD, HOADON.NgayTao, HOADON.HinhThucThanhToan,
                NHANVIEN.MaNV, KHACHHANG.TenKH, HOADON.TrangThai
                FROM HOADON
                INNER JOIN NHANVIEN ON NHANVIEN.ID_NV = HOADON.ID_NV
                INNER JOIN KHACHHANG ON KHACHHANG.ID_KH = HOADON.ID_KH""";
        List<HoaDon> list = new ArrayList<>();
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon h = new HoaDon();
                h.setIdHD(rs.getInt(1));
                h.setMaHD(rs.getString(2));
                h.setNgayTao(rs.getDate(3));
                h.setHinhThuc(rs.getString(4));
                NhanVien n = new NhanVien();
                n.setMaNV(rs.getString(5));
                h.setNv(n);
                KhachHang k = new KhachHang();
                k.setTenKH(rs.getString(6));
                h.setKh(k);
                h.setTrangThai(rs.getBoolean(7));
                list.add(h);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            return null;
        }
    }

    public List<ChiTietHoaDon> getSPtheoIDHD(int idHD) throws SQLException {
        String sql = """
                select ID_HDCT, SANPHAM.MaSP, SANPHAM.TenSP,
                HOADON_CT.SoLuong, BienThe_SANPHAM.GiaSP, HOADON.MaGiamGia
                from HOADON_CT
                inner join BienThe_SANPHAM on BienThe_SANPHAM.ID_BienTheSP = HOADON_CT.ID_BienTheSP
                inner join SANPHAM on SANPHAM.ID_SP = BienThe_SANPHAM.ID_SP
                inner join HOADON on HOADON.ID_HD = HOADON_CT.ID_HD
                where HOADON.ID_HD = ?
                """;
        List<ChiTietHoaDon> list = new ArrayList<>();
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
//            ps.executeUpdate();
            while (rs.next()) {
                ps.setObject(1, idHD);
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getString(2));
                sp.setTenSP(rs.getString(3));
                ChiTietSP btsp = new ChiTietSP();
                btsp.setGia(rs.getDouble(5));
                btsp.setSp(sp);
                HoaDon h = new HoaDon();
                h.setMaGG(rs.getString(6));
                ChiTietHoaDon hdct = new ChiTietHoaDon();
                hdct.setIdCTHD(rs.getInt(1));
                hdct.setSoLuong(rs.getInt(4));
                hdct.setHd(h);
                hdct.setSp(btsp);
//                list.add(hdct);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return null;
        }
    }
}
