package com.spring.diex5;

public class LecExam implements Exam{
	
	private int kor;
	private int eng;
	private int math;
	
	
	@Override
	public String toString() {
		return "LecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}

	public LecExam(int kor, int eng, int math) {
		System.out.println("LecExam(int kor, int eng, int math) !!");
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public LecExam() { //ºó»ý¼ºÀÚ
		System.out.println("LexExam()..!!");
	}

	@Override
	public int total() {
		return (kor+eng+math);
	}

	@Override
	public float avg() {
		return (total()/3.0f);
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		System.out.println("setKor()..!!");
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		System.out.println("setEng()..!!");
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		System.out.println("setMath()..!!");
		this.math = math;
	}
	
	
}
