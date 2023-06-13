package com.example.Toydemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Toydemo.Model.LoginModel;
import com.example.Toydemo.Model.ToyDemo;
import com.example.Toydemo.Service.ToyService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@CrossOrigin("http://localhost:3000/")
public class ToyController {

	@Autowired
	ToyService ts;
	
	@Tag(name="Get",description="get data")
	@GetMapping("/fetch")
	public List<ToyDemo> getallDetails(){
		return ts.getAllDetails();
	}
	@Tag(name="Post",description="post data")
	
	@Tag(name="Put",description="put data")
	@PutMapping("/put")
	public String saveall(@RequestBody ToyDemo x) {
		ts.saveupdate(x);
		return "Updated";
	}
	@Tag(name="Delete",description="delete data")
		@DeleteMapping("/delete/{j}")
	public String deleteDetails(@PathVariable int j) {
		ts.deleteDetails(j);
		return "Deleted";
	}
	@Tag(name="Get",description="get data")
		@GetMapping("/auto/{field}")
		public List<ToyDemo>sortCrudD(@PathVariable String field){
			return ts.sortToy(field);
		}
	@Tag(name="Get",description="get data")
		@GetMapping("/autio")
		public List<ToyDemo>sortCrudDes(@RequestParam String field){
			return ts.sortDesToy(field);
		}
		
	@Tag(name="Get",description="get data")
		@GetMapping("/pagination")
		
		public List<ToyDemo> pagination(@RequestParam int offset,@RequestParam int pagesize){
			
			return ts.getpaginationss(offset,pagesize);
		}
	@Tag(name="Get",description="get data")
		@GetMapping("/sortpagination")
		
		public List<ToyDemo> sortpagination(@RequestParam int offset,@RequestParam int pagesize,String field){
			
			return ts.getsortpaginations(offset,pagesize,field);
		}
	@Tag(name="Get",description="get data")
		@GetMapping("/login")
		public String logins(@RequestParam String username, @RequestParam String password){
			
			return ts.login(username,password);
		}
	@Tag(name="Post",description="post data")
	
		@PostMapping("/reg")
		public LoginModel regid(@RequestBody LoginModel id) {
			
			
			return ts.register(id);
			
		}
	@Tag(name="Get",description="get data")
		@GetMapping("/gettoybytoyname/{toyname}")
		public List<ToyDemo>getToyByToyname(@PathVariable String toyname)
		{
			List<ToyDemo>toy=ts.getToyByToyname(toyname);
			return toy;
		}
	@Tag(name="Delete",description="delete data")
		@DeleteMapping("/deletetoybyname/{toyname}")
		public String deleteToyByToyname(@PathVariable String toyname) {
			int res=ts.deleteToyByToyname(toyname);
			if(res>0) {
				return "deleted";
			}
			else
			{
				return "could not delete";
			}
		}
	//@Tag(name="Put",description="put data")
		//@PutMapping("/updatetoy/{toyname}/{cost}")
		//public String UpdateToyByToynameCost( @PathVariable String toyname,@PathVariable String cost) {
		//	int res=ts.UpdateToyByToynameCost(toyname, cost);
			//if(res>0) {
			//	return "Toy record updated";
			//}
			//return "Toy record Not updated";
		//}
	@PutMapping("/updateByPassword")
	public String updateByPassword(@RequestParam String password,@RequestParam String username)
	{
		
		int result=ts.updateByPassword(password, username);
		if(result>0)
		{
			return "updated";
		}
		else
		{
			return "not updated";
		}
	}
	@DeleteMapping("/remove")
    public void delete(@RequestParam String username,@RequestParam String password) {
    	ts.deleteByUsername(username,password);
    	
    }
	@PostMapping("/save-toy")
	public ToyDemo save(@RequestBody ToyDemo toy) {
		return ts.save(toy);
	}
}
