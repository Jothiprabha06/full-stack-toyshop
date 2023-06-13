package com.example.Toydemo.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Toydemo.Model.ToyDemo;
import com.example.Toydemo.Repository.ToynewRepository;
import jakarta.transaction.Transactional;

@Service
public class ToynewService {
	@Autowired
	ToynewRepository to;

	public List<ToyDemo> getAllUsers() {
		// TODO Auto-generated method stub
		return to.findAll();
	}

	public String deleteToy(int sno) {
		to.deleteById(sno);
		return "Toy Details Deleted";
	}

	@Transactional
	public int updatedtoy(int cost, String toyname) {
		return to.updatetoy(cost, toyname);
	}

	
}
