/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.ChatLieu;
import model.LoaiSP;
import model.Mau;
import model.Size;
import utility.DBConnect;
/**
 *
 * @author ADMIN
 */
public class ThuocTinhService {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = "";
    
    public List<Mau> getMau(){
        List<Mau> listM = new ArrayList<>();
        sql = "select MaMau, TenMau, TrangThai from MAU";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Mau m = new Mau();
                m.setMaMau(rs.getString(1));
                m.setTenMau(rs.getString(2));
                m.setTrangThai(rs.getBoolean(3));
                listM.add(m);
            }
            return listM;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public List<Size> getSize(){
        List<Size> listS = new ArrayList<>();
        sql = "select MaSize, TenSize, TrangThai from SIZE";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Size s = new Size();
                s.setMaSize(rs.getString(1));
                s.setTenSize(rs.getString(2));
                s.setTrangThai(rs.getBoolean(3));
                listS.add(s);
            }
            return listS;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public List<ChatLieu> getChatLieu(){
        List<ChatLieu> listCL = new ArrayList<>();
        sql = "select MaChatLieu, TenCL, TrangThai from CHATLIEU";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ChatLieu cl = new ChatLieu();
                cl.setMaCL(rs.getString(1));
                cl.setTenCL(rs.getString(2));
                cl.setTrangThai(rs.getBoolean(3));
                listCL.add(cl);
            }
            return listCL;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public List<LoaiSP> getLoai(){
        List<LoaiSP> listL = new ArrayList<>();
        sql = "select MaLoaiSP, TenLoaiSP, TrangThai from LOAISANPHAM";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                LoaiSP l = new LoaiSP();
                l.setMaLoai(rs.getString(1));
                l.setTenLoai(rs.getString(2));
                l.setTrangThai(rs.getBoolean(3));
                listL.add(l);
            }
            return listL;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
