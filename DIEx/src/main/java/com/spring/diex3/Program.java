package com.spring.diex3;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ǰ
		Exam exam = new LecExam(10,20,30);	
		//ExamConsole eCon = new OneLineExamPrint(exam);//������ ����鼭 ��
		ExamConsole eCon = new MutipleLineExamPrint(exam);
		
		eCon.print();
	
	}

}
