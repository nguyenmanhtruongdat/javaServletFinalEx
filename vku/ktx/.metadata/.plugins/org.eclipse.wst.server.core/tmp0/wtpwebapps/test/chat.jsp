<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
<title>Đăng nhập hệ thống</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel=stylesheet href="css/aos.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="icon" type="image/x-icon" href="./favicons/favicon.ico">
<link rel="./faviconsapple-touch-icon" sizes="180x180"
	href="./favicons/apple-touch-icon.png">
<link rel="icon" type="image/png" sizes="32x32"
	href="./favicons/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="16x16"
	href="./favicons/favicon-16x16.png">
<script type="text/javascript" src="./js/check.js"></script>
<style>
div.middle {
	position: absolute;
	width: 60%;
	height: 20%;
	z-index: 15;
	top: 50%;
	left: 41%;
	margin: -100px 0 0 -150px;
}

.always-middle {
	border: solid 1px black;
	position: fixed;
	left: 50%;
	top: 50%;
	background-color: white;
	z-index: 100;
	height: 400px;
	margin-top: -200px;
	width: 600px;
	margin-left: -300px;
}

.logout-chat {
	background-color: brown;
	font-size: 20px;
	height: 5%;
	width: 100%;
	align: right;
}

div#list {
	background-color: grey;
	position: fixed;
	left: 19%;
	top: 50%;
	color: #000;
	overflow: scroll;
	padding: 25px;
	width: 80%;
	height: 50%;
	z-index: 15;
	margin: -100px 0 0 -150px;
}

g {
	color: white;
}

body {
	background-image: url(bg.gif);
	background-position: top center;
	background-attachment: fixed;
	color: lightgray;
}

a {
	color: lightgray;
}

.textbox {
	width: 300px;
	height: 40px;
	font-size: 20px;
	border-radius: 50px;
	border: 5px solid gray;
	background-color: #6D6D6D;
	outline: none;
	color: black
}

.circle {
	height: 35px;
	width: 85px;
	border-radius: 50px;
	border: 5px solid green;
	background-color: #22B14C;
	color: black;
}
</style>
</head>
<div class="middle" id="result-data">
	<form autocomplete="off">

		<table>
			<tr height="80px">
				<td>Username:</td>
				<td><input type="text" id="uname" class="textbox"
					autocomplete="off"></td>
			</tr>
			<tr height="20px">
				<td>Password:</td>
				<td><input type="password" id="pw" class="textbox"></td>
			</tr>
			<tr>
				<td><input type="button" value="Go" class="circle"
					onclick="startchating();"></td>
				<td><div id="loading-icon"></div></td>
			</tr>
		</table>
	</form>
</div>
</html>