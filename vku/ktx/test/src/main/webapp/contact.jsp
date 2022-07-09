<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<style><%@ include file="/WEB-INF/sendMsg.css"%></style>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" />
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&amp;display=swap" />
<link rel="stylesheet"
	href="https://mdbootstrap.com/api/snippets/static/download/MDB5-Free_4.2.0/css/mdb.min.css" />
<link rel="icon" type="image/x-icon" href="./favicons/favicon.ico">
<link rel="./faviconsapple-touch-icon" sizes="180x180"
	href="./favicons/apple-touch-icon.png">
<link rel="icon" type="image/png" sizes="32x32"
	href="./favicons/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="16x16"
	href="./favicons/favicon-16x16.png">
<title>Hệ thống quản lý ký túc xá</title>
<style>
body {
	background-color: #fbfbfb;
}

@media ( min-width : 991.98px) {
	main {
		padding-left: 240px;
	}
}

/* Sidebar */
.sidebar {
	position: fixed;
	top: 0;
	bottom: 0;
	left: 0;
	padding: 58px 0 0; /* Height of navbar */
	box-shadow: 0 2px 5px 0 rgb(0 0 0/ 5%), 0 2px 10px 0 rgb(0 0 0/ 5%);
	width: 240px;
	z-index: 600;
}

@media ( max-width : 991.98px) {
	.sidebar {
		width: 100%;
	}
}

.sidebar .active {
	border-radius: 5px;
	box-shadow: 0 2px 5px 0 rgb(0 0 0/ 16%), 0 2px 10px 0 rgb(0 0 0/ 12%);
}

