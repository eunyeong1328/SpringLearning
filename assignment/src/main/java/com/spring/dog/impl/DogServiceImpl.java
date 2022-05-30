package com.spring.dog.impl;

import org.springframework.stereotype.Service;

import com.spring.dog.service.DogService;

@Service("DogService")
public class DogServiceImpl implements DogService{

	private DogInfoDAO ddao;

	@Override
	public void insertDogInfo(DogDO ddo) {
		// TODO Auto-generated method stub
		ddao.insertDogInfo(ddo);
	}

}
