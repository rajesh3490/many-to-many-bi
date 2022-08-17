package com.ty.manytomany.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.manytomany.dto.Subject;
import com.ty.manytomany.dto.Teacher;

public class TestGetSubjectById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Subject subject = entityManager.find(Subject.class, 1);
		List<Teacher> teachers = subject.getTeacher();

		System.out.println("subject id is " + subject.getId());
		System.out.println("subject name is " + subject.getName());
		System.out.println("subject days is " + subject.getDays());

		if (teachers != null) {
			for (Teacher teacher : teachers) {
				System.out.println("teacher id is " + teacher.getId());
				System.out.println("teacher name is " + teacher.getName());
				System.out.println("teacher age is " + teacher.getAge());
			}
		}
	}

}
