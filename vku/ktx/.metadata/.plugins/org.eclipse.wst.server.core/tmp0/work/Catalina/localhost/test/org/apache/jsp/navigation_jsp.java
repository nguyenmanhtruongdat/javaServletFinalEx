/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2022-07-06 03:16:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navigation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- nav starts  -->\r\n");
      out.write("\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-light sticky-top\"\r\n");
      out.write("		style=\"background-color: #0F2557;\">\r\n");
      out.write("		<a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"images/vku.png\"\r\n");
      out.write("			alt=\"\" width=\"66px\" height=\"35px\"></a>\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("			data-target=\"#navbarColor03\" aria-controls=\"navbarColor03\"\r\n");
      out.write("			aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarColor03\">\r\n");
      out.write("			<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"index.jsp\">Trang\r\n");
      out.write("						chủ</a></li>\r\n");
      out.write("				<c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc.isUser==1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("					<li class=\"nav-item dropdown\"><a\r\n");
      out.write("						class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"\r\n");
      out.write("						role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Đăng\r\n");
      out.write("							ký</a>\r\n");
      out.write("						<div class=\"dropdown-menu\">\r\n");
      out.write("							<a class=\"dropdown-item\" href=\"register-live.jsp\">Đăng ký ở\r\n");
      out.write("								nội trú</a> <a class=\"dropdown-item\"\r\n");
      out.write("								href=\"register-infor-student.jsp\">Đăng ký thông tin cá nhân</a>\r\n");
      out.write("						</div></li>\r\n");
      out.write("				</c:if>\r\n");
      out.write("\r\n");
      out.write("				<c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc.isAdmin==1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("					<li class=\"nav-item dropdown\"><a\r\n");
      out.write("						class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"\r\n");
      out.write("						role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Quản\r\n");
      out.write("							lý</a>\r\n");
      out.write("						<div class=\"dropdown-menu\">\r\n");
      out.write("							<a class=\"dropdown-item\" href=\"quanlySV\">Quản lý sinh viên</a> <a\r\n");
      out.write("								class=\"dropdown-item\" href=\"quanlyPhong\">Quản lý phòng</a> <a\r\n");
      out.write("								class=\"dropdown-item\" href=\"quanlyAcc\">Quản lý tài khoản</a>\r\n");
      out.write("						</div></li>\r\n");
      out.write("				</c:if>\r\n");
      out.write("\r\n");
      out.write("				<c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc.isUser==1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("					<li class=\"nav-item dropdown\"><a\r\n");
      out.write("						class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"\r\n");
      out.write("						role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Cập\r\n");
      out.write("							nhật thông tin</a>\r\n");
      out.write("						<div class=\"dropdown-menu\">\r\n");
      out.write("							<a class=\"dropdown-item\" href=\"editLiver.jsp\">Cập nhật thông\r\n");
      out.write("								tin ở nội trú</a> <a class=\"dropdown-item\" href=\"editInfor.jsp\">Cập\r\n");
      out.write("								nhật thông tin các nhân</a>\r\n");
      out.write("						</div></li>\r\n");
      out.write("				</c:if>\r\n");
      out.write("\r\n");
      out.write("				<c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc.isAdmin==1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("					<li class=\"nav-item dropdown\"><a\r\n");
      out.write("						class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"\r\n");
      out.write("						role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Thông\r\n");
      out.write("							báo</a>\r\n");
      out.write("						<div class=\"dropdown-menu\">\r\n");
      out.write("							<a class=\"dropdown-item\" href=\"\">Duyệt đăng ký phòng</a> <a\r\n");
      out.write("								class=\"dropdown-item\" href=\"\">Liên lạc sinh viên, phụ huynh</a>\r\n");
      out.write("							<a class=\"dropdown-item\" href=\"\">Thông báo nộp tiền</a> <a\r\n");
      out.write("								class=\"dropdown-item\" href=\"\">Thông báo hết hạn</a>\r\n");
      out.write("						</div></li>\r\n");
      out.write("				</c:if>\r\n");
      out.write("				\r\n");
      out.write("				<c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc.isAdmin==1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"dashboard\">Đến trang quản lý</a></li>\r\n");
      out.write("				</c:if>\r\n");
      out.write("\r\n");
      out.write("				<c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc.isUser==1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("					<li class=\"nav-item dropdown\"><a\r\n");
      out.write("						class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"\r\n");
      out.write("						role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Biểu\r\n");
      out.write("							mẫu</a>\r\n");
      out.write("						<div class=\"dropdown-menu\">\r\n");
      out.write("							<a class=\"dropdown-item\" href=\"booktour.jsp\">Đơn đăng ký ở\r\n");
      out.write("								nội trú</a> <a class=\"dropdown-item\" href=\"bookticket.jsp\">Hợp\r\n");
      out.write("								đồng</a> <a class=\"dropdown-item\" href=\"bookticket.jsp\">Quy định</a>\r\n");
      out.write("						</div></li>\r\n");
      out.write("				</c:if>\r\n");
      out.write("\r\n");
      out.write("				<c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc!=null}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Xin\r\n");
      out.write("							chào ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" !</a></li>\r\n");
      out.write("				</c:if>\r\n");
      out.write("\r\n");
      out.write("			</ul>\r\n");
      out.write("			<c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc==null}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("				<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("					<li><a href=\"login.jsp\"><i\r\n");
      out.write("							class=\"fa-solid fa-right-to-bracket\"></i>Đăng nhập</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</c:if>\r\n");
      out.write("			<c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc!=null}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("				<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("					<li><a href=\"logout\"><i\r\n");
      out.write("							class=\"fa-solid fa-right-to-bracket\"></i>Đăng xuất</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</c:if>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
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
