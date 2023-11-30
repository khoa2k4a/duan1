/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.KhachHang;
import utility.DBConnect;

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
            con = DBConnect.getConnection();
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
    
    public int themKh(KhachHang kh){
        sql="insert into KHACHHANG(MaKH,TenKH,DiaChi,Sdt,Email,GioiTinh,TrangThai) values (?,?,?,?,?,?,?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, kh.getMakh());
            ps.setObject(2, kh.getTenkh());
            ps.setObject(4, kh.getSdt());
            ps.setObject(3, kh.getDiachi());
            ps.setObject(5, kh.getEmail());
            ps.setObject(6, kh.isGioitinh());
            ps.setObject(7, kh.isTrangthai());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int suaKh(KhachHang kh,String ma){
        sql="update KHACHHANG set TenKH=?,Sdt=?,DiaChi=?,Email=?,GioiTinh=?,TrangThai=? where MaKH=?";
        try {
            con = DBConnect.getConnection();
            ps= con.prepareStatement(sql);           
            ps.setObject(1, kh.getTenkh());
            ps.setObject(2, kh.getSdt());
            ps.setObject(3, kh.getDiachi());
            ps.setObject(4, kh.getEmail());
            ps.setObject(5, kh.isGioitinh());
            ps.setObject(6, kh.isTrangthai());
            ps.setObject(7, ma);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int xoaKh(String ma){
        sql="delete KHACHHANG where MaKH=?";
        try {
            con = DBConnect.getConnection();
            ps= con.prepareStatement(sql); 
            ps.setObject(1, ma);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public List<KhachHang> Timkh(String ten){
        
        sql="select MaKH,TenKH,DiaChi,Sdt,Email,GioiTinh,TrangThai from KHACHHANG where TenKH=?";
        List<KhachHang> listkh = new ArrayList<>();
        try {
            con = DBConnect.getConnection();
            ps= con.prepareStatement(sql); 
            ps.setObject(1, ten);
            rs = ps.executeQuery();
            while(rs.next()){
                 KhachHang kh = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(4), rs.getString(3), rs.getString(5), rs.getBoolean(6), rs.getBoolean(7));
                listkh.add(kh);
            }
            return listkh;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    
    }
    
    
    public KhachHang timma(String ma){
        KhachHang kh = null;
        sql="select MaKH,TenKH,DiaChi,Sdt,Email,GioiTinh,TrangThai from KHACHHANG where MaKH = ?";
        try {
            con=DBConnect.getConnection();
            ps=con.prepareStatement(sql);
            ps.setObject(1,ma);
            rs=ps.executeQuery();           
            while(rs.next()){
                 kh = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(6), rs.getBoolean(7));
                             
            }
            return kh;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

