package com.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.MemberDAO;
import com.dto.MemberDTO;
@Service
public class MemberService {
	@Autowired
	MemberDAO dao;


	public MemberDTO login(Map<String, String> map) {
		MemberDTO dto = dao.login(map);
		return dto;
	}
	
	
	
	
	
	
//	public MemberService() {
//		dao = new MemberDAO();
//	}
//	
//	public MemberDTO loginCheck(HashMap<String, String> map) {
//		SqlSession session = MySqlSessionFactory.getSession();
//		MemberDTO dto = null;
//		try {
//			 dto = dao.loginCheck(session, map);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			session.close();
//		}
//		return dto;
//	}
//
//	public String idSearch(MemberDTO dto) {
//		SqlSession session = MySqlSessionFactory.getSession();
//		String userid = null;
//		try {
//			userid = dao.idSearch(session, dto);
//		} finally {
//			session.close();
//		}
//		return userid;
//	}
//
//	public String pwSearch(MemberDTO dto) {
//		SqlSession session = MySqlSessionFactory.getSession();
//		String passwd = null;
//		try {
//			passwd = dao.pwSearch(session, dto);
//		} finally {
//			session.close();
//		}
//		return passwd;
//	}
//	public MemberDTO mypage(String userid) {
//		SqlSession session = MySqlSessionFactory.getSession();
//		MemberDTO dto = null;
//	
//		try {
//			dto = dao.mypage(session, userid);
//		}finally{
//			session.close();
//		}
//		return dto;
//	}
//
//	public int memberUpdate(MemberDTO dto2) {
//		SqlSession session = MySqlSessionFactory.getSession();
//		int n = 0;
//		try {
//			n=dao.memberUpdate(session,dto2);
//			session.commit();
//		}finally {
//			session.close();
//		}
//		return n;
//	}
//	
//	public int insert(MemberDTO dto) {
//		 SqlSession session = MySqlSessionFactory.getSession();
//		  int n = 0;
//		  try {
//			  MemberDAO dao = new MemberDAO();
//			  n = dao.insert(session, dto);
//			  session.commit();
//		  }finally {
//			session.close();
//		}
//		  return n;
//	}
//	
//	public int duplicateIdCheck(String userid) {
//		
//		SqlSession session = MySqlSessionFactory.getSession();
//		int result = 0; 
//		try {
//			result = dao.duplicateIdCheck(session, userid);
//		} finally {
//			session.close();
//		}
//		return result;
//		
//	}
//	
//	
//		public int duplicateEmailCheck(HashMap<String, String> map) {
//			
//			SqlSession session = MySqlSessionFactory.getSession();
//			int result = 0; 
//			try {
//				result = dao.duplicateEmailCheck(session, map);
//			} finally {
//				session.close();
//			}
//			return result;
//			
//		}
}
