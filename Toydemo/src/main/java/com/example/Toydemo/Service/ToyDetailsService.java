package com.example.Toydemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Toydemo.Model.ToyDetails;
import com.example.Toydemo.Repository.ToyDetailsRepository;

@Service
public class ToyDetailsService {
	
	@Autowired
	ToyDetailsRepository trepo;
	
	public List<ToyDetails> fetchAllDetails(){
		return trepo.findAll();
	}
	public ToyDetails postDetails(ToyDetails t)
	{
		return trepo.save(t);
	}

}
