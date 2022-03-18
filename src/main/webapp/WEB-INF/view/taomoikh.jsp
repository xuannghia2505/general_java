<%@include file="taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="container">
<div id="success" class="alert-success"><c:out value="${message}"></c:out></div>
<form action="taomoikh" method="post" onsubmit="return validateForm();" >
 <div class="form-group">
   <label >Mã khách hàng</label>
   <input type="text" class="form-control" id="makh"  name="makh">
   <small id="makh1"></small>
 </div>
 <div class="form-group">
   <label >Tên khách hàng</label>
   <input type="text" class="form-control" id="tenkh" name="tenkh">
   <small id="tenkh1"></small>
 </div>
 <div class="form-group">
   <label >Địa chỉ</label>
   <input type="text" class="form-control" id="diachi" name="diachi">
   <small id="diachi1"></small>
 </div>
 <div class="form-group">
   <label>Số điện thoại</label>
   <input type="text" class="form-control" id="sdt" name="sdt">
   <small id="sdt1"></small>
 </div>
 <div class="form-group">
   <label>Địa chỉ Email</label>
   <input type="email" class="form-control" id="email" name="email">
   <small id="email1"></small>
 </div>

 <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
<%@include file="footer.jsp" %>