package entity;

public class detailsRoom {
	private String maphong;
	private String masv;
	private String hoten;
	private String ngaysinh;
	private String sdt;
	private String email;
	private String anh;
	private String ngayvao;
	private String ngayra;
	public String getMaphong() {
		return maphong;
	}
	public void setMaphong(String maphong) {
		this.maphong = maphong;
	}
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
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	
	public String getNgayvao() {
		return ngayvao;
	}
	public void setNgayvao(String ngayvao) {
		this.ngayvao = ngayvao;
	}
	public String getNgayra() {
		return ngayra;
	}
	public void setNgayra(String ngayra) {
		this.ngayra = ngayra;
	}
	public detailsRoom(String maphong, String masv, String hoten, String ngaysinh, String sdt, String email,
			String anh) {
		super();
		this.maphong = maphong;
		this.masv = masv;
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.sdt = sdt;
		this.email = email;
		this.anh = anh;
	}
	public detailsRoom(String maphong) {
		super();
		this.maphong = maphong;
	}
	public detailsRoom() {
		// TODO Auto-generated constructor stub
	}
	public detailsRoom(String maphong, String ngayvao, String ngayra) {
		super();
		this.maphong = maphong;
		this.ngayvao = ngayvao;
		this.ngayra = ngayra;
	}
	
	
	
}
