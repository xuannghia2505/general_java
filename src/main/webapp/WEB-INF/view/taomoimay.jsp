<%@include file="taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="container">
<div id="success" class="alert-success"><c:out value="${message}"></c:out></div>
<form action="taomoimay" method="post" onsubmit="return validateForm();" >
  <div class="form-group">
    <label>Mã máy</label>
    <input type="text" class="form-control" id="mamay" name="mamay">
    <small id="mamay1"></small>
  </div>
  <div class="form-group">
    <label>Vị trí</label>
    <input type="text" class="form-control" id="vitri" name="vitri">
    <small id="vitri1"></small>
  </div>
  <div class="form-group">
    <label>Trạng thái</label>
    <input type="text" class="form-control" id="trangthai" name="trangthai">
    <small id="trangthai1"></small>
  </div>

  <button type="submit" class="btn btn-primary" >Submit</button>
</form>
</div>
<%@include file="footer.jsp" %>
	
