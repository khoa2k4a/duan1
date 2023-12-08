/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class NhanVien {

    private int id;
    private String maNV;
    private String tenNV;
    private String diaChi;
    private String sdt;
    private String email;
    private int gioiTinh;
    private String taiKhoan;
    private String matKhau;
    private String vaiTro;
    private int trangThai;

    public NhanVien() {
    }

    public NhanVien(String tenNV) {
        this.tenNV = tenNV;
    }

    public NhanVien(String maNV, String tenNV, String diaChi, String sdt, String email, int gioiTinh, String taiKhoan, String matKhau, String vaiTro, int trangThai) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.vaiTro = vaiTro;
        this.trangThai = trangThai;
    }

    public NhanVien(int id, String maNV, String tenNV, String diaChi, String sdt, String email, int gioiTinh, String taiKhoan, String matKhau, String vaiTro, int trangThai) {
        this.id = id;
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.vaiTro = vaiTro;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
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

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getGT() {
        if (gioiTinh == 0) {
            return "Nam";
        } else {
            return "Nữ";
        }
    }

    public String getTT() {
        if (trangThai == 0) {
            return "Đang làm việc";
        } else {
            return "Đã nghỉ";
        }
    }

    public Object[] toData() {
        return new Object[]{this.maNV, this.tenNV, this.sdt, this.diaChi, this.email, this.getGT(), this.taiKhoan, this.matKhau, this.vaiTro, this.getTT()};
    }
}
