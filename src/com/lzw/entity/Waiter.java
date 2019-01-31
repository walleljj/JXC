package com.lzw.entity;

public class Waiter {
	private int wId;
	private String wName;
	private String wPass;
	private String wPhone;
	
	public Waiter() {
		super();
	}
	public Waiter(int wId, String wName, String wPass, String wPhone) {
		super();
		this.wId = wId;
		this.wName = wName;
		this.wPass = wPass;
		this.wPhone = wPhone;
	}
	@Override
	public String toString() {
		return "Waiter [wId=" + wId + ", wName=" + wName + ", wPass=" + wPass + ", wPhone=" + wPhone + "]";
	}
	public int getwId() {
		return wId;
	}
	public void setwId(int wId) {
		this.wId = wId;
	}
	public String getwName() {
		return wName;
	}
	public void setwName(String wName) {
		this.wName = wName;
	}
	public String getwPass() {
		return wPass;
	}
	public void setwPass(String wPass) {
		this.wPass = wPass;
	}
	public String getwPhone() {
		return wPhone;
	}
	public void setwPhone(String wPhone) {
		this.wPhone = wPhone;
	}
	

}
