package com.example.sample.controller;
import com.example.sample.service.StoreService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.model.CreateStoreModel;
import com.example.sample.service.StoreService;

@RestController
public class PracticeTest {
	@Autowired private StoreService service;
	//private StoreService service;
	
	@GetMapping("/users")
	public List<CreateStoreModel> list(){
		return service.listAll();
		//System.out.println(service.listAll());
	}
	


	

}
