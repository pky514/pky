import java.util.Scanner;

public class Kyg0208 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
	
		Scanner scan = new Scanner(System.in);

		while (true) {

			count = 1;
			num = scan.nextInt();

			// System.out.print();
			int array[] = squareCount(num);

			for (int i = array.length - 1; 0 <= i; i--) {
				System.out.print(array[i]);
			}
			
			System.out.println();
		}

	}

	public static int count = 1;

	// ������ ���� ���Ѵ�.
	public static int[] squareCount(int num) {

		count = 1;
		int initNum = 2;
		while (initNum * 2 <= num) {
			initNum *= 2;
			count++;
		}

		// System.out.printf("count :%d", count);

		int array[] = new int[count];

		count = 0;
		// �������� ���� 2���� ũ�� �迭�� �������� ����
		// �ƴҰ�� ���� ����
		while ((num / 2) >= 2) {
			array[count] = num % 2;
			num /= 2;
			count++;
		}
		array[count] = num / 2;

		for(int i = 0; i < array.length;i++)
		{
			System.out.println(array[i]);
		}
		return array;
	}

}
