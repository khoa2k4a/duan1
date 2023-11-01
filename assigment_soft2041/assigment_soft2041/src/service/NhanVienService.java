/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.NhanVien;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    static String SQL_SELECT_ALL = "SELECT MaNV, MatKhau, HoTen, VaiTro FROM Nhanvien";
    static String SQL_SEARCH = "SELECT MaNV, MatKhau, HoTen, VaiTro FROM Nhanvien WHERE HoTen LIKE ?";
    static String SQL_SELECT_BY_ID = "SELECT MaNV, MatKhau, HoTen, VaiTro FROM Nhanvien WHERE MaNV=?";
    static String SQL_INSERT = "INSERT INTO Nhanvien(MaNV,MatKhau,HoTen,VaiTro)VALUES(?,?,?,?)";
    
    public void insert(NhanVien nv) {
        try {
            Connection conn = DbConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(SQL_INSERT);
            stm.setString(1, nv.getMaNV());
            stm.setString(2, nv.getMatKhau());
            stm.setString(3, nv.getHoTen());
            stm.setBoolean(4, nv.getVaiTro());
            stm.executeUpdate();        // save to DB
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public List<NhanVien> search(String keyword) {
        List<NhanVien> list = new ArrayList<>();
        try {
            Connection conn = DbConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(SQL_SEARCH);
            //"SELECT MaNV, MatKhau, HoTen, VaiTro FROM Nhanvien WHERE HoTen LIKE ?"
            stm.setString(1, "%" + keyword + "%");
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                String maNV = rs.getString(1);
                String matKhau = rs.getString(2);
                String hoTen = rs.getString(3);
                Boolean vaiTro = rs.getBoolean(4);
                list.add(new NhanVien(maNV, matKhau, hoTen, vaiTro));
            }
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    
    public List<NhanVien> selectAll() {
        List<NhanVien> list = new ArrayList<>();
        try{
            Connection conn = DbConnect.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(SQL_SELECT_ALL);
            while(rs.next()){
                String maNV = rs.getString(1);
                String matKhau = rs.getString(2);
                String hoTen = rs.getString(3);
                Boolean vaiTro = rs.getBoolean(4);
                list.add(new NhanVien(maNV, matKhau, hoTen, vaiTro));
            }
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public NhanVien selectById(String id) {
        try {
            Connection conn = DbConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(SQL_SELECT_BY_ID);
            //"SELECT MaNV, MatKhau, HoTen, VaiTro FROM Nhanvien WHERE MaNV=?"
            stm.setString(1, id);
            ResultSet rs = stm.executeQuery();
            NhanVien nv = null;
            if(rs.next()){
                String maNV = rs.getString(1);
                String matKhau = rs.getString(2);
                String hoTen = rs.getString(3);
                Boolean vaiTro = rs.getBoolean(4);
                nv = new NhanVien(maNV, matKhau, hoTen, vaiTro);
            }
            conn.close();
            return nv;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public static void main(String[] args) {
        NhanVienService service = new NhanVienService();
        List<NhanVien> list = service.selectAll();
        for(NhanVien nv : list) System.out.println(nv);
        System.out.println(service.selectById("TeoNV"));
    }
    
}
