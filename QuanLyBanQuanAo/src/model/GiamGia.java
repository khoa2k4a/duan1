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
public class GiamGia {

    private String maDot;
    private String tenDot;
    private Date startDate;
    private Date endDate;
    private int phanTramGiam;
    private float dieuKienGiam;
    private int trangThai;

    public String getTT() {
        if (trangThai == 0) {
            return "Active";
        } else {
            return "Disable";
        }
    }

    public GiamGia() {
    }

    public GiamGia(String maDot, String tenDot, Date startDate, Date endDate, int phanTramGiam, float dieuKienGiam, int trangThai) {
        this.maDot = maDot;
        this.tenDot = tenDot;
        this.startDate = startDate;
        this.endDate = endDate;
        this.phanTramGiam = phanTramGiam;
        this.dieuKienGiam = dieuKienGiam;
        this.trangThai = trangThai;
    }

    public String getMaDot() {
        return maDot;
    }

    public void setMaDot(String maDot) {
        this.maDot = maDot;
    }

    public String getTenDot() {
        return tenDot;
    }

    public void setTenDot(String tenDot) {
        this.tenDot = tenDot;
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

    public int getPhanTramGiam() {
        return phanTramGiam;
    }

    public void setPhanTramGiam(int phanTramGiam) {
        this.phanTramGiam = phanTramGiam;
    }

    public float getDieuKienGiam() {
        return dieuKienGiam;
    }

    public void setDieuKienGiam(float dieuKienGiam) {
        this.dieuKienGiam = dieuKienGiam;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

}
