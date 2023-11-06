/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.SanPham;

/**
 *
 * @author ADMIN
 */
public class SanPhamService {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = "";

    public List<SanPham> getSanPham() {
        List<SanPham> listSP = new ArrayList<>();
        sql = "select TenSP, TenLoaiSP, TenMau, TenSize, TenCL, SoLuong, GiaSP, GiaSauSale, SANPHAM.TrangThai from SANPHAM\n" +
                "join LOAISANPHAM on SANPHAM.ID_LoaiSP = LOAISANPHAM.ID\n" +
                "join MAU on SANPHAM.ID_Mau = MAU.ID\n" +
                "join SIZE on SANPHAM.ID_Size = SIZE.ID\n" +
                "join CHATLIEU on SANPHAM.ID_CL = CHATLIEU.ID";
        try {
            con = DbConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                SanPham sp = new SanPham(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6), rs.getDouble(7), rs.getDouble(8), rs.getBoolean(9));
                listSP.add(sp);
            }
            return listSP;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
