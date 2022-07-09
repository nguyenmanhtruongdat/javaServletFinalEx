<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
<link rel="icon" type="image/x-icon" href="./favicons/favicon.ico">
<link rel="./faviconsapple-touch-icon" sizes="180x180"
	href="./favicons/apple-touch-icon.png">
<link rel="icon" type="image/png" sizes="32x32"
	href="./favicons/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="16x16"
	href="./favicons/favicon-16x16.png">
<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<style>
table, td, th {
	border: 1px solid;
}

table {
	width: 100%;
	border-collapse: collapse;
}
</style>
<script>
$(function () {
    $("#datepicker1").datepicker({
        dateFormat: "dd/mm/yy",
      });
    $("#datepicker2").datepicker({
      dateFormat: "dd/mm/yy",
    });
  };

 </script>
<style><%@ include file ="/WEB-INF/style.css"%></style>
<title>Home</title>

</head>

<body>

	<!-- Preloading -->
	<div class="preloading">
		<img src="gif/pre-loader.gif" alt=""
			style="width: 150px; height: auto;">
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
					<li class="nav-item"><a class="nav-link" href="dashboard.jsp">Đến trang quản lý</a></li>
				</c:if>

				<c:if test="${sessionScope.acc.isUser==1}">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
						role="button" aria-haspopup="true" aria-expanded="false">Biểu
							mẫu</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="file1.jsp" target="_blank">Đơn đăng ký ở
								nội trú</a> <a class="dropdown-item" href="file2.jsp" target="_blank">Hợp
								đồng</a> <a class="dropdown-item" href="file3.jsp" target="_blank">Quy định</a>
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
	<!-- nav end -->

	<div class="site_content">
		<div class="container">
			<div class="row">
				<section class="col-md-12" id="searchDiv">
					<div class="page_header cfix" id="page_header">
						<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
							<h3>Tra cứu thông tin sinh viên</h3>
						</div>
						<div class="container">
							<div class="form-group">
								<div class="col-xs-11 col-sm-4 col-md-4 col-lg-3">
									<input class="form-control" name="masv" id="masv"
										placeholder="Mã sinh viên" autocomplete="off"
										required="required" autofocus="1" type="text">
								</div>
							</div>
							<div class="form-group">
								<div class="col-xs-11 col-sm-4 col-md-4 col-lg-3">
									<button class="btn btn-primary" id="search">
										<i class="fa-solid fa-magnifying-glass"></i> Tìm kiếm
									</button>
								</div>

							</div>
						</div>

						<div id="image_id">
							<img id="ajax-loader" class="img-responsive"
								src="gif/ajax-loader.gif" style="display: none;">
						</div>
					</div>
					<br>
					<div id="info_student"
						class="col-xs-12 col-sm-12 col-md-12 col-lg-12"></div>
				</section>
			</div>
		</div>
		<div class="center" style="margin: 20 auto; width: 100%"></div>
	</div>
	<!-- <footer
  class="text-center text-white fixed-bottom"
  style="background-color: white"
>
  <div class="container p-4"></div>
  <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2)">
    <span id="timeNow"></span>
    <a class="text-white" href="#"></a>
  </div>
</footer> -->

	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/script.js"></script>
	<script>
	    function searchSVAjax() {
	        var masvSearch = document.getElementById('masv').value;
	        console.log(masvSearch);
	        $.ajax({
	            url: "/test/showRegister",
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
  // 	    	    function displayClock() {
  //   setInterval(displayClock, 1000);
  //   var date = new Date();
  //   var dateNow = "Ngày "+ date.getDate()+' tháng '+(date.getMonth()+1)+' năm '+date.getFullYear();
  //   var hrs = date.getHours();
  //   var min = date.getMinutes();
  //   var sec = date.getSeconds();
  //   var en ="AM";
  //   if (hrs > 12) {
  //       en="PM";
  //     }
  //   if (hrs > 12) {
  //     hrs = hrs - 12;
  //   }
  //   if (hrs == 0) {
  //     hrs = 12;
  //   }
  //   if (hrs<10) {
	// 	hrs='0'+hrs;
	// }
  //   if (min<10) {
	// 	min='0'+min;
	// }
  //   if (sec<10) {
	// 	sec='0'+sec;
	// }
  //   const timeText = document.getElementById("timeNow");
	// timeText.innerHTML=hrs+':'+min+':'+sec+' '+en+ ' ' +Intl.DateTimeFormat().resolvedOptions().timeZone +' '+dateNow;
  //}
	    //displayClock();
	    
	    function showPayment() {
	      const value1 = document.getElementById("ngaybatdau").value;
	      const value2 = document.getElementById("ngayketthuc").value;
	      const phong = document.getElementById("phong").value;
	      const loaiphong = document.getElementById("loaiphong").value;
	      const hocki = document.getElementById("hocki").value;
	      var tienphong=0;
	      var tien='';
	      const date1 = new Date(value1);
	      const date2 = new Date(value2);
	      const diffTime = Math.abs(date2 - date1);
	      const diffDays = Math.ceil(diffTime / (1000 * 60 * 60 * 24));
	      const month = Math.floor(diffDays / 30);
	      const day = diffDays % 30;
	      const payment = document.getElementById("payment"); 
	      if (loaiphong=="Phòng thường (8 giường)" || loaiphong=="Phòng CBGV") {
	    	  tienphong=100000 * month + day * (100000/30);
	    	  tien='100.000/tháng';
		} else if (loaiphong=="Phòng dịch vụ (3 giường)") {
			 tienphong=700000 * month + day * (700000/30);
			 tien='700.000/tháng';
		}
	      const tiennuoc = 27440 * month + day*(27440/30);
	      const tong = tiennuoc + tienphong;
	      var data = '<tr>' +
	      '<td>' + loaiphong + '</td>' +
	      '<td>'+tien+'</td>' +
	      '<td rowspan="3">' + value1 + ' đến ' + value2 + '(' + month + ' tháng ' +day+' ngày)' + '</td>' +
	      '<td>' + Math.round(tienphong * 100.0) / 100.0 + '</td>' +
	      '<td> 0 </td>' +
	      '<td>' + Math.round(tienphong * 100.0) / 100.0 + '</td>' +
	      '</tr>' +
	      '<tr>' +
	      '<td> Tiền điện </td>' +
	      '<td> 2.009,7/số </td>' +
	      '<td> Theo thực tế sử dụng </td>' +
	      '<td> </td>' +
	      '<td> </td>' +
	      '</tr>' +
	      '<tr>' +
	      '<td> Tiền nước </td>' +
	      '<td> 27.440/tháng </td>' +
	      '<td>' + Math.round(tiennuoc * 100.0) / 100.0 + '</td>' +
	      '<td> 0 </td>' +
	      '<td>' + Math.round(tiennuoc * 100.0) / 100.0 + '</td>' +
	      '</tr>' +
	      '<tr>' +
	      '<td>Tổng tiền</td>'+
	      '<td colspan="3">' + Math.round(tong * 100.0) / 100.0 +' đ'+ '</td>' +
	      '</tr>';

	      console.log(data);
	if (value1=='' || value2=='' || phong==''|| loaiphong=='' || hocki=='') {
		alert('Chưa nhập đầy đủ dữ liệu!');
	} else {
	      payment.innerHTML = data;
	}
	    }
	    
	  </script>
</body>

</html>