package com.ty.manytomany.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manytomany.dto.Subject;
import com.ty.manytomany.dto.Teacher;

public class TestSaveTeacher {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		List<Teacher> ltList = new ArrayList<Teacher>();
		Teacher teacher = new Teacher();
		teacher.setName("rajesh");
		teacher.setAge(25);
		ltList.add(teacher);

		Teacher teacher1 = new Teacher();
		teacher1.setName("lokesh");
		teacher1.setAge(24);
		ltList.add(teacher1);

		Subject subject = new Subject();
		subject.setName("maths");
		subject.setDays(60);
		subject.setTeacher(ltList);

		entityTransaction.begin();
		entityManager.persist(teacher);
		entityManager.persist(teacher1);
		entityManager.persist(subject);
		entityTransaction.commit();

		System.out.println("data stored");

	}

}
