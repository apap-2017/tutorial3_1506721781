package com.example.tutorial3.service;

import java.util.ArrayList;
import java.util.List;
import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService {
	private static List<StudentModel> studentList = new ArrayList<StudentModel>();
	
	@Override
	public StudentModel selectStudent(String npm) {
		for(int i=0; i<studentList.size(); i++) {
			StudentModel student = studentList.get(i);
			if (student.getNpm().equals(npm))
				 {
					return student;
				}
				
			}
		return null;
	}

	@Override
	public void addStudent(StudentModel student) {
		studentList.add(student);
	}
	
	@Override
	public void removeStudent(StudentModel student) {
		studentList.remove(student);
	}
		
	
	@Override
	public List<StudentModel> selectAllStudents() {
		// TODO Auto-generated method stub
		return studentList;
	}


	@Override
	public StudentModel removeStudent(String npm) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
