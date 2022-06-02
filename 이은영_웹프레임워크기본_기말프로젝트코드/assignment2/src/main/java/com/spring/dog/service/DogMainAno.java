package com.spring.dog.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.dog.impl.DogDO;


public class DogMainAno {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("DogSettingsAno.xml");
		DogService bService = (DogService)context.getBean("DogService");
		
		DogDO ddo = new DogDO();
		ddo.setHost("wendyOne");
		ddo.setDogName("sugaOne");
		ddo.setDogType("ShibaInuOne");
		ddo.setDogGender("femaleOne");
		ddo.setDogInoculation("coronaOne");
		bService.insertDogInfo(ddo);

	}

}
