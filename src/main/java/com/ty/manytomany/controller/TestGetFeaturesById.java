package com.ty.manytomany.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.manytomany.dto.Car;
import com.ty.manytomany.dto.Features;

public class TestGetFeaturesById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Features features = entityManager.find(Features.class, 1);

		List<Car> list = features.getCar();

		System.out.println("features id is " + features.getId());
		System.out.println("car is available in " + features.getColor());
		System.out.println("car milege is  " + features.getMilege());

		if (list != null) {
			for (Car car : list) {
				System.out.println("car id is " + car.getId());
				System.out.println("car name is " + car.getName());
				System.out.println("car cost is " + car.getCost());
			}
		}
	}

}
