package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Login;
import com.example.demo.entities.TruckOwner;

@Repository
public interface LoginRepository extends JpaRepository<Login,Integer> {

	
	
	
	//@Query ("select l.role from Login l where l.uid = :uid and l.pwd= :pwd")
//public String checklogin (String uid,String pwd);
	
	//@Query ("select l.role, l.login_id from Login l where uid= :uid and pwd= :pwd")
	//public List<Login> checkLogin (String uid,String pwd);

	@Query("select l from Login l where uid = :uid and pwd = :pwd")
	public List<Login> checkLogin(String uid, String pwd);

	
	
}
