package oop;

import java.util.Scanner;



public class ExamProgram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
	
		setValue(temp);
		System.out.println(temp);
	}

	public static void setValue(int temp)
	{
		temp = 3;
	}
	
	public static void printExam(Exam exam) {
		// TODO Auto-generated method stub
		int kor = exam.kor;
		int math = exam.math;
		int eng = exam.eng;
		
		int total = kor + math + eng;
		
		float avg = total / 3;
		
		System.out.println(" ����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
		System.out.println(" ��                                                                                                   ��");
		System.out.println(" ��                                           ���� �޴�                                                                                       ��");
		System.out.println(" ��                                                                                                   ��");
		System.out.println(" ����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");

		System.out.printf(" ���� : %d\n", kor);
		System.out.printf(" ���� : %d\n", math);
		System.out.printf(" ���� : %d\n", eng);
		System.out.printf(" ���� : %d\n", total);
		System.out.printf(" ��� : %f\n", avg);
		
		
		
	}

	public static void inputExam(Exam exam) {
		
		int kor;
		int math;
		int eng;
		
		// TODO Auto-generated method stub
		System.out.println(" ����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
		System.out.println(" ��                                                                                                    ��");
		System.out.println(" ��                                           ���� �Է�                                                                                       					  ��");
		System.out.println(" ��                                                                                                    ��");
		System.out.println(" ����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
		
		Scanner scan = new Scanner(System.in);

		System.out.printf(" ���� : ");
		kor = scan.nextInt();

		do
		{
			System.out.printf(" ���� : ");
			kor = scan.nextInt();
			if(kor > 100 || kor < 0)
			System.out.println("��ȿ�������� ������ �Է��ϼ��� 0~100");
		}
		while (kor > 100 || kor < 0);

		
		System.out.printf(" ���� : ");
		math = scan.nextInt();
		System.out.printf(" ���� : ");
		eng = scan.nextInt();
		
		exam.kor = kor;
		exam.math = math;
		exam.eng = eng;
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
