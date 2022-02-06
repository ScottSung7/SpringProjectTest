package com.dto;

import org.apache.ibatis.type.Alias;

@Alias("LikeDTO")
public class LikeDTO {
	String userid;
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
	public LikeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LikeDTO(String userid, String genre, String estyle, String texture, String taste, String sauce, String spice,
			String carbo, String meat, String fat, String vegi) {
		super();
		this.userid = userid;
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
	}
	public LikeDTO(String genre, String estyle, String texture, String taste, String sauce, String spice, String carbo,
			String meat, String fat, String vegi) {
		//menuR1
		super();
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
	}
	
	public LikeDTO(String genre, String carbo) {
		//menuR9AG
		super();
		this.genre = genre;
		this.carbo = carbo;
	}
	@Override
	public String toString() {
		return "LikeDTO [userid=" + userid + ", genre=" + genre + ", estyle=" + estyle + ", texture=" + texture
				+ ", taste=" + taste + ", sauce=" + sauce + ", spice=" + spice + ", carbo=" + carbo + ", meat=" + meat
				+ ", fat=" + fat + ", vegi=" + vegi + "]";
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
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
