package com.example.Toydemo.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class ToyDemo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sno;
	@Column(unique=true)
	private String toyname;
	private int cost;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getToyname() {
		return toyname;
	}

	public void setToyname(String toyname) {
		this.toyname = toyname;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
