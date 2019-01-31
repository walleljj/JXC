package com.lzw.entity;

import java.sql.Timestamp;

public class DD {
	private int id;
	private String cName;
	private String cPhone;
	private String wName;
	private String wPhone;
	private String gName;
	private int number;
	private int price;
	private int amount;
	private String reason;
	private Timestamp time;
	@Override
	public String toString() {
		return "DD [id=" + id + ", cName=" + cName + ", cPhone=" + cPhone + ", wName=" + wName + ", wPhone=" + wPhone
				+ ", gName=" + gName + ", number=" + number + ", price=" + price + ", amount=" + amount + ", reason="
				+ reason + ", time=" + time + "]";
	}
	
	public DD(int id, String cName, String cPhone, String wName, String wPhone, String gName, int number, int price,
			int amount, String reason, Timestamp time) {
		super();
		this.id = id;
		this.cName = cName;
		this.cPhone = cPhone;
		this.wName = wName;
		this.wPhone = wPhone;
		this.gName = gName;
		this.number = number;
		this.price = price;
		this.amount = amount;
		this.reason = reason;
		this.time = time;
	}
	

	public DD() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcPhone() {
		return cPhone;
	}
	public void setcPhone(String cPhone) {
		this.cPhone = cPhone;
	}
	public String getwName() {
		return wName;
	}
	public void setwName(String wName) {
		this.wName = wName;
	}
	public String getwPhone() {
		return wPhone;
	}
	public void setwPhone(String wPhone) {
		this.wPhone = wPhone;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	

}
