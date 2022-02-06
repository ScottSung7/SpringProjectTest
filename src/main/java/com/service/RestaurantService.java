package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MenuDAO;
import com.dao.RestaurantDAO;
import com.dto.MenuDTO;
import com.dto.RestaurantDTO;
@Service
public class RestaurantService {
	@Autowired
	RestaurantDAO dao;

	public List<RestaurantDTO> resList() {
		List<RestaurantDTO> list = dao.resList();
		return list;
	}

	public List<RestaurantDTO> resSearch(String search) {
		List<RestaurantDTO> list = dao.resSearch(search);
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public List<RestaurantDTO> resSearch(String search) {
//		SqlSession session = MySqlSessionFactory.getSession();
//		List<RestaurantDTO> list = null;
//		try {
//			RestaurantDAO dao = new RestaurantDAO();
//			list = dao.resSearch(session, search);
//		} catch (Exception e) {
//			session.close();
//		}
//		return list;
//	}
//	
//	public List<RestaurantDTO> resList() {
//		SqlSession session = MySqlSessionFactory.getSession();
//		List<RestaurantDTO> list = null;
//		try {
//			 RestaurantDAO dao = new RestaurantDAO();
//			 list = dao.resList(session);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			session.close();
//		}
//		return list;
//	}	 
	


}
