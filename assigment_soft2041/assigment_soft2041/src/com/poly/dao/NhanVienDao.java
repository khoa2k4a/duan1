
package com.poly.dao;

import com.poly.entity.NhanVien;
import com.poly.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDao extends EduSysDao<NhanVien, String>{
    String INSERT_SQL = "INSERT INTO NhanVien(MaNV, MatKhau, HoTen,VaiTro) values (?,?,?,?)";
    String UPDATE_SQL = "UPDATE NhanVien SET MatKhau =?, HoTen =?, VaiTro =? WHERE MaNV =?";
    String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV=?";
    String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE MaNV=?";

    @Override
    public void insert(NhanVien entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMaNV(),entity.getMatKhau(),
                   entity.getHoTen(), entity.isVaiTro());
    }

    @Override
    public void update(NhanVien entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getMatKhau(),entity.getHoTen(),
                       entity.isVaiTro(), entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<NhanVien> selectAll() {
       return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectById(String id) {
          List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
          if(list.isEmpty()) {
              return  null;
          } 
          return list.get(0);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object...ags) {
         List<NhanVien> list = new ArrayList<NhanVien>();
        try {
            ResultSet rs = JdbcHelper.query(sql, ags);
            while (rs.next()) {                
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setVaiTro(rs.getBoolean("VaiTro"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return  list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void main(String[] args) {
        NhanVienDao nhanVienDao = new NhanVienDao();

        NhanVien nv = new NhanVien();
        nv.setMaNV("NV005");
        nv.setMatKhau("123");
        nv.setHoTen("Nguyễn Thị Thùy Linh");
        nv.setVaiTro(true);
        nhanVienDao.insert(nv);
    
    }
    
}
