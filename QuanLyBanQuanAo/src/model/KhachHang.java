/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class KhachHang {

    private int idKH;
    private String maKH;
    private String tenKH;
    private String diaChi;
    private String sdt;
    private String email;
    private int gioiTinh;
    private int trangThai;

    public KhachHang() {
    }

    public KhachHang(String tenKH) {
        this.tenKH = tenKH;
    }

    public KhachHang(String maKH, String tenKH) {
        this.maKH = maKH;
        this.tenKH = tenKH;
    }

    public KhachHang(String maKH, String tenKH, String diaChi, String sdt, String email, int gioiTinh, int trangThai) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.trangThai = trangThai;
    }

    public KhachHang(int idKH, String maKH, String tenKH, String diaChi, String sdt, String email, int gioiTinh, int trangThai) {
        this.idKH = idKH;
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.trangThai = trangThai;
    }

    public int getIdKH() {
        return idKH;
    }

    public void setIdKH(int idKH) {
        this.idKH = idKH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
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

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getGT() {
        if (gioiTinh == 0) {
            return "Nam";
        } else {
            return "Nữ";
        }
    }

    public String getTT() {
        if (trangThai == 0) {
            return "Active";
        } else {
            return "Disable";
        }
    }

    public Object[] todata() {
        return new Object[]{this.maKH, this.tenKH, this.sdt, this.diaChi, this.email, this.getGT(), this.getTT()};
    }
}
