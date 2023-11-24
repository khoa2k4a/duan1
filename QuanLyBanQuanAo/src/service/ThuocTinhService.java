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

    public List<Mau> getMau() {
        List<Mau> listM = new ArrayList<>();
        sql = "select ID_Mau, MaMau, TenMau, TrangThai from MAU";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Mau m = new Mau();
                m.setIdMau(rs.getInt(1));
                m.setMaMau(rs.getString(2));
                m.setTenMau(rs.getString(3));
                m.setTrangThai(rs.getBoolean(4));
                listM.add(m);
            }
            return listM;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Size> getSize() {
        List<Size> listS = new ArrayList<>();
        sql = "select ID_Size, MaSize, TenSize, TrangThai from SIZE";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Size s = new Size();
                s.setIdSize(rs.getInt(1));
                s.setMaSize(rs.getString(2));
                s.setTenSize(rs.getString(3));
                s.setTrangThai(rs.getBoolean(4));
                listS.add(s);
            }
            return listS;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<ChatLieu> getChatLieu() {
        List<ChatLieu> listCL = new ArrayList<>();
        sql = "select ID_CL, MaChatLieu, TenCL, TrangThai from CHATLIEU";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ChatLieu cl = new ChatLieu();
                cl.setIdCL(rs.getInt(1));
                cl.setMaCL(rs.getString(2));
                cl.setTenCL(rs.getString(3));
                cl.setTrangThai(rs.getBoolean(4));
                listCL.add(cl);
            }
            return listCL;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<LoaiSP> getLoai() {
        List<LoaiSP> listL = new ArrayList<>();
        sql = "select ID_LoaiSP, MaLoaiSP, TenLoaiSP, TrangThai from LOAISANPHAM";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                LoaiSP l = new LoaiSP();
                l.setIdLoai(rs.getInt(1));
                l.setMaLoai(rs.getString(2));
                l.setTenLoai(rs.getString(3));
                l.setTrangThai(rs.getBoolean(4));
                listL.add(l);
            }
            return listL;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int addMau(Mau m) {
        sql = "insert into MAU(MaMau, TenMau,TrangThai)  values (?, ?, ?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getMaMau());
            ps.setObject(2, m.getTenMau());
            ps.setObject(3, m.isTrangThai());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int addSize(Size s) {
        sql = "insert into SIZE(MaSize, TenSize,TrangThai)  values (?, ?, ?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, s.getMaSize());
            ps.setObject(2, s.getTenSize());
            ps.setObject(3, s.isTrangThai());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int addChatLieu(ChatLieu cl) {
        sql = "insert into CHATLIEU(MaChatLieu, TenCL,TrangThai)  values (?, ?, ?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, cl.getMaCL());
            ps.setObject(2, cl.getTenCL());
            ps.setObject(3, cl.isTrangThai());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int addloaiSP(LoaiSP l) {
        sql = "insert into LOAISANPHAM(MaLoaiSP, TenLoaiSP,TrangThai)  values (?, ?, ?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, l.getMaLoai());
            ps.setObject(2, l.getTenLoai());
            ps.setObject(3, l.isTrangThai());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int updateMau(Mau m, String ma) {
        sql = "update MAU set TenMau = ?, TrangThai = ? where MaMau = ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getTenMau());
            ps.setObject(2, m.isTrangThai());
            ps.setObject(3, ma);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int updateSize(Size s, String ma) {
        sql = "update SIZE set TenSize = ?, TrangThai = ? where MaSize = ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, s.getTenSize());
            ps.setObject(2, s.isTrangThai());
            ps.setObject(3, ma);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int updateChatLieu(ChatLieu cl, String ma) {
        sql = "update CHATLIEU set TenCL = ?, TrangThai = ? where MaChatLieu = ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, cl.getTenCL());
            ps.setObject(2, cl.isTrangThai());
            ps.setObject(3, ma);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int updateLoaiSP(LoaiSP l, String ma) {
        sql = "update LOAISANPHAM set TenLoaiSP = ?, TrangThai = ? where MaLoaiSP = ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, l.getTenLoai());
            ps.setObject(2, l.isTrangThai());
            ps.setObject(3, ma);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
