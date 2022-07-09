package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAO;
import DBConnect.DBContext;
import entity.detailsRoom;
import entity.room;
import entity.student;

/**
 * Servlet implementation class viewRoom
 */
@WebServlet("/viewRoom")
public class viewRoom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    Connection conn;
    ResultSet rs;
    Statement stmt;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        String roomID = request.getParameter("roomID");
        //roomID="2-219";
        PrintWriter out = response.getWriter();
        DBContext db = DBContext.getInstance();
        try {
        	conn = db.getConnection();
            DAO dao = new DAO();
            stmt = conn.createStatement();
            String query = "SELECT thongtino.maphong, room.tiendien, room.songuoi, studentinfor.masv, `hoten`, DATE_FORMAT(studentinfor.ngaysinh,'%d/%m/%Y') AS ngaysinh ,`sdtSV`, `email`, `anh`, DATE_FORMAT(thongtino.ngayvao,'%m/%d/%Y') AS ngayvao ,DATE_FORMAT(thongtino.ngayra,'%m/%d/%Y') AS ngayra  FROM `studentinfor`,`thongtino`, room WHERE thongtino.maphong ='"+roomID+"' and studentinfor.masv=thongtino.masv and room.maphong=thongtino.maphong";
            rs = stmt.executeQuery(query);
            String maphong="";
            String masv ="";
            String hoten="";
            String ngaysinh="";
            String sdt="";
            String email ="";
            String anh="";
            String ngayvao ="";
            String ngayra="";
            float tiendien=0;
            int songuoi=0;     
            out.print("<fieldset>\r\n"
            		+ "	\r\n"
            		+"<h3><i class=\"fa-solid fa-building\"></i> Phòng "+roomID+"</h3>"
            		+ "		<div id=\"list_debt_roomfee2\" class=\"table-responsive\">\r\n"
            		+ "			<table class=\"table table-bordered table-striped table-hover\">\r\n"
            		+ "				<thead>\r\n"
            		+ "					<tr>\r\n"
            		+ "						<th class=\"text-center\">\r\n"
            		+ "							Mã sinh viên\r\n"
            		+ "						</th>\r\n"
            		+ "						<th class=\"text-center\">\r\n"
            		+ "							Họ tên\r\n"
            		+ "						</th>\r\n"
            		+ "						<th class=\"text-center\">\r\n"
            		+ "							Ảnh\r\n"
            		+ "						</th>\r\n"
//            		+ "						<th class=\"text-center\">\r\n"
//            		+ "							Ngày sinh\r\n"
//            		+ "						</th>\r\n"
            		+ "						<th class=\"text-center\">\r\n"
            		+ "							Ngày vào\r\n"
            		+ "						</th>\r\n"
            		+ "						<th class=\"text-center\">\r\n"
            		+ "							Ngày ra\r\n"
            		+ "						</th>\r\n"
            		+ "						<th class=\"text-center\">\r\n"
            		+ "							Số ngày ở trong tháng\r\n"
            		+ "						</th>\r\n"
            		+ "						<th class=\"text-center\">\r\n"
            		+ "							Số tiền\r\n"
            		+ "						</th>\r\n"
            		+ "					</tr>\r\n"
            		+ "				</thead>\r\n"
            		+ "			\r\n"
            		+ "				<tbody>\r\n");
            		
            while (rs.next()) {
            	maphong=rs.getString("maphong");
            	masv = rs.getString("masv");
            	hoten = rs.getString("hoten");
            	ngaysinh = rs.getString("ngaysinh");
            	sdt = rs.getString("sdtSV");
            	email = rs.getString("email");
            	anh = rs.getString("anh");
            	ngayvao = rs.getString("ngayvao");
            	ngayra = rs.getString("ngayra");
            	tiendien=rs.getFloat("tiendien");
            	songuoi=rs.getInt("songuoi");
            	double sotien = tiendien/songuoi;
                System.out.println(ngayvao);
                
                Calendar calendar = Calendar.getInstance(); 
              	 Date today = new Date();  
                  calendar.setTime(today);  

                  calendar.add(Calendar.MONTH, 1);  
                  calendar.set(Calendar.DAY_OF_MONTH, 1);  
                  calendar.add(Calendar.DATE, -1);  
                  Date lastDayOfMonth = calendar.getTime();
                  DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
                   Date date1= new Date(ngayvao);
                   Date date2= new Date(ngayra);
                System.out.println(df.format(lastDayOfMonth));
            	long l = dao.getDifferenceDays(date1, lastDayOfMonth);
            	System.out.println(l);
            	out.print("									<tr>\r\n"
            		+ "						<td>\r\n"
            		+masv
            		+ "						</td>\r\n"
            		+ "						<td>\r\n"
            		+ "							"+hoten+"					</td>\r\n"
            		+ "						<td>\r\n"
            		 + "				<img src=\"" + anh + "\" class=\"img-thumbnail\">\n"
//            		+ "						<td>\r\n"
//            		+ "							"+ngaysinh+"						</td>\r\n"
            		            		+ "						<td>\r\n"
            		+ "							"+ngayvao+"						</td>\r\n"
            		            		+ "						<td>\r\n"
            		+ "							"+ngayra+"						</td>\r\n"
            		            		            		+ "						<td>\r\n"
            		+ "							"+l+"						</td>\r\n"
            		            		            		+ "						<td>\r\n"
            		+ "							"+Math.round(sotien * 1000.0) / 1000.0+" đ						</td>\r\n"
            		+ "					</tr>\r\n");
            }	
            		out.print("								</tbody>\r\n"
            		+ "			</table>\r\n"
            		+ "		</div>\r\n"
            		+ "	\r\n"
            		+ "	\r\n"
            		+ "			\r\n"
            		+ "		<!-- <div class=\"table-responsive\">\r\n"
            		+ "			<table class=\"table table-bordered table-striped table-hover\">\r\n"
            		+ "				<thead>\r\n"
            		+ "					<tr>\r\n"
            		+ "						<th class=\"text-center\" colspan=\"3\">\r\n"
            		+ "							Tổng cộng\r\n"
            		+ "						</th>\r\n"
            		+ "						<th class=\"text-center\">\r\n"
            		+ "							0&nbsp;₫						</th>\r\n"
            		+ "						<th class=\"text-center\">\r\n"
            		+ "							0&nbsp;₫						</th>\r\n"
            		+ "						<th class=\"text-center\">\r\n"
            		+ "							0&nbsp;₫						</th>\r\n"
            		+ "					</tr>\r\n"
            		+ "				</thead>\r\n"
            		+ "			</table>\r\n"
            		+ "		</div> -->\r\n"
            		+ "		\r\n"
            		+ "	</fieldset>");

            //request.getRequestDispatcher("admin.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
