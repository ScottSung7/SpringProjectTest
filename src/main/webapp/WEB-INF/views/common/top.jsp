<%@page import="com.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- 로그인을 해야 top이나옴 -->
    
    <%MemberDTO login = (MemberDTO)session.getAttribute("login"); 
    if(login != null)
    { %> 
<div style="position: absolute; top:10px; left: 90%;">
 <a href="LogoutServlet">로그아웃</a>
 </div>
  <div style="position: absolute; top:10px; left: 85%;">
<a href="MyPageServlet">mypage</a>
</div>
  <div style="position: absolute; top:10px; left: 80%;">
<a href="menuGameServlet">취향조사</a>
</div>
  <div style="position: absolute; top:30px; left: 80%;">
<a href="MenuResultServlet">결과보기</a>
</div>



<div style="position: absolute; top: 25px; right: 70%;">
	<form action="loginCheck/Search" method="get" class="search_form">
		<div class="search_box">
			<input class="search" type="text" name="search" placeholder="지역, 메뉴로 검색"> 
			<button class="searchBtn" type="submit">검색</button>
		</div>
	</form>
</div>


<%} else{%>
<%} %>
