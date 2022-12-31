package com.example.putApi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.putApi.Entity.User;
import com.example.putApi.service.UserService;

@RestController
@RequestMapping("/user")
public class Controller {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public User update(@PathVariable String id, @RequestBody User inputUsr) {
		return this.userService.updateUser(id, inputUsr);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public User add(@RequestBody User inputUsr) {
		return this.userService.addUser(inputUsr);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<User> getAll() {
		System.out.println("Inside Get All User");
		return this.userService.getAllUsers();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User getAUser(@PathVariable String id) {
		System.out.println("Inside Get A User");
		return this.userService.getUser(id);
	}
}