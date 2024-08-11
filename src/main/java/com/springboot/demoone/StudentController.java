package com.springboot.demoone;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Nihal", "Gupta");
	}
	
	@GetMapping(path = "/students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student("Nihal","Gupta"));
		students.add(new Student("Nihal","Gupta"));
		students.add(new Student("Nihal","Gupta"));
		students.add(new Student("Nihal","Gupta"));
		students.add(new Student("Nihal","Gupta"));
		return students;
	}
}
