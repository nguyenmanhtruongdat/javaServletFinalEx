<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"
    />
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&amp;display=swap"
    />
    <link
      rel="stylesheet"
      href="https://mdbootstrap.com/api/snippets/static/download/MDB5-Free_4.2.0/css/mdb.min.css"
    />
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
@media (min-width: 991.98px) {
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
  box-shadow: 0 2px 5px 0 rgb(0 0 0 / 5%), 0 2px 10px 0 rgb(0 0 0 / 5%);
  width: 240px;
  z-index: 600;
}

@media (max-width: 991.98px) {
  .sidebar {
    width: 100%;
  }
}
.sidebar .active {
  border-radius: 5px;
  box-shadow: 0 2px 5px 0 rgb(0 0 0 / 16%), 0 2px 10px 0 rgb(0 0 0 / 12%);
}

.sidebar-sticky {
  position: relative;
  top: 0;
  height: calc(100vh - 48px);
  padding-top: 0.5rem;
  overflow-x: hidden;
  overflow-y: auto; /* Scrollable contents if viewport is shorter than content. */
}</style>
  </head>
  <body>
    <!--Main Navigation-->
<header>
  <!-- Sidebar -->
  <nav
       id="sidebarMenu"
       class="collapse d-lg-block sidebar collapse bg-white"
       >
    <div class="position-sticky">
      <div class="list-group list-group-flush mx-3 mt-4">
        <!-- Collapse 1 -->
        <a
           class="list-group-item list-group-item-action py-2 ripple"
           aria-current="true"
           data-mdb-toggle="collapse"
           href="#collapseExample1"
           aria-expanded="true"
           aria-controls="collapseExample1"
           >
			<i class="fa-solid fa-bars-progress"></i>
			<span>Quản lý</span>
        </a>
        <!-- Collapsed content -->
        <ul
            id="collapseExample1"
            class="collapse show list-group list-group-flush"
            >
          <li class="list-group-item py-1">
            <a href="quanlySV" class="text-reset"> <i class="fa-solid fa-graduation-cap"></i> Quản lý sinh viên</a>
          </li>
          <li class="list-group-item py-1">
            <a href="quanlyPhong" class="text-reset"> <i class="fa-solid fa-building-lock"></i> Quản lý phòng</a>
          </li>
          <li class="list-group-item py-1">
            <a href="quanlyAcc" class="text-reset"> <i class="fa-solid fa-key"></i> Quản lý tài khoản</a>
          </li>
        </ul>
        <!-- Collapse 1 -->

        <!-- Collapse 2 -->
        <a
           class="list-group-item list-group-item-action py-2 ripple"
           aria-current="true"
           data-mdb-toggle="collapse"
           href="#collapseExample2"
           aria-expanded="true"
           aria-controls="collapseExample2"
           >
          <i class="fas fa-chart-area fa-fw me-3"></i>
          <span>Hành động</span>
        </a>
        <!-- Collapsed content -->
        <ul
            id="collapseExample2"
            class="collapse list-group list-group-flush"
            >
          <li class="list-group-item py-1">
            <a href="layDSCanDuyetPhong" class="text-reset"> <i class="fa-solid fa-circle-check"></i> Duyệt đăng ký phòng</a>
          </li>
          <li class="list-group-item py-1">
            <a href="" class="text-reset"> <i class="fa-solid fa-bell"></i> Thông báo</a>
          </li>
          <li class="list-group-item py-1">
            <a href="" class="text-reset"> <i class="fa-solid fa-phone"></i> Liên lạc</a>
          </li>
        </ul>
        <!-- Collapse 2 -->
      </div>
    </div>
  </nav>
  <!-- Sidebar -->

  <!-- Navbar -->
  <nav
       id="main-navbar"
       class="navbar navbar-expand-lg navbar-light bg-white fixed-top"
       >
    <!-- Container wrapper -->
    <div class="container-fluid">
      <!-- Toggle button -->
      <button
              class="navbar-toggler"
              type="button"
              data-mdb-toggle="collapse"
              data-mdb-target="#sidebarMenu"
              aria-controls="sidebarMenu"
              aria-expanded="false"
              aria-label="Toggle navigation"
              >
        <i class="fas fa-bars"></i>
      </button>

      <!-- Brand -->
      <a class="navbar-brand" href="#">
        <img
             src="./images/vku.png"
             height="25"
             alt=""
             loading="lazy"
             />
      </a>
      <!-- Search form -->
