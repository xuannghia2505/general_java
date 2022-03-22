<%@include file="taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="container">
<div id="success" class="alert-success"><c:out value="${message}"></c:out></div>
<form action="dangkysddv" method="post" onsubmit="return validateForm();">
 <div class="form-group">
   <label >Mã khách hàng</label>
   <input type="text" class="form-control" id="makh" name="makh" >
   <small id="makh1"></small>
 </div>
 <div class="form-group">
   <label >Mã dịch vụ</label>
   <input type="text" class="form-control" id="madv" name="madv">
   <small id="madv1"></small>
 </div>
 <div class="form-group">
   <label>Ngày sử dụng</label>
   <input type="date" class="form-control" id="ngaysd" name="ngaysd">
   <small id="ngaysd1"></small>
 </div>
 <div class="form-group">
   <label >Giờ sử dụng</label>
   <input type="time" class="form-control" id="giosd" name="giosd">
   <small id="giosd1"></small>
 </div>
 <div class="form-group">
   <label >Số lượng</label>
   <input type="text" class="form-control" id="soluong" name="soluong">
   <small id="soluong1"></small>
 </div>

 <button type="submit" class="btn btn-primary">Submit</button>
</form>		
</div>
<%@include file="footer.jsp" %>