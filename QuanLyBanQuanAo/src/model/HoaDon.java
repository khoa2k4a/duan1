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

    private Long id;
    private String maHD;
    private NhanVien n;
    private KhachHang k;
    private Date ngayTao;
    private String maGiamGia;
    private String ghiChu;
    private String hinhThucTT;
    private boolean trangThai;

    public HoaDon() {
    }

    public HoaDon(String maHD) {
        this.maHD = maHD;
    }

    public HoaDon(Long id, String maHD, NhanVien n, KhachHang k, Date ngayTao, String maGiamGia, String ghiChu, String hinhThucTT, boolean trangThai) {
        this.id = id;
        this.maHD = maHD;
        this.n = n;
        this.k = k;
        this.ngayTao = ngayTao;
        this.maGiamGia = maGiamGia;
        this.ghiChu = ghiChu;
        this.hinhThucTT = hinhThucTT;
        this.trangThai = trangThai;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public NhanVien getN() {
        return n;
    }

    public void setN(NhanVien n) {
        this.n = n;
    }

    public KhachHang getK() {
        return k;
    }

    public void setK(KhachHang k) {
        this.k = k;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getMaGiamGia() {
        return maGiamGia;
    }

    public void setMaGiamGia(String maGiamGia) {
        this.maGiamGia = maGiamGia;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getHinhThucTT() {
        return hinhThucTT;
    }

    public void setHinhThucTT(String hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "id=" + id + ", maHD=" + maHD + ", n=" + n + ", k=" + k + ", ngayTao=" + ngayTao + ", maGiamGia=" + maGiamGia + ", ghiChu=" + ghiChu + ", hinhThucTT=" + hinhThucTT + ", trangThai=" + trangThai + '}';
    }

}
