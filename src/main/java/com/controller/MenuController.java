package com.controller;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LikeDTO;
import com.dto.MemberDTO;
import com.dto.RestaurantDTO;
import com.service.LikeService;
import com.service.MemberService;
import com.service.MenuService;
import com.service.RestaurantService;

@Controller
public class MenuController {

	@Autowired
	MenuService service;
	
	@Autowired
	LikeService service2;
	
	
	@RequestMapping(value = "/loginCheck/menuGame")
	public String login(HttpSession session, Model model) {
		// 1. 세션을 통한 로그인 처리입니다.
		System.out.println("loginCheck/menuGameloginCheck/menuGameloginCheck\n\n");
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		String nextPage = null;
		if (dto != null) {
			// 2. 로그인이 된 경우 image라는 String을 하나 생성합니다.
			String image = "image";

			// 3. image는 컬럼이름입니다.
			// -1. image 컬럼은 food유저의 menu테이블의 컬럼이름중 하나이고
			// menu테이블에는 레스토랑이름, 메뉴이름등등의 컬럼이 존재하고
			// 그중에서 image 컬럼은 이미지의 이름들을 가지고 있습니다.
			// -2. image라는 컬럼 이름을 통해 menuList라는 함수를 호출합니다.
			// menuList 함수는 List<String>에 menu테이블에서
			// 모든 image이름들을 가지고 옵니다.
			List<String> list = service.menuList(image);
			List<String> list2 = service.menuList(image);

			// 4. 두가지 이미지를 띄우기 위해 같은 배열을 가지는 두개의 list를 생성합니다.
			// list 와 list2는 이름만 다르지 같은 내용의 배열을 가지고 있습니다.

			Collections.shuffle(list);
			Collections.shuffle(list2);
			// 5. Collections.shuffle 함수를 이용하여 배열을 램덤으로 생성되게 합니다.
			// 이제 list와 list2는 다른 배열을 가지고 있습니다.

			System.out.println("Game서블릿" + list);
			System.out.println(list2);
			for (int i = 0; i < list.size(); i++) {
				System.out.println("list" + list.get(i));
			}
			for (int i = 0; i < list2.size(); i++) {
				System.out.println("list2" + list2.get(i));
			}
			// 다른 배열을 가지고 있음을 list와 for문을 통해 체크합니다.

			String a = list.get(0);
			String b = list2.get(0);
			System.out.println("선택" + a);
			System.out.println(b);
			while (a.equals(b)) {
				Collections.shuffle(list);
				Collections.shuffle(list2);
			}

			// 6. 이 두개의 리스트를 request하여 menuGame.jsp로 포워드하여 넘길것 입니다.
			// else부분은 비로그인시 로그인을 요청하여 cover.jsp로 다시 되돌아가게 합니다.
			model.addAttribute("list", list);
			model.addAttribute("list2", list2);

			nextPage = "menuGame";
		} else {
			nextPage = "cover.jsp"; // 추후수정 필요 @@@
			model.addAttribute("mesg", "로그인이 필요한 작업입니다.");
		}

		return nextPage;
	} // end

	@RequestMapping(value = "/loginCheck/MenuResult")
	public String MenuResult(HttpSession session, Model model) {
		System.out.println("\n\n\n\n\nMenuResultServletMenuResultServlet\n\n\n\n");
		// 1. 세션을 통한 로그인 처리
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		String nextPage = null;

		// 2.Userid를 세션에서 가져옵니다.
		String userid = dto.getUserid();

		// 3. Userid를 이용해 통해 유저의 고객취향테이블에 접속하여
		// 각각의 값의 최빈값을 가져옵니다.
		// int result = service.createResultTable(userid);
		String genre = service2.getGenre(userid);
		String estyle = service2.getestyle(userid);
		String texture = service2.gettexture(userid);
		String taste = service2.gettaste(userid);
		String sauce = service2.getsauce(userid);
		String spice = service2.getspice(userid);
		String carbo = service2.getcarbo(userid);
		String meat = service2.getmeat(userid);
		String fat = service2.getfat(userid);
		String vegi = service2.getvegi(userid);

		// 4. 뽑아온 데이터를 LikeDTO에 저장합니다.
		// 총 55가지종류의 데이터를 저장하는 LikeDTO와 함수가 있을 예정입니다.
		// 컬럼이 10개라 가지수가 55개 입니다.
		// (10+9+8+7+6+5+4+3+2+1) = 55

		// 5. 컬럼 10개중 10개 일치, 9개일치 순으로 뽑아옵니다.
		// 일단 테스트용으로 3개를 만들었는데 총 55개의 함수를 제작 예정입니다.
		// menuR1: 10개 모두 일치
		// menuR9AG: 2개 일치 (genre, carbo)
		// menu10A: 1개일치 (genre)
		LikeDTO none = new LikeDTO();
		LikeDTO menuR1 = new LikeDTO(genre, estyle, texture, taste, sauce, spice, carbo, meat, fat, vegi);
		LikeDTO menuR9AG = new LikeDTO(genre, carbo);
		System.out.println(menuR9AG);

		// 뒤에 Z자를 붙여서 값을 받아올 list를 생성했습니다.
		// 일치하는 메뉴가 여러종류가 있을 수 있기에 List<String>으로 결과를 받습니다.
		if (genre == null) {
			System.out.println("if");
			model.addAttribute("menuR", null);

		}
		if (genre != null) {
			List<String> menuR1Z = service2.getMenuR1(menuR1);
			List<String> menuR9AGZ = service2.getMenuR9AG(menuR9AG);
			List<String> menuR10AZ = service2.menuR10A(genre);

			// 일단 10개일치 부터 확인합니다.
			if (menuR1Z.size() != 0) {
				System.out.println("R1F" + menuR1Z);
				Collections.shuffle(menuR1Z);
				model.addAttribute("menuR", menuR1Z);

				// 10개 일치하는 메뉴가 없으면 2개일치하는 값이 있는지 확인합니다.
			} else if (menuR1Z.size() == 0 && menuR9AGZ.size() != 0) {
				System.out.println("menuR9AG서블릿" + menuR9AGZ);
				Collections.shuffle(menuR9AGZ);
				model.addAttribute("menuR", menuR9AGZ);

				// 2개 일치하는 값이 없으면 1개 일치하는 값이 있는지 확인합니다.
				// 일치하는 값이 있는순간 forward해서 main.jsp로 값을 보내줍니다.
				// 보내기 전에 Coolections.shuffle을 이용해 배열을 랜덤하게 생성합니다.
			} else if (menuR9AGZ.size() == 0) {
				System.out.println("menuR10A" + menuR10AZ);
				Collections.shuffle(menuR10AZ);
				model.addAttribute("menuR", menuR10AZ);
			} // 내부if end
		} // 외부if end

		
		

		
		
		
		
		return "menuResult";
	} // end
}