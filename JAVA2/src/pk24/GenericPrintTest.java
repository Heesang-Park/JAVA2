package pk24;

public class GenericPrintTest {
	
	public static void main(String[] args) {
		/*TŸ���� ��ü�� ��� Ŭ�������� ����� 
		 �����Ͽ� �ڵ����� Ŭ������ ����ȯ�� ������ */
		
		GenericPrinter<Powder> powderprint=new GenericPrinter<Powder>();
		powderprint.setMaterial(new Powder());
		Powder powder=powderprint.getMaterial(); // �� ��ȯ ���� ����
		
		System.out.println(powder);
		
		GenericPrinter<Plastic> plasticprint=new GenericPrinter<Plastic>();
		plasticprint.setMaterial(new Plastic());
		Plastic plastic=plasticprint.getMaterial(); // �� ��ȯ ���� ����
		
		System.out.println(plastic);
		
		// ���� ���� ���Ǽ��� �ȵ����� ���׸��� Ư���� ����ϴ� ����߻�
		/*GenericPrinter<Water> waterprint=new GenericPrinter<Water>();
		waterprint.setMaterial(new Water());
		Water water=waterprint.getMaterial();
		
		System.out.println(water);*/
		
		
	}

}
