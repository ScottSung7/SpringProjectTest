package com.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.MemberDTO;
import com.dto.MenuDTO;
import com.dto.RestaurantDTO;
import com.service.MemberService;
import com.service.MenuService;
import com.service.RestaurantService;

@Controller
public class MainController {

	@Autowired
	MenuService service;

	@Autowired
	RestaurantService service2;


	@RequestMapping(value = "/loginCheck/Search")
	public String search(@RequestParam("search") String search, Model model) {

	      System.out.println(search);
	      
	      //menu검색
	      List<MenuDTO> mList = service.menuSearch(search);
	      for (MenuDTO menuDTO : mList) {
	         System.out.println(menuDTO);
	      }
	      String mMesg = null;
	      if (mList.size()==0) {
	         mMesg = "검색결과가 없습니다. 다시 검색하시려면 버튼을 클릭해주세요.";
	      } else {
	         mMesg = "이런 메뉴를 찾으시나요?";
	      }
	      model.addAttribute("mList", mList);
	      model.addAttribute("mMesg", mMesg);
	      System.out.println("\n");
	      
	      //restaurant검색
	      List<RestaurantDTO> rList = service2.resSearch(search);
	      for (RestaurantDTO rDTO : rList) {
	         System.out.println(rDTO);
	      }
	      String rMesg = null;
	      if (rList.size()==0) {
	         rMesg = "검색결과가 없습니다. 다시 검색하시려면 버튼을 클릭해주세요.";
	      } else {
	         rMesg = "이런 맛집을  찾으시나요?";
	      }
	      model.addAttribute("rList", rList);
	      model.addAttribute("rMesg", rMesg);
	  
		return "searchResult";
	} //end search

} 
