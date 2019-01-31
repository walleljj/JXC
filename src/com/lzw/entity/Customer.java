package com.lzw.entity;

public class Customer {
	private int cId;
	private String cName;
	private String cContacts;
	private String cAdress;
	private String cPhone;
	private String cEmal;
	private int cMoney;
	private String cBackCard;
	
	
	public Customer() {
		super();
	}
	public Customer(int cId, String cName, String cContacts, String cAdress, String cPhone, String cEmal, int cMoney,
			String cBackCard) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cContacts = cContacts;
		this.cAdress = cAdress;
		this.cPhone = cPhone;
		this.cEmal = cEmal;
		this.cMoney = cMoney;
		this.cBackCard = cBackCard;
	}
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", cContacts=" + cContacts + ", cAdress=" + cAdress
				+ ", cPhone=" + cPhone + ", cEmal=" + cEmal + ", cMoney=" + cMoney + ", cBackCard=" + cBackCard + "]";
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcContacts() {
		return cContacts;
	}
	public void setcContacts(String cContacts) {
		this.cContacts = cContacts;
	}
	public String getcAdress() {
		return cAdress;
	}
	public void setcAdress(String cAdress) {
		this.cAdress = cAdress;
	}
	public String getcPhone() {
		return cPhone;
	}
	public void setcPhone(String cPhone) {
		this.cPhone = cPhone;
	}
	public String getcEmal() {
		return cEmal;
	}
	public void setcEmal(String cEmal) {
		this.cEmal = cEmal;
	}
	public int getcMoney() {
		return cMoney;
	}
	public void setcMoney(int cMoney) {
		this.cMoney = cMoney;
	}
	public String getcBackCard() {
		return cBackCard;
	}
	public void setcBackCard(String cBackCard) {
		this.cBackCard = cBackCard;
	}
	

}
