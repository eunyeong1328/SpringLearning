package com.spring.diex8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//<bean id="eCon" class="com.spring.diex4.MultipleLineExamPrint">
//	<property name="exam" ref="exam" />
//</bean>

//@Component("eCon")
public class MultipleLineExamPrint implements ExamConsole {
	@Autowired	
	@Qualifier("exam2")
	private Exam exam;
		
	public MultipleLineExamPrint(Exam exam) {
		this.exam = exam;
	}
	
	public MultipleLineExamPrint() {		
		System.out.println("MultipleLineExamPrint() ");
	}
	
	@Override
	public void setExam(Exam exam) {
		System.out.println("MultipleLineExamPrint()->setExam(Exam exam) !!");
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.println("total : " + exam.total() + " avg : " + exam.avg() );
	}

	

}
