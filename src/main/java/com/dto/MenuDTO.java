package com.dto;

import org.apache.ibatis.type.Alias;

@Alias("MenuDTO")
public class MenuDTO {

	String restaurant;
	String menu;
	String genre;
	String estyle;
	String texture;
	String taste;
	String sauce;
	String spice;
	String carbo;
	String meat;
	String fat;
	String vegi;
	String image;
	public MenuDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MenuDTO(String restaurant, String menu, String genre, String estyle, String texture, String taste,
			String sauce, String spice, String carbo, String meat, String fat, String vegi, String image) {
		super();
		this.restaurant = restaurant;
		this.menu = menu;
		this.genre = genre;
		this.estyle = estyle;
		this.texture = texture;
		this.taste = taste;
		this.sauce = sauce;
		this.spice = spice;
		this.carbo = carbo;
		this.meat = meat;
		this.fat = fat;
		this.vegi = vegi;
		this.image = image;
	}


	public String getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "MenuDTO [restaurant=" + restaurant + ", menu=" + menu + ", genre=" + genre + ", estyle=" + estyle
				+ ", texture=" + texture + ", taste=" + taste + ", sauce=" + sauce + ", spice=" + spice + ", carbo="
				+ carbo + ", meat=" + meat + ", fat=" + fat + ", vegi=" + vegi + ", image=" + image + "]";
	}

	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getEstyle() {
		return estyle;
	}
	public void setEstyle(String estyle) {
		this.estyle = estyle;
	}
	public String getTexture() {
		return texture;
	}
	public void setTexture(String texture) {
		this.texture = texture;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public String getSauce() {
		return sauce;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public String getSpice() {
		return spice;
	}
	public void setSpice(String spice) {
		this.spice = spice;
	}
	public String getCarbo() {
		return carbo;
	}
	public void setCarbo(String carbo) {
		this.carbo = carbo;
	}
	public String getMeat() {
		return meat;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	public String getFat() {
		return fat;
	}
	public void setFat(String fat) {
		this.fat = fat;
	}
	public String getVegi() {
		return vegi;
	}
	public void setVegi(String vegi) {
		this.vegi = vegi;
	}
	
}
