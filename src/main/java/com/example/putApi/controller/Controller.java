package com.example.putApi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.putApi.Entity.User;
import com.example.putApi.service.UserService;

@RestController
@RequestMapping("/user")
public class Controller {
	
 @Autowired
 UserService userService;
 
 @PutMapping("/update/{id}")
 public User update(@PathVariable String id,@RequestBody User inputUsr) {
     return this.userService.updateUser(id, inputUsr);
 }
 
 @PostMapping("/add")
 public User add(@RequestBody User inputUsr) {
	 return this.userService.addUser(inputUsr);
 }
 
 @GetMapping("")
 public List<User> getAll() {
	 System.out.println("Inside Get All User");
	 return this.userService.getAllUsers();
 }
 
 @GetMapping("/{id}")
 public User getAUser(@PathVariable String id) {
	 System.out.println("Inside Get A User");
     return this.userService.getUser(id);
 }
}