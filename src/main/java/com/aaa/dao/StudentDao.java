package com.aaa.dao;

import java.util.List;

import com.aaa.entity.Student;

public interface StudentDao {

	int insertStudent(Student student);

	List<Student> selectStudentInfo();

}
