/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class NhanVien {
    private int id;
    private String manv;
    private String tennv;
    private String diachi;
    private String sdt;
    private String email;
    private boolean gioitinh;
    private String taikhoan;
    private String matkhau;
    private String vaitro;
    private boolean trangthai;

    public NhanVien() {
    }

    public NhanVien(String tennv) {
        this.tennv = tennv;
    }

    public NhanVien(String manv, String tennv, String diachi, String sdt, String email, boolean gioitinh, String taikhoan, String matkhau, String vaitro, boolean trangthai) {
        this.manv = manv;
        this.tennv = tennv;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
        this.gioitinh = gioitinh;
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.vaitro = vaitro;
        this.trangthai = trangthai;
    }
    
    public NhanVien(int id, String manv, String tennv, String diachi, String sdt, String email, boolean gioitinh, String taikhoan, String matkhau, String vaitro, boolean trangthai) {
        this.id = id;
        this.manv = manv;
        this.tennv = tennv;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
        this.gioitinh = gioitinh;
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.vaitro = vaitro;
        this.trangthai = trangthai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getVaitro() {
        return vaitro;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
    
    public Object[] toData(){
        return new Object[]{this.manv,this.tennv,this.sdt,this.diachi,this.email,this.gioitinh,this.taikhoan,this.matkhau,this.vaitro,this.trangthai};
    }
}
