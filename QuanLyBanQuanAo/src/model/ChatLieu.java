/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class ChatLieu {

    private Long id;
    private String maCL;
    private String tenCL;
    private boolean trangThai;

    public ChatLieu() {
    }

    public ChatLieu(Long id, String maCL, String tenCL, boolean trangThai) {
        this.id = id;
        this.maCL = maCL;
        this.tenCL = tenCL;
        this.trangThai = trangThai;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaCL() {
        return maCL;
    }

    public void setMaCL(String maCL) {
        this.maCL = maCL;
    }

    public String getTenCL() {
        return tenCL;
    }

    public void setTenCL(String tenCL) {
        this.tenCL = tenCL;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "ChatLieu{" + "id=" + id + ", maCL=" + maCL + ", tenCL=" + tenCL + ", trangThai=" + trangThai + '}';
    }

}
