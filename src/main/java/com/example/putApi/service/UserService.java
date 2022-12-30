package com.example.putApi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.putApi.Entity.User;

@Service
public class UserService {

	List<User> list = new ArrayList<User>();
	
	public UserService() {
	    list.add(new User("1","Kalp","99999999"));
	    list.add(new User("2","Aakash","88888888"));
	    list.add(new User("3","Fenil","77777777"));
	}
	
	public User updateUser(String id, User inputUsr) {
		list.forEach((usr)->{
	    	 if(usr.getId()==id) {
	    		 usr.setName(inputUsr.getName());
	    		 usr.setPhoneno(inputUsr.getPhoneno());
	    	 }
	     });
		
		User userToUpdate = list.stream().filter((usr)->usr.getId().equals(id)).findAny().orElse(null);
		if(userToUpdate!=null) {
			userToUpdate.setName(inputUsr.getName());
			userToUpdate.setPhoneno(inputUsr.getPhoneno());
		}
		
	    return userToUpdate;
	}
	
	public User addUser(User inputUsr) {
		inputUsr.setId(Integer.parseInt(list.get(list.size() - 1).getId())+1+"");
		list.add(inputUsr);
	
	    return inputUsr;
	}
	
	public List<User> getAllUsers() {
	    return list;
	}
	
	public User getUser(String id) {
	    return list.stream().filter((usr)->usr.getId().equals(id)).findAny().orElse(null);
	}
}
