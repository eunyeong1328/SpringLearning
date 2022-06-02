package com.spring.dog.impl;

public class DogDO {

	private int num;
	private String host;	//주인
	private String dogName;	//이름
	private String dogType;	//종류
	private String dogGender;	//성별
	private String dogInoculation; //접종
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getDogName() {
		return dogName;
	}
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	public String getDogType() {
		return dogType;
	}
	public void setDogType(String dogType) {
		this.dogType = dogType;
	}
	public String getDogGender() {
		return dogGender;
	}
	public void setDogGender(String dogGender) {
		this.dogGender = dogGender;
	}
	public String getDogInoculation() {
		return dogInoculation;
	}
	public void setDogInoculation(String dogInoculation) {
		this.dogInoculation = dogInoculation;
	}
	
	
}
