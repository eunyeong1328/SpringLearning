package com.spring.dog.impl;

import org.springframework.stereotype.Service;

import com.spring.dog.service.DogService;

@Service("dogService")
public class DogServiceImpl implements DogService{
	private DogInfoDAO ddao;

	@Override
	public void insertDogInfo(DogDO ddo) {
		ddao.insertDogInfo(ddo);
	}

}
