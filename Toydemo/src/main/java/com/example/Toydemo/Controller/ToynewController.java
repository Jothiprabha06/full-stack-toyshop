package com.example.Toydemo.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Toydemo.Model.ToyDemo;
import com.example.Toydemo.Model.ToyDetails;
import com.example.Toydemo.Service.ToynewService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@CrossOrigin("http://localhost:3000")
public class ToynewController {
	@Autowired
	ToynewService tns;

	@GetMapping("/gettoy")
	public List<ToyDemo> getAllUsers() {
		return tns.getAllUsers();
	}

	@DeleteMapping("/dlttoy/{sno}")
	public String deletedToy(@PathVariable int sno) {
		return tns.deleteToy(sno);
	}

	@PutMapping("/edittoy")
	public String updatedtoy(@RequestParam int cost, @RequestParam String toyname) {

		int result = tns.updatedtoy(cost, toyname);
		if (result > 0) {
			return "toy edited";
		} else {
			return "not edited";
		}
	}

	
}
