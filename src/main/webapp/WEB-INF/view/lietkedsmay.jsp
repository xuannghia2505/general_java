<%@include file="taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="container">
        <form action="lietkedsmay" method="get">
            <div class="input-group mb-3">
                <input type="text" class="search-custom" placeholder="Nhap thong tin may" name="key" value="${key}">
                <div class="input-group-append">
                  <button class="btn btn-outline-secondary" type="submit">Tìm kiếm</button>
                </div>
            </div>
        </form>
        <table class="table table-bordered"> 
            <thead>
                <tr>
                    <th>Mã máy</th>
                    <th>Vị trí</th>
                    <th>Trạng thái</th>
                    <th>Thao tác</th>
                </tr>
                
            </thead>
            <tbody>
            <c:forEach items="${listMay}" var="may">
                <tr>
                    <td>${may.mamay }</td>
                    <td>${may.vitri }</td>
                    <td>${may.trangthai }</td>
                    <td>
                        <span>
                            <i class="fa fa-edit"></i>
                            <i class="fa fa-trash"></i>
                        </span>
                    </td>
                </tr>
             </c:forEach>   
            </tbody>
        </table>
        <div class="mx-auto" style="width: 250px;">
            <ul class="pagination" style="width: 100%;">
              <li class="page-item"><a class="page-link" href="lietkedsmay?message=pre&key=${key}">Previous</a></li>
              <c:forEach var="i" begin="1" end="${soPage }">
              <li class="page-item"><a class="page-link" href="lietkedsmay?page=${i}&key=${key}"><c:out value="${i}"></c:out></a></li>
              </c:forEach>
              <li class="page-item"><a class="page-link" href="lietkedsmay?message=next&key=${key}">Next</a></li>
            </ul>
          </div>
  
    </div>	
<%@include file="footer.jsp" %>