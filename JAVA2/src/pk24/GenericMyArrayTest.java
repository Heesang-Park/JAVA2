package pk24;

class MyArray2<E>{
	private Object[] array= new Object[10];
	int i;
	
	public void add(E obj) {
		array[i++]=obj;
	}
	
	public E get(int index) {
		return (E)array[index];
		
	}
}

public class GenericMyArrayTest {
public static void main(String[] args) {
	
	// �ε����� 0���� �ּҰ� ��ŸƮ �ּ��̱� ������ �迭�� ��ü �ּ��̴�.
			MyArray2<String> myArray1=new MyArray2<String>();
			myArray1.add(new String("test1"));
			String str=myArray1.get(0); // ��������ȯ
			System.out.println(str);
			
			
			MyArray2<Integer> myArray2=new MyArray2<Integer>();
			myArray2.add(new Integer(100));
			Integer num=myArray2.get(0); // ���� ����ȯ
			System.out.println(num);
	
	
}
}
