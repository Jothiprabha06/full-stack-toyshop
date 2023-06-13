package com.example.Toydemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Toydemo.Model.LoginModel;

@Repository
	public interface LoginRepository extends JpaRepository<LoginModel,Integer>{
	
	@Modifying
    @Query("update LoginModel s set s.password=?1 where s.username=?2")
	public int updateByPassword(String password, String username);
	@Modifying
	@Query(("delete from LoginModel s where s.username=?1 and s.password=?2"))
	public void deleteByUsername(String username, String password);
	

	}

