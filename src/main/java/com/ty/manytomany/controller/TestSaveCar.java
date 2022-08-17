package com.ty.manytomany.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manytomany.dto.Car;
import com.ty.manytomany.dto.Features;

public class TestSaveCar {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		List<Features> list = new ArrayList<Features>();
		Features features = new Features();
		features.setColor("black");
		features.setMilege(55);
		list.add(features);

		Features features1 = new Features();
		features1.setColor("red");
		features1.setMilege(50);
		list.add(features1);

		Car car = new Car();
		car.setName("nano");
		car.setCost(100000);
		car.setFeatures(list);

		entityTransaction.begin();
		entityManager.persist(car);
		entityManager.persist(features1);
		entityManager.persist(features);
		entityTransaction.commit();

		System.out.println("data is stored");
	}

}
