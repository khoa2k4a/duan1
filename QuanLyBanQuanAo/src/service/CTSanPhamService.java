/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Mau;
import model.Size;
/**
 *
 * @author ADMIN
 */
public class CTSanPhamService {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = "";
    
    public List<Size> getSize(){
        List<Size> listS = new ArrayList<>();
        sql = "select TenSize from SIZE";
        try {
            con = DbConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Size s = new Size(rs.getString(1));
                listS.add(s);
            }
            return listS;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public List<Mau> getMau(){
        List<Mau> listM = new ArrayList<>();
        sql = "select TenMau from MAU";
        try {
            con = DbConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Mau m = new Mau(rs.getString(1));
                listM.add(m);
            }
            return listM;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
