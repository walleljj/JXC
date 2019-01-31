package com.lzw.entity;

public class Goods {
	private int gId;
	private String name;
	private String pinpai;
	private String gongying;
	private String size;
	private String kuanshi;
	private String color;
	private String mianlia;
	private String baozhuang;
	private int kucun;
	private int jinjia;
	
	
	public Goods() {
		super();
	}
	
	public Goods(int gId, String name, String pinpai, String gongying, String size, String kuanshi, String color,
			String mianlia, String baozhuang, int kucun, int jinjia) {
		super();
		this.gId = gId;
		this.name = name;
		this.pinpai = pinpai;
		this.gongying = gongying;
		this.size = size;
		this.kuanshi = kuanshi;
		this.color = color;
		this.mianlia = mianlia;
		this.baozhuang = baozhuang;
		this.kucun = kucun;
		this.jinjia = jinjia;
	}

	@Override
	public String toString() {
		return "Goods [gId=" + gId + ", name=" + name + ", pinpai=" + pinpai + ", gongying=" + gongying + ", size="
				+ size + ", kuanshi=" + kuanshi + ", color=" + color + ", mianlia=" + mianlia + ", baozhuang="
				+ baozhuang + "]";
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPinpai() {
		return pinpai;
	}
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	public String getGongying() {
		return gongying;
	}
	public void setGongying(String gongying) {
		this.gongying = gongying;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getKuanshi() {
		return kuanshi;
	}
	public void setKuanshi(String kuanshi) {
		this.kuanshi = kuanshi;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMianlia() {
		return mianlia;
	}
	public void setMianlia(String mianlia) {
		this.mianlia = mianlia;
	}
	public String getBaozhuang() {
		return baozhuang;
	}
	public void setBaozhuang(String baozhuang) {
		this.baozhuang = baozhuang;
	}

	public int getKucun() {
		return kucun;
	}

	public void setKucun(int kucun) {
		this.kucun = kucun;
	}

	public int getJinjia() {
		return jinjia;
	}

	public void setJinjia(int jinjia) {
		this.jinjia = jinjia;
	}
	

}
