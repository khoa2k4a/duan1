/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.ChatLieu;
import model.ChiTietHoaDon;
import model.ChiTietSP;
import model.HoaDon;
import model.KhachHang;
import model.Mau;
import model.NhanVien;
import model.SanPham;
import model.Size;
import utility.DBConnect;

/**
 *
 * @author ADMIN
 */
public class HoaDonService {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = "";

    public List<HoaDon> getHoaDon() {
        List<HoaDon> listHD = new ArrayList<>();
        sql = "select ID_HD, MaHD, TenNV, TenKH, NgayTao, TongTien, MaGiamGia, GhiChu, HinhThucThanhToan, HOADON.TrangThai from HOADON\n"
                + "join NHANVIEN on HOADON.ID_NV = NHANVIEN.ID_NV\n"
                + "join KHACHHANG on HOADON.ID_KH = KHACHHANG.ID_KH";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setIdHD(rs.getInt(1));
                hd.setMaHD(rs.getString(2));
                NhanVien nv = new NhanVien(rs.getString(3));
                hd.setNv(nv);
                KhachHang hk = new KhachHang(rs.getString(4));
                hd.setKh(hk);
                hd.setNgayTao(rs.getDate(5));
                hd.setTongTien(rs.getDouble(6));
                hd.setMaGG(rs.getString(7));
                hd.setGhiChu(rs.getString(8));
                hd.setHinhThuc(rs.getString(9));
                hd.setTrangThai(rs.getBoolean(10));
                listHD.add(hd);
            }
            return listHD;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<ChiTietHoaDon> getCTHD() {
        List<ChiTietHoaDon> listCTHD = new ArrayList<>();
        sql = "select ID_HDCT, MaHDCT, MaBienTheSP, TenSP, TenMau, TenCL, TenSize, MaHD, HOADON_CT.SoLuong, BienThe_SANPHAM.GiaSP, TongTien = SUM(HOADON_CT.SoLuong * BienThe_SANPHAM.GiaSP), HOADON_CT.TrangThai from HOADON_CT\n"
                + "join BienThe_SANPHAM on HOADON_CT.ID_BienTheSP = BienThe_SANPHAM.ID_BienTheSP\n"
                + "join SANPHAM on BienThe_SANPHAM.ID_SP = SANPHAM.ID_SP\n"
                + "join MAU on BienThe_SANPHAM.ID_Mau = MAU.ID_Mau\n"
                + "join CHATLIEU on BienThe_SANPHAM.ID_ChatLieu = CHATLIEU.ID_CL\n"
                + "join SIZE on BienThe_SANPHAM.ID_Size = SIZE.ID_Size\n"
                + "join HOADON on HOADON_CT.ID_HD = HOADON.ID_HD\n"
                + "group by ID_HDCT, MaHDCT, MaBienTheSP, TenSP, TenMau, TenCL, TenSize, MaHD, HOADON_CT.SoLuong, BienThe_SANPHAM.GiaSP, HOADON_CT.TrangThai";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietHoaDon cthd = new ChiTietHoaDon();
                cthd.setIdCTHD(rs.getInt(1));
                cthd.setMaCTHD(rs.getString(2));
                ChiTietSP ctsp = new ChiTietSP();
                ctsp.setMaBienThe(rs.getString(3));
                SanPham sp = new SanPham(rs.getString(4));
                ctsp.setSp(sp);
                Mau m = new Mau(rs.getString(5));
                ctsp.setMau(m);
                ChatLieu cl = new ChatLieu(rs.getString(6));
                ctsp.setCl(cl);
                Size s = new Size(rs.getString(7));
                ctsp.setSize(s);
                ctsp.setGia(rs.getDouble(10));
                cthd.setSp(ctsp);
                HoaDon hd = new HoaDon(rs.getString(8));
                cthd.setHd(hd);
                cthd.setSoLuong(rs.getInt(9));
                cthd.setTongTien(rs.getDouble(11));
                cthd.setTrangThai(rs.getBoolean(12));
                listCTHD.add(cthd);
            }
            return listCTHD;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<ChiTietHoaDon> findCTHD(int id) {
        List<ChiTietHoaDon> listCTHD = new ArrayList<>();
        sql = "select ID_HDCT, MaHDCT, MaBienTheSP, TenSP, TenMau, TenCL, TenSize, MaHD, HOADON_CT.SoLuong, BienThe_SANPHAM.GiaSP, TongTien = SUM(HOADON_CT.SoLuong * BienThe_SANPHAM.GiaSP), HOADON_CT.TrangThai from HOADON_CT\n"
                + "join BienThe_SANPHAM on HOADON_CT.ID_BienTheSP = BienThe_SANPHAM.ID_BienTheSP\n"
                + "join SANPHAM on BienThe_SANPHAM.ID_SP = SANPHAM.ID_SP\n"
                + "join MAU on BienThe_SANPHAM.ID_Mau = MAU.ID_Mau\n"
                + "join CHATLIEU on BienThe_SANPHAM.ID_ChatLieu = CHATLIEU.ID_CL\n"
                + "join SIZE on BienThe_SANPHAM.ID_Size = SIZE.ID_Size\n"
                + "join HOADON on HOADON_CT.ID_HD = HOADON.ID_HD\n"
                + "where HOADON_CT.ID_HD = ?\n"
                + "group by ID_HDCT, MaHDCT, MaBienTheSP, TenSP, TenMau, TenCL, TenSize, MaHD, HOADON_CT.SoLuong, BienThe_SANPHAM.GiaSP, HOADON_CT.TrangThai";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietHoaDon cthd = new ChiTietHoaDon();
                cthd.setIdCTHD(rs.getInt(1));
                cthd.setMaCTHD(rs.getString(2));
                ChiTietSP ctsp = new ChiTietSP();
                ctsp.setMaBienThe(rs.getString(3));
                SanPham sp = new SanPham(rs.getString(4));
                ctsp.setSp(sp);
                Mau m = new Mau(rs.getString(5));
                ctsp.setMau(m);
                ChatLieu cl = new ChatLieu(rs.getString(6));
                ctsp.setCl(cl);
                Size s = new Size(rs.getString(7));
                ctsp.setSize(s);
                ctsp.setGia(rs.getDouble(10));
                cthd.setSp(ctsp);
                HoaDon hd = new HoaDon(rs.getString(8));
                cthd.setHd(hd);
                cthd.setSoLuong(rs.getInt(9));
                cthd.setTongTien(rs.getDouble(11));
                cthd.setTrangThai(rs.getBoolean(12));
                listCTHD.add(cthd);
            }
            return listCTHD;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
