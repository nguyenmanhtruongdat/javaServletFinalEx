/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2022-07-07 20:33:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateStd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/vku/ktx/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/test/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("jar:file:/D:/vku/ktx/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/test/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1655716260513L));
    _jspx_dependants.put("jar:file:/D:/vku/ktx/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/test/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153359882000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Cập nhật thông tin</title>\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"16x16\"\r\n");
      out.write("	href=\"./favicons/edit.jpg\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.13.1/jquery-ui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("            $(function () {\r\n");
      out.write("                $(\"#datepicker\").datepicker({\r\n");
      out.write("                    dateFormat: 'dd/mm/yy'\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("<style>\r\n");
      out.write(".tab2 {\r\n");
      out.write("	tab-size: 4;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"center\" style=\"margin: 20 auto; width: 100%\">\r\n");
      out.write("		<form action=\"./updateStd\" method=\"post\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<div class=\" text-center mt-5 \"></div>\r\n");
      out.write("				<div class=\"row \">\r\n");
      out.write("					<div class=\"col-lg-7 mx-auto\">\r\n");
      out.write("						<div class=\"card mt-2 mx-auto p-4 bg-light\">\r\n");
      out.write("							<div class=\"card-body bg-light\">\r\n");
      out.write("\r\n");
      out.write("								<div class=\"container\">\r\n");
      out.write("									<form id=\"contact-form\" role=\"form\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("										<div class=\"controls\">\r\n");
      out.write("\r\n");
      out.write("											<div class=\"row\">\r\n");
      out.write("												<div class=\"col-md-12\">\r\n");
      out.write("													<div class=\"form-group\">\r\n");
      out.write("														<label for=\"masv\">Mã sinh viên <span><span>*</span></span></label>\r\n");
      out.write("														<input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${std.masv}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"masv\"\r\n");
      out.write("															class=\"form-control\" id=\"masv\" required\r\n");
      out.write("															readonly=\"readonly\">\r\n");
      out.write("\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("												<div class=\"col-md-12\">\r\n");
      out.write("													<div class=\"form-group\">\r\n");
      out.write("														<label for=\"hoten\">Họ tên <span><span>*</span></span></label>\r\n");
      out.write("														<input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${std.ten}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"hoten\"\r\n");
      out.write("															class=\"form-control\" name=\"hoten\" required=\"required\">\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("											<div class=\"row\">\r\n");
      out.write("												<div class=\"col-md-12\">\r\n");
      out.write("													<div class=\"form-group\">\r\n");
      out.write("														<label for=\"ngaysinh\">Ngày sinh <span>*</span></label> <input\r\n");
      out.write("															type=\"date\" name=\"dob\" min=\"1997-01-01\" max=\"2030-12-31\"\r\n");
      out.write("															value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${std.ngaysinh}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" required=\"required\"\r\n");
      out.write("															class=\"form-control\" id=\"ngaysinh\">\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("\r\n");
      out.write("											<div class=row>\r\n");
      out.write("\r\n");
      out.write("												<div class=\"col-md-12\">\r\n");
      out.write("													<div class=\"form-group\">\r\n");
      out.write("														<label for=\"gioitinh\">Giới tính<span>*</span></label> <br>\r\n");
      out.write("														Nam <input type=\"radio\" name=\"gioitinh\" value=\"1\"\r\n");
      out.write("															");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${std.gioitinh == 1 ? \"checked\":\"\"}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("> &nbsp &nbsp\r\n");
      out.write("														&nbsp &nbsp Nữ <input type=\"radio\" name=\"gioitinh\"\r\n");
      out.write("															value=\"0\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${std.gioitinh == 0 ? \"checked\":\"\"}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("											</div>\r\n");
      out.write("											<div class=\"row\">\r\n");
      out.write("												<div class=\"col-md-12\">\r\n");
      out.write("													<div class=\"form-group\">\r\n");
      out.write("														<label for=\"lop\">Lớp <span>*</span></label> <input\r\n");
      out.write("															type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${std.lop}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"lop\" id=\"lop\"\r\n");
      out.write("															class=\"form-control\" required=\"required\">\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("\r\n");
      out.write("											<div class=\"row\">\r\n");
      out.write("												<div class=\"col-md-12\">\r\n");
      out.write("													<div class=\"form-group\">\r\n");
      out.write("														<label for=\"nganh\">Ngành <span>*</span></label> <input\r\n");
      out.write("															type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${std.nganh}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"nganh\"\r\n");
      out.write("															class=\"form-control\" id=\"nganh\" required=\"required\">\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("												<div class=\"col-md-12\">\r\n");
      out.write("													<div class=\"form-group\">\r\n");
      out.write("														<label for=\"khoa\">Khoa <span>*</span></label> <input\r\n");
      out.write("															type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${std.khoa}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"khoa\"\r\n");
      out.write("															class=\"form-control\" id=\"nganh\" required=\"required\">\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("\r\n");
      out.write("											</div>\r\n");
      out.write("\r\n");
      out.write("											<div class=\"row\">\r\n");
      out.write("												<div class=\"col-md-12\">\r\n");
      out.write("													<div class=\"form-group\">\r\n");
      out.write("														<label for=\"cmnd\">CMND/CCCD <span>*</span></label> <input\r\n");
      out.write("															type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${std.CMND}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"cmnd\"\r\n");
      out.write("															class=\"form-control\" id=\"cmnd\" required=\"required\">\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("												<div class=\"col-md-12\">\r\n");
      out.write("													<div class=\"form-group\">\r\n");
      out.write("														<label for=\"truong\">Trường <span>*</span></label> <input\r\n");
      out.write("															type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${std.truong}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"truong\"\r\n");
      out.write("															class=\"form-control\" id=\"truong\" required=\"required\">\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("											<div class=\"row\">\r\n");
      out.write("												<div class=\"col-md-6\">\r\n");
      out.write("													<div class=\"form-group\">\r\n");
      out.write("														<label for=\"sdt\">Số điện thoại cá nhân <span>*</span></label>\r\n");
      out.write("														<input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${std.sdtCanhan}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"sdtSV\"\r\n");
      out.write("															class=\"form-control\" id=\"sdt\" required=\"required\">\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("												<div class=\"col-md-6\">\r\n");
      out.write("													<div class=\"form-group\">\r\n");
      out.write("														<label for=\"sdt\">Số điện thoại gia đình <span>*</span></label>\r\n");
      out.write("														<input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${std.sdtGiadinh}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"sdtPH\"\r\n");
      out.write("															class=\"form-control\" id=\"sdt\" required=\"required\">\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("											<div class=\"row\">\r\n");
      out.write("												<div class=\"col-md-12\">\r\n");
      out.write("													<div class=\"form-group\">\r\n");
      out.write("														<label for=\"email\">Email <span>*</span></label> <input\r\n");
      out.write("															type=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${std.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"email\"\r\n");
      out.write("															class=\"form-control\" id=\"email\" required=\"required\">\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("												<div class=\"col-md-12\">\r\n");
      out.write("													<div class=\"form-group\">\r\n");
      out.write("														<label for=\"diachi\">Địa chỉ <span>*</span></label> <input\r\n");
      out.write("															type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${std.diachi}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"diachi\"\r\n");
      out.write("															class=\"form-control\" id=\"diachi\" required=\"required\">\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("											<div class=\"row\">\r\n");
      out.write("												<div class=\"col-md-12\">\r\n");
      out.write("\r\n");
      out.write("													<input type=\"submit\"\r\n");
      out.write("														class=\"btn btn-success btn-send  pt-2 btn-block\r\n");
      out.write("                                                               \"\r\n");
      out.write("														value=\"Cập nhật\">\r\n");
      out.write("\r\n");
      out.write("												</div>\r\n");
      out.write("\r\n");
      out.write("											</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("										</div>\r\n");
      out.write("									</form>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("						<!-- /.8 -->\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- /.row-->\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
