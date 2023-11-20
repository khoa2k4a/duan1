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

    private int idMau;
    private String maMau;
    private String tenMau;
    private boolean trangThai;
    private String loai = "Màu sắc";

    public Mau() {
    }

    public Mau(int idMau) {
        this.idMau = idMau;
    }

    public Mau(String tenMau) {
        this.tenMau = tenMau;
    }

    public Mau(String tenMau, boolean trangThai) {
        this.tenMau = tenMau;
        this.trangThai = trangThai;
    }

    public Mau(String maMau, String tenMau, boolean trangThai) {
        this.maMau = maMau;
        this.tenMau = tenMau;
        this.trangThai = trangThai;
    }

    public Mau(int idMau, String maMau, String tenMau, boolean trangThai) {
        this.idMau = idMau;
        this.maMau = maMau;
        this.tenMau = tenMau;
        this.trangThai = trangThai;
    }

    public int getIdMau() {
        return idMau;
    }

    public void setIdMau(int idMau) {
        this.idMau = idMau;
    }

    public String getMaMau() {
        return maMau;
    }

    public void setMaMau(String maMau) {
        this.maMau = maMau;
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

    public Object[] dataMau() {
        return new Object[]{
            this.maMau,
            this.loai,
            this.tenMau,
            this.trangThai
        };
    }
}
