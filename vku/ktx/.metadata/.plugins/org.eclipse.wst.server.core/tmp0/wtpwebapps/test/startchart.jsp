<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%String uname=(String)session.getAttribute("name"); %>

<head>
<link rel="stylesheet" type="text/css" href="styles.css">
<script type="text/javascript" src="./js/check.js"></script>
<title>The Chat Room</title>
<link rel="shortcut icon" href="icon.jpeg" />
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
<script>
     setInterval(reloaddata, 3000);
    </script>
</head>

<body>
	<p id="result"></p>
	Welcome,
	<%=uname%>
	<div class="logout-div" align="right">
		<a href="logout.jsp" class="logout-chat">Logout</a>
	</div>
	<div id="list">
		<div id="content"></div>
		<input style="display: none" type="text" id="u" value="<%=uname%>">
		<textarea id='h' style="width: 100%; height: 10%;"></textarea>
		<input type="button" value="send" onclick="addText()" />
	</div>
</body>


</html>