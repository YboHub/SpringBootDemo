package com.aaa.service;

import java.util.List;

import com.aaa.entity.Student;

public interface StudentService {

	int insertStudent(Student student);

	List<Student> selectStudentInfo();


}
