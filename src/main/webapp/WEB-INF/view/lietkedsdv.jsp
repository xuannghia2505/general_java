<%@include file="taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<div class="container">
<form action="lietkedsdv">
	<div class="input-group mb-3">
		<input type="text" class="search-custom"
			placeholder="Nhập thông tin dịch vụ" name="key" value="${key}">
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
	<c:forEach items="${listDV}" var="dv">
		<tr>
			<td>${dv.maDV }</td>
			<td>${dv.tenDV }</td>
			<td>${dv.donvitinh }</td>
			<td>${dv.dongia }</td>
			
			<td><span> <i class="fa fa-edit"></i> <i
					class="fa fa-trash"></i>
			</span></td>
		</tr>
	 </c:forEach>
	</tbody>
</table>
 <div class="mx-auto" style="width: 250px;">
            <ul class="pagination" style="width: 100%;">
              <li class="page-item"><a class="page-link" href="lietkedsdv?message=pre&key=${key}">Previous</a></li>
              <c:forEach var="i" begin="1" end="${soPage }">
              <li class="page-item"><a class="page-link" href="lietkedsdv?page=${i}&key=${key}"><c:out value="${i}"></c:out></a></li>
              </c:forEach>
              <li class="page-item"><a class="page-link" href="lietkedsdv?message=next&key=${key}">Next</a></li>
            </ul>
          </div>
</div>
<%@include file="footer.jsp"%>