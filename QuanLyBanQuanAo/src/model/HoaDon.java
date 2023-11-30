/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class HoaDon {
    private int idHD;
    private String maHD;
    private NhanVien nv;
    private KhachHang kh;
    private Date ngayTao;
    private double tongTien;
    private String maGG;
    private String ghiChu;
    private String hinhThuc;
    private boolean trangThai;

    public HoaDon() {
    }

    public HoaDon(String maHD) {
        this.maHD = maHD;
    }

    public HoaDon(int idHD, String maHD, NhanVien nv, KhachHang kh, Date ngayTao, double tongTien, String maGG, String ghiChu, String hinhThuc, boolean trangThai) {
        this.idHD = idHD;
        this.maHD = maHD;
        this.nv = nv;
        this.kh = kh;
        this.ngayTao = ngayTao;
        this.tongTien = tongTien;
        this.maGG = maGG;
        this.ghiChu = ghiChu;
        this.hinhThuc = hinhThuc;
        this.trangThai = trangThai;
    }

    public int getIdHD() {
        return idHD;
    }

    public void setIdHD(int idHD) {
        this.idHD = idHD;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getMaGG() {
        return maGG;
    }

    public void setMaGG(String maGG) {
        this.maGG = maGG;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getHinhThuc() {
        return hinhThuc;
    }

    public void setHinhThuc(String hinhThuc) {
        this.hinhThuc = hinhThuc;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    public Object[] dataHD(){
        return new Object[]{
            this.maHD,
            this.nv.getTennv(),
            this.kh.getTenkh(),
            this.ngayTao,
            this.tongTien,
            this.trangThai
        };
    }
}
