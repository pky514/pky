package oop.inter.entity;

public abstract class Exam {

	private int kor;
	private int math;
	private int eng;
	

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
	
	public abstract float avg();

}
