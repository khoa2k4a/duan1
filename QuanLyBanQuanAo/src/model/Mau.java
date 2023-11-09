/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class Mau {

    private int id;
    private String tenMau;
    private boolean trangThai;
    private String mauSac = "Màu sắc";

    public Mau() {
    }

    public Mau(String tenMau, boolean trangThai) {
        this.tenMau = tenMau;
        this.trangThai = trangThai;
    }

    public Mau(int id, String tenMau, boolean trangThai) {
        this.id = id;
        this.tenMau = tenMau;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public Object[] toData() {
        return new Object[]{
            this.id,
            this.mauSac,
            this.tenMau,
            this.trangThai
        };
    }
}
