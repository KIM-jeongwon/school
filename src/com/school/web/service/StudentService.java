package com.school.web.service;

import com.school.web.bean.StudentBean;

public interface StudentService {
	public int CustumNum();
	public void addStudent(StudentBean student);
	public void addScore(StudentBean score);
	public StudentBean login(StudentBean student);
	public StudentBean find(String id);
	public void setCount(int count);
	public int getCount();
	public StudentBean[] list();
	public StudentBean findStudentById(String id);
	public StudentBean[] findStudentByName(String name);
	public void updatePassword(StudentBean student);
	public void deleteId(String id);
	
}
