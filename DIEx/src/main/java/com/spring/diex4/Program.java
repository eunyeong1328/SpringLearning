package com.spring.diex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		
		//부품
//		Exam exam = new LecExam(10,20,30);	//Exam 객체, LexExam클래스
		//ExamConsole eCon = new OneLineExamPrint(exam);//생성자 만들면서 주입
		//ExamConsole eCon = new MutipleLineExamPrint(exam);s
		
//		ExamConsole eCon = new MutipleLineExamPrint();
//		eCon.setExam(exam);
//		
//		eCon.print();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("setting.xml");
		
		Exam exam = (Exam) context.getBean("exam2"); //" getBean을 이용해서"  객체를 가져올때  객체이름,클래스 타입을 이용
//		Exam exam = context.getBean(Exam.class)
		
		ExamConsole eCon = context.getBean(ExamConsole.class);
		eCon.print();
		
		//-----------------------------------
	
	}

}
