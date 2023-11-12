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
    private LoaiSP loai;
    private Mau mau;
    private Size size;
    private ChatLieu chatLieu;
    private boolean trangThai;

    public SanPham() {
    }

    public SanPham(String ten, int soLuong, double gia, LoaiSP loai, Mau mau, Size size, ChatLieu chatLieu, boolean trangThai) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.gia = gia;
        this.loai = loai;
        this.mau = mau;
        this.size = size;
        this.chatLieu = chatLieu;
        this.trangThai = trangThai;
    }

    public SanPham(int id, String ten, int soLuong, double gia, LoaiSP loai, Mau mau, Size size, ChatLieu chatLieu, boolean trangThai) {
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

    public LoaiSP getLoai() {
        return loai;
    }

    public void setLoai(LoaiSP loai) {
        this.loai = loai;
    }

    public Mau getMau() {
        return mau;
    }

    public void setMau(Mau mau) {
        this.mau = mau;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public ChatLieu getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(ChatLieu chatLieu) {
        this.chatLieu = chatLieu;
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
            this.loai.getTenLoai(),
            this.mau.getTenMau(),
            this.size.getSize(),
            this.chatLieu.getTenCL(),
            this.trangThai
        };
    }
}
