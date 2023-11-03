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
        sql = "select TenSP, TenLoaiSP, TenMau, TenSize, TenCL, SoLuong, GiaSP, GiaSauSale, SANPHAM_CT.TrangThai from SANPHAM_CT\n" +
                "join SANPHAM on SANPHAM_CT.ID_SP = SANPHAM.ID\n" +
                "join LOAISANPHAM on SANPHAM_CT.ID_LoaiSP = LOAISANPHAM.ID\n" +
                "join MAU on SANPHAM_CT.ID_Mau = MAU.ID\n" +
                "join SIZE on SANPHAM_CT.ID_Size = SIZE.ID\n" +
                "join CHATLIEU on SANPHAM_CT.ID_CL = CHATLIEU.ID";
        try {
            con = DbConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                SanPham sp = new SanPham(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
                listSP.add(sp);
            }
            return listSP;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
