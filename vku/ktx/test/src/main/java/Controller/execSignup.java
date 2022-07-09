package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import DAO.DAO;
import entity.student;

/**
 * Servlet implementation class execSignup
 */
@WebServlet("/execSignup")
@MultipartConfig(fileSizeThreshold = 1024*1024*2, maxFileSize = 1024*1024*10,
maxRequestSize = 1024*1024*50)
public class execSignup extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private static final String SAVE_DIR="images/sinhvien";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public execSignup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String savePath ="D:/vku/ktx/test/src/main/webapp/" +File.separator+SAVE_DIR;
		File filesavePath = new File(savePath);
		FileInputStream fis=null;
	        DAO dao = new DAO();
	        student std = new student();
	        String masv = request.getParameter("masv");
	        String hoten = request.getParameter("hoten");
	        String ngaysinh = request.getParameter("dob");
	        String gioitinh = request.getParameter("gioitinh");
	        String lop = request.getParameter("lop");
	        String nganh = request.getParameter("nganh");
	        String khoa = request.getParameter("khoa");
	        String truong = request.getParameter("truong");
	        String cmnd = request.getParameter("cmnd");
	        String sdtSV = request.getParameter("sdtSV");
	        String sdtPH = request.getParameter("sdtPH");
	        String email = request.getParameter("email");
	        String diachi = request.getParameter("diachi");
	        Part part = request.getPart("img");
	        String filename = extractFilename(part);
	        File image= new File(savePath +File.separator+filename); 
	        try {
	        	System.out.println(filename);
	            part.write(savePath +File.separator+filename);
	            filename="./images/sinhvien/"+filename;
	            System.out.println(filename);
	            std.setMasv(masv);
	            std.setTen(hoten);
	            std.setNgaysinh(ngaysinh);
	            std.setGioitinh(Integer.parseInt(gioitinh));
	            std.setLop(lop);
	            std.setNganh(nganh);
	            std.setKhoa(khoa);
	            std.setTruong(truong);
	            std.setCMND(cmnd);
	            std.setSdtCanhan(sdtSV);
	            std.setSdtGiadinh(sdtPH);
	            std.setEmail(email);
	            std.setDiachi(diachi);
	            std.setAnh(filename);
	            int result = dao.registerInforStudent(std);
	            if (result>0) {
					out.print("<script>\r\n"
							+ "  alert(\"Đăng ký thông tin cá nhân thành công!\");\r\n"
							+ "  window.location.href = \"register-infor-student.jsp\";\r\n"
							+ "</script>");
				}else {
					out.print("<script>\r\n"
							+ "  alert(\"Đăng ký thông tin cá nhân thất bại!\");\r\n"
							+ "  window.location.href = \"register-infor-student.jsp\";\r\n"
							+ "</script>");
				}
	        } catch (Exception e1) {
	            // TODO Auto-generated catch block
	            e1.printStackTrace();
	        }
	}

	private String extractFilename(Part part) {
		String disk = part.getHeader("content-disposition");
		String[] items = disk.split(";");
		for (String s : items) {
			if (s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length()-1);
			}
		}
		return "";
	}

}
