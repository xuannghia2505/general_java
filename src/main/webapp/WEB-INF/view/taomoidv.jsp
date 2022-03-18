<%@include file="taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="container">
<form onsubmit="return validateForm();">
 <div class="form-group">
   <label >Mã dịch vụ</label>
   <input type="text" class="form-control" id="madv">
   <small id="madv1"></small>
 </div>
 <div class="form-group">
   <label >Tên dịch vụ</label>
   <input type="text" class="form-control" id="tendv">
   <small id="tendv1"></small>
 </div>
 <div class="form-group">
   <label >Đơn vị tính</label>
   <input type="text" class="form-control" id="donvitinh">
   <small id="donvitinh1"></small>
 </div>
 <div class="form-group">
   <label >Đơn giá</label>
   <input type="text" class="form-control" id="dongia" >
   <small id="dongia1"></small>
 </div>

 <button type="submit" class="btn btn-primary">Submit</button>
</form>	
</div>
<%@include file="footer.jsp" %>