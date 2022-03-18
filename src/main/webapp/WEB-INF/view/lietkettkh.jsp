<%@include file="taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
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
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
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
<%@include file="footer.jsp" %>