<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.dto.MemberDTO"%>
<%@page import="com.dto.MenuDTO"%>

<%@page import="java.util.List"%>
<%@page import="com.service.MenuService"%>

<%
	MemberDTO dto = (MemberDTO)session.getAttribute("login");
	//1. menuR에 고객취향테이블에서 받아온 데이터로 menu테이블에서 select한 메뉴들이 들어있습니다.
	//2. 이것이 null일때는 menuFinal에 준비중으로 담기게 했습니다.
	if(dto != null){
		String username = dto.getUsername();		
		List <String> menuR = (List<String>)request.getAttribute("menuR");
		
		System.out.println("check");
		System.out.println(menuR==null);
		
		System.out.println("selected: "+ menuR);	
		String menuFinal = null;
		String menuImage = null;		
		if(menuR==null){ 
			 menuFinal = "준비 중";	}
		else if(menuR!=null){
	//3. 결과버튼을 눌러서 값이 생성되면 menuR의 배열중 첫번째것을 선택하여 menuFinal변수에 담습니다.
	//4. 아래 출력페이지에서 menuFinal변수에 담긴 메뉴를 추천해 주게 됩니다. 
	// 	 이때 결과 버튼을 다시 누르면 list에 담긴 메뉴가 여러개면 랜덤하게 MenuSelect 서블릿에서 받아오기 때문에 그중 하나를 바꿔가며 추천해줍니다.
				String menu = menuR.get(0);
				menuFinal = menu;
//				MenuService service = new MenuService();	
//				menuImage = service.getMenuImage(menuFinal); 
			}
			
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나의 맛슐랭. 틀린 입맛은 없어</title>
</head>
<body>
<div class="image">
<h1><%= username %>님께 추천드리는 메뉴는 <%= menuFinal %>입니다</h1>
<br>
<img src="images/menuImages/<%= menuImage %>.jpg" align = "center" width = "300" height = "400"><br><br>
</div>
<center>
	 <div class="button-3" >
    <div class="eff-2"></div>
    <a href="menuGameServlet">취향 선택 Go!</a>
 	 </div>
	 <div class="button-1" >
    <div class="eff-1"></div>
    <a href="MenuResultServlet">결과 더보기</a>
  </div>
 <div class="button-2" >
    <div class="eff-2"></div>
    <a href="main.jsp"> 돌아가기</a>
  </div><br>
  </center>

<%} %>

</body>
</html>