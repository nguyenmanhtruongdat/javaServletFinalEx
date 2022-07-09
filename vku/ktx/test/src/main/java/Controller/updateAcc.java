package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAO;
import entity.account;
import entity.student;

/**
 * Servlet implementation class updateStd
 */
@WebServlet("/updateAcc")
public class updateAcc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateAcc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String masv = request.getParameter("username");
		DAO dao = new DAO();
		account acc = dao.selectAccByUsername(masv);
		request.setAttribute("acc", acc);
		request.getRequestDispatcher("updateAcc.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		DAO dao = new DAO();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String role = request.getParameter("role");
		int roleUser=0;
		int roleAdmin=0;
		if (role.trim().equals("user")) {
			roleUser=1;
			roleAdmin=0;
		}else {
			roleUser=0;
			roleAdmin=1;
		}
		System.out.println(username);
		System.out.println(password);
		System.out.println(role);
		System.out.println(roleUser);
		System.out.println(roleAdmin);
		account acc= new account();
		try {
		String passwordEcrtdao= dao.MD5(password);
		System.out.println(passwordEcrtdao);
		 acc.setUsername(username);
		 acc.setPassword(passwordEcrtdao);
		 acc.setIsUser(roleUser);
		 acc.setIsAdmin(roleAdmin);
		  dao.updateAcc(acc);
		  response.sendRedirect("quanlyAcc");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

}
