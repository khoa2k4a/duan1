/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author admin
 */
public class Voucher {

    private Long id;
    private String maVoucher;
    private NhanVien n;
    private String tenCD;
    private Date startDate;
    private Date endDate;
    private int gtGiam;
    private String dvGiam;
    private boolean trangThai;

    public Voucher() {
    }

    public Voucher(Long id, String maVoucher, NhanVien n, String tenCD, Date startDate, Date endDate, int gtGiam, String dvGiam, boolean trangThai) {
        this.id = id;
        this.maVoucher = maVoucher;
        this.n = n;
        this.tenCD = tenCD;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public String getMaVoucher() {
        return maVoucher;
    }

    public void setMaVoucher(String maVoucher) {
        this.maVoucher = maVoucher;
    }

    public NhanVien getN() {
        return n;
    }

    public void setN(NhanVien n) {
        this.n = n;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
        return "Voucher{" + "id=" + id + ", maVoucher=" + maVoucher + ", n=" + n + ", tenCD=" + tenCD + ", startDate=" + startDate + ", endDate=" + endDate + ", gtGiam=" + gtGiam + ", dvGiam=" + dvGiam + ", trangThai=" + trangThai + '}';
    }

}
