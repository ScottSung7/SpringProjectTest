<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="com.dto.RestaurantDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.MenuDAO"%>
<%@page import="com.dto.MenuDTO"%>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	$(".reSearch").on("click", function() {
		 window.location.href='main.jsp'
	})
})
</script>
<%
	List<MenuDTO> mList = (List<MenuDTO>) request.getAttribute("mList");
	List<RestaurantDTO> rList = (List<RestaurantDTO>) request.getAttribute("rList");
	System.out.println(mList.size());
	System.out.println(rList.size());	
%>

<br><br>
<%if(rList.size()==0 && mList.size()==0){ %>
<h3> 검색결과가 없습니다. 다시 검색하시려면 버튼을 클릭해주세요
<button class="reSearch">다시검색하러가기</button>
</h3>

<%} else{ %><!-- 두 리스트중 한 개만 데이터가 있는 경우 -->

<!-- Restaurant관한 정보 searchResult result출력 -->
<!-- 레스토랑검색결과가 없는 경우 다시 검색하는 메뉴 출력 -->
<%if(rList.size()==0) {%>
<h3>맛집에 대한 검색결과가 없습니다. 다시 검색하시려면 버튼을 클릭해주세요
<button class="reSearch">다시검색하러가기</button></h3>
<%} else { %>
<h3>이런 맛집을 찾으시나요?</h3>
<div>
	<table>
	<tr>
	<%
	int i = 0;
	for(RestaurantDTO dto : rList){
	//dto 정보 변수선언
 	String rRestaurant = dto.getRestaurant();
	String rPhone1 = dto.getPhone1();
	String rPhone2 = dto.getPhone2();
	String rAddr1 = dto.getAddr1();
	String rAddr2 = dto.getAddr2();
	String rImage = dto.getImage();
	i += 1;

%>
		<td>
			<table>
				<tr>
					<td align="center">
						<a href = "?restaurant=<%=rRestaurant%>"><!-- 이미지 클릭시 상세페이지로 이동 -->
							<div class="scale"><img src = "images/resImages/<%=rImage%>.jpg" width="200" height="300" class="image">
							</div>
						</a>
					</td>
					<td width="15"><!-- 검색결과별 폭 조정 -->
					</td>
				</tr>
				<tr>
					<td align="center">
						<a class = "aReview" href = "?restaurant=<%=rRestaurant%>"><%=rRestaurant %></a><!-- 상세페이지로 이동 -->
					</td>
				</tr>
			</table>
		</td>
		<%
			if(i%5==0){ //메뉴를 5개 보여주면 줄을 바꿈
		%>
		<tr>
			<td height="10">
		</tr>
		<%
			}//end if
		%>
<%
}//end for
%>
		</tr>
	</table>
</div>
<%} %><!-- if-else문 종료 -->



<br>
<%if(mList.size()==0) {%>
<h3>메뉴에 대한 검색결과가 없습니다. 다시 검색하시려면 버튼을 클릭해주세요
<button class="reSearch">다시검색하러가기</button></h3>
<%} else { %>
<h3>이런 메뉴를 찾으시나요?</h3>
<!-- menu에 관한 정보 searchResult result출력 -->
<div>
	<table>
	<tr>
	<%
	int j = 0;
	for(MenuDTO dto : mList){
	//dto 정보 변수선언
 	String menuRestaurant = dto.getRestaurant();
	String menuMenu = dto.getMenu();
	String menuGenre = dto.getGenre();
	String menuEstyle = dto.getEstyle();
	String menuTexture = dto.getTexture();
	String menuTaste = dto.getTaste();
	String menuSauce = dto.getSauce();
	String menuSpice = dto.getSpice();
	String menuCarbo = dto.getCarbo();
	String menuMeat = dto.getMeat();
	String menuFat = dto.getFat();
	String menuVegi = dto.getVegi();
	String menuImage = dto.getImage();
	j += 1;
		
	
%>
<!-- 지금은 메뉴명이 중복되지 않아서 특정 메뉴는 특정 레스토랑 db에만 있음
메뉴클릭시 레스토랑상세페이지..? -->
		<td>
			<table >
				<tr>
					<td align="center">
						<a href = "?restaurant=<%=menuMenu%>"><!-- 이미지 클릭시 상세페이지로 이동 -->
							<div class="scale"><img src = "images/menuImages/<%=menuImage%>.jpg" width="200" height="300" class="image">
							</div>
						</a>
					</td>
					<td width="15"><!-- 검색결과별 폭 조정 -->
					</td>
				</tr>
				<tr>
					<td align="center">
						<a class = "aReview" href = "?restaurant=<%=menuMenu%>"><%=menuMenu %></a><!-- 상세페이지로 이동 -->
					</td>
				</tr>
			</table>
		</td>
		<%
			if(j%5==0){ //메뉴를 5개 보여주면 줄을 바꿈
		%>
		<tr>
			<td height="10">
		</tr>
		<%
			}//end if
		%>
<%
}//end for
%>
		</tr>
	</table>
</div>
<%} %><!-- if-else문 종료 -->
<%} %><!-- if-else문 종료 -->