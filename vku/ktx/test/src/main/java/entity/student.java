package entity;

import java.text.SimpleDateFormat;

public class student {

    private String masv;
    private String ten;
    private String ngaysinh;
    private int gioitinh;
    private String lop;
    private String nganh;
    private String khoa;
    private String truong;
    private String CMND;
    private String sdtCanhan;
    private String sdtGiadinh;
    private String email;
    private String diachi;
    private String anh;
    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String cMND) {
        CMND = cMND;
    }

    public String getSdtCanhan() {
        return sdtCanhan;
    }

    public void setSdtCanhan(String sdtCanhan) {
        this.sdtCanhan = sdtCanhan;
    }

    public String getSdtGiadinh() {
        return sdtGiadinh;
    }

    public void setSdtGiadinh(String sdtGiadinh) {
        this.sdtGiadinh = sdtGiadinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public student() {

    }

    public student(String masv, String ten, String ngaysinh, int gioitinh, String lop, String nganh, String khoa, String truong, String CMND, String sdtCanhan, String sdtGiadinh, String email, String diachi, String anh) {
        this.masv = masv;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.lop = lop;
        this.nganh = nganh;
        this.khoa = khoa;
        this.truong = truong;
        this.CMND = CMND;
        this.sdtCanhan = sdtCanhan;
        this.sdtGiadinh = sdtGiadinh;
        this.email = email;
        this.diachi = diachi;
        this.anh = anh;
    }
}

