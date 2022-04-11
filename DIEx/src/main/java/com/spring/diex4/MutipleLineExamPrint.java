package com.spring.diex4;

public class MutipleLineExamPrint implements ExamConsole {
	public Exam exam;
	
	public MutipleLineExamPrint(Exam exam) { //������
		this.exam = exam;
	}
	
	public MutipleLineExamPrint() { //�� ������
		System.out.println("MutipleLineExamPrint() ");
	}
	
	@Override
	public void setExam(Exam exam) {
		System.out.println("MutipleLineExamPrint() -> setExam(Exam exam) !!");
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.println("total : " + exam.total());
		System.out.println("avg : " + exam.avg());
	}
	
}
