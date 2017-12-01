package com.school.web.serviceImpl;

import com.school.web.bean.StudentBean;
import com.school.web.service.StudentService;

public class StudentServiceImpl implements StudentService {
	private StudentBean[] students;
	private int count;

	public StudentServiceImpl(int count) {
		this.count=0;
		students = new StudentBean[count];
	}
	@Override
	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}
	@Override
	public void addStudent(StudentBean student) {
		students[count] = student;
		count++;
	}
	@Override
	public void addScore(StudentBean score) {

	}

	@Override
	public StudentBean login(StudentBean student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentBean find(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public StudentBean[] list() {
		return students;	
		}
	@Override
	public int CustumNum() {
		// TODO Auto-generated method stub
		return 0;
	}
}
