package com.example.model;

import org.springframework.stereotype.Component;

@Component
public class Bill {

	
	private Integer p1;
	private Integer p2;
	public Integer getP1() {
		return p1;
	}
	public void setP1(Integer p1) {
		this.p1 = p1;
	}
	public Integer getP2() {
		return p2;
	}
	public void setP2(Integer p2) {
		this.p2 = p2;
	}
	public Bill(Integer p1, Integer p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
