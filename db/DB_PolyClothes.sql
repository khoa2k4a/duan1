CREATE DATABASE POLYCLOTHES;
USE POLYCLOTHES;
CREATE TABLE NHANVIEN(
    ID_NV INT IDENTITY(1,1) PRIMARY KEY,
	MaNV VARCHAR(250) UNIQUE NOT NULL,
    TenNV NVARCHAR(100) NOT NULL,
    DiaChi NVARCHAR(150) NOT NULL,
    Sdt VARCHAR(10) NOT NULL,
    Email VARCHAR(50),
    GioiTinh BIT NOT NULL,
    TaiKhoan VARCHAR(50) NOT NULL,
    MatKhau VARCHAR(20) NOT NULL,
    VaiTro NVARCHAR(50) NOT NULL,
    TrangThai BIT NOT NULL
)
;
CREATE TRIGGER tr_ma_nhan_vien BEFORE INSERT ON nhan_vien
FOR EACH ROW
BEGIN
    SET NEW.ma_nhan_vien = CONCAT('NV', LPAD(NEW.id, 4, '0'));
END;

CREATE TABLE KHACHHANG(
    ID_KH INT IDENTITY(1,1) PRIMARY KEY,
	MaKH VARCHAR(250) UNIQUE NOT NULL,
    TenKH NVARCHAR(100) NOT NULL,
    DiaChi NVARCHAR(150) NOT NULL,
    Sdt VARCHAR(10) NOT NULL,
    Email VARCHAR(50),
    GioiTinh BIT NOT NULL,
    TrangThai BIT NOT NULL
);
CREATE TABLE SANPHAM(
	ID_SP INT IDENTITY(1,1) PRIMARY KEY,
	MaSP VARCHAR(250) UNIQUE NOT NULL,
	TenSP NVARCHAR(100) NOT NULL,
	TrangThai BIT NOT NULL
);
CREATE TABLE BienThe_SANPHAM(
    ID_SPCT INT IDENTITY(1,1) PRIMARY KEY,
	MaSP VARCHAR(250) NOT NULL,
    MaLoaiSP VARCHAR(250) NOT NULL,
    MaMau VARCHAR(250) NOT NULL,
    MaSize VARCHAR(250) NOT NULL,
    MaChatLieu VARCHAR(250) NOT NULL,
	MaBienTheSP VARCHAR(250) UNIQUE NOT NULL,
    SoLuong INT NOT NULL,
    GiaSP MONEY NOT NULL,
    GiaSauSale MONEY NOT NULL,
    TrangThai BIT NOT NULL
);
CREATE TABLE LOAISANPHAM(
    ID_LoaiSP INT IDENTITY(1,1) PRIMARY KEY,
	MaLoaiSP VARCHAR(250) UNIQUE NOT NULL,
    TenLoaiSP NVARCHAR(100) NOT NULL,
    TrangThai BIT NOT NULL
);
CREATE TABLE MAU(
    ID_Mau INT IDENTITY(1,1) PRIMARY KEY,
    MaMau VARCHAR(250) UNIQUE NOT NULL,
    TenMau NVARCHAR(100) NOT NULL,
    TrangThai BIT NOT NULL
);
CREATE TABLE SIZE(
    ID_Size INT IDENTITY(1,1) PRIMARY KEY,
    MaSize VARCHAR(250) UNIQUE NOT NULL,
    TenSize NVARCHAR(100) NOT NULL,
    TrangThai BIT NOT NULL
);
CREATE TABLE CHATLIEU(
    ID_CL INT IDENTITY(1,1) PRIMARY KEY,
    MaChatLieu VARCHAR(250) UNIQUE NOT NULL,
    TenCL NVARCHAR(100) NOT NULL,
    TrangThai BIT NOT NULL
);
CREATE TABLE SALE(
    ID_Sale INT IDENTITY(1,1) PRIMARY KEY,
	MaSale VARCHAR(250) UNIQUE NOT NULL,
    TenChienDich NVARCHAR(100),
    StartDate DATE NOT NULL,
    EndDate DATE NOT NULL,
    TrangThai BIT NOT NULL
);
CREATE TABLE SALE_CT(
    ID_SaleCT INT IDENTITY(1,1) PRIMARY KEY,
	MaBienTheSP VARCHAR(250) NOT NULL,
    MaSale VARCHAR(250) NOT NULL,
    GiaTriGiamGia INT NOT NULL,
    DonViGiam VARCHAR(10) NOT NULL,
    TrangThai BIT NOT NULL
);
CREATE TABLE HOADON(
    ID_HD INT IDENTITY(1,1) PRIMARY KEY,
	MaHD VARCHAR(250) UNIQUE NOT NULL,
    MaNV VARCHAR(250) NOT NULL,
    MaKH VARCHAR(250) NOT NULL,
    TongTien MONEY NOT NULL,
    MaGiamGia VARCHAR(10),
    GhiChu NVARCHAR(150),
    HinhThucThanhToan NVARCHAR(50),
    TrangThai BIT NOT NULL
);
CREATE TABLE HOADON_CT(
    ID_HDCT INT IDENTITY(1,1) PRIMARY KEY,
	MaHDCT VARCHAR(250) UNIQUE NOT NULL,
    MaSP VARCHAR(250) NOT NULL,
    MaHD VARCHAR(250) NOT NULL,
    SoLuong INT,
    Gia MONEY,
    TongTien MONEY, 
    TrangThai BIT
);
CREATE TABLE VOUCHER(
    ID_Voucher INT IDENTITY(1,1) PRIMARY KEY,
	MaVoucher VARCHAR(250) UNIQUE NOT NULL,
    MaNV VARCHAR(250) NOT NULL,
    TenChienDich NVARCHAR(100),
    StartDate DATE,
    EndDate DATE,
    GiaTriGiam INT,
    DonViGiam VARCHAR(10),
    TrangThai BIT
);
CREATE TABLE VOUCHER_CT(
    ID INT IDENTITY(1,1) PRIMARY KEY,
    MaVoucher VARCHAR(250) NOT NULL,
    MaKH VARCHAR(250) NOT NULL,
    MaHD VARCHAR(250) NOT NULL,
    SoLuong INT,
    GiaTriGiam INT,
    DonViGiam VARCHAR(10),
    TrangThai BIT
);
ALTER TABLE BienThe_SANPHAM ADD CONSTRAINT fk_spct_sp FOREIGN KEY (MaSP) REFERENCES SANPHAM (MaSP);
ALTER TABLE BienThe_SANPHAM ADD CONSTRAINT fk_spct_loaisp FOREIGN KEY (MaLoaiSP) REFERENCES LOAISANPHAM (MaLoaiSP);
ALTER TABLE BienThe_SANPHAM ADD CONSTRAINT fk_spct_mau FOREIGN KEY (MaMau) REFERENCES MAU (MaMau);
ALTER TABLE BienThe_SANPHAM ADD CONSTRAINT fk_spct_size FOREIGN KEY (MaSize) REFERENCES SIZE (MaSize);
ALTER TABLE BienThe_SANPHAM ADD CONSTRAINT fk_spct_chatlieu FOREIGN KEY (MaChatLieu) REFERENCES CHATLIEU (MaChatLieu);
ALTER TABLE SALE_CT ADD CONSTRAINT fk_saleCT_sale FOREIGN KEY (MaSale) REFERENCES SALE (MaSale);
ALTER TABLE SALE_CT ADD CONSTRAINT fk_saleCT_spct FOREIGN KEY (MaBienTheSP) REFERENCES BienThe_SANPHAM (MaBienTheSP);
ALTER TABLE HOADON ADD CONSTRAINT fk_hoadon_nhanvien FOREIGN KEY (MaNV) REFERENCES NHANVIEN (MaNV);
ALTER TABLE HOADON ADD CONSTRAINT fk_hoadon_khachhang FOREIGN KEY (MaKH) REFERENCES KHACHHANG (MaKH);
ALTER TABLE HOADON_CT ADD CONSTRAINT fk_hdct_sp FOREIGN KEY (MaSP) REFERENCES SANPHAM (MaSP);
ALTER TABLE HOADON_CT ADD CONSTRAINT fk_hdct_hoadon FOREIGN KEY (MaHD) REFERENCES HOADON (MaHD);
ALTER TABLE VOUCHER ADD CONSTRAINT fk_voucher_nhanvien FOREIGN KEY (MaNV) REFERENCES NHANVIEN (MaNV);
ALTER TABLE VOUCHER_CT ADD CONSTRAINT fk_voucherCT_voucher FOREIGN KEY (MaVoucher) REFERENCES VOUCHER (MaVoucher);
ALTER TABLE VOUCHER_CT ADD CONSTRAINT fk_voucherCT_khachhang FOREIGN KEY (MaKH) REFERENCES KHACHHANG (MaKH);
ALTER TABLE VOUCHER_CT ADD CONSTRAINT fk_voucherCT_hoadon FOREIGN KEY (MaHD) REFERENCES HOADON (MaHD);

