/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class VoucherCT {

    private Long id;
    private String maVoucherCT;
    private Voucher v;
    private KhachHang k;
    private HoaDon h;
    private int soLuong;
    private int gtGiam;
    private String dvGiam;
    private boolean trangThai;

    public VoucherCT() {
    }

    public VoucherCT(Long id, String maVoucherCT, Voucher v, KhachHang k, HoaDon h, int soLuong, int gtGiam, String dvGiam, boolean trangThai) {
        this.id = id;
        this.maVoucherCT = maVoucherCT;
        this.v = v;
        this.k = k;
        this.h = h;
        this.soLuong = soLuong;
        this.gtGiam = gtGiam;
        this.dvGiam = dvGiam;
        this.trangThai = trangThai;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaVoucherCT() {
        return maVoucherCT;
    }

    public void setMaVoucherCT(String maVoucherCT) {
        this.maVoucherCT = maVoucherCT;
    }

    public Voucher getV() {
        return v;
    }

    public void setV(Voucher v) {
        this.v = v;
    }

    public KhachHang getK() {
        return k;
    }

    public void setK(KhachHang k) {
        this.k = k;
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

    public int getGtGiam() {
        return gtGiam;
    }

    public void setGtGiam(int gtGiam) {
        this.gtGiam = gtGiam;
    }

    public String getDvGiam() {
        return dvGiam;
    }

    public void setDvGiam(String dvGiam) {
        this.dvGiam = dvGiam;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "VoucherCT{" + "id=" + id + ", maVoucherCT=" + maVoucherCT + ", v=" + v + ", k=" + k + ", h=" + h + ", soLuong=" + soLuong + ", gtGiam=" + gtGiam + ", dvGiam=" + dvGiam + ", trangThai=" + trangThai + '}';
    }

}
