package oop.inherit.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;

public class ChartPanel extends Panel {
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		int offset = 100;

		int originX = offset;
		int originY = 1024 - offset;
		
		String arrowUp = "��";
		String arrowRight = "��";
		
		String[] value1 = { "2", "4", "6", "8", "10" };
		String[] value2 = { "20", "40", "60", "80", "100" };
		
		g.setColor(Color.blue);
		g.drawLine(offset, 1024 - offset + 20 , offset, offset);//������
		g.drawString(arrowUp, offset -5, offset);//���� �� ȭ��ǥ
		g.drawLine(offset - 20, 1024 - offset, 1024 - offset, 1024 - offset );//������
		g.drawString(arrowRight, 1024 - offset, 1024 - offset +5);//������ �ϴ� ȭ��ǥ
		
		g.setColor(Color.red);
		g.drawLine(1024 - offset, 1024 - offset + 20, 1024 - offset, offset);//
		g.drawString(arrowUp,  1024 - offset-5, offset);//������ �� ȭ��ǥ

		for (int y = 0; y < 5; y++) {
			g.setColor(Color.black);
			g.drawString(value1[y], originX - 30, originY - 150 + (-150 * y));
			g.drawString(value2[y], 1024 - offset + 30, originY - 150 + (-150 * y));
			
			for (int x = 0; x < 83; x++) {
				g.setColor(Color.green);
				g.drawOval(originX + (x * 10), originY - 150 + (-150 * y), 4, 4);
			}
		}

		String text1 = "�ο�(��)";
		String text2 = "������뵵��(%)";
		//�ο� ��, ������뵵��
		g.setColor(Color.black);
		g.drawString(text1, offset, offset - 20);

		g.drawString(text2, 1024 - offset, offset - 20);

	}
}
