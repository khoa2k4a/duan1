/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class ThongKe {
    private String mahoadon;
    private String tennv;
    private String tenkh;
    private Date ngaytao;
    private double tongtien;

    public ThongKe() {
    }

    public ThongKe(String mahoadon, String tennv, String tenkh, Date ngaytao, double tongtien) {
        this.mahoadon = mahoadon;
        this.tennv = tennv;
        this.tenkh = tenkh;
        this.ngaytao = ngaytao;
        this.tongtien = tongtien;
    }

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public double getTongtien() {
        return tongtien;
    }

    public void setTongtien(double tongtien) {
        this.tongtien = tongtien;
    }
    
    public Object[] toData(){
        return new Object[]{this.mahoadon,this.tennv,this.ngaytao,this.tenkh,this.tongtien};
    }
}
