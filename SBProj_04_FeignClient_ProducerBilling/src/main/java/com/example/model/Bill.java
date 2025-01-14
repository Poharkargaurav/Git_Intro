package com.example.model;

import org.springframework.stereotype.Component;

@Component
public class Bill {

	private int p1;
	private int p2;
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bill(int p1, int p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}
	public int getP1() {
		return p1;
	}
	public void setP1(int p1) {
		this.p1 = p1;
	}
	public int getP2() {
		return p2;
	}
	public void setP2(int p2) {
		this.p2 = p2;
	}
}
