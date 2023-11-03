/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class SanPham {
    private String ten;
    private String loai;
    private String mau;
    private String size;
    private String chatLieu;
    private String soLuong;
    private String gia;
    private String giaSale;
    private String trangThai;

    public SanPham() {
    }

    public SanPham(String ten, String loai, String mau, String size, String chatLieu, String soLuong, String gia, String giaSale, String trangThai) {
        this.ten = ten;
        this.loai = loai;
        this.mau = mau;
        this.size = size;
        this.chatLieu = chatLieu;
        this.soLuong = soLuong;
        this.gia = gia;
        this.giaSale = giaSale;
        this.trangThai = trangThai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getGiaSale() {
        return giaSale;
    }

    public void setGiaSale(String giaSale) {
        this.giaSale = giaSale;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    public Object[] toData(){
        return new Object[]{
            this.ten,
            this.loai,
            this.mau,
            this.size,
            this.chatLieu,
            this.soLuong,
            this.gia,
            this.giaSale,
            this.trangThai
        };
    }
}
