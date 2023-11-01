/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.dao;

import com.poly.entity.HocVien;
import com.poly.entity.NguoiHoc;
import com.poly.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NguoiHocDao extends EduSysDao<NguoiHoc, String> {

    String INSERT_SQL = "INSERT INTO NguoiHoc (MaNH, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNV, NgayDK) VALUES (?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE NguoiHoc SET  HoTen =?, NgaySinh =?, GioiTinh =?, DienThoai =?, Email =?, GhiChu =?, MaNV =?, NgayDK =? WHERE  MaNH =?";
    String DELETE_SQL = "DELETE FROM NguoiHoc WHERE MaNH=?";
    String SELECT_ALL_SQL = "SELECT * FROM NguoiHoc";
    String SELECT_BY_ID_SQL = "SELECT * FROM NguoiHoc WHERE MaNH=?";

    @Override
    public void insert(NguoiHoc entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMaNH(), entity.getHoTen(),
                entity.getNgaySinh(), entity.isGioiTinh(), entity.getDienThoai(), entity.getEmail(), entity.getGhiChu(), entity.getMaNV(), entity.getNgayDK());
    }

    @Override
    public void update(NguoiHoc entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getHoTen(), entity.getNgaySinh(),
                entity.isGioiTinh(), entity.getEmail(), entity.getDienThoai(), entity.getGhiChu(), entity.getMaNV(), entity.getNgayDK(), entity.getMaNH());
    }

    @Override
    public void delete(String key) {
        JdbcHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<NguoiHoc> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NguoiHoc selectById(String key) {
        List<NguoiHoc> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
             System.out.println("Không tìm thấy dữ liệu với MaNH = " + key);
            return null;
        }
        
        System.out.println(list.get(0).toString());
        return list.get(0);
    }

    @Override
    protected List<NguoiHoc> selectBySql(String sql, Object... ags) {
        List<NguoiHoc> list = new ArrayList<NguoiHoc>();
        try {
            ResultSet rs = JdbcHelper.query(sql, ags);
            while (rs.next()) {
                NguoiHoc entity = new NguoiHoc();
                entity.setMaNH(rs.getString("MaNH"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setNgaySinh(rs.getDate("NgaySinh"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setDienThoai(rs.getString("DienThoai"));
                entity.setEmail(rs.getString("Email"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setNgayDK(rs.getDate("NgayDK"));
                entity.setGhiChu(rs.getString("GhiChu"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<NguoiHoc> selectByKeyword(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            System.out.println("nhảy vào trường hợp tất cả");
            return selectAll();
        } else {
            System.out.println("nhảy vào trường hợp tìm kiếm");
            String sql = "SELECT * FROM NguoiHoc WHERE HoTen LIKE ?";
            return this.selectBySql(sql, "%" + keyword + "%");
        }
    }
    
    public List<NguoiHoc> selectNotInCourse(int makh, String keyword) {
        String sql = "SELECT * FROM NguoiHoc WHERE HoTen like ? AND MaNH NOT IN (SELECT MaNH FROM HocVien WHERE MaKH=?)";
        return this.selectBySql(sql, "%"+keyword+"%", makh);
    }

    public static void main(String[] args) {
        NguoiHocDao dao = new NguoiHocDao();
        NguoiHoc nh = dao.selectById("NH001");
        if(nh==null) {
            System.out.println("null roi me oi");
        }
        System.out.println(nh.toString());
    }

}
