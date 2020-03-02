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
	<div >
		<form id="contextForm" name="contextForm" action="userDB" onSubmit="submitClickEvent(); return false">		
			<div class="table">
				<div class="table-row-group">
					<div class = " table-cell  textbox content">
						<label>이메일 : </label>
					</div>
					<div class = " table-cell textbox ">
						<input type="email" id="email" name="email" >						
					</div>
				</div>
				<div class="table-row-group">
					<div class = " table-cell  textbox content">
						<label >패스워드 : </label>
					</div>
					<div class = " table-cell textbox">
						<input type="password" id="nicname" name="nicname" >
					</div>
				</div>
			</div>
			<div class="toolbar">
				<input type="submit" value="로그인">
				<input type="button" value="회원가입" onclick="javascript:location.href='singin'">
			</div>
			<div class="toolbar">
				<input type="button" value="패스워드찾기" onclick="javascript:location.href='searchPW'">
			</div>
		</form>
	</div>
</body>
</html>