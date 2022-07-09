<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<title>Cập nhật thông tin</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
<script>
            $(function () {
                $("#datepicker").datepicker({
                    dateFormat: 'dd/mm/yy'
                });
            });

        </script>
</head>
<body>
	<div class="center" style="margin: 20 auto; width: 100%">
		<form action="./updateAcc" method="post">
			<div class="container">
				<div class=" text-center mt-5 "></div>
				<div class="row ">
					<div class="col-lg-7 mx-auto">
						<div class="card mt-2 mx-auto p-4 bg-light">
							<div class="card-body bg-light">

								<div class="container">
									<form id="contact-form" role="form">



										<div class="controls">

											<div class="row">
												<div class="col-md-12">
													<div class="form-group">
														<label for="masv">Tên đăng nhập <span><span>*</span></span></label>
														<input type="text" value="${acc.username}" name="username"
															class="form-control" id="username" required
															readonly="readonly">

													</div>
												</div>
												<div class="col-md-12">
													<div class="form-group">
														<label for="hoten">Mật khẩu <span><span>*</span></span></label>
														<input type="text" value="" id="password"
															class="form-control" name="password" required>
													</div>
												</div>
											</div>
											<div class="row">
												<div class="col-md-6">
													<div class="form-group">
														<label for="masv">Vai trò trên hệ thống <span><span>*</span></span></label>

													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
													
													<select name="role" class="form-control" required="required">
													
													<c:if test="${acc.isAdmin ==1 }">
                                                        <option value="admin" selected>Người quản trị</option>
                                                        <option value="user">Người dùng</option>
													</c:if>

                                                    <c:if test="${acc.isUser ==1 }">
                                                        <option value="user" selected>Người dùng</option>
                                                        <option value="admin">Người quản trị</option>
													</c:if>

													</select>
													</div>
												</div>
											</div>
											<div class="row">
												<div class="col-md-12">

													<input type="submit"
														class="btn btn-success btn-send  pt-2 btn-block
                                                               "
														value="Cập nhật">

												</div>

											</div>
										</div>
									</form>
								</div>
							</div>


						</div>
						<!-- /.8 -->

					</div>
					<!-- /.row-->

				</div>
			</div>

		</form>
	</div>
</body>
</html>