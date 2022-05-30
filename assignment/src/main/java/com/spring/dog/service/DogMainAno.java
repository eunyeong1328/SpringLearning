package com.spring.dog.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.dog.impl.DogDO;


public class DogMainAno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new GenericXmlApplicationContext("DogSettings.xml");
		
		DogService bService = (DogService)context.getBean("DogService");
		
		DogDO ddo = new DogDO();
		ddo.setHost("wendy");
		ddo.setDogName("suga");
		ddo.setDogType("ShibaInu");
		ddo.setDogGender("female");

	}

}
