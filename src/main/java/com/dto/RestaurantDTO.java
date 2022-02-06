package com.dto;

import org.apache.ibatis.type.Alias;

@Alias("RestaurantDTO")
public class RestaurantDTO {
	String restaurant;
	String phone1;
	String phone2;
	String phone3;
	String addr1;
	String addr2;
	String image;

	@Override
	public String toString() {
		return "RestaurantDTO [restaurant=" + restaurant + ", phone1=" + phone1 + ", phone2=" + phone2 + ", phone3="
				+ phone3 + ", addr1=" + addr1 + ", addr2=" + addr2 + ", image=" + image + "]";
	}
	public String getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getPhone3() {
		return phone3;
	}
	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public RestaurantDTO(String restaurant, String phone1, String phone2, String phone3, String addr1, String addr2,
			String image) {
		super();
		this.restaurant = restaurant;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.image = image;
	}
	public RestaurantDTO() {
		super();
	}

	
	
	
}
