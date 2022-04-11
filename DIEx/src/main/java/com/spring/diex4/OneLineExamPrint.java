package com.spring.diex4;

public class OneLineExamPrint implements ExamConsole{
	private Exam exam;
	
	public OneLineExamPrint(Exam exam) {
		this.exam = exam;
	}
	
	public OneLineExamPrint() {
		System.out.println();
	}
	
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public void print() {
		System.out.println("total : " + exam.total() + ", avg : " + exam.avg());
	}

}
