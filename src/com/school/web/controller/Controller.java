package com.school.web.controller;

import java.util.Scanner;

import com.school.web.bean.StudentBean;
import com.school.web.service.StudentService;
import com.school.web.serviceImpl.StudentServiceImpl;

public class Controller {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생수를입력하세요.");
		int count = scanner.nextInt();
		StudentService studentService = new StudentServiceImpl(count);
		StudentBean student = null;
		while (true) {
			System.out.println("[메뉴] 0.종료  1.학생부등록  2.성적등록  3.총학생수"
								+"  4.학생이름 리스트  5.내정보 보기  6.이름검색");
			int a = scanner.nextInt();
			switch (a) {
			case 0:
				System.out.println("종료합니다.");
				return;
			case 1:
				student = new StudentBean();
				System.out.println("아이디 입력");
				student.setId(scanner.next());
				System.out.println("패스워드 입력");
				student.setPass(scanner.next());
				System.out.println("이름 입력");
				student.setName(scanner.next());
				studentService.addStudent(student);
				break;
			case 2:

				break;
			case 3:
				System.out.println("총학생수는" 
								+ studentService.getCount());
				break;
			case 4:
				StudentBean[] students = studentService.list();
				for(int i =0; i < students.length; i++) {
					System.out.println(students[i].getName());
				}
				break;
			case 5 : 
				System.out.println("아이디");
				String id = scanner.next();
				StudentBean temp = studentService.findStudentById(id);
				System.out.println(temp.getId());
				break;
			case 6 : 
				System.out.println("이름");
				String name = scanner.next();
				StudentBean[] temp2 = studentService.findStudentByName(name);
				if(temp2 == null) {
					System.out.println("검색하려는 이름이 존재 하지 않습니다.");
				}else {
					for(int i =0; i<temp2.length;i++) {
						System.out.println(temp2[i].toString());
					}
				}
						break;
			}
		}

	}
}
