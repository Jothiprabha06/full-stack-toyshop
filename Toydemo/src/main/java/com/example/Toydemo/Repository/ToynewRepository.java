package com.example.Toydemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.Toydemo.Model.ToyDemo;


public interface ToynewRepository extends JpaRepository<ToyDemo,Integer>{
	
	@Modifying
    @Query("update ToyDemo s set s.cost=?1 where s.toyname=?2")
    public int updatetoy(int cost,String toyname);

}
