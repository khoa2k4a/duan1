package service;

import entity.KhoaHoc;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class KhoaHocService {
    String SQL_SELECT_ALL = "SELECT MaKH, MaCD,HocPhi,ThoiLuong,NgayKG,GhiChu,MaNV,NgayTao FROM KhoaHoc";
    String SQL_SEARCH_BY_MACD = "SELECT MaKH, MaCD,HocPhi,ThoiLuong,NgayKG,GhiChu,MaNV,NgayTao FROM KhoaHoc WHERE MaCD=?";
    
    public List<KhoaHoc> selectAll() {
        List<KhoaHoc> list = new ArrayList<>();
        try {
            Connection conn = DbConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(SQL_SELECT_ALL);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Integer maKH = rs.getInt(1);
                String maCD = rs.getString(2);
                Double hocPhi = rs.getDouble(3);
                Integer thoiLuong = rs.getInt(4);
                Date ngayKG = rs.getDate(5);
                String ghiChu = rs.getString(6);
                String maNV = rs.getString(7);
                Date ngayTao = rs.getDate(8);
                list.add(new KhoaHoc(maKH, maCD, hocPhi, thoiLuong, ngayKG, ghiChu, maNV, ngayTao));
            }
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public List<KhoaHoc> searchByMaCD(String maCD) {
        List<KhoaHoc> list = new ArrayList<>();
        try {
            Connection conn = DbConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(SQL_SEARCH_BY_MACD);
            stm.setString(1, maCD);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Integer maKH = rs.getInt(1);
                Double hocPhi = rs.getDouble(3);
                Integer thoiLuong = rs.getInt(4);
                Date ngayKG = rs.getDate(5);
                String ghiChu = rs.getString(6);
                String maNV = rs.getString(7);
                Date ngayTao = rs.getDate(8);
                list.add(new KhoaHoc(maKH, maCD, hocPhi, thoiLuong, ngayKG, ghiChu, maNV, ngayTao));
            }
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
