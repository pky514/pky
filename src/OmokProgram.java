import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] board = new char[15][20];

		Scanner scan = new Scanner(System.in);

		// Init
		for (int y = 0; y < 15; y++) {

			for (int x = 0; x < 20; x++) {
				board[y][x] = '��';
			}
		}

		for (int y = 0; y < 15; y++) {

			for (int x = 0; x < 20; x++) {
				System.out.printf("%c", board[y][x]);
			}
			System.out.println();

		}

		int posX, posY;

		int cnt = 0;

		String[] omokIndex = new String[100];

		GAME :while (true) {

			System.out.print("���� �Է� X sp Y \n");

			System.out.print("������ 0 sp 0 \n");

			posX = scan.nextInt();

			posY = scan.nextInt();

			// ������ ���
			if (posX == 0 && posY == 0) {

				if (cnt == 0) {

					System.out.println("������ ���� �ٽ���");
					continue;
				}

				int fakeX, fakeY;

				String fake[] = omokIndex[cnt - 1].split(" ");

				System.out.println(fake[0]);
				System.out.println(fake[1]);

				board[Integer.parseInt(fake[0]) - 1][Integer.parseInt(fake[1]) - 1] = '��';
				cnt--;

				for (int y = 0; y < 15; y++) {

					for (int x = 0; x < 20; x++) {
						System.out.printf("%c", board[y][x]);
					}
					System.out.println();
				}
				continue;
			}

			// �Է°� ���� ���
			if ((posX > 20 || posY > 15) || (posX <= 0 || posY <= 0)) {
				System.out.println("�Է°� ���� ���");
				continue;
			}

			// �ߺ� üũ
			if (cnt != 0 && board[posY - 1][posX - 1] != '��') {
				System.out.println("�ߺ��̾� �ٽ���");
				continue;
			}

			// �Է¹��� ��ġ���� �ش� �� ����
			if (cnt % 2 == 0) {
				board[posY - 1][posX - 1] = '��';
			} else {
				board[posY - 1][posX - 1] = '��';
			}

			// �� ���� ��ġ ���
			omokIndex[cnt] = String.format("%d %d", posX, posY);
			System.out.println(omokIndex[cnt]);

			// ī��Ʈ ����
			cnt++;

			for (int y = 0; y < 15; y++) {

				for (int x = 0; x < 20; x++) {
					System.out.printf("%c", board[y][x]);
				}

				System.out.println();

			}

			int offset = 5;
			
			// - ���� �˻�
			for (int y = 0; y < 15 - offset; y++) {

				for (int x = 0; x < 20 - offset; x++) {
					if (board[y][x] != '��')
					{
						int count = 0;
						for (int i = 0; i < 5; i++) {
					
							if (board[y][x + i] == board[y][x]) {
								
								count++;
								if (count == 5) {
									
									System.out.printf(" %c ��",board[y][x]);
									break GAME;

								}
							}
						}
					}

				}
			}
			// | ���� �˻�
			for (int y = 0; y < 15 - offset; y++) {

				for (int x = 0; x < 20 - offset; x++) {
					if (board[y][x] != '��')
					{
						int count = 0;
						for (int i = 0; i < 5; i++) {
					
							if (board[y+i][x] == board[y][x]) {
								
								count++;
								if (count == 5) {
									
									System.out.printf(" %c ��",board[y][x]);
									break GAME;

								}
							}
						}
					}

				}
			}
			
			// �밢��
			for (int y = 0; y < 15 - offset; y++) {

				for (int x = 0; x < 20 - offset; x++) {
					if (board[y][x] != '��')
					{
						int count = 0;
						for (int i = 0; i < 5; i++) {
					
							if (board[y + i][x + i] == board[y][x]) {
								
								count++;
								if (count == 5) {
									
									System.out.printf(" %c ��",board[y][x]);
									break GAME;

								}
							}
						}
					}

				}
			}
			

			System.out.println();
		}
	}

}
