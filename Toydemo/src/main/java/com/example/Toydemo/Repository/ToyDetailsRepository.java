package com.example.Toydemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Toydemo.Model.ToyDetails;

public interface ToyDetailsRepository  extends JpaRepository<ToyDetails,Long>{
	
}
