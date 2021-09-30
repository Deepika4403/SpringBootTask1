package com.example.sample.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sample.model.CreateStoreModel;

@Repository("UserRepository")
public interface UserRepository extends JpaRepository<CreateStoreModel, Integer> {

	

}
