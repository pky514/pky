import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class LottoProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Random rand = new Random();

		int[] nums = new int[6];

		System.out.println();
		// �ε�
		for (int i = 0; i < 6; i++) {

			nums[i] = rand.nextInt(6) + 1;

			for (int j = 0; j < i; j++) {
				if (nums[i] == nums[j]) {
					System.out.printf("�ߺ�  %d %d \n" ,i ,nums[i]);
					
					while(true)
					{
						nums[i] = rand.nextInt(6) + 1;
						
						if (nums[i] != nums[j])
						{
							i--;
							break;
						}
					}
				}
			}
		}
		// ���
		for (int i = 0; i < nums.length; i++) {
			System.out.printf(" %d", nums[i]);
		}


	}

}
