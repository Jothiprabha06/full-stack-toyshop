package com.example.Toydemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Toydemo.Model.ToyDetails;
import com.example.Toydemo.Service.ToyDetailsService;

@RestController
public class ToyDetailsController {

	@Autowired
	ToyDetailsService tservice;
	
	@PostMapping("/postDetails")
	public ToyDetails postDetails(@RequestBody ToyDetails t)
	{
		return tservice.postDetails(t);
	}
	@GetMapping("/getDetails")
	public List<ToyDetails>fetchAllDetails()
	{
		return tservice.fetchAllDetails();
	}
	
	
}
