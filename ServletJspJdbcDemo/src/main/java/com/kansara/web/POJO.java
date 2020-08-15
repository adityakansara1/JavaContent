package com.kansara.web;

public class POJO {
	private String id;
	private String name;
	private String phone;
	private String pin;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "POJO [id=" + id + ", name=" + name + ", phone=" + phone + ", pin=" + pin + "]";
	}

}
