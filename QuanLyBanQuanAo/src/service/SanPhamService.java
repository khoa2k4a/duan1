/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.ChatLieu;
import model.ChiTietSP;
import model.LoaiSP;
import model.Mau;
import model.SanPham;
import model.Size;
import utility.DBConnect;

/**
 *
 * @author ADMIN
 */
public class SanPhamService {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = "";

    public List<ChiTietSP> getChiTietSP() {
        List<ChiTietSP> listCTSP = new ArrayList<>();
        sql = "select MaSP, TenSP, MaBienTheSP, TenLoaiSP, TenMau, TenSize, TenCL, SoLuong, GiaSP, BienThe_SANPHAM.TrangThai from BienThe_SANPHAM\n"
                + "join SANPHAM on BienThe_SANPHAM.ID_SP = SANPHAM.ID_SP\n"
                + "join LOAISANPHAM on BienThe_SANPHAM.ID_LoaiSP = LOAISANPHAM.ID_LoaiSP\n"
                + "join MAU on BienThe_SANPHAM.ID_Mau = MAU.ID_Mau\n"
                + "join SIZE on BienThe_SANPHAM.ID_Size = SIZE.ID_Size\n"
                + "join CHATLIEU on BienThe_SANPHAM.ID_ChatLieu = CHATLIEU.ID_CL";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietSP ctsp = new ChiTietSP();
                SanPham sp = new SanPham(rs.getString(1), rs.getString(2));
                ctsp.setSp(sp);
                ctsp.setMaBienThe(rs.getString(3));
                LoaiSP l = new LoaiSP(rs.getString(4));
                ctsp.setLoai(l);
                Mau m = new Mau(rs.getString(5));
                ctsp.setMau(m);
                Size s = new Size(rs.getString(6));
                ctsp.setSize(s);
                ChatLieu cl = new ChatLieu(rs.getString(7));
                ctsp.setCl(cl);
                ctsp.setSoLuong(rs.getInt(8));
                ctsp.setTrangThai(rs.getBoolean(9));
                listCTSP.add(ctsp);
            }
            return listCTSP;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public int addCTSP(ChiTietSP ctsp){
        sql = "insert into BienThe_SANPHAM(ID_SP, MaBienTheSP, ID_LoaiSP, ID_Mau, ID_Size, ID_ChatLieu, SoLuong, GiaSP, TrangThai) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, ctsp.getSp().getIdSP());
            ps.setObject(2, ctsp.getMaBienThe());
            ps.setObject(3, ctsp.getLoai().getIdLoai());
            ps.setObject(4, ctsp.getMau().getIdMau());
            ps.setObject(5, ctsp.getSize().getIdSize());
            ps.setObject(6, ctsp.getCl().getIdCL());
            ps.setObject(7, ctsp.getSoLuong());
            ps.setObject(8, ctsp.getGia());
            ps.setObject(9, ctsp.isTrangThai());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
