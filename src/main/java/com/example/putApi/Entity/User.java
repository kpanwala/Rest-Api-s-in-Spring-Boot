package com.example.putApi.Entity;


public class User {
	
	private String id;
	private String name;
	private String phoneno;
	
	public User() {
		
	}

	public User(String id, String name, String phoneno) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
	}

	public User(String name, String phoneno) {
		super();
		this.name = name;
		this.phoneno = phoneno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phoneno=" + phoneno + "]";
	}
}
