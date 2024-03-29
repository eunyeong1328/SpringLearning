package com.spring.diex8;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//<bean id="exam" class="com.spring.diex4.LecExam">
//<property name="kor" value="10" />
//<property name="eng" value="10" />
//<property name="math" value="10" />
//</bean>

//@Component("exam")
public class LecExam implements Exam {
	//@Value("10")
	private int kor;
	//@Value("20")
	private int eng;
	//@Value("30")
	private int math;
		
	@Override
	public String toString() {
		return "LecExam kor=" + kor + ", eng=" + eng + ", math=" + math ;
	}

	public LecExam(int kor, int eng, int math) {
		System.out.println("LecExam(int kor, int eng, int math) !!");
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public LecExam() {
		System.out.println("LecExam ������ !!");
	}
	

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return (kor+eng+math);
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return (total() / 3.0f);
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		System.out.println("setKor(int kor) !!");
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		System.out.println("setEng(int eng) !!");
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		System.out.println("setMath(int math) !!");
		this.math = math;
	}
	
	
	
	

}
