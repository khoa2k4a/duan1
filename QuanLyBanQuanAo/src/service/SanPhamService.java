/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.SanPham;
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
        sql = "select ID, TenSP, SoLuong, GiaSP, TenLoaiSP, TenMau, TenSize, TenCL, SANPHAM.TrangThai from SANPHAM\n" +
                                "join LOAISANPHAM on SANPHAM.ID_LoaiSP = LOAISANPHAM.ID\n" +
                                "join MAU on SANPHAM.ID_Mau = MAU.ID\n" +
                                "join SIZE on SANPHAM.ID_Size = SIZE.ID\n" +
                                "join CHATLIEU on SANPHAM.ID_CL = CHATLIEU.ID";
        try {
            con = DbConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                SanPham s = new SanPham(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getDouble(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getBoolean(9));
                listS.add(s);
            }
            return listS;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
