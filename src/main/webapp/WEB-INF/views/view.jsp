<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("UTF-8");
%>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet" type="text/css" href="resources/css/table.css">
<link rel="stylesheet" type="text/css" href="resources/css/textarea.css">
<script src="/resources/js/clieckEvent.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div>
		<div class="table">
			<div class="table-row-group">
				<div class = "table-cell content">제목 : ${board.board_title}</div>
			</div>	
			<div class="table-row-group">
				<div class = "table-cell content">작성자 : ${board.board_un}</div>
			</div>				
		</div>
		<form id="frm" action="/write">
			<div class="textarea" style="width:100%">
					<textarea rows=30% cols=100% name="context" style="width:100%" readonly onfocus="this.blur();">${board.board_contexts}</textarea>
			</div>
			<div class="toolbar">				
				<input type="hidden" name="title" value="${board.board_title}">
				<input type="hidden" name="nicname" value="${board.board_un}">
				<input type="hidden" name="views" value="${board.board_views}">
				
				<input type="submit" value="수정" >
				<input type="submit" value="삭제" formaction=/delete >			
			</div>
		</form>
	</div>
</body>
</html>