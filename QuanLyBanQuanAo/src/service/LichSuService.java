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

/**
 * @author admin
 */
public class LichSuService {

    Connection conn = null;
    PreparedStatement ps = null;

    public List<HoaDon> getH() {
        String sql = """
                    SELECT HOADON.MaHD,HOADON.NgayTao,
                    NHANVIEN.MaNV,KHACHHANG.TenKH,DOTGIAMGIA.MaDotGiamGia,
                    HOADON.TrangThai
                    FROM HOADON
                    inner join NHANVIEN on NHANVIEN.ID_NV = HOADON.ID_NV
                    inner join KHACHHANG on KHACHHANG.ID_KH = HOADON.ID_KH
                    inner join DOTGIAMGIA on DOTGIAMGIA.MaDotGiamGia = HOADON.MaGiamGia""";
        List<HoaDon> list = new ArrayList<>();
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon h = new HoaDon();
                h.setMaHD(rs.getString(1));
                h.setNgayTao(rs.getDate(2));
                NhanVien n = new NhanVien();
                n.setMaNV(rs.getString(3));
                h.setNv(n);
                KhachHang k = new KhachHang();
                k.setTenKH(rs.getString(4));
                h.setKh(k);
                GiamGia g = new GiamGia();
                g.setMaDot(rs.getString(5));
                h.setTrangThai(rs.getBoolean(6));
                list.add(h);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            return null;
        }
    }

    public List<ChiTietHoaDon> getSP(String maHD) {
        String sql = """
                     SELECT SANPHAM.MaSP,SANPHAM.TENSP,
                     HOADON_CT.SoLuong,BIENTHE_SANPHAM.GiaSP
                     FROM HOADON_CT
                     inner join BIENTHE_SANPHAM on BIENTHE_SANPHAM.ID_BienTheSP = HOADON_CT.ID_BienTheSP
                     inner join SANPHAM on SANPHAM.ID_SP = BIENTHE_SANPHAM.ID_SP
                     inner join HOADON on HOADON.ID_HD = HOADON_CT.ID_HD
                     inner join DOTGIAMGIA on DOTGIAMGIA.MaDotGiamGia = HOADON.MaGiamGia
                     WHERE HOADON.MaHD like ?""";
        List<ChiTietHoaDon> list = new ArrayList<>();
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, maHD);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietHoaDon cthd = new ChiTietHoaDon();
                ChiTietSP ctsp = new ChiTietSP();
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getString(1));
                sp.setTenSP(rs.getString(2));
                ctsp.setSp(sp);
                cthd.setSoLuong(rs.getInt(3));
                ctsp.setGia(rs.getDouble(4));
                cthd.setSp(ctsp);
                list.add(cthd);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            return null;
        }
    }
}
