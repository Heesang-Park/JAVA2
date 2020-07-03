package pk23;

public class StringBuilderTest {
	public static void main(String[] args) {
		// immutable �Һ�(�����̴�)
		String javastr=new String("java");
		// ó�� ��ü�� �ν���ȭ�� �޸𸮰�
		System.out.println("javastr�� ���ڿ� �ּ�: "+System.identityHashCode(javastr));
		//String���κ��� StringBuilder�� ��ü�� ����
		StringBuilder buffer=new StringBuilder(javastr);
		// ������ �̷������ �� ���� hash��
		System.out.println("���� �� bufer�� �޸� �ּ�: "+System.identityHashCode(buffer));
		
		buffer.append(" and ");
		buffer.append("Android");
		buffer.append(" Programing is fun!");
		
		System.out.println("���� �� bufer�� �޸� �ּ�: "+System.identityHashCode(buffer));
		
		javastr=buffer.toString();
		System.out.println(javastr);
		System.out.println("���� ������� javastr�� ���ڿ� �ּ�: "+System.identityHashCode(javastr));
		
		
		
	}

}
