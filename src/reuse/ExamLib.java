package reuse;

import java.util.Scanner;



public class ExamLib {

	public static void print(Exam exam) {
		// TODO Auto-generated method stub
		int kor = exam.kor;
		int math = exam.kor;
		int eng = exam.kor;
		
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

	public static void input(Exam exam) {
		// TODO Auto-generated method stub
		int kor = exam.kor;
		int math = exam.math;
		int eng = exam.eng;
		
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
