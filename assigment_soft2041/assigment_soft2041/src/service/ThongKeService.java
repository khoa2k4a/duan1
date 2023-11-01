package service;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class ThongKeService {
    String SQL_GET_BANG_DIEM = 
        "SELECT \n" +
        "   nh.MaNH, nh.HoTen, hv.Diem\n" +
        "FROM HocVien hv\n" +
        "   JOIN NguoiHoc nh ON hv.MaNH = nh.MaNH\n" +
        "WHERE \n" +
        "   hv.MaKH = ?\n" +
        "ORDER BY hv.Diem DESC";

    String getXepLoai(Double diem){
        if(diem < 5) return "Chưa đạt"; else return "Đạt";
    }
    public List<Object[]> getBangDiem(Integer maKH){
        List<Object[]> rows = new ArrayList<>();
        try{
            Connection conn = DbConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(SQL_GET_BANG_DIEM);
            stm.setInt(1, maKH);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                String maNH = rs.getString(1);
                String hoTen = rs.getString(2);
                Double diem = rs.getDouble(3);
                rows.add(new Object[]{maNH, hoTen, diem, getXepLoai(diem)});
            }
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return rows;
    }
}
