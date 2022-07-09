package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import DAO.DAO;
import DBConnect.DBContext;
import entity.room;
import entity.student;

/**
 * Servlet implementation class registerRoom
 */
@WebServlet("/registerRoom")
public class registerRoom extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Connection conn;
    Statement stmt;
    PreparedStatement ps;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerRoom() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		FileInputStream fis=null;
	        DAO dao = new DAO();
	        room rom = new room();
	        String masv = request.getParameter("masv");
	        String phong=request.getParameter("phong");
	        String hocki = request.getParameter("hocki");
	        String ngayvao = request.getParameter("ngaybatdau");
	        String ngayra = request.getParameter("ngayketthuc");
	        String loaiphong = request.getParameter("loaiphong");
	        System.out.println(ngayvao);
	        System.out.println(ngayra);
	        String phongcu = request.getParameter("phongcu");
	        String dienuutien = request.getParameter("dienuutien");
	        String banocung = request.getParameter("banocung");
	        DBContext db = DBContext.getInstance();
	        try {
	            conn = db.getConnection();

	            String query = "INSERT INTO `duyetphong`(`masv`, `maphong`, `daduyet`) VALUES (?,?,?)";
	            conn = db.getConnection();
	            ps = conn.prepareStatement(query);
	            ps.setString(1, masv);
	            ps.setString(2, phong);
	            ps.setString(3, "0");
	            int rs = ps.executeUpdate();
	        	rom.setMasv(masv);
				rom.setMaphong(phong);
				rom.setHocky(hocki);
				rom.setNgayvao(ngayvao);
				rom.setNgayra(ngayra);
				rom.setLoaiphong(loaiphong);
				rom.setDathu(0);
	            int result = dao.registerRoom(rom);
	            if (rs>0 && result>0) {
	            	out.print("<script>\r\n"
							+ "  alert(\"Đăng ký ở nội trú thành công! Hãy mang hồ sơ đến để hoàn thành thủ tục nhận phòng!\");\r\n"
							+"window.location.href = \"register-live.jsp\";"
							+ "</script>\r\n"
							+ "");
	            	//request.getRequestDispatcher("register-live.jsp").forward(request, response);
				}else {
					out.print("<script>\r\n"
							+"window.location.href = \"register-live.jsp\";"
							+ "  alert(\"Đăng ký không thành công! Vui lòng kiểm tra lại!\");\r\n"
							+ "</script>\r\n"
							+ "");
					//request.getRequestDispatcher("register-live.jsp").forward(request, response);
				}
	        } catch (Exception e1) {
	        	out.print("<script>\r\n"
						+"window.location.href = \"register-live.jsp\";"
						+ "  alert(\"Đăng ký không thành công! Vui lòng kiểm tra lại!\");\r\n"
						+ "</script>\r\n"
						+ "");
	        }
	}

}
