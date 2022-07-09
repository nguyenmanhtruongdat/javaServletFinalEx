<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>contact form</title>
<style><%@ include file="/WEB-INF/style.css"%></style>
</head>

<body>

	<link href="contact-form.css" rel="stylesheet">

	<div class="fcf-body">

		<div id="fcf-form">
			<h3 class="fcf-h3">Gửi thông báo</h3>

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

</body>
</html>