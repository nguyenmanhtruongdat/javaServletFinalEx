package DAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import entity.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.naming.java.javaURLContextFactory;

import entity.*;
import DBConnect.DBContext;

public class DAO {

    PreparedStatement ps;
    Connection cnn;
    public int register(account acc) throws ClassNotFoundException {
        DBContext db = DBContext.getInstance();
        int result = 0;
        Connection connection;
        PreparedStatement ps;
        ResultSet rs;
        String query = "INSERT INTO `account`(`username`, `password`, `isUser`, `isAdmin`) VALUES (?,?,?,?)";
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	connection=db.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, acc.getUsername());
            ps.setString(2, acc.getPassword());
            ps.setInt(3, acc.getIsUser());
            ps.setInt(4, acc.getIsAdmin());
            result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Thanh cong");
            } else {
                System.out.println("That bai");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public account login(String username, String password) throws SQLException {
        DBContext db = DBContext.getInstance();
        ResultSet rs;
        Connection connection;
        PreparedStatement ps;
DAO dao = new DAO();
        String query = "SELECT * FROM account WHERE username=? AND password=?";
        try {
        	String passwordEncrypt=dao.MD5(password);
            connection = db.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, passwordEncrypt);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new account(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public int registerInforStudent(student std) throws SQLException {
        DBContext db = DBContext.getInstance();
        int result = 0;
        Connection connection;
        FileInputStream fis =null;
        PreparedStatement ps;
        String query = "INSERT INTO studentinfor (masv, hoten, ngaysinh, gioitinh, lop, nganh, khoa, truong, CMND, sdtSV, sdtPH, email, diachi, anh) VALUES (?,?,STR_TO_DATE(?,'%Y/%m/%d'),?,?,?,?,?,?,?,?,?,?,?)";
        try {
            connection = db.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, std.getMasv());
            System.out.println(std.getMasv());
            ps.setString(2, std.getTen());
            ps.setString(3, std.getNgaysinh().replace('-', '/'));
            ps.setInt(4, std.getGioitinh());
            System.out.println(std.getGioitinh());
            ps.setString(5, std.getLop());
            ps.setString(6, std.getNganh());
            ps.setString(7, std.getKhoa());
            ps.setString(8, std.getTruong());
            ps.setString(9, std.getCMND());
            ps.setString(10, std.getSdtCanhan());
            ps.setString(11, std.getSdtGiadinh());
            ps.setString(12, std.getEmail());
            ps.setString(13, std.getDiachi());
            ps.setString(14, std.getAnh());
//			fis=new FileInputStream(img); 
//    		ps.setBinaryStream(14, (InputStream) fis, (int) (img.length()));
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<student> getAllStudent() {
        ResultSet rs;
        DBContext db = DBContext.getInstance();
        List<student> list = new ArrayList<>();
        String query = "SELECT `masv`, `hoten`, DATE_FORMAT(ngaysinh,'%d/%m/%Y') AS ngaysinh, `gioitinh`, `lop`, `nganh`, `khoa`, `truong`, `CMND`, `sdtSV`, `sdtPH`, `email`, `diachi`, `anh` FROM `studentinfor` LIMIT 0,14";
        Connection connection;
        PreparedStatement ps;
        try {
            connection = db.getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }
    
    public List<student> getTop10() {
        ResultSet rs;
        DBContext db = DBContext.getInstance();
        List<student> list = new ArrayList<>();
        String query = "SELECT * FROM studentinfor ORDER BY masv LIMIT 5";
        Connection connection;
        PreparedStatement ps;
        try {
            connection = db.getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }

    public void deleteStudent(String masv) {
        DBContext db = DBContext.getInstance();
        String query = "DELETE FROM studentinfor WHERE masv =?";
        Connection connection;
        PreparedStatement ps;
        try {
            connection = db.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, masv);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public student selectStudentById(String masv) {
        ResultSet rs;
        DBContext db = DBContext.getInstance();
        List<student> list = new ArrayList<>();
        String query = "SELECT `masv`, `hoten`, DATE_FORMAT(ngaysinh,'%Y/%m/%d') AS ngaysinh,`gioitinh`, `lop`, `nganh`, `khoa`, `truong`, `CMND`, `sdtSV`, `sdtPH`, `email`, `diachi`, `anh` FROM `studentinfor` WHERE `masv`=?  LIMIT 0,14";
        Connection connection;
        PreparedStatement ps;
        try {
            connection = db.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, masv);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new student(rs.getString(1), rs.getString(2), rs.getString(3).replace('/', '-'), rs.getInt(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public void updateStudent(student std) {
        DBContext db = DBContext.getInstance();
        String query = "UPDATE studentinfor SET  hoten  =? ,ngaysinh  = STR_TO_DATE(?,'%Y/%m/%d'), gioitinh  =?  ,lop  =? , nganh  =?, khoa=? ,truong  =? , cmnd  =? , sdtSV  =?,  sdtPH  =? , email  =?,  diachi  =? WHERE  masv =?";
        Connection connection;
        PreparedStatement ps;
        try {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");
            System.out.println(std.getGioitinh());
            connection = db.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, std.getTen());
            ps.setString(2, std.getNgaysinh().replace('-', '/'));
            ps.setInt(3, std.getGioitinh());
            ps.setString(4, std.getLop());
            ps.setString(5, std.getNganh());
            ps.setString(6, std.getKhoa());
            ps.setString(7, std.getTruong());
            ps.setString(8, std.getCMND());
            ps.setString(9, std.getSdtCanhan());
            ps.setString(10, std.getSdtGiadinh());
            ps.setString(11, std.getEmail());
            ps.setString(12, std.getDiachi());
            ps.setString(13, std.getAnh());
            ps.setString(13, std.getMasv());

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    public String MD5(String input) throws Exception {
        
        MessageDigest m=MessageDigest.getInstance("MD5");
        m.update(input.getBytes(),0,input.length());
        return new BigInteger(1,m.digest()).toString(16);
        
     }
    
    public String Decrypt(String input){

     return "Không thể xem";
  }
    public List<account> getAllAccount() {
		ResultSet rs;
        DBContext db = DBContext.getInstance();
        List<account> list = new ArrayList<>();
        String query = "SELECT * FROM account";
        Connection connection;
        PreparedStatement ps;
        try {
            connection = db.getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
//                list.add(new account(rs.getString(1), Decrypt(rs.getString(2)), rs.getInt(3), rs.getInt(4)));
            	String str = "*****************";
            	list.add(new account(rs.getString(1), (str), rs.getInt(3), rs.getInt(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
	}
    
    public account selectAccByUsername(String username) {
        ResultSet rs;
        DBContext db = DBContext.getInstance();
        List<account> list = new ArrayList<>();
        String query = "SELECT * FROM `account` WHERE username=?";
        Connection connection;
        PreparedStatement ps;
        try {
            connection = db.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new account(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
    
    public void deleteAcc(String username) {
        DBContext db = DBContext.getInstance();
        String query = "DELETE FROM account WHERE username=?";
        Connection connection;
        PreparedStatement ps;
        try {
            connection = db.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ResultSet getImage(String masvsearch) {
    	ResultSet rs =null;
    	 DBContext db = DBContext.getInstance();
       try {
    	   Connection conn = db.getConnection();
//         OutputStream o = response.getOutputStream();
         DAO dao = new DAO();
         Statement stmt = conn.createStatement();
         String sql = "select * from studentinfor where masv='" + masvsearch + "'";
         rs = stmt.executeQuery(sql);
         return rs;
	} catch (Exception e) {
		e.printStackTrace();
	}
    	return rs;
    }

	public int registerRoom(room rom) {
		DBContext db = DBContext.getInstance();
        int result = 0;
        Connection connection;
        FileInputStream fis =null;
        PreparedStatement ps;
        String query = "INSERT INTO `thongtino`(`masv`, `maphong`, `ngayvao`, `ngayra`) VALUES (?,?,STR_TO_DATE(?,'%Y-%m-%d'),STR_TO_DATE(?,'%Y-%m-%d'))";
        try {
            connection = db.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, rom.getMasv());
            ps.setString(2, rom.getMaphong());
            ps.setString(3, rom.getNgayvao());
            ps.setString(4, rom.getNgayra());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
	}
	
	public List<duyetphong> dsCanDuyetPhong() {
		ResultSet rs;
        DBContext db = DBContext.getInstance();
        List<duyetphong> list = new ArrayList<>();
        String query= "SELECT DISTINCT studentinfor.masv, studentinfor.hoten, DATE_FORMAT(studentinfor.ngaysinh,'%d/%m/%Y') AS ngaysinh, studentinfor.sdtSV, studentinfor.email, duyetphong.maphong FROM duyetphong, studentinfor, thongtino WHERE studentinfor.masv=duyetphong.masv and duyetphong.maphong=thongtino.maphong and duyetphong.daduyet=0";
        Connection connection;
        PreparedStatement ps;
        try {
            connection = db.getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new duyetphong(rs.getString("masv"), rs.getString("hoten"), rs.getString("ngaysinh"), rs.getString("sdtSV"), rs.getString("email"), rs.getString("maphong")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
        
	}
	
	public ResultSet searchSV(String masvsearch) {
		DBContext db = DBContext.getInstance();
        Connection connection;
        FileInputStream fis =null;
        PreparedStatement ps;
        String sql = "SELECT * FROM `studentinfor` WHERE masv='"+masvsearch+"'";
        ResultSet rs = null;
		try {
            connection = db.getConnection();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
		
	}
	
	public static long getDifferenceDays(java.util.Date date1, java.util.Date date2) {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");
	    long diff = date2.getTime() - date1.getTime();
	    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	public static void main(String[] args) throws ParseException {
		DAO dao = new DAO();
		java.util.Date date1 = new java.util.Date("6/27/2022");
		java.util.Date date2 = new java.util.Date("7/27/2022");
		int day =(int) dao.getDifferenceDays(date1, date2);
		System.out.println(day);
	}

	public void updateAcc(account acc) {
		DBContext db = DBContext.getInstance();
        String query = "UPDATE account SET  password  =? ,isUser  = ?, isAdmin  =? WHERE  username =?";
        Connection connection;
        PreparedStatement ps;
        try {
            connection = db.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, acc.getPassword());
            ps.setInt(2, acc.getIsUser());
            ps.setInt(3, acc.getIsAdmin());
            ps.setString(4, acc.getUsername());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

	public int updateInforstudent(student std) {
		DBContext db = DBContext.getInstance();
        int result = 0;
        Connection connection;
        FileInputStream fis =null;
        PreparedStatement ps;
        String query = "UPDATE  studentinfor  SET  hoten =?, ngaysinh  = STR_TO_DATE(?,'%Y/%m/%d'), gioitinh =?, lop =?, nganh =?, khoa =?, truong =?, CMND =?, sdtSV =?, sdtPH =?, email =?, diachi =? WHERE masv=?";
        try {
            connection = db.getConnection();
            String dob = std.getNgaysinh().replace('-', '/');
            ps = connection.prepareStatement(query);
            ps.setString(1, std.getTen());
            ps.setString(2, dob);
            ps.setInt(3, std.getGioitinh());
            ps.setString(4, std.getLop());
            ps.setString(5, std.getNganh());
            ps.setString(6, std.getKhoa());
            ps.setString(7, std.getTruong());
            ps.setString(8, std.getCMND());
            ps.setString(9, std.getSdtCanhan());
            ps.setString(10, std.getSdtGiadinh());
            ps.setString(11, std.getEmail());
            ps.setString(12, std.getDiachi());
            ps.setString(13, std.getMasv());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
	}

	public int duyetphong(String masv) {
		 DBContext db = DBContext.getInstance();
	        int result = 0;
	        Connection connection;
	        PreparedStatement ps;
	        ResultSet rs;
	        String query = "DELETE FROM `duyetphong` WHERE masv=?";
	        try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	        	connection=db.getConnection();
	            ps = connection.prepareStatement(query);
	            ps.setString(1, masv);
	            result = ps.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return result;
		
	}

	public void xoaYeuCau(String masv) {
		 DBContext db = DBContext.getInstance();
	        String query = "DELETE FROM duyetphong WHERE masv=?";
	        Connection connection;
	        PreparedStatement ps;
	        try {
	            connection = db.getConnection();
	            ps = connection.prepareStatement(query);
	            ps.setString(1, masv);
	            ps.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

	public List<student> filterSV(String hoten, String option) {
		DBContext db = DBContext.getInstance();
		List<student> list = new ArrayList<>();
		String query ="SELECT * FROM `studentinfor` WHERE "+option+" LIKE ?";
		Connection connection;
		try {
			connection=db.getConnection();
			ps=connection.prepareStatement(query);
			ps.setString(1, "%"+ hoten +"%");
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
			list.add(new student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5),
                    rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14)));
			}
			
			return list;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public List<student> filterSVByGender(int gt) {
		DBContext db = DBContext.getInstance();
		List<student> list = new ArrayList<>();
		String query ="SELECT * FROM `studentinfor` WHERE gioitinh ="+gt;
		Connection connection;
		try {
			connection=db.getConnection();
			ps=connection.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
			list.add(new student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5),
                    rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14)));
			}
			
			return list;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	public List<room> getAllRoom() {
		ResultSet rs;
        DBContext db = DBContext.getInstance();
        List<room> list = new ArrayList<>();
        String query = "SELECT * FROM room";
        Connection connection;
        PreparedStatement ps;
        try {
            connection = db.getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
            	list.add(new room(rs.getString(1), rs.getInt(2), rs.getFloat(3), rs.getInt(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
	}
	
	public ResultSet showLiverInfor(String masvsearch, String cmnd) {
		DBContext db = DBContext.getInstance();
        Connection connection;
        PreparedStatement ps;
        String sql = "SELECT DISTINCT studentinfor.masv, studentinfor.anh, studentinfor.hoten, thongtino.maphong, "
        		+ "DATE_FORMAT(thongtino.ngayvao,'%Y/%m/%d') AS ngayvao, DATE_FORMAT(thongtino.ngayra,'%Y/%m/%d') AS ngayra FROM studentinfor, thongtino"
        		+ " WHERE studentinfor.masv=thongtino.masv AND studentinfor.masv='"+masvsearch+"'";
        ResultSet rs = null;
		try {
            connection = db.getConnection();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
		
	}
	public int getNumberPage() {
		String query = "select count(*) from studentinfor";
		DBContext db = DBContext.getInstance();
        Connection connection;
        PreparedStatement ps;
        ResultSet rs;
        try {
            connection = db.getConnection();
            ps = connection.prepareStatement(query);
            rs=ps.executeQuery();
            while (rs.next()) {
				return rs.getInt(1);
			}
        } catch (Exception e) {
            e.printStackTrace();
        }
		return 0;
	}

	public int updateLiverInfor(detailsRoom d) {
		int rs=0;
		 DBContext db = DBContext.getInstance();
	        String query = "UPDATE thongtino SET maphong=?, ngayvao  = STR_TO_DATE(?,'%Y/%m/%d'), ngayra  = STR_TO_DATE(?,'%Y/%m/%d') WHERE masv=?";
	        Connection connection;
	        PreparedStatement ps;
	        try {
	            connection = db.getConnection();
	            ps = connection.prepareStatement(query);
	            ps.setString(1, d.getMaphong());
	            ps.setString(2, d.getNgayvao().replace('-', '/'));
	            ps.setString(3, d.getNgayra().replace('-', '/'));
	            ps.setString(4, d.getMasv());
	            System.out.println(d.getNgayvao().replace('-', '/'));
	            System.out.println(d.getNgayra().replace('-', '/'));
	            rs = ps.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return rs;
	}

	public int addAccount(account acc) {
		DBContext db = DBContext.getInstance();
        int result = 0;
        Connection connection;
        PreparedStatement ps;
        ResultSet rs;
        String query = "INSERT INTO `account`(`username`, `password`, `isUser`, `isAdmin`) VALUES (?,?,?,?)";
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	connection=db.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, acc.getUsername());
            ps.setString(2, acc.getPassword());
            ps.setInt(3, acc.getIsUser());
            ps.setInt(4, acc.getIsAdmin());
            result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Thanh cong");
            } else {
                System.out.println("That bai");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
	}
}