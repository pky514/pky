package struct;

import java.util.Scanner;



public class Program {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kor = 0;
		int eng = 0;
		int math = 0;
		
		int menu;
		
		EXAM : while(true)
		{
			menu = inputMenu();
			
			switch (menu) {
			case 1:
				inputExam(kor,eng,math);
				break;
			case 2:
				printExam(kor,eng,math);
				break;
			case 3:
				break;
			default:
				break EXAM;
			}
		}
	}

	public static void printExam(int kor, int eng, int math) {
		// TODO Auto-generated method stub
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

	public static void inputExam(int kor, int eng, int math) {
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
