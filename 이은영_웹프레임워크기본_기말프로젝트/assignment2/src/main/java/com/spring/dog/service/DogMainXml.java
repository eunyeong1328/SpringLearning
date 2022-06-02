package com.spring.dog.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.dog.impl.DogDO;

public class DogMainXml {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("DogSettings.xml");
		DogService bService = (DogService)context.getBean("DogService");
		
		DogDO ddoo = (DogDO)context.getBean("ddooThree");
		bService.insertDogInfo(ddoo);
	}
}
