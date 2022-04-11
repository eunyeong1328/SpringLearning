package com.spring.diex3;

public class OneLineExamPrint implements ExamConsole{
	private Exam exam;
	
	
	
	public OneLineExamPrint(Exam exam) {
		super();
		this.exam = exam;
	}



	public void print() {
		System.out.println("total : " + exam.total() + ", avg : " + exam.avg());
	}
}
