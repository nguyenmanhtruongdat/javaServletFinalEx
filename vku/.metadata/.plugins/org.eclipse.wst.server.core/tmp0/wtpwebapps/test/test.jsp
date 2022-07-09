<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
    <html>
   <head>
      <title>JSTL fmt:setLocale Tag</title>
   </head>

   <body>
   <fmt:setLocale value="vi_VN"/>
      <fmt:bundle basename = "truongdat.resources.app" var="lang">
    <fmt:message key=content bundle="${lang}"></fmt:message>
      </fmt:bundle>
   </body>
</html>