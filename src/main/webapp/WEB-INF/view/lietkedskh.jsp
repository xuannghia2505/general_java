<%@include file="taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<div class="container">
<form action="lietkedskh">
	<div class="input-group mb-3">
		<input type="text" class="search-custom"
			placeholder="Nhập thông tin khách hàng" name="key" value="${key}">
		<div class="input-group-append">
			<button class="btn btn-outline-secondary" type="submit">Tìm
				kiếm</button>
		</div>
	</div>
</form>
<table class="table table-bordered">
	<thead>
		<tr>
			<th>Mã khách hàng</th>
			<th>Tên khách hàng</th>
			<th>Địa chỉ</th>
			<th>Số điện thoại</th>
			<th>Địa chỉ Email</th>
			<th>Thao tác</th>
		</tr>

	</thead>
	<tbody>
	<c:forEach items="${listKH}" var="kh">
		<tr>
			<td>${kh.maKH }</td>
			<td>${kh.tenKH }</td>
			<td>${kh.diachi }</td>
			<td>${kh.sdt }</td>
			<td>${kh.email }</td>
			<td><span> <i class="fa fa-edit"></i> <i
					class="fa fa-trash"></i>
			</span></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
 <div class="mx-auto" style="width: 250px;">
  <ul class="pagination" style="width: 100%;">
    <li class="page-item"><a class="page-link" href="lietkedskh?message=pre&key=${key}">Previous</a></li>
    <c:forEach var="i" begin="1" end="${soPage }">
    <li class="page-item"><a class="page-link" href="lietkedskh?page=${i}&key=${key}"><c:out value="${i}"></c:out></a></li>
    </c:forEach>
    <li class="page-item"><a class="page-link" href="lietkedskh?message=next&key=${key}">Next</a></li>
  </ul>
</div>
</div>


<%@include file="footer.jsp"%>