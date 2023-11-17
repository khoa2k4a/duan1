/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.SanPham;
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
    public List<SanPham> getSanPham(){
        List<SanPham> listSP = new ArrayList<>();
        sql = "select ID_SP, MaSP, TenSP, TrangThai from SANPHAM";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                SanPham sp = new SanPham();
                sp.setIdSP(rs.getInt(1));
                sp.setMaSP(rs.getString(2));
                sp.setTenSP(rs.getString(3));
                sp.setTrangThai(rs.getBoolean(4));
                listSP.add(sp);
            }
            return listSP;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
