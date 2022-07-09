package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAO;
import DBConnect.DBContext;

/**
 * Servlet implementation class getAllInfor
 */
@WebServlet("/getLiverInfor")
public class getLiverInfor extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Connection conn;
    ResultSet rs;
    ResultSet rs1;
    Statement stmt;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        //String masv=msv.getMasv();
        String masvsearch = request.getParameter("masv");  
        String cmndSearch=request.getParameter("cmnd");
        DBContext db = DBContext.getInstance();
        try {
            conn = db.getConnection();
            
            response.setContentType("image/jpg");
            DAO dao = new DAO();
            rs=dao.showLiverInfor(masvsearch, cmndSearch);
            String masv = "";
            String hoten = "";
            String anh = "";
//            String ngaysinh = "";
            int gt =0;
            String gioitinh="";
//            String lop = "";
//            String nganh = "";
//            String khoa="";
//            String truong = "";
//            String cmnd="";
//            String sdtSV="";
//            String sdtPH="";
//            String email ="";
//            String diachi="";
            String phong ="";
            String ngayvao="";
            String ngayra="";

            while (rs.next()) {
                masv = rs.getString("masv");
                hoten = rs.getString("hoten");
                phong=rs.getString("maphong");
                ngayvao=rs.getString("ngayvao").replace('/', '-');
                ngayra=rs.getString("ngayra").replace('/', '-');
//                ngaysinh = rs.getString("ngaysinh").replace('/', '-');
//                lop = rs.getString("lop");
//                nganh = rs.getString("nganh");
//                khoa=rs.getString("khoa");
//                truong = rs.getString("truong");
//                cmnd = rs.getString("cmnd");
//                sdtSV= rs.getString("sdtSV");
//                sdtPH=rs.getString("sdtPH");
//                email = rs.getString("email");
//                diachi = rs.getString("diachi");
                anh = rs.getString("anh");
            }
            System.out.println(masv);
            System.out.println(hoten);
            System.out.println(phong);
            System.out.println(ngayvao);
            System.out.println(ngayra);
            String checkedNam="";
            String checkedNu="";
            if (gt==1) {
            	gioitinh="Nam";
            	checkedNam="checked";
			}else {
				gioitinh="Nữ";
				checkedNu="checked";
			}

            boolean stt= (masvsearch.trim().toLowerCase().equals(masv.trim().toLowerCase()));
            if (!stt) {
                out.print("<div class=\"cc\" id=\"cc\">\n"
                        + "	<div class=\"col-xs-9 col-sm-9 col-md-10 col-lg-10\" style=\"position:relative;\">\n"
                        + "		<p style=\"font-weight:normal; line-height:20px\">\n"
                        + "					<b>Không tìm thấy sinh viên!</b></p>\n"
                        +"<p>Vui lòng kiểm tra lại mã thông tin hoặc thực hiện đăng ký thông tin cá nhân <a href=\"register-infor-student.jsp\">Tại đây</a></p>"
                        + "	</div>\n"
                        + "</div>");
            } else if(stt) {
            	out.print("<div class=\"center\" style=\"margin: 10 auto; width: 100%\">\r\n"
            			+ "		<form action=\"./updateLiverInfor\" method=\"post\"\r\n"
            			+ "			<div class=\"container\">\r\n"
//            			+ "				<div class=\"text-center mt-5\">\r\n"
//            			+ "					<hr>\r\n"
//            			+ "				</div>\r\n"
            			+ "\r\n"
            			+ "				<div class=\"row\">\r\n"
            			+ "					<div class=\"col-lg-12 mx-auto\">\r\n"
            			+ "						<div class=\"card mt-2 mx-auto p-4\" style=\"border: none\">\r\n"
            			+ "							<div class=\"card-body\">\r\n"
            			+ "								<div class=\"container\">\r\n"
            			+ "									<div class=\"controls\">\r\n"
            			+ "										<h5>I. Thông tin ở nội trú</h5>\r\n"
            			+ "										<hr style=\"border: 1px dotted gray\">\r\n"
            			+ "										<div class=\"row\">\r\n"
            			+ "											<div class=\"col-md-2\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<label for=\"masv\">Mã sinh viên <span><span>*</span></span>\r\n"
            			+ "													</label>\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "											<div class=\"col-md-10\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<input type=\"text\" readonly name=\"masv\" value=\""+masv+"\" class=\"form-control\"\r\n"
            			+ "														id=\"masv\" required />\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "										</div>\r\n"
            			+ "										<div class=\"row\">\r\n"
            			+ "											<div class=\"col-md-2\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<label for=\"hoten\">Họ tên <span><span>*</span></span>\r\n"
            			+ "													</label>\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "											<div class=\"col-md-10\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<input type=\"text\" readonly id=\"hoten\" value=\""+hoten+"\" class=\"form-control\"\r\n"
            			+ "														name=\"hoten\" required />\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "										</div>\r\n"
            			+ "										<div class=\"row\">\r\n"
            			+ "											<div class=\"col-md-2\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<label for=\"img\">Ảnh <span><span>*</span></span>\r\n"
            			+ "													</label>\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "											<div class=\"col-md-10\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													 <img id=\"anhthe\" src=\""+anh+"\" alt=\"\" style=\"width:113px; height:auto\"> &nbsp\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "										</div>\r\n"
            			+ "										<div class=\"row\">\r\n"
            			+ "											<div class=\"col-md-2\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<label for=\"phong\">Phòng ở <span>*</span>\r\n"
            			+ "													</label>\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+"											<div class=\"col-md-10\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<input type=\"text\" id=\"phong\" value=\""+phong+"\" class=\"form-control\" name=\"phong\" required=\"\">\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>"
            			+ "											</div>\r\n"
            			+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <label for=\"ngaybatdau\"\r\n"
                		+ "                          >Thời gian vào: <span><span>*</span></span></label\r\n"
                		+ "                        >\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "													<input type=\"date\" name=\"ngaybatdau\"\r\n"
                		+ "														placeholder=\"dd-mm-yyyy\" value=\""+ngayvao+"\"\r\n"
                		+ "		min=\"1997-01-01\" max=\"2030-12-31\" class=\"form-control\"\r\n"
                		+ "														id=\"ngaybatdau\" required=\"required\" />\r\n"
                		+ "												</div>"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <label for=\"ngayketthuc\"\r\n"
                		+ "                          >Thời gian ra: <span><span>*</span></span></label\r\n"
                		+ "                        >\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "													<input type=\"date\" name=\"ngayketthuc\"\r\n"
                		+ "														placeholder=\"dd-mm-yyyy\" value=\""+ngayra+"\" class=\"form-control\"\r\n"
                		+ "														id=\"ngayketthuc\" required=\"required\" />\r\n"
                		+ "												</div>"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
            			+ "										<h5>Xác nhận cập nhật</h5>\r\n"
            			+ "										<hr style=\"border: 1px dotted gray\">\r\n"
            			+ "										<div class=\"row\">\r\n"
            			+ "											<div class=\"col-md-2\"></div>\r\n"
            			+ "											<div class=\"col-md-10\">\r\n"
            			+ "												<button type=\"submit\" class=\"btn btn-success\">\r\n"
            			+ "													<i class=\"fa-solid fa-circle-check\"></i> Cập nhật\r\n"
            			+ "												<button type=\"reset\" class=\"btn btn-default\">\r\n"
            			+ "													<i class=\"fa-solid fa-rotate-right\"></i> Viết lại\r\n"
            			+ "												</button>\r\n"
            			+ "											</div>\r\n"
            			+ "										</div>\r\n"
            			+ "									</div>\r\n"
            			+ "								</div>\r\n"
            			+ "							</div>\r\n"
            			+ "						</div>\r\n"
            			+ "						<!-- /.8 -->\r\n"
            			+ "					</div>\r\n"
            			+ "					<!-- /.row-->\r\n"
            			+ "				</div>\r\n"
            			+ "			</div>\r\n"
            			+ "		</form>\r\n"
            			+ "	</div>");
            }
        }catch (Exception e) {

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