.sidebar-sticky {
	position: relative;
	top: 0;
	height: calc(100vh - 48px);
	padding-top: 0.5rem;
	overflow-x: hidden;
	overflow-y: auto;
	/* Scrollable contents if viewport is shorter than content. */
}
</style>
</head>
<body>
	<!--Main Navigation-->
	<header>
		<!-- Sidebar -->
		<nav id="sidebarMenu"
			class="collapse d-lg-block sidebar collapse bg-white">
			<div class="position-sticky">
				<div class="list-group list-group-flush mx-3 mt-4">
					<!-- Collapse 1 -->
					<a class="list-group-item list-group-item-action py-2 ripple"
						aria-current="true" data-mdb-toggle="collapse"
						href="#collapseExample1" aria-expanded="true"
						aria-controls="collapseExample1"> <i
						class="fa-solid fa-bars-progress"></i> <span>Quản lý</span>
					</a>
					<!-- Collapsed content -->
					<ul id="collapseExample1"
						class="collapse show list-group list-group-flush">
						<li class="list-group-item py-1"><a href="quanlySV"
							class="text-reset"> <i class="fa-solid fa-graduation-cap"></i>
								Quản lý sinh viên
						</a></li>
						<li class="list-group-item py-1"><a href="quanlyPhong"
							class="text-reset"> <i class="fa-solid fa-building-lock"></i>
								Quản lý phòng
						</a></li>
						<li class="list-group-item py-1"><a href="quanlyAcc"
							class="text-reset"> <i class="fa-solid fa-key"></i> Quản lý
								tài khoản
						</a></li>
					</ul>
					<!-- Collapse 1 -->

					<!-- Collapse 2 -->
					<a class="list-group-item list-group-item-action py-2 ripple"
						aria-current="true" data-mdb-toggle="collapse"
						href="#collapseExample2" aria-expanded="true"
						aria-controls="collapseExample2"> <i
						class="fas fa-chart-area fa-fw me-3"></i> <span>Hành động</span>
					</a>
					<!-- Collapsed content -->
					<ul id="collapseExample2"
						class="collapse list-group list-group-flush">
						<li class="list-group-item py-1"><a href="layDSCanDuyetPhong"
							class="text-reset"> <i class="fa-solid fa-circle-check"></i>
								Duyệt đăng ký phòng
						</a></li>
						<li class="list-group-item py-1"><a href=""
							class="text-reset"> <i class="fa-solid fa-bell"></i> Thông
								báo
						</a></li>
						<li class="list-group-item py-1"><a href=""
							class="text-reset"> <i class="fa-solid fa-phone"></i> Liên
								lạc
						</a></li>
					</ul>
					<!-- Collapse 2 -->
				</div>
			</div>
		</nav>
		<!-- Sidebar -->

		<!-- Navbar -->
		<nav id="main-navbar"
			class="navbar navbar-expand-lg navbar-light bg-white fixed-top">
			<!-- Container wrapper -->
			<div class="container-fluid">
				<!-- Toggle button -->
				<button class="navbar-toggler" type="button"
					data-mdb-toggle="collapse" data-mdb-target="#sidebarMenu"
					aria-controls="sidebarMenu" aria-expanded="false"
					aria-label="Toggle navigation">
					<i class="fas fa-bars"></i>
				</button>

				<!-- Brand -->
				<a class="navbar-brand" href="#"> <img src="./images/vku.png"
					height="25" alt="" loading="lazy" />
				</a>
				<!-- Search form -->
				<form class="d-none d-md-flex input-group w-auto my-auto">
					<input autocomplete="off" type="search"
						class="form-control rounded" placeholder=""
						style="min-width: 225px" /> <span
						class="input-group-text border-0"><i
						class="fas fa-search"></i></span>
				</form>

				<!-- Right links -->
				<ul class="navbar-nav ms-auto d-flex flex-row">
					<!-- Notification dropdown -->
					<li class="nav-item dropdown"><a
						class="nav-link me-3 me-lg-0 dropdown-toggle hidden-arrow"
						href="#" id="navbarDropdownMenuLink" role="button"
						data-mdb-toggle="dropdown" aria-expanded="false">
							<i class="fas fa-bell"></i> <span
							class="badge rounded-pill badge-notification bg-danger">1</span>
					</a>
						<ul class="dropdown-menu dropdown-menu-end"
							aria-labelledby="navbarDropdownMenuLink">
							<li><a class="dropdown-item" href="#">Some news</a></li>
							<li><a class="dropdown-item" href="#">Another news</a></li>
							<li><a class="dropdown-item" href="#">Something else
									here</a></li>
						</ul></li>

					<!-- Icon -->
					<li class="nav-item"><a class="nav-link me-3 me-lg-0" href="#">

					</a></li>
					<!-- Icon -->
					<li class="nav-item me-3 me-lg-0"><a class="nav-link" href="#">

					</a></li>

					<!-- Icon dropdown -->
					<li class="nav-item dropdown"><a
						class="nav-link me-3 me-lg-0 dropdown-toggle hidden-arrow"
						href="#" id="navbarDropdown" role="button"
						data-mdb-toggle="dropdown" aria-expanded="false">
							<i class="united kingdom flag m-0"></i>
					</a>
						<ul class="dropdown-menu dropdown-menu-end"
							aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="#"><i
									class="united kingdom flag"></i>Việt Nam <i
									class="fa fa-check text-success ms-2"></i></a></li>
							<li><hr class="dropdown-divider" /></li>
							<li><a class="dropdown-item" href="#"><i
									class="poland flag"></i>English</a></li>
						</ul></li>

					<!-- Avatar -->
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle hidden-arrow d-flex align-items-center"
						href="#" id="navbarDropdownMenuLink" role="button"
						data-mdb-toggle="dropdown" aria-expanded="false">
							<img src="./images/sinhvien/21DA054.jpg
                 class="
							rounded-circle"
                 height="22" alt=""
							loading="lazy" />
					</a>
						<ul class="dropdown-menu dropdown-menu-end"
							aria-labelledby="navbarDropdownMenuLink">
							<li><a class="dropdown-item" href="#">Logout</a></li>
						</ul></li>
				</ul>
			</div>
			<!-- Container wrapper -->
		</nav>
		<!-- Navbar -->
	</header>
	<!--Main Navigation-->

	<!--Main layout-->
	<main style="margin-top: 58px">
		<div class="fcf-body">

			<div id="fcf-form">
				<h3 class="fcf-h3">Gửi mail</h3>

				<form id="fcf-form-id" class="fcf-form-class" method="post"
					action="./sendMsg">
					<div class="fcf-form-group">
						<label for="Name" class="fcf-label">Người nhận</label>
						<div class="fcf-input-group">
							<input type="text" id="user" name="user" class="fcf-form-control"
								required>
						</div>
					</div>

					<div class="fcf-form-group">
						<label for="Email" class="fcf-label">Tiêu đề</label>
						<div class="fcf-input-group">
							<input type="text" id="title" name="title"
								class="fcf-form-control" required>
						</div>
					</div>

					<div class="fcf-form-group">
						<label for="Message" class="fcf-label">Nội dung</label>
						<div class="fcf-input-group">
							<textarea id="msg" name="msg" class="fcf-form-control" rows="6"
								maxlength="3000" required></textarea>
						</div>
					</div>

					<div class="fcf-form-group">
						<button type="submit" id="fcf-button"
							class="fcf-btn fcf-btn-primary fcf-btn-lg fcf-btn-block">Gửi</button>
					</div>
				</form>
			</div>

		</div>
	</main>
	<!--Main layout-->
	<script>
	function showMess(id) {
	    var option = confirm("Bạn có muốn xóa không?");
	    if (option === true) {
	      window.location.href = "deleteAcc?username=" + id;
	    }
	  }
	
	function showUpdate(id) {
		window.location.href = "updateAcc?username=" + id;
	}
</script>
	<script type="text/javascript" src="js/min.js"></script>
	<script type="text/javascript"
		src="https://cdn.jsdelivr.net/npm/chart.js@2.9.4/dist/Chart.min.js"></script>

	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/script.js"></script>
</body>
</html>