/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class ChiTietHoaDon {
    private int idCTHD;
    private String maCTHD;
    private ChiTietSP sp;
    private HoaDon hd;
    private int soLuong;
    private double gia;
    private double tongTien;
    private boolean trangThai;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(String maCTHD, ChiTietSP sp, HoaDon hd, int soLuong) {
        this.maCTHD = maCTHD;
        this.sp = sp;
        this.hd = hd;
        this.soLuong = soLuong;
    }

    public ChiTietHoaDon(int idCTHD, String maCTHD, ChiTietSP sp, HoaDon hd, int soLuong, double gia, double tongTien, boolean trangThai) {
        this.idCTHD = idCTHD;
        this.maCTHD = maCTHD;
        this.sp = sp;
        this.hd = hd;
        this.soLuong = soLuong;
        this.gia = gia;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
    }

    public int getIdCTHD() {
        return idCTHD;
    }

    public void setIdCTHD(int idCTHD) {
        this.idCTHD = idCTHD;
    }

    public String getMaCTHD() {
        return maCTHD;
    }

    public void setMaCTHD(String maCTHD) {
        this.maCTHD = maCTHD;
    }

    public ChiTietSP getSp() {
        return sp;
    }

    public void setSp(ChiTietSP sp) {
        this.sp = sp;
    }

    public HoaDon getHd() {
        return hd;
    }

    public void setHd(HoaDon hd) {
        this.hd = hd;
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

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    public Object[] dataCTHD(){
        return new Object[]{
            this.sp.getMaBienThe(),
            this.sp.getSp().getTenSP(),
            this.sp.getMau().getTenMau(),
            this.sp.getCl().getTenCL(),
            this.sp.getSize().getTenSize(),
            this.soLuong,
            this.sp.getGia(),
            this.tongTien,
            this.trangThai
        };
    }
}
