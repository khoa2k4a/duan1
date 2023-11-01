/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.ChuyenDe;
import java.sql.*;
import java.util.*;

/**
 *
 * @author admin
 */
public class ChuyenDeService {
    static String SQL_SELECT_ALL = "SELECT MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa FROM ChuyenDe";
    public List<ChuyenDe> selectAll() {
        List<ChuyenDe> list = new ArrayList<>();
        try{
            Connection conn = DbConnect.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(SQL_SELECT_ALL);
            while(rs.next()){
                String maCD = rs.getString(1);
                String tenCD = rs.getString(2);
                Double hocPhi = rs.getDouble(3);
                Integer thoiLuong = rs.getInt(4);
                String hinh = rs.getString(5);
                String moTa = rs.getString(6);
                list.add(new ChuyenDe(maCD, tenCD, hocPhi, thoiLuong, hinh, moTa));
            }
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
