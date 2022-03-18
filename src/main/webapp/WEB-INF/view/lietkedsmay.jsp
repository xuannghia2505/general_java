<%@include file="taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="container">
        <form action="">
            <div class="input-group mb-3">
                <input type="text" class="search-custom" placeholder="Nhap thong tin may" >
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
                <tr>
                    <td>M0001</td>
                    <td>1</td>
                    <td>Đang sử dụng</td>
                    <td>
                        <span>
                            <i class="fa fa-edit"></i>
                            <i class="fa fa-trash"></i>
                        </span>
                    </td>
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
  
    </div>	
<%@include file="footer.jsp" %>