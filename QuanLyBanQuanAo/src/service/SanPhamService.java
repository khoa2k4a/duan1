/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.ChatLieu;
import model.LoaiSP;
import model.Mau;
import model.SanPham;
import model.Size;
import utility.DbConnect;

/**
 *
 * @author ADMIN
 */
public class SanPhamService {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = "";
    
    public List<SanPham> getSanPham(){
        List<SanPham> listS = new ArrayList<>();
        sql = "select SANPHAM.ID, TenSP, SoLuong, GiaSP, TenLoaiSP, TenMau, TenSize, TenCL, SANPHAM.TrangThai from SANPHAM\n" +
                                "join LOAISANPHAM on SANPHAM.ID_LoaiSP = LOAISANPHAM.ID\n" +
                                "join MAU on SANPHAM.ID_Mau = MAU.ID\n" +
                                "join SIZE on SANPHAM.ID_Size = SIZE.ID\n" +
                                "join CHATLIEU on SANPHAM.ID_CL = CHATLIEU.ID";
        try {
            con = DbConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                String ten = rs.getString(2);
                int soLuong = rs.getInt(3);
                double gia = rs.getDouble(4);
                LoaiSP loai = new LoaiSP(rs.getString(5));
                Mau mau = new Mau(rs.getString(6));
                Size sze = new Size(rs.getString(7));
                ChatLieu cl = new ChatLieu(rs.getString(8));
                boolean trangThai = rs.getBoolean(9);
                SanPham sp = new SanPham(id, ten, soLuong, gia, loai, mau, sze, cl, trangThai);
                listS.add(sp);  
            }
            return listS;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public int addSanPham(SanPham sp){
        sql = "insert into SANPHAM(ID_LoaiSP, ID_Mau, ID_Size, ID_CL, TenSP, SoLuong, GiaSP, TrangThai) values(?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            con = DbConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, sp.getLoai().getId());
            ps.setObject(2, sp.getMau().getId());
            ps.setObject(3, sp.getSize().getId());
            ps.setObject(4, sp.getChatLieu().getId());
            ps.setObject(5, sp.getTen());
            ps.setObject(6, sp.getSoLuong());
            ps.setObject(7, sp.getGia());
            ps.setObject(8, sp.isTrangThai());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

}
