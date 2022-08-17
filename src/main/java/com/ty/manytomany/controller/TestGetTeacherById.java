package com.ty.manytomany.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.manytomany.dto.Subject;
import com.ty.manytomany.dto.Teacher;

public class TestGetTeacherById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Teacher teacher = entityManager.find(Teacher.class, 1);
		List<Subject> subjects = teacher.getSubject();
		System.out.println("teacher id is " + teacher.getId());
		System.out.println("teacher name is " + teacher.getName());
		System.out.println("teacher age is " + teacher.getAge());

		if (subjects != null) {
			for (Subject subject2 : subjects) {

				System.out.println("subject id is " + subject2.getId());
				System.out.println("subject name is " + subject2.getName());
				System.out.println("subject days is " + subject2.getDays());
			}

		}
	}
}
