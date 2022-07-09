package Controller;

import java.sql.*;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBConnect.DBContext;

/**
 * Servlet implementation class viewImg
 */
@WebServlet("/viewImg")
public class viewImg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewImg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Blob image = null;
		byte[ ] imgData = null ;
		Statement stmt = null;
		ResultSet rs = null;
		Connection connection;
		PreparedStatement ps;
		DBContext db = DBContext.getInstance();
		String masv = request.getParameter("sid");
		OutputStream o = response.getOutputStream();
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=db.getConnection();
		stmt = connection.createStatement();
	    String query ="select anh from studentinfor where masv = '"+masv+"'";
	    rs = stmt.executeQuery(query);
	    if (rs.next()) {
	    image = rs.getBlob(1);
	    imgData = image.getBytes(1,(int)image.length());
	    }else {
	    	
	    }
	    // display the image
	    response.setContentType("image/jpg");
	    o.write(imgData);
	    o.flush();
	    o.close();
	    request.getRequestDispatcher("view.jsp");
	} catch (Exception e) {
	        
	    System.out.println("Image Display Error=" + e.getMessage());
	    return;
	}
	
}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
