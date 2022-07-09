<%@ page language="java" contentType="text/html"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- nav starts  -->

	<nav class="navbar navbar-expand-lg navbar-light sticky-top"
		style="background-color: #0F2557;">
		<a class="navbar-brand" href="index.jsp"><img src="images/vku.png"
			alt="" width="66px" height="35px"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarColor03" aria-controls="navbarColor03"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarColor03">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="index.jsp">Trang
						chủ</a></li>
				<c:if test="${sessionScope.acc.isUser==1}">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
						role="button" aria-haspopup="true" aria-expanded="false">Đăng
							ký</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="register-live.jsp">Đăng ký ở
								nội trú</a> <a class="dropdown-item"
								href="register-infor-student.jsp">Đăng ký thông tin cá nhân</a>
						</div></li>
				</c:if>

				<c:if test="${sessionScope.acc.isAdmin==1}">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
						role="button" aria-haspopup="true" aria-expanded="false">Quản
							lý</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="quanlySV">Quản lý sinh viên</a> <a
								class="dropdown-item" href="quanlyPhong">Quản lý phòng</a> <a
								class="dropdown-item" href="quanlyAcc">Quản lý tài khoản</a>
						</div></li>
				</c:if>

				<c:if test="${sessionScope.acc.isUser==1}">

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
						role="button" aria-haspopup="true" aria-expanded="false">Cập
							nhật thông tin</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="editLiver.jsp">Cập nhật thông
								tin ở nội trú</a> <a class="dropdown-item" href="editInfor.jsp">Cập
								nhật thông tin các nhân</a>
						</div></li>
				</c:if>

				<c:if test="${sessionScope.acc.isAdmin==1}">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
						role="button" aria-haspopup="true" aria-expanded="false">Thông
							báo</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="">Duyệt đăng ký phòng</a> <a
								class="dropdown-item" href="">Liên lạc sinh viên, phụ huynh</a>
							<a class="dropdown-item" href="">Thông báo nộp tiền</a> <a
								class="dropdown-item" href="">Thông báo hết hạn</a>
						</div></li>
				</c:if>
				
				<c:if test="${sessionScope.acc.isAdmin==1}">
					<li class="nav-item"><a class="nav-link" href="dashboard">Đến trang quản lý</a></li>
				</c:if>

				<c:if test="${sessionScope.acc.isUser==1}">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
						role="button" aria-haspopup="true" aria-expanded="false">Biểu
							mẫu</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="booktour.jsp">Đơn đăng ký ở
								nội trú</a> <a class="dropdown-item" href="bookticket.jsp">Hợp
								đồng</a> <a class="dropdown-item" href="bookticket.jsp">Quy định</a>
						</div></li>
				</c:if>

				<c:if test="${sessionScope.acc!=null}">
					<li class="nav-item"><a class="nav-link" href="#">Xin
							chào ${sessionScope.acc.username} !</a></li>
				</c:if>

			</ul>
			<c:if test="${sessionScope.acc==null}">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="login.jsp"><i
							class="fa-solid fa-right-to-bracket"></i>Đăng nhập</a></li>
				</ul>
			</c:if>
			<c:if test="${sessionScope.acc!=null}">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="logout"><i
							class="fa-solid fa-right-to-bracket"></i>Đăng xuất</a></li>
				</ul>
			</c:if>
		</div>
	</nav>
</body>
</html>