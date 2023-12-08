/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.ChiTietHoaDon;
import model.ChiTietSP;
import model.HoaDon;
import model.KhachHang;
import model.NhanVien;
import model.SanPham;
import utility.DBConnect;

/**
 *
 * @author admin
 */
public class ThongKeService {
    
    Connection conn = null;
    PreparedStatement ps = null;
    
    public List<HoaDon> getTK() {
        List<HoaDon> listTK = new ArrayList<>();
        String sql = """
                   SELECT HOADON.MAHD,NHANVIEN.MANV,KHACHHANG.TENKH,HOADON.NGAYTAO,HOADON.TONGTIEN
                   FROM HOADON
                   INNER JOIN NHANVIEN ON NHANVIEN.ID_NV = HOADON.ID_NV
                   INNER JOIN KHACHHANG ON KHACHHANG.ID_KH = HOADON.ID_KH""";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon h = new HoaDon();
                h.setMaHD(rs.getString(1));
                NhanVien n = new NhanVien();
                n.setMaNV(rs.getString(2));
                h.setNv(n);
                KhachHang k = new KhachHang();
                k.setTenKH(rs.getString(3));
                h.setKh(k);
                h.setNgayTao(rs.getDate(4));
                h.setTongTien(rs.getDouble(5));
                listTK.add(h);
            }
            return listTK;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            return null;
        }
    }

    public List<ChiTietHoaDon> getTop5SP() {
        List<ChiTietHoaDon> lst = new ArrayList<>();
        String sql = """
                     SELECT TOP (5) sp.TenSP, SUM(hdct.SoLuong) AS TongSoLuongBanDuoc
                     FROM HOADON_CT hdct
                     inner join BienThe_SANPHAM btsp on btsp.ID_BienTheSP = hdct.ID_BienTheSP
                     inner join SANPHAM sp on sp.ID_SP = btsp.ID_SP 
                     GROUP BY TenSP
                     ORDER BY TongSoLuongBanDuoc DESC""";
        try {
            conn = DBConnect.getConnection();            
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietHoaDon cthd = new ChiTietHoaDon();
                SanPham s = new SanPham();
                s.setTenSP(rs.getString(1));
                ChiTietSP ctsp = new ChiTietSP();
                ctsp.setSp(s);
                cthd.setSp(ctsp);
                cthd.setSoLuong(rs.getInt(2));
                lst.add(cthd);
            }
            return lst;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            return null;
        }
    }

    public List<HoaDon> getDoanhThu() {
        List<HoaDon> topDT = new ArrayList<>();
        String sql = "SELECT NgayTao,TongTien FROM HOADON";
        try {
            conn = DBConnect.getConnection();            
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon h = new HoaDon();
                h.setNgayTao(rs.getDate(1));
                h.setTongTien(rs.getInt(2));
                topDT.add(h);
            }
            return topDT;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            return null;
        }
    }

    public List<HoaDon> getKHTT() {
        List<HoaDon> topKH = new ArrayList<>();
        String sql = """
                     SELECT TOP (3) k.MaKH, k.TenKH, SUM(h.TongTien) AS TongTienMua 
                                              FROM HOADON h 
                                              INNER JOIN KHACHHANG k ON h.ID_KH = k.ID_KH
                                              GROUP BY k.MaKH, k.TenKH
                                              ORDER BY TongTienMua DESC""";
        try {
            conn = DBConnect.getConnection();            
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon h = new HoaDon();
                KhachHang k = new KhachHang();
                k.setMaKH(rs.getString(1));
                k.setTenKH(rs.getString(2));
                h.setKh(k);
                h.setTongTien(rs.getInt(3));
                topKH.add(h);
            }
            return topKH;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            return null;
        }
    }
}
