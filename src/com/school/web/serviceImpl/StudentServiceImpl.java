package com.school.web.serviceImpl;

import com.school.web.bean.StudentBean;
import com.school.web.service.StudentService;

public class StudentServiceImpl implements StudentService {
	private StudentBean[] students;
	private int count;

	public StudentServiceImpl(int count) {
		this.count = 0;
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
		this.students[count] = student;
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

	@Override
	public StudentBean findStudentById(String id) {
		StudentBean student = new StudentBean();
		for (int i = 0; i < count; i++) {
			if (id.equals(students[i].getId())) {
				student = students[i];
				break;
			}
		}
		return student;
	}

	@Override
	public StudentBean[] findStudentByName(String name) {
		StudentBean[] student =null;
		int count = 0;
		for (int i = 0; i < this.count; i++) {
			if (name.equals(students[i].getName())) {
				count++;
			}
		}
		if(count!=0) {
			student = new StudentBean[count];
		}
		for (int i = 0, num = 0; i < this.count; i++) {
			if (name.equals(students[i].getName())) {
				student[num] = students[i];
				num++;
				if(num == count) {
					break;
				}

			}
		}
		return student;
	}
}
