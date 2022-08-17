package com.ty.manytomany.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.manytomany.dto.Car;
import com.ty.manytomany.dto.Features;

public class TestGetCarById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Car car = entityManager.find(Car.class, 1);

		List<Features> features = car.getFeatures();

		System.out.println("car id is " + car.getId());
		System.out.println("car name is " + car.getName());
		System.out.println("car cost is " + car.getCost());

		if (features != null) {
			for (Features features2 : features) {
				System.out.println("car id is " + features2.getId());
				System.out.println("car is available in " + features2.getColor());
				System.out.println("car milege is  " + features2.getMilege());
			}
		}
	}

}
