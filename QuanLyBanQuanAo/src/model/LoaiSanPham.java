/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class LoaiSanPham {

    private Long id;
    private String maLSP;
    private String tenLSP;
    private boolean trangThai;

    public LoaiSanPham() {
    }

    public LoaiSanPham(Long id, String maLSP, String tenLSP, boolean trangThai) {
        this.id = id;
        this.maLSP = maLSP;
        this.tenLSP = tenLSP;
        this.trangThai = trangThai;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaLSP() {
        return maLSP;
    }

    public void setMaLSP(String maLSP) {
        this.maLSP = maLSP;
    }

    public String getTenLSP() {
        return tenLSP;
    }

    public void setTenLSP(String tenLSP) {
        this.tenLSP = tenLSP;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "LoaiSanPham{" + "id=" + id + ", maLSP=" + maLSP + ", tenLSP=" + tenLSP + ", trangThai=" + trangThai + '}';
    }

}
