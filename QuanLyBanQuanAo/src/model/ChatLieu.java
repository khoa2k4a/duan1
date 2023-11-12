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

    private int id;
    private String tenCL;
    private boolean trangThai;
    private String cl = "Chất Liệu";

    public ChatLieu() {
    }

    public ChatLieu(int id) {
        this.id = id;
    }

    public ChatLieu(String tenCL) {
        this.tenCL = tenCL;
    }

    public ChatLieu(String tenCL, boolean trangThai) {
        this.tenCL = tenCL;
        this.trangThai = trangThai;
    }

    public ChatLieu(int id, String tenCL, boolean trangThai) {
        this.id = id;
        this.tenCL = tenCL;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Object[] toData() {
        return new Object[]{
            this.id,
            this.cl,
            this.tenCL,
            this.trangThai
        };
    }
}
