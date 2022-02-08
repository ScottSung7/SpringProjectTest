<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.dto.MemberDTO"%>
<%@page import="com.dto.MenuDTO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Collections"%>

<%
	//Username을 띄우기 위해 세션에서 유저의 정보를 받아 옵니다.
	MemberDTO dto = (MemberDTO)session.getAttribute("login");
	
	 
	if(dto != null){
		String username = dto.getUsername();		
	
	//1. 이미 menuGameServlet에서 랜덤으로 배열이 되어 있는 list와 list2를 받습니다.
	//Collections.shuffle은 menuGameServlet에 접속할때 마다 랜덤 배열을 섞기 때문에
	//새로고침하거나 다시 페이지로 들어올때마다 이전과 다른 배열이 됩니다. 
	List<String> list = (List<String>)request.getAttribute("list");	
	List<String> list2 = (List<String>)request.getAttribute("list2");	
	System.out.println("Game"+list);
	
	//2. 이중 첫번째 배열만 뽑아 menu1과 menu2 변수로 저장합니다.
	String menu1 = list.get(0);
	String menu2 = list2.get(0);
	System.out.println("\n\nmenu1"+menu1);
	System.out.println("\n\nmenu2"+menu2);
	
	
	%>
	
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript">


</script>
<meta charset="UTF-8">
<title>나의 맛슐랭. 틀린 입맛은 없어</title>
</head>
<body>
<center>
	<h1><%= username %>님의 새로운 단골집을 찾아드립니다.</h1> <br><br>
	<form action="likeAdd" method="get">
		<button type="submit" name="food1" style="border:none;" value="<%=menu1%>"><img src="images/menuImages/<%=menu1%>.jpg" align = "center" width = "300" height = "400"></button>
		VS
		<% System.out.println("\n\nmenu2내부"+ menu2); %>
		<button type="submit" name="food1" style="border:none;" value="<%=menu2%>"><img src="images/menuImages/<%=menu2%>.jpg" align = "center" width = "300" height = "400"></button>
	</form> <br>
	<div id="container">
	 <div class="button-1" >
    <div class="eff-1"></div>
    <a href="MenuResult">결과 페이지로 이동</a>
  </div> <space>
<!-- 	<div class="button-1">
	<button type="button" onclick="location.href='main.jsp'">돌아가기</button> <br>
	</div> -->
	 <div class="button-2" >
    <div class="eff-2"></div>
    <a href="main"> 돌아가기</a>
  </div></div><br>
<!-- 	<div class="button2">	
	<button type="button" onclick="location.href='MenuResultServlet'">결과 페이지로 이동</button>
	<div class="button2"> -->
	</center>
<%} %>

</body>
</html>