/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class ChiTietSP {

    private int idBienThe;
    private SanPham sp;
    private String maBienThe;
    private LoaiSP loai;
    private Mau mau;
    private Size size;
    private ChatLieu cl;
    private int soLuong;
    private double gia;
    private boolean trangThai;

    public ChiTietSP() {
    }

    public ChiTietSP(int idBienThe, SanPham sp, String maBienThe, LoaiSP loai, Mau mau, Size size, ChatLieu cl, int soLuong, double gia, boolean trangThai) {
        this.idBienThe = idBienThe;
        this.sp = sp;
        this.maBienThe = maBienThe;
        this.loai = loai;
        this.mau = mau;
        this.size = size;
        this.cl = cl;
        this.soLuong = soLuong;
        this.gia = gia;
        this.trangThai = trangThai;
    }

    public int getIdBienThe() {
        return idBienThe;
    }

    public void setIdBienThe(int idBienThe) {
        this.idBienThe = idBienThe;
    }

    public SanPham getSp() {
        return sp;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }

    public String getMaBienThe() {
        return maBienThe;
    }

    public void setMaBienThe(String maBienThe) {
        this.maBienThe = maBienThe;
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

    public ChatLieu getCl() {
        return cl;
    }

    public void setCl(ChatLieu cl) {
        this.cl = cl;
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

    public Object[] dataSPCT() {
        return new Object[]{
            this.sp.getMaSP(),
            this.sp.getTenSP(),
            this.maBienThe,
            this.loai.getTenLoai(),
            this.mau.getTenMau(),
            this.size.getTenSize(),
            this.cl.getTenCL(),
            this.soLuong,
            this.gia,
            this.trangThai
        };
    }
}
