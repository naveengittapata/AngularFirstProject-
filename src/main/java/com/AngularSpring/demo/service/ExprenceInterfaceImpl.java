package com.AngularSpring.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AngularSpring.demo.model.expences;
import com.AngularSpring.demo.repository.SalesRepo;
@Service
public class ExprenceInterfaceImpl implements ExpenceInterface {
	@Autowired
	SalesRepo res;

	@Override
	public List<expences> getAll() {
		
		return res.findAll();
	}

	@Override//add data or post data
	public expences updateExp(expences ex) {
		return res.save(ex);
		
	}

	@Override
	public expences getbyID(Long id) {
	 if (res.findById(id).isPresent()) {
		 return res.findById(id).get();
	 }
	return null;
		
	}


	

	

}
