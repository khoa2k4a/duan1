/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.NhanVien;
import utility.DBConnect;
/**
 *
 * @author ADMIN
 */
public class NhanVienService {
    Connection con = null;
    PreparedStatement ps=null;
    String sql = null;
    ResultSet rs = null;
    
    public List<NhanVien> getAll(){
        sql="select MaNV,TenNV,Sdt,DiaChi,Email,GioiTinh,TaiKhoan,MatKhau,VaiTro,TrangThai from NHANVIEN";
        List<NhanVien> listnv = new ArrayList<>();
        try {
            con=DBConnect.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                NhanVien nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(4), rs.getString(3),rs.getString(5),rs.getBoolean(6), rs.getString(7),rs.getString(8), rs.getString(9), rs.getBoolean(10));
                listnv.add(nv);              
            }
            return listnv;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public int themnv (NhanVien nv){
        sql="INSERT INTO NHANVIEN(MaNV,TenNV,Sdt,DiaChi,Email,GioiTinh,TaiKhoan,MatKhau,VaiTro,TrangThai) VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, nv.getManv());
            ps.setObject(2, nv.getTennv());
            ps.setObject(3, nv.getSdt());
            ps.setObject(4, nv.getDiachi());
            ps.setObject(5, nv.getEmail());
            ps.setObject(6, nv.isGioitinh());
            ps.setObject(7, nv.getTaikhoan());
            ps.setObject(8, nv.getMatkhau());
            ps.setObject(9, nv.getVaitro());
            ps.setObject(10, nv.isTrangthai());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int suanv(NhanVien nv,String ma){
        sql="update NHANVIEN set TenNV=?,Sdt=?,DiaChi=?,Email=?,GioiTinh=?,TaiKhoan=?,MatKhau=?,VaiTro=?,TrangThai=? where MaNV=?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, nv.getTennv());
            ps.setObject(2, nv.getSdt());
            ps.setObject(3, nv.getDiachi());
            ps.setObject(4, nv.getEmail());
            ps.setObject(5, nv.isGioitinh());
            ps.setObject(6, nv.getTaikhoan());
            ps.setObject(7, nv.getMatkhau());
            ps.setObject(8, nv.getVaitro());
            ps.setObject(9, nv.isTrangthai());
            ps.setObject(10, ma);   
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int xoanv(String ma){
        sql="delete NHANVIEN where MaNV=?";
        try {
            con=DBConnect.getConnection();
            ps=con.prepareStatement(sql);
            ps.setObject(1, ma);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public List<NhanVien> timten(String ten){
        List<NhanVien> listTim = new ArrayList<>();
        sql="select MaNV,TenNV,Sdt,DiaChi,Email,GioiTinh,TaiKhoan,MatKhau,VaiTro,TrangThai from NHANVIEN where TenNV like ?";
        try {
            con=DBConnect.getConnection();
            ps=con.prepareStatement(sql);
            ps.setObject(1, ten);
            rs=ps.executeQuery();
            while(rs.next()){
                NhanVien nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(4), rs.getString(3),rs.getString(5),rs.getBoolean(6), rs.getString(7),rs.getString(8), rs.getString(9), rs.getBoolean(10));
                listTim.add(nv);              
            }
            return listTim;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<NhanVien> timvaitro(String vaitro){
        List<NhanVien> listTim = new ArrayList<>();
        sql="select MaNV,TenNV,Sdt,DiaChi,Email,GioiTinh,TaiKhoan,MatKhau,VaiTro,TrangThai from NHANVIEN where VaiTro like ?";
        try {
            con=DBConnect.getConnection();
            ps=con.prepareStatement(sql);
            ps.setObject(1,vaitro);
            rs=ps.executeQuery();
            while(rs.next()){
                NhanVien nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(4), rs.getString(3),rs.getString(5),rs.getBoolean(6), rs.getString(7),rs.getString(8), rs.getString(9), rs.getBoolean(10));
                listTim.add(nv);              
            }
            return listTim;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
