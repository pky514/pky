package oop.collection;

public class GenericList<����> {

	private ����[] objects;
	private int index;
	private int capacity;
	
	public GenericList() {
		// TODO Auto-generated constructor stub
		objects = (����[]) new Object[3];
		index = 0;
		capacity = 3;
	}

	public void add(���� obj)
	{
		if(index >= capacity)
		{
			����[] temp = (����[]) new Object[capacity + 5];//���� �ִ� �迭�������� 5�� �߰�

			for (int j = 0; j < index; j++) {
				temp[j] = objects[j];
			}
			
			capacity +=5;
			
			objects = temp;
			
		}
								
		objects[index] = obj;

		index++;
	}

	public int get(int i) {
		// TODO Auto-generated method stub
	
		return (int) objects[i];
	}


}
