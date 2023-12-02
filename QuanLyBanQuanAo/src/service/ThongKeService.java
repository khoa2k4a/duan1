/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.ThongKe;

/**
 *
 * @author DELL
 */
public class ThongKeService {

    Connection con = null;
    PreparedStatement ps = null;
    String sql = null;
    ResultSet rs = null;

    public List<ThongKe> getAll() {
        sql = "select MaHD,NHANVIEN.TenNV,NgayTao,KHACHHANG.TenKH,TongTien\n"
                + "from HOADON \n"
                + "join NHANVIEN on HOADON.ID_NV = NHANVIEN.ID_NV\n"
                + "join KHACHHANG on HOADON.ID_KH = KHACHHANG.ID_KH";
        List<ThongKe> listTke = new ArrayList<>();
        try {
            con = DbConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ThongKe tk = new ThongKe(rs.getString(1), rs.getString(2), rs.getString(4), rs.getDate(3), rs.getDouble(5));
                listTke.add(tk);
            }
            return listTke;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
