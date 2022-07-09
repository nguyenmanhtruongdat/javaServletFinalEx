package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAO;
import entity.student;

/**
 * Servlet implementation class updateModal
 */
@WebServlet("/updateModal")
public class updateModal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateModal() {
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
		String masv = request.getParameter("sid");
		DAO dao = new DAO();
		student std = dao.selectStudentById(masv);
		if (std!=null) {
			out.print(" <form action=\"./execSignup\" method=\"post\"\r\n"
					+ "			enctype='multipart/form-data'>\r\n"
					+ "      									<div class=\"row\">\r\n"
					+ "											<div class=\"col-md-12\">\r\n"
					+ "												<div class=\"form-group\">\r\n"
					+ "													<label for=\"masv\">Mã sinh viên <span><span>*</span></span></label>\r\n"
					+ "													<input type=\"text\" name=\"masv\" class=\"form-control\"\r\n"
					+ "														id=\"masv\" required>\r\n"
					+ "\r\n"
					+ "												</div>\r\n"
					+ "											</div>\r\n"
					+ "											<div class=\"col-md-12\">\r\n"
					+ "												<div class=\"form-group\">\r\n"
					+ "													<label for=\"hoten\">Họ tên <span><span>*</span></span></label>\r\n"
					+ "													<input type=\"text\" id=\"hoten\" class=\"form-control\"\r\n"
					+ "														name=\"hoten\" required>\r\n"
					+ "												</div>\r\n"
					+ "											</div>\r\n"
					+ "										</div>\r\n"
					+ "																				<div class=\"row\">\r\n"
					+ "											<div class=\"col-md-12\">\r\n"
					+ "												<div class=\"form-group\">\r\n"
					+ "													<label for=\"img\">Ảnh <span><span>*</span></span></label> <input\r\n"
					+ "														type=\"file\" id=\"img\" name=\"img\" accept=\"image/*\">\r\n"
					+ "\r\n"
					+ "												</div>\r\n"
					+ "											</div>\r\n"
					+ "										</div>\r\n"
					+ "										<div class=\"row\">\r\n"
					+ "											<div class=\"col-md-12\">\r\n"
					+ "												<div class=\"form-group\">\r\n"
					+ "													<label for=\"ngaysinh\">Ngày sinh <span>*</span></label> <input\r\n"
					+ "														type=\"text\" name=\"dob\" placeholder=\"dd-mm-yyyy\"\r\n"
					+ "														class=\"form-control\" id=\"datepicker\"\r\n"
					+ "														onclick=\"datepicker()\">\r\n"
					+ "\r\n"
					+ "												</div>\r\n"
					+ "											</div>\r\n"
					+ "										</div>\r\n"
					+ "\r\n"
					+ "										<div class=\"row\">\r\n"
					+ "											<div class=\"col-md-12\">\r\n"
					+ "												<div class=\"form-group\">\r\n"
					+ "													<label for=\"gioitinh\">Giới tính <span>*</span></label> <select\r\n"
					+ "														id=\"gioitinh\" name=\"gioitinh\" class=\"form-control\"\r\n"
					+ "														required=\"required\">\r\n"
					+ "														<option value=\"\" selected disabled>--Chọn giới\r\n"
					+ "															tính--</option>\r\n"
					+ "														<option name=\"gioitinh\" value=\"Nam\" class=\"form-control\"\r\n"
					+ "															id=\"gioitinh\">Nam</option>\r\n"
					+ "														<option name=\"gioitinh\" value=\"Nữ\" class=\"form-control\"\r\n"
					+ "															id=\"gioitinh\">Nữ</option>\r\n"
					+ "													</select>\r\n"
					+ "												</div>\r\n"
					+ "											</div>\r\n"
					+ "											<div class=\"col-md-12\">\r\n"
					+ "												<div class=\"form-group\">\r\n"
					+ "													<label for=\"lop\">Lớp <span>*</span></label> <input\r\n"
					+ "														type=\"text\" name=\"lop\" id=\"lop\" class=\"form-control\"\r\n"
					+ "														required=\"required\">\r\n"
					+ "												</div>\r\n"
					+ "											</div>\r\n"
					+ "										</div>\r\n"
					+ "\r\n"
					+ "										<div class=\"row\">\r\n"
					+ "											<div class=\"col-md-12\">\r\n"
					+ "												<div class=\"form-group\">\r\n"
					+ "													<label for=\"nganh\">Ngành <span>*</span></label> <input\r\n"
					+ "														type=\"text\" name=\"nganh\" class=\"form-control\" id=\"nganh\"\r\n"
					+ "														required=\"required\">\r\n"
					+ "												</div>\r\n"
					+ "											</div>\r\n"
					+ "											<div class=\"col-md-12\">\r\n"
					+ "												<div class=\"form-group\">\r\n"
					+ "													<label for=\"khoa\">Khoa <span>*</span></label> <input\r\n"
					+ "														type=\"text\" name=\"khoa\" class=\"form-control\" id=\"khoa\"\r\n"
					+ "														required=\"required\">\r\n"
					+ "												</div>\r\n"
					+ "											</div>\r\n"
					+ "										</div>\r\n"
					+ "\r\n"
					+ "										<div class=\"row\">\r\n"
					+ "											<div class=\"col-md-12\">\r\n"
					+ "												<div class=\"form-group\">\r\n"
					+ "													<label for=\"cmnd\">CMND/CCCD <span>*</span></label> <input\r\n"
					+ "														type=\"text\" name=\"cmnd\" class=\"form-control\" id=\"cmnd\"\r\n"
					+ "														required=\"required\">\r\n"
					+ "												</div>\r\n"
					+ "											</div>\r\n"
					+ "											<div class=\"col-md-12\">\r\n"
					+ "												<div class=\"form-group\">\r\n"
					+ "													<label for=\"truong\">Trường <span>*</span></label> <input\r\n"
					+ "														type=\"text\" name=\"truong\" class=\"form-control\" id=\"truong\"\r\n"
					+ "														required=\"required\">\r\n"
					+ "												</div>\r\n"
					+ "											</div>\r\n"
					+ "										</div>\r\n"
					+ "										<div class=\"row\">\r\n"
					+ "											<div class=\"col-md-6\">\r\n"
					+ "												<div class=\"form-group\">\r\n"
					+ "													<label for=\"sdt\">Số điện thoại cá nhân <span>*</span></label>\r\n"
					+ "													<input type=\"text\" name=\"sdtSV\" class=\"form-control\"\r\n"
					+ "														id=\"sdt\" required=\"required\">\r\n"
					+ "												</div>\r\n"
					+ "											</div>\r\n"
					+ "											<div class=\"col-md-6\">\r\n"
					+ "												<div class=\"form-group\">\r\n"
					+ "													<label for=\"sdt\">Số điện thoại gia đình <span>*</span></label>\r\n"
					+ "													<input type=\"text\" name=\"sdtPH\" class=\"form-control\"\r\n"
					+ "														id=\"sdt\" required=\"required\">\r\n"
					+ "												</div>\r\n"
					+ "											</div>\r\n"
					+ "										</div>\r\n"
					+ "										<div class=\"row\">\r\n"
					+ "											<div class=\"col-md-12\">\r\n"
					+ "												<div class=\"form-group\">\r\n"
					+ "													<label for=\"email\">Email <span>*</span></label> <input\r\n"
					+ "														type=\"email\" name=\"email\" class=\"form-control\" id=\"email\"\r\n"
					+ "														required=\"required\">\r\n"
					+ "												</div>\r\n"
					+ "											</div>\r\n"
					+ "											<div class=\"col-md-12\">\r\n"
					+ "												<div class=\"form-group\">\r\n"
					+ "													<label for=\"diachi\">Địa chỉ <span>*</span></label> <input\r\n"
					+ "														type=\"text\" name=\"diachi\" class=\"form-control\" id=\"diachi\"\r\n"
					+ "														required=\"required\">\r\n"
					+ "												</div>\r\n"
					+ "											</div>\r\n"
					+ "										</div>\r\n"
					+ "										<div class=\"row\">\r\n"
					+ "											<div class=\"col-md-12\">\r\n"
					+ "\r\n"
					+ "												<input type=\"submit\"\r\n"
					+ "													class=\"btn btn-success btn-send  pt-2 btn-block\r\n"
					+ "                                                               \"\r\n"
					+ "													value=\"Lưu\">\r\n"
					+ "\r\n"
					+ "											</div>\r\n"
					+ "\r\n"
					+ "										</div>\r\n"
					+ "      </form>");
		}
		request.setAttribute("std", std);
		request.getRequestDispatcher("updateStd.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
