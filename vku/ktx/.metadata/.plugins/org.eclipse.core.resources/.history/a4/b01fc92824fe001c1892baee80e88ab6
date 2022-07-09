<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!DOCTYPE html>
<html>
<head>
<title>Register</title>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
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
<link rel="shortcut icon" type="image/x-icon"
	href="/images/asset/vku-icon.png" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel=stylesheet href="css/aos.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<style>
form {
	justify-content: center !important;
	align-items: center !important;
	text-align: center !important;
}
</style>
<meta name="msapplication-TileColor" content="#ffffff">
<meta name="theme-color" content="#ffffff">
</head>
<body
	style="background-image: url('https://cdn5.f-cdn.com/contestentries/1578585/21468461/5d62b49ac544b_thumb900.jpg'); background-size: 100%; background-repeat: no-repeat; height: 100vh;">
	<div class="center">
		<form action="./register" method="post">
			<h1 style="font-family: 'Permanent Marker', cursive;">ĐĂNG KÝ
				TÀI KHOẢN</h1>
			<p class="text-danger" id="danger" style="text-align: center">${msg}</p>
			<input type="text" name="username" id="username"
				placeholder="Username" required="required"><br> <br>
			<input type="password" name="password" class="Password"
				placeholder="Password" id="password" required="required"><br>
			<br> <span class="passwordText"></span> <input type="password"
				name="password" class="cfPassword" placeholder="Confirm password"
				required="required" id="cfpassword"><br> <br> <span
				class="cfpasswordText"></span> <input id="button" type="submit"
				value="Register"
				style="background-color: rgb(255, 0, 68); color: #ffff; border: none; border-radius: 5px; font-size: 20px; cursor: pointer;" />
			<br> <br> <a href="login.jsp">Or login</a>
		</form>
	</div>
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
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>