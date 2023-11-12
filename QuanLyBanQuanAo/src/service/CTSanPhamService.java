/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import utility.DbConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.ChatLieu;
import model.LoaiSP;
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
        sql = "select ID, TenSize, TrangThai from SIZE";
        try {
            con = DbConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Size s = new Size(rs.getInt(1), rs.getString(2), rs.getBoolean(3));
                listS.add(s);
            }
            return listS;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public int addSize(Size size){
        sql = "insert into Size(TenSize, TrangThai) values (?, ?)";
        try {
            con = DbConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, size.getSize());
            ps.setObject(2, size.isTrangThai());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public List<Mau> getMau(){
        List<Mau> listM = new ArrayList<>();
        sql = "select ID, TenMau, TrangThai from MAU";
        try {
            con = DbConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Mau m = new Mau(rs.getInt(1), rs.getString(2), rs.getBoolean(3));
                listM.add(m);
            }
            return listM;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public int addMau(Mau mau){
        sql = "insert into MAU(TenMau, TrangThai) values(?, ?)";
        try {
            con = DbConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, mau.getTenMau());
            ps.setObject(2, mau.isTrangThai());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public List<LoaiSP> getLoai(){
        List<LoaiSP> listL = new ArrayList<>();
        sql = "select ID, TenLoaiSP, TrangThai from LoaiSanPham";
        try {
            con = DbConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                LoaiSP l = new LoaiSP(rs.getInt(1), rs.getString(2), rs.getBoolean(3));
                listL.add(l);
            }
            return listL;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public int addLoai(LoaiSP loai){
        sql = "insert into LoaiSanPham(TenLoaiSP, TrangThai) values(?, ?)";
        try {
            con = DbConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, loai.getTenLoai());
            ps.setObject(2, loai.isTrangThai());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public List<ChatLieu> getChatLieu(){
        List<ChatLieu> listCL = new ArrayList<>();
        sql = "select ID, TenCL, TrangThai from CHATLIEU";
        try {
            con = DbConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ChatLieu cl = new ChatLieu(rs.getInt(1), rs.getString(2), rs.getBoolean(3));
                listCL.add(cl);
            }
            return listCL;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public int addChatLieu(ChatLieu chatLieu){
        sql = "insert into ChatLieu(TenCL, TrangThai) values(?, ?)";
        try {
            con = DbConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, chatLieu.getTenCL());
            ps.setObject(2, chatLieu.isTrangThai());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
