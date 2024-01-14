package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien
{
	private int aid;
	private String aname;
	private String tech;
	@Autowired
	private Laptop laptop;
	
	
	public Alien() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Object created only once");
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public Laptop getLaptod() {
		return laptop;
	}
	public void setLaptod(Laptop laptod) {
		this.laptop = laptod;
	}
	public void show()
	{
		System.out.println("In Alien");
		laptop.compile();
	}
}
