package com.example.Toydemo.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name="Toydetails")
@Entity
public class ToyDetails {
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Toy_id")
	private ToyDetails toy;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	public ToyDetails getToy() {
		return toy;
	}
	public void setToy(ToyDetails toy) {
		this.toy = toy;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getToydes() {
		return toydes;
	}
	public void setToydes(String toydes) {
		this.toydes = toydes;
	}
	public String getWarrenty() {
		return warrenty;
	}
	public void setWarrenty(String warrenty) {
		this.warrenty = warrenty;
	}
	public String getAgegroup() {
		return agegroup;
	}
	public void setAgegroup(String agegroup) {
		this.agegroup = agegroup;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	private String toydes;
	private String warrenty;
	private String agegroup;
	private String duration;
	
	

}
