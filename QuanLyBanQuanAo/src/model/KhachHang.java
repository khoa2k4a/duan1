/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class KhachHang {
    private String makh;
    private String tenkh;
    private String diachi;
    private String sdt;
    private String email;
    private boolean gioitinh;
    private boolean trangthai;

    public KhachHang() {
    }

    public KhachHang(String tenkh) {
        this.tenkh = tenkh;
    }

    public KhachHang(String makh, String tenkh, String diachi, String sdt, String email, boolean gioitinh, boolean trangthai) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
        this.gioitinh = gioitinh;
        this.trangthai = trangthai;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
    
    public Object[] todata(){
        return new Object[]{this.makh,this.tenkh,this.sdt,this.diachi,this.email,this.gioitinh,this.trangthai};
    }
}
