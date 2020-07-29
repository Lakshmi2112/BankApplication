package com.lakshmi.web.models;

public class Customer {
	private int Id;
	private String Name;
	private float Amount;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getAmount() {
		return Amount;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer [id = " + Id + ", Name = " + Name + ", Amount" + Amount + "]"; 
	}
	public void setAmount(float amount) {
		Amount = amount;
	}
}
