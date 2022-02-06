<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/menuGame.css"> 

</head>
<body>
    <header>
    <jsp:include page="common/top.jsp" flush="false"></jsp:include>
    </header>
    <hr style="display:block; border:black 0 none; border-top: 2px solid; height:10px">
    <div class="main">
    <jsp:include page="menu/menuGame.jsp" flush="false"></jsp:include>  
    </div>
    <div id="sidebar"></div>
   
</body>
</html>