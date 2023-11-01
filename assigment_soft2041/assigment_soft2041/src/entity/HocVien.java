/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class HocVien {
    Integer maHV;
    String maNH;
    String hoTen;
    Double diem;

    public HocVien(Integer maHV, String maNH, String hoTen, Double diem) {
        this.maHV = maHV;
        this.maNH = maNH;
        this.hoTen = hoTen;
        this.diem = diem;
    }

    
    
    public Integer getMaHV() {
        return maHV;
    }

    public void setMaHV(Integer maHV) {
        this.maHV = maHV;
    }

    public String getMaNH() {
        return maNH;
    }

    public void setMaNH(String maNH) {
        this.maNH = maNH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }
    
    
}
