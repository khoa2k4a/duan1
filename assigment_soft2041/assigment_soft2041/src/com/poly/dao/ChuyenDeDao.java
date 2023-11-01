package com.poly.dao;

import com.poly.entity.ChuyenDe;
import com.poly.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ChuyenDeDao extends EduSysDao<ChuyenDe, String> {

    String INSERT_SQL = "INSERT INTO ChuyenDe (MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa) VALUES (?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE ChuyenDe SET  TenCD =?, HocPhi =?, ThoiLuong =?, Hinh =?, MoTa =? WHERE MaCD=?";
    String DELETE_SQL = "DELETE FROM ChuyenDe WHERE MaCD=?";
    String SELECT_ALL_SQL = "SELECT * FROM ChuyenDe";
    String SELECT_BY_ID_SQL = "SELECT * FROM ChuyenDe WHERE MaCD=?";

    @Override
    public void insert(ChuyenDe entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMaCD(), entity.getTenCD(),
                entity.getHocPhi(), entity.getThoiLuong(), entity.getHinh(), entity.getMoTa());
    }

    @Override
    public void update(ChuyenDe entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getTenCD(), entity.getHocPhi(),
                entity.getThoiLuong(), entity.getHinh(), entity.getMoTa(), entity.getMaCD());
    }

    @Override
    public void delete(String key) {
         JdbcHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<ChuyenDe> selectAll() {
         return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ChuyenDe selectById(String key) {
           List<ChuyenDe> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<ChuyenDe> selectBySql(String sql, Object... ags) {
         List<ChuyenDe> list = new ArrayList<ChuyenDe>();
        try {
            ResultSet rs = JdbcHelper.query(sql, ags);
            while (rs.next()) {
                ChuyenDe entity = new ChuyenDe();
                entity.setHinh(rs.getString("Hinh"));
                entity.setHocPhi(rs.getFloat("HocPhi"));
                entity.setMaCD(rs.getString("MaCD"));
                entity.setMoTa(rs.getString("MoTa"));
                entity.setTenCD(rs.getString("TenCD"));
                entity.setThoiLuong(rs.getInt("ThoiLuong"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void main(String[] args) {
        
    }

}
