/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import entity.HocVien;
import java.sql.*;
import java.util.*;

/**
 *
 * @author admin
 */
public class HocVienService {
    String SQL_SEARCH_BY_KHOAHOC = "SELECT hv.MaHV, hv.MaNH, nh.HoTen, hv.Diem  FROM HocVien hv JOIN NguoiHoc nh\n" +
            "ON hv.MaNH=nh.MaNH WHERE hv.MaKH=?";
    
    public List<HocVien> searchByKhoaHoc(Integer maKH) {
        List<HocVien> list = new ArrayList<>();
        try {
            Connection conn = DbConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(SQL_SEARCH_BY_KHOAHOC);
            stm.setInt(1, maKH);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Integer maHV = rs.getInt(1);
                String maNH = rs.getString(2);
                String hoTen = rs.getString(3);
                Double diem = rs.getDouble(4);
                list.add(new HocVien(maHV, maNH, hoTen, diem));
            }
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
