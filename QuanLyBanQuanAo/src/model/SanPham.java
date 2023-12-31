/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class SanPham {

    private int idSP;
    private String maSP;
    private String tenSP;
    private boolean trangThai;
    private String loaiTT = "Tên Sản Phẩm";

    public SanPham() {
    }

    public SanPham(int idSP) {
        this.idSP = idSP;
    }

    public SanPham(String tenSP) {
        this.tenSP = tenSP;
    }

    public SanPham(String maSP, String tenSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    public SanPham(String maSP, String tenSP, boolean trangThai) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.trangThai = trangThai;
    }

    public SanPham(int idSP, String maSP, String tenSP, boolean trangThai) {
        this.idSP = idSP;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.trangThai = trangThai;
    }

    public int getIdSP() {
        return idSP;
    }

    public void setIdSP(int idSP) {
        this.idSP = idSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    public String getTrangThai(){
        String trangThai;
        if(this.isTrangThai()){
            trangThai = "còn bán";
        }else{
            trangThai = "Ngưng bán";
        }
        return trangThai;
    }

    public Object[] dataSanPham() {
        return new Object[]{
            this.maSP,
            this.tenSP,
            this.getTrangThai()
        };
    }
}
