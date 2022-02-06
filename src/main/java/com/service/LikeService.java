package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.LikeDAO;
import com.dao.MemberDAO;
import com.dto.LikeDTO;
@Service
public class LikeService {
	@Autowired
	LikeDAO dao;

	public String getGenre(String userid) {
		String genre = dao.getGenre(userid);
		return genre;
	}

	public String getestyle(String userid) {
		// TODO Auto-generated method stub
		String estyle= dao.getestyle(userid);
		return estyle;
	}

	public String gettexture(String userid) {
		// TODO Auto-generated method stub
		String texture = dao.gettexture(userid);
		return texture;
	}

	public String gettaste(String userid) {
		// TODO Auto-generated method stub
		String taste= dao.gettaste(userid);
		return taste;
	}

	public String getsauce(String userid) {
		// TODO Auto-generated method stub
		String sauce = dao.getsauce(userid);
		return sauce;
	}

	public String getspice(String userid) {
		// TODO Auto-generated method stub
		String spice = dao.getspice(userid);
		return spice;
	}

	public String getcarbo(String userid) {
		// TODO Auto-generated method stub
		String carbo = dao.getcarbo(userid);
		return carbo;
	}

	public String getmeat(String userid) {
		// TODO Auto-generated method stub
		String meat = dao.getmeat(userid);
		return meat;
	}

	public String getfat(String userid) {
		// TODO Auto-generated method stub
		String fat = dao.getfat(userid);
		return fat;
	}

	public String getvegi(String userid) {
		// TODO Auto-generated method stub
		String vegi = dao.getvegi(userid);
		return vegi;
	}
	
	
	
	public List<String> getMenuR1(LikeDTO menuR1) {
		List<String> list = dao.getMenuR1(menuR1); 
		return list;
	}

	public List<String> getMenuR9AG(LikeDTO menuR9AG) {
		List<String> list = dao.getMenuR9AG(menuR9AG); 
		return list;
	}

	public List<String> menuR10A(String genre) {
		List<String> list = dao.menuR10A(genre); 
		return list;
	}
	
	
	
	
	
	
//	
////취향을 선택하는 함수
//	public int insertSelect(LikeDTO like) {
//		SqlSession session = MySqlSessionFactory.getSession();
//		  int n = 0;
//		  try {
//			  LikeDAO dao = new LikeDAO();
//			  n = dao.insertSelect(session, like);
//			  session.commit();
//		  }finally {
//			session.close();
//		}
//		  return n;
//	}
//// 취향선택함수 끝
//	public int createResultTable(String userid) {
//		SqlSession session = MySqlSessionFactory.getSession();
//		int n = 0;
//		try {
//			 LikeDAO dao = new LikeDAO();
//			 n = dao.createResultTable(session, userid);
//			 session.commit();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			session.close();
//		}
//		System.out.println(n);
//		return n;
//	}
//	
//	
//
//	// 최빈값들을 가져오는 함수들입니다
//	
//	public String getGenre(String userid) {
//		SqlSession session = MySqlSessionFactory.getSession();
//		String a = null;
//		try {
//			 LikeDAO dao = new LikeDAO();
//			 a = dao.getGenre(session, userid);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			session.close();
//		}
//		return a;
//	}
//
//	public String getestyle(String userid) {
//		SqlSession session = MySqlSessionFactory.getSession();
//		String a = null;
//		try {
//			 LikeDAO dao = new LikeDAO();
//			 a = dao.getestyle(session, userid);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			session.close();
//		}
//		return a;
//	}
//
//	public String gettexture(String userid) {
//		SqlSession session = MySqlSessionFactory.getSession();
//		String a = null;
//		try {
//			 LikeDAO dao = new LikeDAO();
//			 a = dao.gettexture(session, userid);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			session.close();
//		}
//		return a;
//	}
//
//	public String gettaste(String userid) {
//		SqlSession session = MySqlSessionFactory.getSession();
//		String a = null;
//		try {
//			 LikeDAO dao = new LikeDAO();
//			 a = dao.gettaste(session, userid);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			session.close();
//		}
//		return a;
//	}
//
//	public String getsauce(String userid) {
//		SqlSession session = MySqlSessionFactory.getSession();
//		String a = null;
//		try {
//			 LikeDAO dao = new LikeDAO();
//			 a = dao.getsauce(session, userid);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			session.close();
//		}
//		return a;
//	}
//
//	public String getspice(String userid) {
//		SqlSession session = MySqlSessionFactory.getSession();
//		String a = null;
//		try {
//			 LikeDAO dao = new LikeDAO();
//			 a = dao.getspice(session, userid);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			session.close();
//		}
//		return a;
//	}
//
//	public String getcarbo(String userid) {
//		SqlSession session = MySqlSessionFactory.getSession();
//		String a = null;
//		try {
//			 LikeDAO dao = new LikeDAO();
//			 a = dao.getcarbo(session, userid);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			session.close();
//		}
//		return a;
//	}
//
//	public String getmeat(String userid) {
//		SqlSession session = MySqlSessionFactory.getSession();
//		String a = null;
//		try {
//			 LikeDAO dao = new LikeDAO();
//			 a = dao.getmeat(session, userid);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			session.close();
//		}
//		return a;
//	}
//
//	public String getfat(String userid) {
//		SqlSession session = MySqlSessionFactory.getSession();
//		String a = null;
//		try {
//			 LikeDAO dao = new LikeDAO();
//			 a = dao.getfat(session, userid);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			session.close();
//		}
//		return a;
//	}
//
//	public String getvegi(String userid) {
//		SqlSession session = MySqlSessionFactory.getSession();
//		String a = null;
//		try {
//			 LikeDAO dao = new LikeDAO();
//			 a = dao.getvegi(session, userid);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			session.close();
//		}
//		return a;
//	}
//	
//	//메뉴를 추천하는 함수들입니다
//	
//	public List<String> getMenuR1(LikeDTO menuR1) {
//		SqlSession session = MySqlSessionFactory.getSession();
//		List<String> a = null;
//		try {
//			 LikeDAO dao = new LikeDAO();
//			 a = dao.getMenuR1(session, menuR1);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			session.close();
//		}
//		return a;
//	}
//
//	public List<String> getMenuR9AG(LikeDTO menuR9AG) {
//		SqlSession session = MySqlSessionFactory.getSession();
//		List<String> a = null;
//		try {
//			 LikeDAO dao = new LikeDAO();
//			 a = dao.getMenuR9AG(session, menuR9AG);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			session.close();
//		}
//		return a;
//	}
//
//	public List<String> menuR10A(String genre) {
//		SqlSession session = MySqlSessionFactory.getSession();
//		List<String> a = null;
//		try {
//			 LikeDAO dao = new LikeDAO();
//			 a = dao.menuR10A(session, genre);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			session.close();
//		}
//		return a;
//	}
//	
	
}
