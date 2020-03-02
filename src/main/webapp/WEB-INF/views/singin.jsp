<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/table.css">
<link rel="stylesheet" type="text/css" href="resources/css/textarea.css">
<script src="/resources/js/clieckEvent.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form id="contextForm" name="contextForm" action="submitUser" method="POST">		
			<div class="table">
				<div class="table-row-group">
					<div class = " table-cell content textbox">
						<label>이메일 : </label>
					</div>
					<div class = " table-cell textbox">
						<input type="email" id="email" name="email">						
					</div>
				</div>
				<div class="table-row-group">
					<div class = " table-cell content textbox">
						<label >닉네임 : </label>
					</div>
					<div class = " table-cell textbox">
						<input type="text" id="nicname" name="nicname">
					</div>
				</div>
				<div class="table-row-group">
					<div class = " table-cell content textbox">
						<label >비밀번호 : </label>
					</div>
					<div class = " table-cell textbox">
						<input type="password" id="password" name="password">
					</div>
				</div>
				<div class="table-row-group">
					<div class = " table-cell content textbox">
						<label >비밀번호 확인: </label>
					</div>
					<div class = " table-cell textbox">
						<input type="password" id="checkPW" name="checkPW">
					</div>
				</div>
			</div>
			<div class="toolbar">
				<input type="submit" value="등록">
			</div>
		</form>
	</div>
</body>
</html>