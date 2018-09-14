package com.aaa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.StudentDao;
import com.aaa.entity.Student;
import com.aaa.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	@Override
	public int insertStudent(Student student) {
		return studentDao.insertStudent(student);
	}
	@Override
	public List<Student> selectStudentInfo() {
		return studentDao.selectStudentInfo();
	}

}
