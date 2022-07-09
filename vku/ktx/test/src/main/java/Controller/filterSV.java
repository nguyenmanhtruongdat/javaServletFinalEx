package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAO;
import DBConnect.DBContext;
import entity.student;

/**
 * Servlet implementation class filterSV
 */
@WebServlet("/filterSV")
public class filterSV extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Connection conn;
    ResultSet rs;
    Statement stmt;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public filterSV() {
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
        DBContext db = DBContext.getInstance();
        DAO dao = new DAO();
        List<student> list=null;
        String option=request.getParameter("option");
        String key = request.getParameter("searchBox");
        int gt=0;

			list = dao.filterSV(key, option);
        System.out.println(option);
        System.out.println(key);
       // String masvsearch = request.getParameter("masv");

		
			for (student std: list) {
				out.print("		<tbody>\r\n"
						+ "				<tr>\r\n"
						+ "					<td>"+std.getMasv()+"</td>\r\n"
						+ "					<td>"+std.getTen()+"</td>\r\n"
						+ "					<td>"+std.getNgaysinh()+"</td>\r\n"
						+ "					<td>"+std.getGioitinh()+"</td>\r\n"
						+ "					<td>"+std.getLop()+"</td>\r\n"
						+ "					<td>"+std.getNganh()+"</td>\r\n"
						+ "					<td>"+std.getKhoa()+"</td>\r\n"
						+ "					<td>"+std.getTruong()+"</td>\r\n"
						+ "					<td>"+std.getCMND()+"</td>\r\n"
						+ "					<td>"+std.getSdtCanhan()+"</td>\r\n"
						+ "					<td>"+std.getSdtGiadinh()+"</td>\r\n"
						+ "					<td>"+std.getEmail()+"</td>\r\n"
						+ "					<td>"+std.getDiachi()+"</td>\r\n"
						//+ "					<td><img src=\""+std.getAnh()+"\"></td>\r\n"
						+ "					<td>\r\n"
						+ "					<button class=\"btn btn-success\" onclick=\"javascript:showUpdate('${x.masv}')\">Sửa</button>\r\n"
						+ "					<button type=\"button\" class=\"btn btn-danger\" onclick=\"javascript:showMess('${x.masv}')\">Xóa</button>\r\n"
						+ "					</td>\r\n"
						+ "				</tr>\r\n"
						+ "\r\n"
						+ "		</tbody>");
			}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
