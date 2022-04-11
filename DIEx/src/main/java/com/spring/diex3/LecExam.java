package com.spring.diex3;

public class LecExam implements Exam{
	
	private int kor;
	private int eng;
	private int math;
	
	public LecExam(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public int total() {
		return (kor+eng+math);
	}

	@Override
	public float avg() {
		return (total()/3.0f);
	}
}
