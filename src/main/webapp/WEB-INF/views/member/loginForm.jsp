<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
<link rel="stylesheet" href="../css/reset.css">
<link rel="stylesheet" href="../css/loginstyle.css">
<%//로그인 정보가 틀렸을 경우 메세지 출력
	String mesg = (String) request.getAttribute("mesg");
	System.out.println(mesg+"loginFormloginForm\n\n\n");
	if(mesg != null){
%>
<script type="text/javascript">
alert("<%=mesg%>");
</script>
<%
	}
%><!-- if end -->

<%//메일 발송을 완료했을 때 
	String mesg2 = (String) request.getAttribute("mesg2");
	if(mesg2 != null){
%>
<script type="text/javascript">
alert("<%=mesg2%>");
</script>
<%
	}
%><!-- if end -->

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
/* $(function() {//id or pw 가 공란일 경우 메세지 발생
	$("form").on("submit", function(event) {
		var userid = $("#userid").val();
		var passwd = $("#passwd").val();	
		if (userid.length == 0) {
			alert("아이디를 입력해 주세요");
			event.preventDefault();
		} else if (passwd.length == 0) {
			alert("비밀번호를 입력해 주세요");			
			event.preventDefault();
		}
	})
})
 */</script>
</head>
<body>
	<div class="wrap">
		<div class="title">Login Form</div>
		<form action="Login" method="post">
			<div class="field">
				<input type="text" required="required" name="userid" id="userid"><!-- 리콰이어때문에 자동으로 공백시 이벤트방지 -->
				<label>ID</label>
			</div>
			<div class="field">
				<input type="password" required="required" name="passwd" id="passwd">
				<label>Password</label>
			</div>
			<div class="pass-link">Forgot <a href="IdSearchUIServlet">ID</a> / <a href="PwSearchUIServlet">password?</a></div>		
			<div class="field">
				<input type="submit" value="login">				 
			</div>
			<div class="signup-link">회원이 아니신가요? <a href="memberForm.jsp">지금 회원가입 하기</a></div>
		</form>
	</div>
	
	<!-- <form action="LoginServlet" method="get">
		<table>
			<tr>
				<td><b>로그인</b></td>
				<td align="right">
				<a href="IdSearchUIServlet">아이디찾기</a>
				<a href="PwSearchUIServlet">비밀번호찾기</a></td>
			</tr>
			<tr>
				<td colspan="2"><input type="text" name="userid" id="userid"
					style="width: 336px" placeholder="아이디를 입력하세요"><br></td>
			</tr>
			<tr>
				<td colspan="2"><input type="text" name="passwd" id="passwd"
					style="width: 336px" placeholder="비밀번호를 입력하세요"><br></td>
			</tr>
			<tr>
				<th>
				</th>
			</tr>
			<tr>
				<th colspan="2"><input type="submit" value="로그인"> <input
					type="reset" value="다시 쓰기"></th>
			</tr>
		</table>
	</form> -->
</body>
</html>