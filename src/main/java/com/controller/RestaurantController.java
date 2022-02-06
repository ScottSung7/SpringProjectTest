package com.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.MemberDTO;
import com.dto.RestaurantDTO;
import com.service.MemberService;
import com.service.RestaurantService;

@Controller
public class RestaurantController {

	@Autowired
	RestaurantService service;

//	@RequestMapping(value = "/loginCheck/resList")
//	public String login(HttpSession session) {
//		List<RestaurantDTO> list = service.resList();
//		session.setAttribute("resList", list);
//		return "resList";
//	}

}
