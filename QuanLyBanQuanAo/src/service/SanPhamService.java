/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.SanPham;

/**
 *
 * @author ADMIN
 */
public class SanPhamService extends PolyClothes<SanPham, String>{

    String SQL_SELECT_ALL = "select TenSP, TenLoaiSP, TenMau, TenSize, TenCL, SoLuong, GiaSP, GiaSauSale, SANPHAM.TrangThai from SANPHAM\n" +
                                "join LOAISANPHAM on SANPHAM.ID_LoaiSP = LOAISANPHAM.ID\n" +
                                "join MAU on SANPHAM.ID_Mau = MAU.ID\n" +
                                "join SIZE on SANPHAM.ID_Size = SIZE.ID\n" +
                                "join CHATLIEU on SANPHAM.ID_CL = CHATLIEU.ID";
    

    @Override
    protected List<SanPham> selectBySQL(String sql, Object[] args) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<SanPham> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(SanPham model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(SanPham model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SanPham selectByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
