/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.GiamGia;
import utility.DBConnect;

/**
 *
 * @author admin
 */
public class GiamGiaService {

    Connection conn = null;
    PreparedStatement ps = null;

    public List<GiamGia> getAll() {
        List<GiamGia> listG = new ArrayList<>();
        String sql = "SELECT MaDotGiamGia,TenDot,NgayBatDau,NgayKetThuc,PhanTramGiam,DieuKien,TrangThai FROM DOTGIAMGIA";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GiamGia g = new GiamGia(rs.getString(1), rs.getString(2),
                        rs.getDate(3), rs.getDate(4),
                        rs.getInt(5), rs.getFloat(6), rs.getInt(7));
                listG.add(g);
            }
            return listG;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            return null;
        }
    }

    public int add(GiamGia g) {
        String sql = "INSERT INTO DOTGIAMGIA VALUES(?,?,?,?,?,?,?)";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, g.getMaDot());
            ps.setObject(2, g.getTenDot());
            ps.setObject(3, g.getStartDate());
            ps.setObject(4, g.getEndDate());
            ps.setObject(5, g.getPhanTramGiam());
            ps.setObject(6, g.getDieuKienGiam());
            ps.setObject(7, g.getTrangThai());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            return 0;
        }
    }

    public int update(GiamGia g, String maDot) {
        String sql = "UPDATE DOTGIAMGIA SET TenDot=?,NgayBatDau=?,NgayKetThuc=?,PhanTramGiam=?,DieuKien=?,TrangThai=? WHERE MaDotGiamGia like ?";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, g.getTenDot());
            ps.setObject(2, g.getStartDate());
            ps.setObject(3, g.getEndDate());
            ps.setObject(4, g.getPhanTramGiam());
            ps.setObject(5, g.getDieuKienGiam());
            ps.setObject(6, g.getTrangThai());
            ps.setObject(7, maDot);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            return 0;
        }
    }

    public int del(String maDot) {
        String sql = "DELETE FROM DOTGIAMGIA WHERE MaDotGiamGia like ?";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, maDot);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            return 0;
        }
    }

    public List<GiamGia> findTen(String tenCD) {
        List<GiamGia> listTim = new ArrayList<>();
        String sql = "SELECT MaDotGiamGia,TenDot,NgayBatDau,NgayKetThuc,PhanTramGiam,DieuKien,TrangThai FROM DOTGIAMGIA where TenDot like ?";
        try {
            conn = DBConnect.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, tenCD);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GiamGia g = new GiamGia(rs.getString(1), rs.getString(2),
                        rs.getDate(3), rs.getDate(4),
                        rs.getInt(5), rs.getFloat(6), rs.getInt(7));
                listTim.add(g);
            }
            return listTim;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            return null;
        }
    }
}
