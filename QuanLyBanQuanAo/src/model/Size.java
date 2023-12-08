/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class Size {

    private int idSize;
    private String maSize;
    private String tenSize;
    private boolean trangThai;
    private String loai = "Size";

    public Size() {
    }

    public Size(int idSize) {
        this.idSize = idSize;
    }

    public Size(String tenSize) {
        this.tenSize = tenSize;
    }

    public Size(String tenSize, boolean trangThai) {
        this.tenSize = tenSize;
        this.trangThai = trangThai;
    }

    public Size(String maSize, String tenSize, boolean trangThai) {
        this.maSize = maSize;
        this.tenSize = tenSize;
        this.trangThai = trangThai;
    }

    public Size(int idSize, String maSize, String tenSize, boolean trangThai) {
        this.idSize = idSize;
        this.maSize = maSize;
        this.tenSize = tenSize;
        this.trangThai = trangThai;
    }

    public int getIdSize() {
        return idSize;
    }

    public void setIdSize(int idSize) {
        this.idSize = idSize;
    }

    public String getMaSize() {
        return maSize;
    }

    public void setMaSize(String maSize) {
        this.maSize = maSize;
    }

    public String getTenSize() {
        return tenSize;
    }

    public void setTenSize(String tenSize) {
        this.tenSize = tenSize;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getTrangThai() {
        String trangThai;
        if (this.isTrangThai()) {
            trangThai = "Còn";
        } else {
            trangThai = "Hết";
        }
        return trangThai;
    }

    public Object[] dataSize() {
        return new Object[]{
            this.maSize,
            this.loai,
            this.tenSize,
            this.getTrangThai()
        };
    }
}
