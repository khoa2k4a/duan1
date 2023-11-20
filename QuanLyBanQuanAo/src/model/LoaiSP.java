/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class LoaiSP {

    private int idLoai;
    private String maLoai;
    private String tenLoai;
    private boolean trangThai;
    private String loai = "Loại Sản Phẩm";

    public LoaiSP() {
    }

    public LoaiSP(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public LoaiSP(String tenLoai, boolean trangThai) {
        this.tenLoai = tenLoai;
        this.trangThai = trangThai;
    }

    public LoaiSP(String maLoai, String tenLoai, boolean trangThai) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.trangThai = trangThai;
    }

    public LoaiSP(int idLoai, String maLoai, String tenLoai, boolean trangThai) {
        this.idLoai = idLoai;
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.trangThai = trangThai;
    }

    public int getIdLoai() {
        return idLoai;
    }

    public void setIdLoai(int idLoai) {
        this.idLoai = idLoai;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public Object[] dataLoai() {
        return new Object[]{
            this.maLoai,
            this.loai,
            this.tenLoai,
            this.trangThai
        };
    }
}