<!-- <form class="d-none d-md-flex input-group w-auto my-auto">
  <input
         autocomplete="off"
         type="search"
         class="form-control rounded"
         placeholder='Search (ctrl + "/" to focus)'
         style="min-width: 225px"
         />
  <span class="input-group-text border-0"
        ><i class="fas fa-search"></i
    ></span>
</form> -->

      <!-- Right links -->
      <ul class="navbar-nav ms-auto d-flex flex-row">
        <!-- Notification dropdown -->
        <li class="nav-item dropdown">
          <a
             class="nav-link me-3 me-lg-0 dropdown-toggle hidden-arrow"
             href="#"
             id="navbarDropdownMenuLink"
             role="button"
             data-mdb-toggle="dropdown"
             aria-expanded="false"
             >
            <i class="fas fa-bell"></i>
            <span class="badge rounded-pill badge-notification bg-danger"
                  >1</span
              >
          </a>
          <ul
              class="dropdown-menu dropdown-menu-end"
              aria-labelledby="navbarDropdownMenuLink"
              >
            <li><a class="dropdown-item" href="#">Some news</a></li>
            <li><a class="dropdown-item" href="#">Another news</a></li>
            <li>
              <a class="dropdown-item" href="#">Something else here</a>
            </li>
          </ul>
        </li>

        <!-- Icon -->
        <li class="nav-item">
          <a class="nav-link me-3 me-lg-0" href="#">
           
          </a>
        </li>
        <!-- Icon -->
        <li class="nav-item me-3 me-lg-0">
          <a class="nav-link" href="#">
            
          </a>
        </li>

        <!-- Icon dropdown -->
        <li class="nav-item dropdown">
          <a
             class="nav-link me-3 me-lg-0 dropdown-toggle hidden-arrow"
             href="#"
             id="navbarDropdown"
             role="button"
             data-mdb-toggle="dropdown"
             aria-expanded="false"
             >
            <i class="united kingdom flag m-0"></i>
          </a>
          <ul
              class="dropdown-menu dropdown-menu-end"
              aria-labelledby="navbarDropdown"
              >
            <li>
              <a class="dropdown-item" href="#"
                 ><i class="united kingdom flag"></i>Việt Nam
                <i class="fa fa-check text-success ms-2"></i
                  ></a>
            </li>
            <li><hr class="dropdown-divider" /></li>
            <li>
              <a class="dropdown-item" href="#"
                 ><i class="poland flag"></i>English</a
                >
            </li>
          </ul>
        </li>

        <!-- Avatar -->
        <li class="nav-item dropdown">
          <a
             class="nav-link dropdown-toggle hidden-arrow d-flex align-items-center"
             href="#"
             id="navbarDropdownMenuLink"
             role="button"
             data-mdb-toggle="dropdown"
             aria-expanded="false"
             >
            <img
                 src="./images/sinhvien/21DA054.jpg
                 class="rounded-circle"
                 height="22"
                 alt=""
                 loading="lazy"
                 />
          </a>
          <ul
              class="dropdown-menu dropdown-menu-end"
              aria-labelledby="navbarDropdownMenuLink"
              >
            <li><a class="dropdown-item" href="#">Logout</a></li>
          </ul>
        </li>
      </ul>
    </div>
    <!-- Container wrapper -->
  </nav>
  <!-- Navbar -->
</header>
<!--Main Navigation-->

