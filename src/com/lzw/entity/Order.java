package com.lzw.entity;

import java.sql.Timestamp;

public class Order {
	private int id;
	private int cId;
	private int gId;
	private int wId;
	private int number;
	private int price;
	private String reason;
	private int amount;
	private Timestamp oTime;
	
	
	public Order() {
		super();
	}
	
	public Order(int id, int cId, int gId, int wId, int number, int price, String reason, int amount, Timestamp oTime) {
		super();
		this.id = id;
		this.cId = cId;
		this.gId = gId;
		this.wId = wId;
		this.number = number;
		this.price = price;
		this.reason = reason;
		this.amount = amount;
		this.oTime = oTime;
	}

	
	@Override
	public String toString() {
		return "Order [id=" + id + ", cId=" + cId + ", gId=" + gId + ", wId=" + wId + ", number=" + number + ", price="
				+ price + ", reason=" + reason + ", amount=" + amount + ", oTime=" + oTime + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public int getwId() {
		return wId;
	}
	public void setwId(int wId) {
		this.wId = wId;
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
	public Timestamp getoTime() {
		return oTime;
	}
	public void setoTime(Timestamp oTime) {
		this.oTime = oTime;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
	

}
