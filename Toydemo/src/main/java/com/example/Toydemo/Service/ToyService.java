package com.example.Toydemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Toydemo.Model.LoginModel;
import com.example.Toydemo.Model.ToyDemo;
import com.example.Toydemo.Repository.LoginRepository;
import com.example.Toydemo.Repository.ToyRepository;
import com.example.Toydemo.Repository.ToynewRepository;

import jakarta.transaction.Transactional;

@Service
public class ToyService {

	@Autowired
	ToyRepository tr;
	@Autowired
	LoginRepository lr;
	@Autowired
	ToynewRepository tr1;
	
	public List<ToyDemo> getAllDetails(){
		
		return tr.findAll();
	}
	
	public ToyDemo saveDetails(@RequestBody ToyDemo b) {
		
		return tr.save(b);
	}
	

	public ToyDemo saveupdate(@RequestBody ToyDemo x) {
		
		return tr.save(x);
	}
	public void deleteDetails(@PathVariable int a) {
		
		tr.deleteById(a);
	}
	
	public List<ToyDemo>sortToy(String field){
		return tr.findAll(Sort.by(field));
	}
	
	public List<ToyDemo> sortDesToy(String field){
		
		return tr.findAll(Sort.by(Direction.DESC,field));
	}

	public List<ToyDemo> getpaginationss(int offset, int pagesize) {
		
		Page<ToyDemo> paging=tr.findAll(PageRequest.of(offset, pagesize));
		return paging.getContent();
	}

	public List<ToyDemo> getsortpaginations(int offset, int pagesize,String field) {
		
		Page<ToyDemo> paging=tr.findAll(PageRequest.of(offset, pagesize,Sort.by(field)));
		return paging.getContent();
	}
	public String login(String username,String password) {
		List<LoginModel> li = lr.findAll();
		String res = null;
		for(LoginModel l : li ) {
			if(l.getUsername().equals(username)&&l.getPassword().equals(password)) {
				res = "Login sucessfull";
			}
		}
		if(res==null) {
			res= "Login failed";
		}
		return res;
	}
	public LoginModel register(LoginModel id) {
			
			return lr.save(id);
		}
	public List<ToyDemo>getToyByToyname(String toyname){
		List<ToyDemo> toy=tr.getToyByToyname(toyname);
		return toy;
	}
	@Transactional
	public int deleteToyByToyname(String toyname) {
		return tr.deleteToyByToyname(toyname);
	}
	@Transactional
	public int UpdateToyByToynameCost(String toyname,String cost) {
		return tr.UpdateToyByToynameCost(toyname, cost);
	}
	@Transactional
	public int updateByPassword(String password, String username) {
		// TODO Auto-generated method stub
		return lr.updateByPassword(password, username);
	}

	@Transactional

	public void deleteByUsername(String username, String password) {
		// TODO Auto-generated method stub
		 lr.deleteByUsername(username,password);
		
	}

	
	public ToyDemo save(ToyDemo toy) {
		return tr1.save(toy);
	}
    
}

	
	
