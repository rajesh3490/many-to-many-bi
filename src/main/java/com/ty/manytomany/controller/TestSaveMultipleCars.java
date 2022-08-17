package com.ty.manytomany.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manytomany.dto.Car;
import com.ty.manytomany.dto.Features;

public class TestSaveMultipleCars {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Features features = entityManager.find(Features.class, 1);

		Features features2 = new Features();
		features2.setColor("yellow");
		features2.setMilege(30);

		List<Features> lf = new ArrayList<Features>();
		lf.add(features);
		lf.add(features2);

		Car car1 = new Car();
		car1.setCost(500000);
		car1.setName("BMW");
		car1.setFeatures(lf);

		entityTransaction.begin();
		entityManager.persist(car1);
		entityManager.persist(features2);
		entityTransaction.commit();
		System.out.println("data is stored");

	}

}
