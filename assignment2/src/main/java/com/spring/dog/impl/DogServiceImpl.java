package com.spring.dog.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dog.service.DogService;

@Service("DogService")
public class DogServiceImpl implements DogService{
	@Autowired
	private DogInfoDAO ddao;
	
	public DogInfoDAO getDdao() {
		return ddao;
	}

	public void setDdao(DogInfoDAO ddao) {
		this.ddao = ddao;
	}

	@Override
	public void insertDogInfo(DogDO ddo) {
		ddao.insertDogInfo(ddo);
	}

}
