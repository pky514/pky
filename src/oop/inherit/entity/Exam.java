package oop.inherit.entity;

import java.util.Scanner;

public class Exam {

	private int kor;
	private int math;
	private int eng;
	
	public Exam(int kor,int math, int eng) {
		// TODO Auto-generated constructor stub
		System.out.println("�θ�");
		
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	

	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int total() {
		// TODO Auto-generated method stub
		return kor + math + eng;
	}
	
	public float avg() {
		// TODO Auto-generated method stub
		return total()/3.0f;
	}

}
