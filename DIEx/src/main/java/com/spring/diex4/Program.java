package com.spring.diex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		
		//��ǰ
//		Exam exam = new LecExam(10,20,30);	//Exam ��ü, LexExamŬ����
		//ExamConsole eCon = new OneLineExamPrint(exam);//������ ����鼭 ����
		//ExamConsole eCon = new MutipleLineExamPrint(exam);s
		
//		ExamConsole eCon = new MutipleLineExamPrint();
//		eCon.setExam(exam);
//		
//		eCon.print();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("setting.xml");
		
		Exam exam = (Exam) context.getBean("exam2"); //" getBean�� �̿��ؼ�"  ��ü�� �����ö�  ��ü�̸�,Ŭ���� Ÿ���� �̿�
//		Exam exam = context.getBean(Exam.class)
		
		ExamConsole eCon = context.getBean(ExamConsole.class);
		eCon.print();
		
		//-----------------------------------
	
	}

}
