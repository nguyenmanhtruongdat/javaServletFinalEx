<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
<link rel="icon" type="image/png" sizes="16x16"
	href="favicons/favicon-16x16.png">
<link rel="icon" type="image/png" sizes="32x32"
	href="favicons/favicon-32x32.png">
<link rel="apple-touch-icon" sizes="57x57"
	href="favicons/apple-touch-icon-57x57.png">
<link rel="apple-touch-icon" sizes="60x60"
	href="favicons/apple-touch-icon-60x60.png">
<link rel="apple-touch-icon" sizes="72x72"
	href="favicons/apple-touch-icon-72x72.png">
<link rel="apple-touch-icon" sizes="76x76"
	href="favicons/apple-touch-icon-76x76.png">
<link rel="icon" type="image/png" sizes="96x96"
	href="favicons/apple-touch-icon-96x96.png">
<link rel="apple-touch-icon" sizes="114x114"
	href="favicons/apple-touch-icon-114x114.png">
<link rel="apple-touch-icon" sizes="120x120"
	href="favicons/apple-touch-icon-120x120.png">
<link rel="apple-touch-icon" sizes="144x144"
	href="favicons/apple-touch-icon-144x144.png">
<link rel="apple-touch-icon" sizes="152x152"
	href="favicons/apple-touch-icon-152x152.png">
<link rel="apple-touch-icon" sizes="180x180"
	href="favicons/apple-touch-icon-180x180.png">
<link rel="icon" type="image/png" sizes="192x192"
	href="/favicons/android-icon-192x192.png">
<link rel="stylesheet" href="css/style.css">
<title>Quản lý tài khoản</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
<style>
.modal-dialog {
	width: 100%;
	height: 100%;
	margin: 0;
	padding: 0;
}

.modal-content {
	height: auto;
	min-height: 100%;
	border-radius: 0;
}
</style>
<script>
   $(function () {
       $("#datepicker").datepicker({ 
           dateFormat: 'dd/mm/yy' 
       });
   });
  
  </script>

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
<title>Quản lý sinh viên</title>
</head>
<body>
	<div class="preloading">
		<img src="gif/pre-loader.gif" alt=""
			style="width: 80px !important; height: auto;">
	</div>
	<!-- Modal -->
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
					<td><a href="updateAcc?username=${x.username}">Sửa</a></td>
					<td><a href="#" onclick="showMess(${x.username})">Xoá</a></td>
				</tr>

			</c:forEach>
		</tbody>
	</table>
	<button class="btn btn-primary btn-lg" data-toggle="modal"
		data-target="#addAccountModal">Thêm tài khoản</button>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script>
	function showMess(id) {
		var option = confirm('Xoa?');
	if (option===true) {
		window.location.href=='deleteAcc?sid='+id;
	}
	}
</script>
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
</script>
	<script type="text/javascript" src="js/script.js"></script>
</body>
</html>