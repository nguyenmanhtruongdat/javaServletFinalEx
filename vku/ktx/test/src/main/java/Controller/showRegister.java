package Controller;

import java.awt.Taskbar.State;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAO;

import java.sql.Statement;

import java.sql.ResultSet;
import DBConnect.DBContext;
import entity.student;

/**
 * Servlet implementation class searchSV
 */
@WebServlet("/showRegister")
public class showRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Connection conn;
    ResultSet rs;
    Statement stmt;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showRegister() {
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
        //String masv=msv.getMasv();
        String masvsearch = request.getParameter("masv");
        try {
            DBContext db = DBContext.getInstance();
            conn = db.getConnection();
            PrintWriter out = response.getWriter();
            DAO dao = new DAO();
            stmt = conn.createStatement();
            String sql = "select * from studentinfor where masv='" + masvsearch + "'";
            rs = stmt.executeQuery(sql);
            String masv = "";
            String hoten = "";
            String anh = "";
            String ngaysinh = "";
            int gt=0;
            String gioitinh = "";
            String lop = "";
            String nganh = "";
            String truong = "";
            String cmnd = "";
            String sdtSV = "";
            String sdtPH = "";
            String email = "";
            String diachi = "";
            while (rs.next()) {
                masv = rs.getString("masv");
                anh = rs.getString("anh");
                hoten = rs.getString("hoten");
                ngaysinh = rs.getString("ngaysinh");
                gt = rs.getInt("gioitinh");
                lop = rs.getString("lop");
                nganh = rs.getString("nganh");
                truong = rs.getString("truong");
                cmnd = rs.getString("CMND");
                sdtSV = rs.getString("sdtSV");
                email = rs.getString("email");
                diachi = rs.getString("diachi");
            }
            student std = new student();
            std.setMasv(masv);
            std.setTen(hoten);
            std.setNgaysinh(ngaysinh);
            std.setGioitinh(gt);
            std.setLop(lop);
            std.setNganh(nganh);
            std.setTruong(truong);
            std.setCMND(cmnd);
            std.setSdtCanhan(sdtSV);
            std.setSdtGiadinh(sdtPH);
            std.setDiachi(diachi);
            std.setEmail(email);
boolean stt= (masvsearch.trim().toLowerCase().equals(masv.trim().toLowerCase()));
			if (gt==1) {
				gioitinh="Nam";
			} else {
				gioitinh="Nữ";
			}
            if (!stt) {
                out.print("<div class=\"cc\" id=\"cc\">\n"
                        + "	<div class=\"col-xs-9 col-sm-9 col-md-10 col-lg-10\" style=\"position:relative;\">\n"
                        + "		<p style=\"font-weight:normal; line-height:20px\">\n"
                        + "					<b>Không tìm thấy sinh viên!</b></p>\n"
                        +"<p>Vui lòng kiểm tra lại mã sinh viên hoặc thực hiện đăng ký thông tin cá nhân <a href=\"register-infor-student.jsp\">Tại đây</a></p>"
                        + "	</div>\n"
                        + "</div>");
            } else if(stt) {
                out.print("<div class=\"page_sub_header cfix row\">\n"
                        + "    <div class=\"col-xs-3 col-sm-3 col-md-2 col-lg-2\" style=\"position:relative;\">\n"
                        + "				<img src=\"" + anh + "\" class=\"img-thumbnail\">\n"
                        + "		</div>\n"
                        + "	\n"
                        + "	<div class=\"col-xs-9 col-sm-9 col-md-10 col-lg-10\" style=\"position:relative;\">\n"
                        + "		<p style=\"font-weight:normal; line-height:20px\">\n"
                        + "					<b>Mã sinh viên:</b>" + masv + "<br>\n"
                        + "			<b>Họ và tên:</b>" + hoten + "<br>\n"
                        + "			<b>Ngày sinh </b>" + ngaysinh + "<br>\n"
                        + "			<b>Giới tính:</b>" + gioitinh + "<br>\n"
                        + "		Lớp:" + lop + "<br>Ngành:" + nganh + "<br></p>\n"
                        + "	</div>\n"
                        + "</div>");
                
                out.print("<div class=\"center\" style=\"margin: 10 auto; width: 100%\">\r\n"
                		+ "  <form action=\"./registerRoom\" method=\"post\">\r\n"
                		+ "    <div class=\"container\">\r\n"
                		+ "      <div class=\"row\">\r\n"
                		+ "        <div class=\"col-lg-12 mx-auto\">\r\n"
                		+ "          <div class=\"card mt-2 mx-auto p-4\" style=\"border: none\">\r\n"
                		+ "            <div class=\"card-body\">\r\n"
                		+ "              <div class=\"container\">\r\n"
                		+ "                <div class=\"controls\">\r\n"
                		+ "                  <h5>I. Thông tin đăng ký</h5>\r\n"
                		+ "				<hr style=\"border: 1px dotted gray\">\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <label for=\"hocki\">Học kỳ: <span>*</span></label>\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <select\r\n"
                		+ "                          id=\"hocki\"\r\n"
                		+ "                          name=\"hocki\"\r\n"
                		+ "                          class=\"form-control\"\r\n"
                		+ "                          required=\"required\"\r\n"
                		+ "                        >\r\n"
                		+ "                          <option value=\"Năm học 2021-2022: Học kỳ 2\" selected>\r\n"
                		+ "                            Năm học 2021-2022: Học kỳ 2\r\n"
                		+ "                          </option>\r\n"
                		+ "                          <option value=\"Năm học 2022-2023: Học kỳ 1\">Năm học 2022-2023: Học kỳ 1</option>\r\n"
                		+ "                        </select>\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <label for=\"masv\">Mã sinh viên: <span>*</span></label>\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <input\r\n"
                		+ "                          type=\"text\"\r\n"
                		+ "                          name=\"masv\"\r\n"
                		+ "                          class=\"form-control\"\r\n"
                		+ "                          id=\"masv\"\r\n"
                		+ "                           value=\""+masv+"\""
                		+ "                           readonly"
                		+ "                        />\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <label for=\"phong\">Phòng mong muốn <span></span></label>\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <input\r\n"
                		+ "                          placeholder=\"Phòng mong muốn ở\"\r\n"
                		+ "                          type=\"text\"\r\n"
                		+ "                          name=\"phong\"\r\n"
                		+ "                          id=\"phong\"\r\n"
                		+ "                          class=\"form-control\"\r\n"
                		+"							 required=\"required\""		
                		+ "                        />\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
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
                		+ "														placeholder=\"dd-mm-yyyy\" value=\"\"\r\n"
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
                		+ "														placeholder=\"dd-mm-yyyy\" class=\"form-control\"\r\n"
                		+ "														id=\"ngayketthuc\" required=\\\"required\\\" />\r\n"
                		+ "												</div>"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <label for=\"loaiphong\">Loại phòng <span>*</span></label>\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <select\r\n"
                		+ "                          id=\"loaiphong\"\r\n"
                		+ "                          name=\"loaiphong\"\r\n"
                		+ "                          class=\"form-control\"\r\n"
                		+ "                          required=\"required\"\r\n"
                		+ "                        >\r\n"
                		+ "                          <option value=\"\" selected disabled>\r\n"
                		+ "                            --Chọn loại phòng\r\n"
                		+ "                          </option>\r\n"
                		+ "                          <option value=\"Phòng thường (8 giường)\" class=\"form-control\" id=\"loaiphong\">\r\n"
                		+ "                            Phòng thường (8 giường)\r\n"
                		+ "                          </option>\r\n"
                		+ "                          <option value=\"Phòng dịch vụ (3 giường)\" class=\"form-control\" id=\"loaiphong\">\r\n"
                		+ "                            Phòng dịch vụ (3 giường)\r\n"
                		+ "                          </option>\r\n"
                		+ "                          <option value=\"Phòng CBGV\" class=\"form-control\" id=\"loaiphong\">\r\n"
                		+ "                            Phòng CBGV\r\n"
                		+ "                          </option>\r\n"
                		+ "                        </select>\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <label for=\"phongcu\">Phòng đã ở: <span></span></label>\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <input\r\n"
                		+ "                          placeholder=\"Phòng đã ở học kỳ trước (nếu có)\"\r\n"
                		+ "                          type=\"text\"\r\n"
                		+ "                          name=\"phongcu\"\r\n"
                		+ "                          id=\"phongcu\"\r\n"
                		+ "                          class=\"form-control\"\r\n"
                		+ "                        />\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <label for=\"dienuutien\"\r\n"
                		+ "                          >Diện ưu tiên: <span></span></label\r\n"
                		+ "                        >\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <input\r\n"
                		+ "                          type=\"text\"\r\n"
                		+ "                          name=\"dienuutien\"\r\n"
                		+ "                          class=\"form-control\"\r\n"
                		+ "                          placeholder=\"Diện ưu tiên (nếu có): Con thương/bệnh binh, Thủ khoa đầu vào, Học sinh giỏi các cấp,...\"\r\n"
                		+ "                          id=\"dienuutien\"\r\n"
                		+ "                        />\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <label for=\"banocung\"\r\n"
                		+ "                          >Chọn bạn ở cùng: <span></span></label\r\n"
                		+ "                        >\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <input\r\n"
                		+ "                          placeholder=\"Nhập mã sinh viên bạn ở cùng\"\r\n"
                		+ "                          type=\"text\"\r\n"
                		+ "                          name=\"banocung\"\r\n"
                		+ "                          class=\"form-control\"\r\n"
                		+ "                          id=\"banocung\"\r\n"
                		+ "                        />\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\"></div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <button type =\"button\" id=\"checkpayment\" onclick=\"showPayment()\" class=\"btn btn-danger\">\r\n"
                		+ "                          <i class=\"fa-solid fa-coins\"></i> Kiểm tra các khoản\r\n"
                		+ "                          thanh toán\r\n"
                		+ "                        </button>\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
                		+ "                  <h5>II. Các khoản phải thanh toán</h5>\r\n"
                		+ "										<hr style=\"border: 1px dotted gray\">\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-12\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <table class=\"table\">\r\n"
                		+ "                          <thead class=\"thead-dark\">\r\n"
                		+ "                            <tr>\r\n"
                		+ "                              <th scope=\"col\">Khoản phí</th>\r\n"
                		+ "                              <th scope=\"col\">Đơn giá</th>\r\n"
                		+ "                              <th scope=\"col\" rowspan=\"3\">Thời gian ở</th>"
                		+ "                              <th scope=\"col\">Thành tiền</th>\r\n"
                		+ "                              <th scope=\"col\">Đã thanh toán</th>\r\n"
                		+ "                              <th scope=\"col\">Còn lại</th>\r\n"
                		+ "                            </tr>\r\n"
                		+ "                          </thead>\r\n"
                		+ "                          <tbody id=\"payment\">\r\n"
                		+ "                          </tbody>\r\n"
                		+ "                        </table>\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
                		+ "                  <h5>III. Xác nhận</h5>\r\n"
                		+ "										<hr style=\"border: 1px dotted gray\">\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\"></div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <button type=\"submit\" class=\"btn btn-success\">\r\n"
                		+ "                        <i class=\"fa-solid fa-circle-check\"></i> Đăng ký\r\n"
                		+ "                      </button>\r\n"
                		+ "                      <button type=\"reset\" class=\"btn btn-default\">\r\n"
                		+ "                        <i class=\"fa-solid fa-rotate-right\"></i> Viết lại\r\n"
                		+ "                      </button>\r\n"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
                		+ "                </div>\r\n"
                		+ "              </div>\r\n"
                		+ "            </div>\r\n"
                		+ "          </div>\r\n"
                		+ "          <!-- /.8 -->\r\n"
                		+ "        </div>\r\n"
                		+ "        <!-- /.row-->\r\n"
                		+ "      </div>\r\n"
                		+ "    </div>\r\n"
                		+ "  </form>\r\n"
                		+ "</div>\r\n"
                		+"<script>\r\n"
                		+ "$(function () {\r\n"
                		+ "    $(\"#datepicker1\").datepicker({\r\n"
                		+ "        dateFormat: \"dd/mm/yy\",\r\n"
                		+ "      });\r\n"
                		+ "    $(\"#datepicker2\").datepicker({\r\n"
                		+ "      dateFormat: \"dd/mm/yy\",\r\n"
                		+ "    });\r\n"
                		+ "  };\r\n"
                		+ "\r\n"
                		+ " </script>"
                		+ "");
                
                
            }
            
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
