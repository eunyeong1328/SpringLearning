package com.spring.diex3;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//何前
		Exam exam = new LecExam(10,20,30);	
		//ExamConsole eCon = new OneLineExamPrint(exam);//积己磊 父甸搁辑 林
		ExamConsole eCon = new MutipleLineExamPrint(exam);
		
		eCon.print();
	
	}

}
