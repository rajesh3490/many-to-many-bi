package com.ty.manytomany.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Features {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String color;
	private double milege;

	@ManyToMany(mappedBy = "features")
	private List<Car> car;

	public Features() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMilege() {
		return milege;
	}

	public void setMilege(double milege) {
		this.milege = milege;
	}

	public List<Car> getCar() {
		return car;
	}

	public void setCar(List<Car> car) {
		this.car = car;
	}
}
