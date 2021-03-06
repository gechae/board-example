<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" type="text/css" href="resources/css/table.css">
<script src="/resources/js/clieckEvent.js"></script>
</head>
<body>
	<a href="javascript:location.href='login'">로그인</a>
	<div class="table">
		<div class="table-row-group">
		<div class = "table-cell content"> No</div>
		<div class = "table-cell content"> 제목</div>
		<div class = "table-cell content"> 작성자</div>
		<div class = "table-cell content"> 조회수</div>
		<div class = "table-cell content"> 작성일</div>
		</div>
		<c:forEach items="${listBoard}" var="listBoard" varStatus="status">
			<div class="table-row-group">
				<div class = "table-cell content"> ${status.count}</div>
				<div class = "table-cell "><a href="http://localhost:9000/view?board_un=${listBoard.board_un}" >${listBoard.board_title}</a></div>
				<div class = "table-cell ">${listBoard.board_un}</div>
				<div class = "table-cell ">${listBoard.board_views}</div>
				<div class = "table-cell ">${listBoard.board_create_time}</div>
			</div>
		</c:forEach>
	</div>
	
	<div class="toolbar">
		<input type="button" id="button1" onclick="writeClickEvent();" value="글쓰기">
	</div>
</body>
</html>