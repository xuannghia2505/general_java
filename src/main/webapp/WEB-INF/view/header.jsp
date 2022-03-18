<%@include file="taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<script ><%@include file="/javascript/main.js" %></script>

<title><c:out value="${title}" /></title>
</head>
<style><%@include file="/css/style.css"%></style>
<body class="container-fluid">
<%@include file="navbar.jsp" %>