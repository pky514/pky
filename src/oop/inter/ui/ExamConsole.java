package oop.inter.ui;

import java.util.Scanner;

import oop.inter.entity.Exam;


public class ExamConsole {

	
	
	private Exam exam;
	
	
	private PrintListener printListener;
	
	
	public void setPrintListener(PrintListener printListener) {
		this.printListener = printListener;
	}


	public ExamConsole(Exam exam) {
		// TODO Auto-generated constructor stub
		 this.exam = exam;
	}

	
	public Exam getExam() {
		return exam;
	}


	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public void print() {
		// TODO Auto-generated method stub
		int kor = exam.getKor();
		int math = exam.getMath();
		int eng = exam.getEng();
		
		int total = exam.total();
		
		float avg = exam.avg();
		
		System.out.println(" ����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
		System.out.println(" ��                                                                                                    ��");
		System.out.println(" ��                                           ���� ���                                                                                       					  ��");
		System.out.println(" ��                                                                                                    ��");
		System.out.println(" ����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
		

		
		
		System.out.printf(" ���� : %d\n", kor);
		System.out.printf(" ���� : %d\n", math);
		System.out.printf(" ���� : %d\n", eng);
		if(printListener != null)
			printListener.onPrint(exam);
		System.out.printf(" ���� : %d\n", total);
		System.out.printf(" ��� : %f\n", avg);
		
	}


	
	public void input() {
		// TODO Auto-generated method stub
		int kor;
		int math ;
		int eng ;
		
		System.out.println(" ����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
		System.out.println(" ��                                                                                                    ��");
		System.out.println(" ��                                           ���� �Է�                                                                                       					  ��");
		System.out.println(" ��                                                                                                    ��");
		System.out.println(" ����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
		
		Scanner scan = new Scanner(System.in);

		do
		{
			System.out.printf(" ���� : ");
			kor = scan.nextInt();
			if(0 > kor || kor > 100)
			System.out.println("��ȿ�������� ������ �Է��ϼ��� 0~100");
		}
		while (0 > kor || kor > 100);

		
		System.out.printf(" ���� : ");
		math = scan.nextInt();
		System.out.printf(" ���� : ");
		eng = scan.nextInt();
		
		exam.setEng(eng);
		exam.setKor(kor);
		exam.setMath(math);

	}

	public static int inputMenu() {
		// TODO Auto-generated method stub
		int menu =0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" ����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
		System.out.println(" ��                                                                                                    ��");
		System.out.println(" ��                                           ���� ���                                                                                       					  ��");
		System.out.println(" ��                                                                                                    ��");
		System.out.println(" ����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");

		System.out.printf("1.���� �Է� \n");
		System.out.printf("2.���� ��� \n");
		System.out.printf("3.���� \n");
		System.out.print("���� > :");
		
		menu = scan.nextInt();
	
		return menu;
	}


}
