package com.aaa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Student;
import com.aaa.service.StudentService;
@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@GetMapping("add")
	public String addStudent(){
		return "student/student_add";
	}
	@PostMapping("save")
	public String saveStudent(Student student){
		studentService.insertStudent(student);
		return "student/student_list";
	}
	@PostMapping("datagrid")
	@ResponseBody
	public List<Student> dataGrid(){
		List<Student> studentList = studentService.selectStudentInfo();
		return studentList;
	}
}
