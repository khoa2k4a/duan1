/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class HoaDonCT {

    private Long id;
    private String maHDCT;
    private BienTheSanPham btsp;
    private HoaDon h;
    private int soLuong;
    private double gia;
    private boolean trangThai;

    public HoaDonCT() {
    }

    public HoaDonCT(Long id, String maHDCT, BienTheSanPham btsp, HoaDon h, int soLuong, double gia, boolean trangThai) {
        this.id = id;
        this.maHDCT = maHDCT;
        this.btsp = btsp;
        this.h = h;
        this.soLuong = soLuong;
        this.gia = gia;
        this.trangThai = trangThai;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaHDCT() {
        return maHDCT;
    }

    public void setMaHDCT(String maHDCT) {
        this.maHDCT = maHDCT;
    }

    public BienTheSanPham getBtsp() {
        return btsp;
    }

    public void setBtsp(BienTheSanPham btsp) {
        this.btsp = btsp;
    }

    public HoaDon getH() {
        return h;
    }

    public void setH(HoaDon h) {
        this.h = h;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "HoaDonCT{" + "id=" + id + ", maHDCT=" + maHDCT + ", btsp=" + btsp + ", h=" + h + ", soLuong=" + soLuong + ", gia=" + gia + ", trangThai=" + trangThai + '}';
    }

}
