import java.util.Scanner;

class Hello {
	public static void main(String[] args) {
		int kor = 0;
		int math = 0;
		int eng = 0;

		int total = kor + math + eng;

		float avg = total / 3;

		int menu = 0;

		Scanner scan = new Scanner(System.in);

		 �ּ�ȯ :while (true) {
			System.out.println(
					" ����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
			System.out.println(
					" ��                                                                                                   ��");
			System.out.println(
					" ��                                           ���� �޴�                                                                                       ��");
			System.out.println(
					" ��                                                                                                   ��");
			System.out.println(
					" ����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");

			System.out.printf("1.���� �Է� \n");
			System.out.printf("2.���� ��� \n");
			System.out.printf("3.���� \n");
			System.out.print("���� > :");
			menu = scan.nextInt();

			switch (menu) {

				
				case 1: {
					System.out.println(
							" ����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
					System.out.println(
							" ��                                                                                                   ��");
					System.out.println(
							" ��                                                                                                   ��");
					System.out.println(
							" ��                                           ���� �Է�                                                                                       ��");
					System.out.println(
							" ��                                                                                                   ��");
					System.out.println(
							" ����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
	
					// System.out.println("���� ����\n");
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
					
					break;
				}
				case 2: {
					total = kor + math + eng;
	
					avg = total / 3;
	
					System.out.println(
							" ����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
					System.out.println(
							" ��                                                                                                   ��");
					System.out.println(
							" ��                                                                                                   ��");
					System.out.println(
							" ��                                           ���� ���                                                                                       ��");
					System.out.println(
							" ��                                                                                                   ��");
					System.out.println(
							" ����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
					
					for(int i = 0; i < 3; i++)
					{
						System.out.printf(" ���� : %d\n", kor);
						System.out.printf(" ���� : %d\n", math);
						System.out.printf(" ���� : %d\n", eng);
						System.out.printf(" ���� : %d\n", total);
						System.out.printf(" ��� : %f\n", avg);
					}
					break;
				}
				case 3:
				{
					System.out.println("bye~");
					break �ּ�ȯ;
				}
				default:
					
					System.out.println("����������?");
				
				
					
				
			}

		}

	}

}