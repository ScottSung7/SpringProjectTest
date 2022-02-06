<%@page import="com.dto.RestaurantDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- <table width="100%" cellspacing="500" cellpadding="0">

	<tr>
		<td> -->
			<table align="center" width="710"  height="0" cellspacing="0" cellpadding="0"
				border="0">
				
				<tr>
					<td height="5"></td>
				</tr>
				<!-- <tr>
					<td height="1000" colspan="8" bgcolor="CECECE"></td>
				</tr> -->
				<tr>
					<td height="10"></td>
				</tr>

				<tr>				

 
  <%
 List<RestaurantDTO> list = (List<RestaurantDTO>)session.getAttribute("resList");
  System.out.println("resList.jsp@@@:::"+list);
 for(int i=1;i<=20;i++){
	 RestaurantDTO dto = list.get(i-1);
 	String restaurant = dto.getRestaurant();
 	String Image = dto.getImage();
 	String addr2=dto.getAddr2();
 	
 	
 %>
						<td>
							<table style='padding:15px'>
								<tr>
									<td>
										<%-- <a href="GoodsRetrieveServlet?gCode=<%=gCode %>"><!-- 이미지링크 -->  --%>
											<img src="images/resImages/<%=Image %>.jpg" border="0" align="center" width="200">
									<!-- 	</a> -->
									</td>
								</tr>
								<tr>
								
									<td height="10">
								</tr>
								<tr>
									<td  align ="center">
										 <a class= "a_black" href="#"> 
										<%= restaurant%><br>
										</a>
										<font color="gray">
										 --------------------
										</font>
									</td>
									
								</tr>
								<tr>
									<td height="10">
								</tr>
								<tr>
									<td  align ="center">
									<%-- 	<%= addr2%> --%>
									</td>
								</tr>
								<tr>
									<td height="10">
								</tr>
								<tr>
									<td class="td_red" align ="center"><font color="red"><strong>
									<%-- <%= addr2%> --%>	</strong></font></td>
								</tr>
							</table>
						</td>
					<!-- 한줄에 4개씩 보여주기 -->	
				   <%
				      if(i%4==0){
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
			</table>

	<tr>
		<td height="10">
	</tr>