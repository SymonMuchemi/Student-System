package com.symon.student_system.controller;


import com.symon.student_system.model.Student;
import com.symon.student_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@PostMapping("/add");
	public String add(@RequestBody Student student){
		studentService.saveStudent(student);
		return "New student added!";
	}
}
