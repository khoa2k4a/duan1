/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class ChatLieu {

    private int idCL;
    private String maCL;
    private String tenCL;
    private boolean trangThai;
    private String loai = "Chất Liệu";

    public ChatLieu() {
    }

    public ChatLieu(String tenCL) {
        this.tenCL = tenCL;
    }

    public ChatLieu(String tenCL, boolean trangThai) {
        this.tenCL = tenCL;
        this.trangThai = trangThai;
    }

    public ChatLieu(String maCL, String tenCL, boolean trangThai) {
        this.maCL = maCL;
        this.tenCL = tenCL;
        this.trangThai = trangThai;
    }

    public ChatLieu(int idCL, String maCL, String tenCL, boolean trangThai) {
        this.idCL = idCL;
        this.maCL = maCL;
        this.tenCL = tenCL;
        this.trangThai = trangThai;
    }

    public int getIdCL() {
        return idCL;
    }

    public void setIdCL(int idCL) {
        this.idCL = idCL;
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

    public Object[] dataChatLieu() {
        return new Object[]{
            this.maCL,
            this.loai,
            this.tenCL,
            this.trangThai
        };
    }
}
