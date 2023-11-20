/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Mau {

    private Long id;
    private String maMau;
    private String tenMau;
    private boolean trangThai;

    public Mau() {
    }

    public Mau(Long id, String maMau, String tenMau, boolean trangThai) {
        this.id = id;
        this.maMau = maMau;
        this.tenMau = tenMau;
        this.trangThai = trangThai;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Mau{" + "id=" + id + ", maMau=" + maMau + ", tenMau=" + tenMau + ", trangThai=" + trangThai + '}';
    }

}
