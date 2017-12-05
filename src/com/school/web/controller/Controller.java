package com.school.web.controller;



import javax.swing.JOptionPane;

import com.school.web.bean.StudentBean;
import com.school.web.service.StudentService;
import com.school.web.serviceImpl.StudentServiceImpl;
import com.school.web.ui.MainPage;

public class Controller {
	public static void main(String[] args) {
		StudentService studentService = new StudentServiceImpl();
		StudentBean student = null;
		StudentBean[] students = null;
		String  showMsg= "";
		while (true) {
			switch (Integer.parseInt(JOptionPane
					.showInputDialog("[메뉴] 0.종료\n  "
							+ "1.학생부등록  2.성적등록  3.총학생수\n"
					+"  4.학생이름 리스트  5.내정보 보기  6.이름검색\n "
					+ " 7.비번변경 8.삭제  9.화면보기"))) {
			case 0:
				JOptionPane.showMessageDialog(null, "종료합니다.");
				return;
			case 1:
				// String sSetId = integer.parsInt(setId);
				// 
				student = new StudentBean();//[]
				student.setId(JOptionPane
						.showInputDialog("아이디 입력"));
				student.setPass(JOptionPane
						.showInputDialog("비밀번호 입력"));
				student.setName(JOptionPane
						.showInputDialog("이름 입력"));
				studentService.addStudent(student);
				JOptionPane.showMessageDialog(null, "등록 완료");
				break;
			case 2:

				break;
			case 3:
				JOptionPane.showMessageDialog(null, "총학생수는 " 
								+ studentService.getCount() +" 명 입니다.");
				break;
			case 4:
				students = studentService.list();
				showMsg = "";
				for(int i =0; i < studentService.getCount(); i++) {
					showMsg += students[i].getName()+"\n";
				}
				JOptionPane.showMessageDialog(null, showMsg);
				break;
			case 5 :
				student = studentService.
								findStudentById(JOptionPane
										.showInputDialog("아이디 입력"));
				
				JOptionPane.showMessageDialog(null, student.getId());
				break;
			case 6 : 
				showMsg = "";
				students = studentService.
								findStudentByName(JOptionPane
										.showInputDialog("이름 입력"));
				if(students == null) {
						JOptionPane.showMessageDialog(null, "검색하려는 이름이 존재 하지 않습니다.");
				}else {
					for(int i =0; i<students.length;i++) {
						showMsg +=students[i].toString();
					}
				}
					JOptionPane.showMessageDialog(null, showMsg);
						break;
			case 7 :
				student = new StudentBean();
				student.setId(JOptionPane
						.showInputDialog("수정하고자 하는 아이디 입력"));
				student.setPass(JOptionPane
						.showInputDialog("수정하고자 하는 비밀번호 입력"));
				studentService.updatePassword(student);
				JOptionPane.showMessageDialog(null, "수정완료");
				StudentBean reId = studentService.findStudentById(student.getId());
				System.out.println(reId.toString());
				break;
			case 8 :
				studentService.deleteId(JOptionPane
						.showInputDialog("삭제할 ID"));
				break;
			case 9 :
				System.out.println("화면 보기");
				MainPage mp = new MainPage();
				break;
			}
		}

	}
}
