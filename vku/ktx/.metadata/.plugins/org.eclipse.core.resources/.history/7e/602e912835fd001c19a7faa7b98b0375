<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
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
        <style>
                .tab2 {
            tab-size: 4;
        }
        </style>
</head>
<body>
	<div class="center" style="margin: 20 auto; width: 100%">
		<form action="./updateStd" method="post">
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
														<label for="masv">Mã sinh viên <span><span>*</span></span></label>
														<input type="text" value="${std.masv}" name="masv"
															class="form-control" id="masv" required
															readonly="readonly">

													</div>
												</div>
												<div class="col-md-12">
													<div class="form-group">
														<label for="hoten">Họ tên <span><span>*</span></span></label>
														<input type="text" value="${std.ten}" id="hoten"
															class="form-control" name="hoten" required>
													</div>
												</div>
											</div>
											<div class="row">
												<div class="col-md-12">
													<div class="form-group">
														<label for="ngaysinh">Ngày sinh <span>*</span></label> <input
															type="text" name="dob" placeholder="dd/MM/YYYY"
															value="${std.ngaysinh}" class="form-control"
															id="datepicker" onclick="datepicker()" readonly>

													</div>
												</div>
											</div>

											<div class=row>

												<div class="col-md-12">
													<div class="form-group">
														<label for="gioitinh">Giới tính<span>*</span></label> <br>
															Nam <input type="radio" name="gioitinh" value="1" ${std.gioitinh == 1 ? "checked":""} >
															&nbsp &nbsp &nbsp &nbsp
															Nữ <input type="radio" name="gioitinh" value="0" ${std.gioitinh == 0 ? "checked":""} >
													</div>
												</div>


											</div>
											<div class="row">
												<div class="col-md-12">
													<div class="form-group">
														<label for="lop">Lớp <span>*</span></label> <input
															type="text" value="${std.lop}" name="lop" id="lop"
															class="form-control" required="required">
													</div>
												</div>
											</div>

											<div class="row">
												<div class="col-md-12">
													<div class="form-group">
														<label for="nganh">Ngành <span>*</span></label> <input
															type="text" value="${std.nganh}" name="nganh"
															class="form-control" id="nganh" required="required">
													</div>
												</div>
												<div class="col-md-12">
													<div class="form-group">
														<label for="khoa">Khoa <span>*</span></label> <input
															type="text" value="${std.khoa}" name="khoa"
															class="form-control" id="nganh" required="required">
													</div>
												</div>

											</div>

											<div class="row">
												<div class="col-md-12">
													<div class="form-group">
														<label for="cmnd">CMND/CCCD <span>*</span></label> <input
															type="text" value="${std.CMND}" name="cmnd"
															class="form-control" id="cmnd" required="required">
													</div>
												</div>
												<div class="col-md-12">
													<div class="form-group">
														<label for="truong">Trường <span>*</span></label> <input
															type="text" value="${std.truong}" name="truong"
															class="form-control" id="truong" required="required">
													</div>
												</div>
											</div>
											<div class="row">
												<div class="col-md-6">
													<div class="form-group">
														<label for="sdt">Số điện thoại cá nhân <span>*</span></label>
														<input type="text" value="${std.sdtCanhan}" name="sdtSV"
															class="form-control" id="sdt" required="required">
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<label for="sdt">Số điện thoại gia đình <span>*</span></label>
														<input type="text" value="${std.sdtGiadinh}" name="sdtPH"
															class="form-control" id="sdt" required="required">
													</div>
												</div>
											</div>
											<div class="row">
												<div class="col-md-12">
													<div class="form-group">
														<label for="email">Email <span>*</span></label> <input
															type="email" value="${std.email}" name="email"
															class="form-control" id="email" required="required">
													</div>
												</div>
												<div class="col-md-12">
													<div class="form-group">
														<label for="diachi">Địa chỉ <span>*</span></label> <input
															type="text" value="${std.diachi}" name="diachi"
															class="form-control" id="diachi" required="required">
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