/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class BienTheSanPham {

    private int id;
    private SanPham sp;
    private LoaiSanPham lsp;
    private Mau m;
    private Size s;
    private ChatLieu cl;
    private String maBTSP;
    private int soLuong;
    private double giaSP;
    private boolean trangThai;

    public BienTheSanPham() {
    }

    public BienTheSanPham(int id, SanPham sp, LoaiSanPham lsp, Mau m, Size s, ChatLieu cl, String maBTSP, int soLuong, double giaSP, boolean trangThai) {
        this.id = id;
        this.sp = sp;
        this.lsp = lsp;
        this.m = m;
        this.s = s;
        this.cl = cl;
        this.maBTSP = maBTSP;
        this.soLuong = soLuong;
        this.giaSP = giaSP;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SanPham getSp() {
        return sp;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }

    public LoaiSanPham getLsp() {
        return lsp;
    }

    public void setLsp(LoaiSanPham lsp) {
        this.lsp = lsp;
    }

    public Mau getM() {
        return m;
    }

    public void setM(Mau m) {
        this.m = m;
    }

    public Size getS() {
        return s;
    }

    public void setS(Size s) {
        this.s = s;
    }

    public ChatLieu getCl() {
        return cl;
    }

    public void setCl(ChatLieu cl) {
        this.cl = cl;
    }

    public String getMaBTSP() {
        return maBTSP;
    }

    public void setMaBTSP(String maBTSP) {
        this.maBTSP = maBTSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

}
