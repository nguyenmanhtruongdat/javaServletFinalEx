<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
<link rel="stylesheet" href="css/style.css">
<link rel="icon" type="image/x-icon" href="./favicons/favicon.ico">
<link rel="./faviconsapple-touch-icon" sizes="180x180"
	href="./favicons/apple-touch-icon.png">
<link rel="icon" type="image/png" sizes="32x32"
	href="./favicons/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="16x16"
	href="./favicons/favicon-16x16.png">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Bevan&family=Satisfy&display=swap"
	rel="stylesheet">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Bevan&family=Cabin&family=Satisfy&display=swap"
	rel="stylesheet">
<title>Trang chủ</title>
</head>
<style>
#bg {
	position: fixed;
	top: 0;
	left: 0;
	/* Preserve aspet ratio */
	min-width: 100%;
	min-height: 100%;
}

.home {
	min-height: 100vh;
	display: flex;
	align-items: center;
	justify-content: center;
	flex-flow: column;
	position: relative;
	z-index: 0;
}

.home .content {
	text-align: center;
}

.home .content h3 {
	text-align: center;
	font-size: 69px;
	font-family: 'Bevan', cursive;
	color: #fff;
	text-transform: uppercase;
	text-shadow: 0 .3rem .5rem rgba(121, 121, 121, 0.971);
}

.home .content h5 {
	font-size: 42px;
	color: #fff;
	padding: .10px 0;
	text-align: center;
	font-family: 'Cabin', sans-serif;
	text-shadow: 5px 5px 15px rgba(121, 121, 121, 0.971);
}

.home .image-container img {
	position: absolute;
	top: 0;
	left: 0;
	z-index: -1;
	height: 100vh;
	width: 100%;
	object-fit: cover;
}

.home .controls {
	padding: 1rem;
	border-radius: 5rem;
	background: rgba(0, 0, 0, .7);
	position: relative;
	top: 10rem;
}
</style>
<body>
	<div class="preloading">
		<img src="gif/pre-loader.gif" alt=""
			style="width: 80px !important; height: auto;">
	</div>
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

				<c:if test="${sessionScope.acc.isAdmin==3}">
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
								nhật thông tin cá nhân</a>
						</div></li>
				</c:if>

				<c:if test="${sessionScope.acc.isAdmin==3}">
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
					<li class="nav-item"><a class="nav-link" href="dashboard.jsp">Đến
							trang quản lý</a></li>
				</c:if>

				<c:if test="${sessionScope.acc.isUser==1}">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
						role="button" aria-haspopup="true" aria-expanded="false">Biểu
							mẫu</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="file1.jsp" target="_blank">Đơn
								đăng ký ở nội trú</a> <a class="dropdown-item" href="file2.jsp"
								target="_blank">Hợp đồng</a> <a class="dropdown-item"
								href="file3.jsp" target="_blank">Quy định</a>
						</div></li>
				</c:if>

				<c:if test="${sessionScope.acc!=null}">
					<li class="nav-item"><a class="nav-link" href="#">Xin chào
							${sessionScope.acc.username} !</a></li>
				</c:if>
			</ul>
			<c:if test="${sessionScope.acc==null}">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="login"><i
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
	<!-- nav end -->
	<section class="home" id="home">

		<div class="content">
			<h3 data-aos="fade-down" data-aos-easing="ease-in-sine"
				data-aos-duration="1000">HỆ THỐNG KÝ TÚC XÁ VKU!</h3>
			<h5 data-aos="fade-up" data-aos-easing="ease-in-sine"
				data-aos-duration="2000">Đăng nhập để sử dụng</h5>
			<!-- <button class="btn btnChinh" ="fade-up" -duration="1000"
                    -anchor-placement="bottom-bottom">Tìm hiểu thêm</button> -->
		</div>

		<div class="image-container">
			<img src="images/background.jpg" alt="">
		</div>

	</section>
	<script>
//            var btn = document.getElementById("search");
//            btn.addEventListener("click", function () {
//                $.ajax({
//                    url: "/tomcat/searchSV",
//                    type: "get",
//                    beforeSend: function () {
//                        $('#image_id').show();
//                    },
//                    success: function (data) {
//                        $('#image_id').hide();
//                        var row = document.getElementById("info_student");
//                        row.innerHTML = data;
//                    },
//                    error: function (xhr) {
//                        //Do Something to handle error
//                    }
//                });
//            });

            function searchSVAjax() {
                var masvSearch = document.getElementById('masv').value;
//                var infor = x.parentElement.children;
//                var masvSearch = infor[0].value;
                console.log(masvSearch);
                $.ajax({
                    url: "/tomcat/searchSV",
                    type: "get",
                    data: {
                        masv: masvSearch
                    },
                    beforeSend: function () {
                        $('#ajax-loader').show();
                    },
                    success: function (data) {
                        $('#ajax-loader').hide();
                        var row = document.getElementById("info_student");
                        row.innerHTML = data;
                    },
                    error: function (xhr) {
                        //Do Something to handle error
                    }
                });
            }
            var input = document.getElementById("masv");
            input.addEventListener("keypress", function (event) {
                if (event.key === "Enter") {
                    if (input.value == "") {
                        alert("Vui lòng nhập mã sinh viên!");
                    } else {
                        event.preventDefault();
                        document.getElementById("search").click();
                    }

                }


            });
            var btn = document.getElementById("search");
            btn.addEventListener('click', function () {
                if (input.value == "") {
                    alert("Vui lòng nhập mã sinh viên!");
                } else {
                    searchSVAjax();
                }
            })
        </script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/script.js"></script>
</body>
</html>