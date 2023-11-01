package com.poly.dao;

import com.poly.entity.HocVien;
import com.poly.entity.NguoiHoc;
import com.poly.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HocVienDao extends EduSysDao<HocVien, Integer> {

    String INSERT_SQL = "INSERT INTO HocVien (MaKH, MaNH, Diem) VALUES (?,?,?)";
    String UPDATE_SQL = "UPDATE HocVien SET MaKH =?, MaNH =?, Diem =? WHERE MaHV = ?";
    String DELETE_SQL = "DELETE FROM HocVien WHERE MaHV=?";
    String SELECT_ALL_SQL = "SELECT * FROM HocVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM HocVien WHERE MaHV=?";

    @Override
    public void insert(HocVien entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMaKH(),
                entity.getMaNH(), entity.getDiem());
    }

    @Override
    public void update(HocVien entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getMaKH(), entity.getMaNH(),
                entity.getDiem(), entity.getMaHV());
    }

    @Override
    public void delete(Integer id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<HocVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HocVien selectById(Integer key) {
        List<HocVien> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<HocVien> selectBySql(String sql, Object... ags) {
        List<HocVien> list = new ArrayList<HocVien>();
        try {
            ResultSet rs = JdbcHelper.query(sql, ags);
            while (rs.next()) {
                HocVien entity = new HocVien();
                entity.setMaHV(rs.getInt("MaHV"));
                entity.setDiem(rs.getFloat("Diem"));
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setMaNH(rs.getString("MaNH"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<HocVien> selectByKhoaHoc(int maKH) {
        String sql = "SELECT * FROM HocVien WHERE MaKH = ?";
        return this.selectBySql(sql, maKH);
    }
    
    public HocVien selectByNguoiHoc(String MaNH) {
        String sql = "SELECT * FROM HocVien WHERE MaNH = ?";
        List<HocVien> list = this.selectBySql(sql, MaNH);
        return list.get(0);
    }

    public static void main(String[] args) {
        HocVienDao dao = new HocVienDao();
        HocVien hocVien = dao.selectById(4);
        hocVien.setDiem(10);
        dao.update(hocVien);
    }

}
