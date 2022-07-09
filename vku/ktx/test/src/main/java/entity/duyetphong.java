package entity;

public class duyetphong {
private String masv;
private String hoten;
private String 	ngaysinh;
private String sdtSV;
private String email;
private String maphong;
public String getMasv() {
	return masv;
}
public void setMasv(String masv) {
	this.masv = masv;
}
public String getHoten() {
	return hoten;
}
public void setHoten(String hoten) {
	this.hoten = hoten;
}
public String getNgaysinh() {
	return ngaysinh;
}
public void setNgaysinh(String ngaysinh) {
	this.ngaysinh = ngaysinh;
}
public String getSdtSV() {
	return sdtSV;
}
public void setSdtSV(String sdtSV) {
	this.sdtSV = sdtSV;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMaphong() {
	return maphong;
}
public void setMaphong(String maphong) {
	this.maphong = maphong;
}
public duyetphong(String masv, String hoten, String ngaysinh, String sdtSV, String email, String maphong) {
	super();
	this.masv = masv;
	this.hoten = hoten;
	this.ngaysinh = ngaysinh;
	this.sdtSV = sdtSV;
	this.email = email;
	this.maphong = maphong;
}

}
