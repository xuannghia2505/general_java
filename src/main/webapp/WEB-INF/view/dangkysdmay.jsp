<%@include file="taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="container">
<div id="success" class="alert-success"><c:out value="${message}"></c:out></div>
<form action="dangkysdmay" method="post" onsubmit="return validateForm();">
 <div class="form-group">
   <label >Mã khách hàng</label>
   <input type="text" class="form-control"  id="makh" name="makh" >
   <small id="makh1"></small>
 </div>
 <div class="form-group">
   <label >Mã máy</label>
   <input type="text" class="form-control" id="mamay" name="mamay">
   <small id="mamay1"></small>
 </div>
 <div class="form-group">
   <label>Ngày bắt đầu sử dụng</label>
   <input type="date" class="form-control" id="ngaysd" name="ngaysd" >
   <small id="ngaysd1"></small>
 </div>
 <div class="form-group">
   <label >Giờ bắt đầu sử dụng</label>
   <input type="time" class="form-control" id="giosd" name="giosd">
   <small id="giosd1"></small>
 </div>
 <div class="form-group">
   <label >Thời gian sử dụng</label>
   <input type="text" class="form-control" id="thoigiansd" name="thoigiansd">
   <small id="thoigiansd1"></small>
 </div>

 <button type="submit" class="btn btn-primary">Submit</button>
</form>	
</div>	
<%@include file="footer.jsp" %>