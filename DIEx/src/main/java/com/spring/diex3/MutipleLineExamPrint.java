package com.spring.diex3;

public class MutipleLineExamPrint implements ExamConsole {
	public Exam exam;
	
	public MutipleLineExamPrint(Exam exam) {
		super();
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.println("total : " + exam.total());
		System.out.println("avg : " + exam.avg());
	}
	
}
