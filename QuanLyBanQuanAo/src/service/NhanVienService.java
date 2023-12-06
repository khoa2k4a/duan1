/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.NhanVien;
import utility.DBConnect;

/**
 *
 * @author ADMIN
 */
public class NhanVienService {

    Connection con = null;
    PreparedStatement ps = null;
    String sql = null;
    ResultSet rs = null;

    public List<NhanVien> getAll() {
        sql = "select ID_NV, MaNV,TenNV,Sdt,DiaChi,Email,GioiTinh,TaiKhoan,MatKhau,VaiTro,TrangThai from NHANVIEN";
        List<NhanVien> listnv = new ArrayList<>();
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(5), rs.getString(4), rs.getString(6), rs.getInt(7),
                        rs.getString(8), rs.getString(9), rs.getString(10), rs.getInt(11));
                listnv.add(nv);
            }
            return listnv;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int themnv(NhanVien nv) {
        sql = "INSERT INTO NHANVIEN(MaNV,TenNV,Sdt,DiaChi,Email,GioiTinh,TaiKhoan,MatKhau,VaiTro,TrangThai) VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, nv.getMaNV());
            ps.setObject(2, nv.getTenNV());
            ps.setObject(3, nv.getSdt());
            ps.setObject(4, nv.getDiaChi());
            ps.setObject(5, nv.getEmail());
            ps.setObject(6, nv.getGioiTinh());
            ps.setObject(7, nv.getTaiKhoan());
            ps.setObject(8, nv.getMatKhau());
            ps.setObject(9, nv.getVaiTro());
            ps.setObject(10, nv.getTrangThai());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int suanv(NhanVien nv, String ma) {
        sql = "update NHANVIEN set TenNV=?,Sdt=?,DiaChi=?,Email=?,GioiTinh=?,TaiKhoan=?,MatKhau=?,VaiTro=?,TrangThai=? where MaNV=?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, nv.getTenNV());
            ps.setObject(2, nv.getSdt());
            ps.setObject(3, nv.getDiaChi());
            ps.setObject(4, nv.getEmail());
            ps.setObject(5, nv.getGioiTinh());
            ps.setObject(6, nv.getTaiKhoan());
            ps.setObject(7, nv.getMatKhau());
            ps.setObject(8, nv.getVaiTro());
            ps.setObject(9, nv.getTrangThai());
            ps.setObject(10, ma);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int xoanv(String ma) {
        sql = "delete NHANVIEN where MaNV=?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, ma);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List<NhanVien> timten(String ten) {
        List<NhanVien> listTim = new ArrayList<>();
        sql = "select MaNV,TenNV,Sdt,DiaChi,Email,GioiTinh,TaiKhoan,MatKhau,VaiTro,TrangThai from NHANVIEN where TenNV like ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, ten);
            rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(4), rs.getString(3), rs.getString(5),
                        rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10));
                listTim.add(nv);
            }
            return listTim;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<NhanVien> timvaitro(String vaitro) {
        List<NhanVien> listTim = new ArrayList<>();
        sql = "select MaNV,TenNV,Sdt,DiaChi,Email,GioiTinh,TaiKhoan,MatKhau,VaiTro,TrangThai from NHANVIEN where VaiTro like ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, vaitro);
            rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(4), rs.getString(3), rs.getString(5),
                        rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10));
                listTim.add(nv);
            }
            return listTim;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int suaTK(NhanVien nv, String ma) {
        sql = "update NHANVIEN set TenNV=?,TaiKhoan=?,MatKhau=?,VaiTro=? where MaNV=?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, nv.getTenNV());
            ps.setObject(2, nv.getTaiKhoan());
            ps.setObject(3, nv.getMatKhau());
            ps.setObject(4, nv.getVaiTro());
            ps.setObject(5, ma);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
