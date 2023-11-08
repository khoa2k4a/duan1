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

    private int id;
    private String ten;
    private int soLuong;
    private double gia;
    private String loai;
    private String mau;
    private String size;
    private String chatLieu;
    private boolean trangThai;

    public SanPham() {
    }

    public SanPham(int id, String ten, int soLuong, double gia, String loai, String mau, String size, String chatLieu, boolean trangThai) {
        this.id = id;
        this.ten = ten;
        this.soLuong = soLuong;
        this.gia = gia;
        this.loai = loai;
        this.mau = mau;
        this.size = size;
        this.chatLieu = chatLieu;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Object[] toData() {
        return new Object[]{
            this.id,
            this.ten,
            this.soLuong,
            this.gia,
            this.loai,
            this.mau,
            this.size,
            this.chatLieu,
            this.trangThai
        };
    }
}
