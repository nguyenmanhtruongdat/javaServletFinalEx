package entity;

public class room {
	private String masv;
	private String hocky;
	private String maphong;
	int songuoi;
	float tiendien;
	private String ngayvao;
	private String ngayra;
	private String loaiphong;
	private int dathu;
	public String getMasv() {
		return masv;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	public String getHocky() {
		return hocky;
	}
	public void setHocky(String hocky) {
		this.hocky = hocky;
	}
	public String getMaphong() {
		return maphong;
	}
	public void setMaphong(String maphong) {
		this.maphong = maphong;
	}
	public int getSonguoi() {
		return songuoi;
	}
	public void setSonguoi(int songuoi) {
		this.songuoi = songuoi;
	}
	public float getTiendien() {
		return tiendien;
	}
	public void setTiendien(float tiendien) {
		this.tiendien = tiendien;
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
	public String getLoaiphong() {
		return loaiphong;
	}
	public void setLoaiphong(String loaiphong) {
		this.loaiphong = loaiphong;
	}
	public int getDathu() {
		return dathu;
	}
	public void setDathu(int dathu) {
		this.dathu = dathu;
	}
	public room(String maphong, int songuoi, float tiendien, int dathu) {
		super();
		this.maphong = maphong;
		this.songuoi = songuoi;
		this.tiendien = tiendien;
		this.dathu = dathu;
	}
	public room(String masv, String hocky, String maphong, int songuoi, float tiendien, String ngayvao, String ngayra,
			String loaiphong, int dathu) {
		super();
		this.masv = masv;
		this.hocky = hocky;
		this.maphong = maphong;
		this.songuoi = songuoi;
		this.tiendien = tiendien;
		this.ngayvao = ngayvao;
		this.ngayra = ngayra;
		this.loaiphong = loaiphong;
		this.dathu = dathu;
	}
	public room() {
		// TODO Auto-generated constructor stub
	}
	

	
}
