package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.DAO;
import entity.account;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie[] = req.getCookies();
		for (Cookie c : cookie) {
			if (c.getName().equals("userC")) {
				req.setAttribute("username", c.getValue());
			}
			if (c.getName().equals("passC")) {
				req.setAttribute("password", c.getValue());
			}
		}
		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
	String username =request.getParameter("username");
	String password = request.getParameter("password");	
	DAO dao = new DAO();
	try {
		account accInfor = new account();
		accInfor.setUsername(username);
		accInfor.setPassword(password);
		PrintWriter out = response.getWriter();
		account acc = dao.login(username, password);
		if (acc==null) {
			request.setAttribute("msg", "The password that you've entered is incorrect");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{
			
HttpSession session = request.getSession();
			session.setAttribute("acc", acc);
			Cookie u = new Cookie("userC", username);
			Cookie p = new Cookie("passC", password);
			u.setMaxAge(60*60*24*365);
			p.setMaxAge(60*60*24*365);
			response.addCookie(u);
			response.addCookie(p);
			
			   response.sendRedirect("index.jsp");			}
	} catch (Exception e) { 
		e.printStackTrace();
	}
	}
	
}
