package com.lakshmi.web.models;

public class Transaction {
	private int Id;
	private String Sentby;
	private String Receivedby;
	private float Amount;
	private String Datetime;
	public int getId() { return Id;	}
	public void setId(int id) {	Id = id; }
	public String getSentby() {	return Sentby;	}
	public void setSentby(String sentby) {	Sentby = sentby; }
	public String getReceivedby() {	return Receivedby;	}
	public void setReceivedby(String receivedby) {	Receivedby = receivedby; }
	public float getAmount() {	return Amount;	}
	public void setAmount(float amount) {	Amount = amount;	}
	public String getDatetime() {	return Datetime; }
	public void setDatetime(String datetime) {	Datetime = datetime;	}
	public Transaction(int a, String b, String c, float d, String e) 
    { 
        this.Id = a; 
        this.Sentby = b; 
        this.Receivedby = c;
        this.Amount = d;
        this.Datetime = e;
    } 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Transaction [" + Id + ", " + Sentby + ", " + Receivedby + ", " + Amount + ", " + Datetime + "]";
	}
}
