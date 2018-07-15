package com.test.restdemo.resources;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.test.restdemo.model.Student;
import com.test.restdemo.repository.StudentRepository;

@Path("students")
public class StudentResource {
	
	static StudentRepository repo = new StudentRepository();
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Student> getStudents() {		
		System.out.println("get called");		
		return repo.getStudents();
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Path("{id}")
	public Student getStudent(@PathParam("id") int id) {		
		System.out.println("getStudent called");		
		return repo.getStudent(id);
	}
	
	@POST
	@Path("add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Student addStudent(Student st) {
		System.out.println("addStudent()=" + st);
		repo.addStudent(st);
		return st;
	}
}
