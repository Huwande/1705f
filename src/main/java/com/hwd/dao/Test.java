package com.hwd.dao;

public class Test {
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + "]";
	}
	public Test(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
