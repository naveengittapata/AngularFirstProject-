package com.AngularSpring.demo.service;

import java.util.List;

import com.AngularSpring.demo.model.expences;

public interface ExpenceInterface {
	
	public List<expences> getAll();
	public expences updateExp(expences ex);//post the new Data
	public expences getbyID(Long id);

}
