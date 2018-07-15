package com.test.restdemo.repository;

import java.util.ArrayList;
import java.util.List;
import com.test.restdemo.model.Student;

public class StudentRepository {
	List<Student> students = new ArrayList<Student>();

	public StudentRepository() {
		// TODO Auto-generated constructor stub
		System.out.println("Student Repo Constructor");
		Student st1 = new Student(1, "Siva");
		Student st2 = new Student(2, "Reddy");
		students.add(st1);
		students.add(st2);
		System.out.println("students count:" + students.size());
	}
	
	public List<Student> getStudents() {
		System.out.println("getStudents count:" + students.size());
		return this.students;
	}
	
	public Student getStudent(int id) {
		Student st = null;
		if(id < students.size())
			st = students.get(id);
		return st;
	}

	public void addStudent(Student st) {
		// TODO Auto-generated method stub
		System.out.println("adding student with id " + st.getId());
		students.add(st);
	}
}
