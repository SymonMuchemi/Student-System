package com.symon.student_system.service;

import com.symon.student_system.model.Student;
import com.symon.student_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class StudentServiceImplementation implements StudentService{
	@Autowired
	public StudentRepository studentRepository;
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
}
