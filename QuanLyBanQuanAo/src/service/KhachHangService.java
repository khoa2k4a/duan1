/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.KhachHang;

/**
 *
 * @author ADMIN
 */
public class KhachHangService {

    Connection con = null;
    PreparedStatement ps = null;
    String sql = null;
    ResultSet rs = null;
    
    public List<KhachHang> getAll() {
        sql = "select MaKH,TenKH,DiaChi,Sdt,Email,GioiTinh,TrangThai from KHACHHANG";
        List<KhachHang> listkh = new ArrayList<>();
        try {
            con = DbConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(6), rs.getBoolean(7));
                listkh.add(kh);  
            }
            return listkh;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