<!--Main layout-->
<main style="margin-top: 58px">
	<div class="modal fade" id="addAccountModal" tabindex="-1"
		role="dialog" aria-labelledby="addAccountModal" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form action="./register" method="post">
						<div class="row">
							<div class="col-md-12">
								<div class="form-group">
									<label for="username">Tên đăng nhập <span><span>*</span></span></label>
									<input type="text" class="form-control" name="username"
										id="username" placeholder="Username" required="required">

								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<label for="password">Mật khẩu <span><span>*</span></span></label>
									<input type="password" name="password" class="form-control"
										placeholder="Password" id="password" required="required">
									<span class="passwordText"></span>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<div class="form-group">
									<button class="login btn btn-success" type="submit">Lưu</button>
								</div>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Hủy</button>
				</div>
			</div>
		</div>
	</div>

	<table class="table table-striped">
		<thead>
			<tr>
				<th scope="col">Tên đăng nhập</th>
				<th scope="col">Mật khẩu</th>
				<th scope="col">Vai trò trên hệ thống</th>
				<th colspan="2">Hành động</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listA}" var="x">
				<tr>
					<td>${x.username}</td>
					<td>${x.password}</td>
					<td><c:if test="${x.isUser==1}">Người dùng</c:if> <c:if
							test="${x.isAdmin==1}">Người quản trị</c:if></td>
					<td>
					<button class="btn btn-success" onclick="javascript:showUpdate('${x.username}')">Sửa</button>
					<button type="button" class="btn btn-danger" onclick="showMess('${x.username}')">Xóa</button>
					</td>
				</tr>

			</c:forEach>
		</tbody>
	</table>
	<button class="btn btn-primary btn-lg" data-toggle="modal"
		data-target="#addAccountModal">Thêm tài khoản</button>
</main>
<!--Main layout-->
<script>
const username = document.getElementById("username");
const password = document.getElementById("password");
const cfpassword = document.getElementById("cfpassword");
if (username.value.length==0 || password.value.length==0 || cfpassword.value.length==0) {
	document.getElementById("button").disabled = true;
}else{
	document.getElementById("button").disabled = false;
}
	const passwordBox = document.querySelector('.Password');
	const passwordText = document.querySelector('.passwordText');
	var passwordPatterm = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$/;
	
	password.addEventListener('input', () => {
	    if (!password.value.match(passwordPatterm) && (password.value).length>0) {
	        passwordBox.classList.add('invalid');
	        passwordBox.classList.remove('valid');
	        passwordText.innerHTML = "<i><b>Mật khẩu không hợp lệ</b></i>";
	        passwordText.style.display = 'block';
	        passwordText.style.margin="-10px 0 0 0";
	        document.getElementById("button").disabled = true;
	        passwordText.style.color="red";
	    } else{
	  		passwordBox.classList.add('valid');
	        passwordBox.classList.remove('invalid');
	        passwordText.style.display = 'none';
	        document.getElementById("button").disabled = false;
	    }
	});
	
	const cfpasswordBox = document.querySelector('.cfPassword');
	const cfpasswordText = document.querySelector('.cfpasswordText');

	cfpassword.addEventListener('input', () => {
			if (cfpassword.value==password.value) {
	        cfpasswordBox.classList.add('valid');
	        cfpasswordBox.classList.remove('invalid');
	        cfpasswordText.style.display = 'none';
	        document.getElementById("button").disabled = false;
	    } else {
			cfpasswordBox.classList.add('invalid');
	        cfpasswordBox.classList.remove('valid');
	        cfpasswordText.innerHTML = "<b><i>Mật khẩu không khớp</b></i>";
	        cfpasswordText.style.display = 'block';
	        cfpasswordText.style.margin="-10px 0 0 0";
	        document.getElementById("button").disabled = true;
	        cfpasswordText.style.color="red";
	    }

	    
	});
	
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
    <script
      type="text/javascript"
      src="js/min.js"
    ></script>
    <script
      type="text/javascript"
      src="https://cdn.jsdelivr.net/npm/chart.js@2.9.4/dist/Chart.min.js"
    ></script>
    
    	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/script.js"></script>
  </body>
</html>