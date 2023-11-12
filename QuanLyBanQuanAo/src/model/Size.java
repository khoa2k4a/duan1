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
    private int id;
    private String size;
    private boolean trangThai;
    private String s = "Size";

    public Size() {
    }

    public Size(int id) {
        this.id = id;
    }

    public Size(String size) {
        this.size = size;
    }

    public Size(String size, boolean trangThai) {
        this.size = size;
        this.trangThai = trangThai;
    }

    public Size(int id, String size, boolean trangThai) {
        this.id = id;
        this.size = size;
        this.trangThai = trangThai;
    }

    

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
            this.s,
            this.size,
            this.trangThai
        };
    }
}
