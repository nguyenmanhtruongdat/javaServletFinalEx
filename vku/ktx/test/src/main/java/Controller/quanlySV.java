package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAO;
import entity.student;

/**
 * Servlet implementation class quanlySV
 */
@WebServlet("/quanlySV")
public class quanlySV extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public quanlySV() {
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
        try {
            DAO dao = new DAO();
            int count = dao.getNumberPage();
            int endPage=count/10;
            if (count%3!=0) {
				endPage++;
			}
            request.setAttribute("endP", endPage);
            List<student> list = dao.getAllStudent();
            request.setAttribute("listS", list);
            
//            for (student std : list) {
//				out.print("<tr>\r\n"
//						+ "					<td>"+std.getMasv()+"</td>\r\n"
//						+ "					<td>"+std.getTen()+"</td>\r\n"
//						+ "					<td>"+std.getNgaysinh()+"</td>\r\n"
//						+ "					<td>"+std.getGioitinh()+"</td>\r\n"
//						+ "					<td>"+std.getLop()+"</td>\r\n"
//						+ "					<td>"+std.getNganh()+"</td>\r\n"
//						+ "					<td>"+std.getKhoa()+"</td>\r\n"
//						+ "					<td>"+std.getTruong()+"</td>\r\n"
//						+ "					<td>"+std.getCMND()+"</td>\r\n"
//						+ "					<td>"+std.getSdtCanhan()+"</td>\r\n"
//						+ "					<td>"+std.getSdtGiadinh()+"</td>\r\n"
//						+ "					<td>"+std.getEmail()+"</td>\r\n"
//						+ "					<td>"+std.getDiachi()+"</td>\r\n"
//						+ "					<td>\r\n"
//						+ "					<button class=\"btn btn-success\" onclick=\"javascript:showUpdate('${x.masv}')\">Sửa</button>\r\n"
//						+ "					<button type=\"button\" class=\"btn btn-danger\" onclick=\"javascript:showMess('${x.masv}')\">Xóa</button>\r\n"
//						+ "					<button type=\"button\" class=\"btn btn-default\" onclick=\"javascript:sendMessage('${x.masv}')\">Gửi</button>\r\n"
//						+ "					</td>\r\n"
//						+ "				</tr>");
//			}
            
           request.getRequestDispatcher("dashboardStd.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
