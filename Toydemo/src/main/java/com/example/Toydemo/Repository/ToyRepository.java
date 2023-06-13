package com.example.Toydemo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Toydemo.Model.ToyDemo;

@Repository
public interface ToyRepository extends JpaRepository<ToyDemo,Integer> {
	@Query("select s from ToyDemo s where s.toyname=:toyname")
	public List<ToyDemo>getToyByToyname(String toyname);
    
	@Modifying
	@Query("delete from ToyDemo s  where s.toyname=?1")
	public int deleteToyByToyname(String toyname);
	
	@Modifying
	@Query("update ToyDemo s set s.toyname=?1 where s.cost=?2")
	public int UpdateToyByToynameCost(String toyname,String cost);
	
	

}
