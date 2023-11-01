/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.dao;

import com.poly.entity.KhoaHoc;
import com.poly.utils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.crypto.dsig.XMLObject;

/**
 *
 * @author Admin
 */
public class KhoaHocDao extends EduSysDao<KhoaHoc, Integer>{

    String INSERT_SQL = "INSERT INTO KhoaHoc (MaCD, MaNV, HocPhi, ThoiLuong, NgayKG, GhiChu, NgayTao) VALUES (?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE KhoaHoc SET MaCD =?, MaNV =?, HocPhi =?, ThoiLuong =?, NgayKG =?, GhiChu =?, NgayTao =? WHERE MaKH = ?";
    String DELETE_SQL = "DELETE FROM KhoaHoc WHERE MaKH=?";
    String SELECT_ALL_SQL = "SELECT * FROM KhoaHoc";
    String SELECT_BY_ID_SQL = "SELECT * FROM KhoaHoc WHERE MaKH=?";
    
    @Override
    public void insert(KhoaHoc entity) {
        JdbcHelper.update(INSERT_SQL,  entity.getMaCD(),
                entity.getMaNV(), entity.getHocPhi(), entity.getThoiLuong(), entity.getNgayKG(), entity.getGhiChu(), entity.getNgayTao());
    }

    @Override
    public void update(KhoaHoc entity) {
         JdbcHelper.update(UPDATE_SQL, entity.getMaCD(), entity.getMaNV(),
                entity.getHocPhi(), entity.getThoiLuong(), entity.getNgayKG(), entity.getGhiChu(), entity.getNgayTao(), entity.getMaKH());
    }

    @Override
    public void delete(Integer key) {
        JdbcHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<KhoaHoc> selectAll() {
          return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public KhoaHoc selectById(Integer key) {
        List<KhoaHoc> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<KhoaHoc> selectBySql(String sql, Object... ags) {
         List<KhoaHoc> list = new ArrayList<KhoaHoc>();
        try {
            ResultSet rs = JdbcHelper.query(sql, ags);
            while (rs.next()) {
                KhoaHoc entity = new KhoaHoc();
                entity.setGhiChu(rs.getString("GhiChu"));
                entity.setHocPhi(rs.getFloat("HocPhi"));
                entity.setMaCD(rs.getString("MaCD"));
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setNgayKG(rs.getDate("NgayKG"));
                entity.setNgayTao(rs.getDate("NgayTao"));
                entity.setThoiLuong(rs.getInt("ThoiLuong"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Integer> selectYears() {
        String sql = "SELECT DISTINCT YEAR(NgayKG) FROM KhoaHoc ORDER BY YEAR(NgayKG) DESC";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql);
            while (rs.next()) {                
                list.add(rs.getInt(1));
                
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
                
    }
    
    public List<KhoaHoc> selectByChuyenDe(String macd) {
        String sql = "SELECT * FROM KhoaHoc WHERE MaCD = ?";
        return this.selectBySql(sql, macd);
    }
    

   
}
