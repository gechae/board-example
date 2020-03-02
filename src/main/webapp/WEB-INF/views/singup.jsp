<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/table.css">
<link rel="stylesheet" type="text/css" href="resources/css/textarea.css">
<script src="/resources/js/clieckEvent.js"></script>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form id="contextForm" name="contextForm" action="writeDB" onSubmit="submitClickEvent(); return false">		
			<div class="table">
				<div class="table-row-group">
					<div class = " table-cell content textbox">
						<label>제목 : </label>
					</div>
					<div class = " table-cell textbox">
						<input type="text" id="title" name="title"  value="${param.title}">						
					</div>
				</div>
				<div class="table-row-group">
					<div class = " table-cell content textbox">
						<label >닉네임 : </label>
					</div>
					<div class = " table-cell textbox">
						<input type="text" id="nicname" name="nicname" value="${param.nicname}">
					</div>
				</div>
			</div>
			<div class="table">
					<textarea rows=30% cols=100% id="context" name="context" style="width:100%" >${param.context}</textarea>
			</div>
			<div class="toolbar">
				<input type="submit" value="등록">
			</div>
		</form>
	</div>
</body>
</html>