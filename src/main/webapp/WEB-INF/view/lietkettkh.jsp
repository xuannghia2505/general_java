<%@include file="taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<table class="table">
	<thead>
		<tr>
			<th scope="col">Mã khách hàng</th>
			<th scope="col">Tên khách hàng</th>
			<th scope="col">Mã máy</th>
			<th scope="col">Vị trí</th>
			<th scope="col">Trạng thái</th>
			<th scope="col">Ngày bắt đầu sử dụng máy</th>
			<th scope="col">Giờ bắt đầu sử dụng máy</th>
			<th scope="col">Thời gian sử dụng máy</th>
			<th scope="col">Mã dịch vụ</th>
			<th scope="col">Ngày sử dụng dịch vụ</th>
			<th scope="col">Giờ sử dụng dịch vụ</th>
			<th scope="col">Số lượng</th>
			<th scope="col">Tổng tiền</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="o" items="${listInfo}">
			<tr>
				<td>${o.getMaKH() }</td>
				<td>${o.getTenKH() }</td>
				<td>${o.getMamay() }</td>
				<td>${o.getVitri() }</td>
				<td>${o.getTrangthai() }</td>
				<td>${o.getNgaysdm() }</td>
				<td>${o.getGiosdm() }</td>
				<td>${o.getThoigiansd() }</td>
				<c:if test="${o.getMaDV() !=null}">
					<td>${o.getMaDV() }</td>
					<td>${o.getNgaysddv() }</td>
					<td>${o.getGiosddv() }</td>
					<td>${o.getSoluong() }</td>
					<td>${o.getTongtien() }</td>
				</c:if>
				<c:if test="${o.getMaDV() ==null}">
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</c:if>

			</tr>
		</c:forEach>
	</tbody>
</table>
<div class="mx-auto" style="width: 250px;">
	<ul class="pagination" style="width: 100%;">
		<li class="page-item"><a class="page-link"
			href="lietkettkh?message=pre">Previous</a></li>
		<c:forEach var="i" begin="1" end="${soPage }">
			<li class="page-item"><a class="page-link"
				href="lietkettkh?page=${i}"><c:out value="${i}"></c:out></a></li>
		</c:forEach>
		<li class="page-item"><a class="page-link"
			href="lietkettkh?message=next">Next</a></li>
	</ul>
</div>
<%@include file="footer.jsp"%>