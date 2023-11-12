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

    private int id;
    private String tenLoai;
    private boolean trangThai;
    private String loai = "Loại Sản Phẩm";

    public LoaiSP() {
    }

    public LoaiSP(int id) {
        this.id = id;
    }

    public LoaiSP(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public LoaiSP(String tenLoai, boolean trangThai) {
        this.tenLoai = tenLoai;
        this.trangThai = trangThai;
    }

    public LoaiSP(int id, String tenLoai, boolean trangThai) {
        this.id = id;
        this.tenLoai = tenLoai;
        this.trangThai = trangThai;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Object[] toData(){
        return new Object[]{
            this.id,
            this.loai,
            this.tenLoai,
            this.trangThai
        };
    }
}
