/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.entity;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class KhoaHoc {

    private int maKH;
    private String maCD;
    private String maNV;
    private float hocPhi;
    private int thoiLuong;
    private Date ngayKG;
    private String ghiChu;
    private Date ngayTao;

    public KhoaHoc() {
    }

    public KhoaHoc(String maCD, String maNV, float hocPhi, int thoiLuong, Date ngayKG, String ghiChu, Date ngayTao) {
        this.maCD = maCD;
        this.maNV = maNV;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.ngayKG = ngayKG;
        this.ghiChu = ghiChu;
        this.ngayTao = ngayTao;
    }
    
    
    

    public KhoaHoc(int maKH, String maCD, String maNV, float hocPhi, int thoiLuong, Date ngayKG, String ghiChu, Date ngayTao) {
        this.maKH = maKH;
        this.maCD = maCD;
        this.maNV = maNV;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.ngayKG = ngayKG;
        this.ghiChu = ghiChu;
        this.ngayTao = ngayTao;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getMaCD() {
        return maCD;
    }

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public Date getNgayKG() {
        return ngayKG;
    }

    public void setNgayKG(Date ngayKG) {
        this.ngayKG = ngayKG;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    @Override
    public String toString() {
        return  maCD +""+ngayTao+"";
    }
    
}
