<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.narrowWidth1 {
   	 	width: 35%;
	}
	.inputline1 {
		border: none;
		outline: 0;
		width: 35%;
	}
	td, th {
    padding: 10px 20px;
   	}
	#idBtn {
		margin-top: 30px;
	}
</style>
</head>
<body>
<div class="container narrowWidth1"  align="center">
	<h2 class="title">로그인</h2>
	<form action="login.do" method="post">
		<table class="table ">  
			<tr>
				<td class="col md-2 text-center">이메일</td>
				<td class="col md-10">
					<input type="text" name="MB_id" required="required" 
							autofocus="autofocus" placeholder="이메일" class="inputline1">
			</td>
			<tr>
				<td class="col md-2 text-center">비밀번호</td>
				<td class="col md-10">
					<input type="password" name="MB_pw" required="required" 
					       placeholder="비밀번호" class="inputline1"></td>
			<tr>
			<tr>
				<td colspan="2" class="text-center">
					<input type="submit" value="로그인" class="btn_sm_full" id="idBtn">
				</td>
			</tr>
		</table>
		<a href="findIdForm.do">아이디 찾기</a>&nbsp; |      
		<a href="findPwForm.do">비밀번호 찾기</a>&nbsp;
	</form>
</div>  
</body>
</html>