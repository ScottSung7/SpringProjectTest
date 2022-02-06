package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.MenuDTO;
import com.dto.RestaurantDTO;
@Repository
public class RestaurantDAO {
	@Autowired
	SqlSessionTemplate template;

	public List<RestaurantDTO> resList() {
		List<RestaurantDTO> list = template.selectList("RestaurantMapper.resList");
		return list;
	}

	public List<RestaurantDTO> resSearch(String search) {
		List<RestaurantDTO> list = template.selectList("RestaurantMapper.resSearch", search);
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	public List<RestaurantDTO> resSearch(SqlSession session, String search) {
//		List<RestaurantDTO> list = session.selectList("RestaurantMapper.resSearch",search);
//		return list;
//	}
//	
//	public List<RestaurantDTO> resList(SqlSession session) {
//		   List<RestaurantDTO> list = 
//				   session.selectList("RestaurantMapper.resList");
//		   return list;
//	   }


}
