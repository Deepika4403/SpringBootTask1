package com.example.sample.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.model.CreateStoreModel;
import com.example.sample.repo.UserRepository;
import com.example.sample.service.StoreService;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired private UserRepository repo;
	

	public List<CreateStoreModel> listAll() {
		return repo.findAll();

	}

	public void save(CreateStoreModel createStoreModel) {
		repo.save(createStoreModel);
	}

	public CreateStoreModel get(Integer id) {
		return repo.findById(id).get();

	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
