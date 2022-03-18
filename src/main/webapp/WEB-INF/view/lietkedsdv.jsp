<%@include file="taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<div class="container">
<form action="">
	<div class="input-group mb-3">
		<input type="text" class="search-custom"
			placeholder="Nhập thông tin dịch vụ" >
		<div class="input-group-append">
			<button class="btn btn-outline-secondary" type="submit">Tìm
				kiếm</button>
		</div>
	</div>
</form>
<table class="table table-bordered">
	<thead>
		<tr>
			<th>Mã dịch vụ</th>
			<th>Tên dịch vụ</th>
			<th>Đơn vị tính</th>
			<th>Đơn giá</th>
			<th>Thao tác</th>
		</tr>

	</thead>
	<tbody>
		<tr>
			<td>DV001</td>
			<td>Mì tôm thịt boà</td>
			<td>Tô</td>
			<td>10000</td>
			<td><span> <i class="fa fa-edit"></i> <i
					class="fa fa-trash"></i>
			</span></td>
		</tr>

	</tbody>
</table>
<div class="mx-auto" style="width: 250px;">
	<ul class="pagination" style="width: 100%;">
		<li class="page-item"><a class="page-link" href="#">Previous</a></li>
		<li class="page-item"><a class="page-link" href="#">1</a></li>
		<li class="page-item"><a class="page-link" href="#">2</a></li>
		<li class="page-item"><a class="page-link" href="#">3</a></li>
		<li class="page-item"><a class="page-link" href="#">Next</a></li>
	</ul>
</div>
</div>
<%@include file="footer.jsp"%>