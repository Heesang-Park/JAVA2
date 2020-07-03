package pk22;

public class EqualsTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "�̻��");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "�̻��");
		
		// ������ �ּ��� �� �ν��Ͻ� ��
		if(studentLee==studentLee2) {
			System.out.println("�ּҰ� ����!");
		}
		else {
			System.out.println("�ּҰ� ���� �ʴ�!");
		}
		if(studentLee.equals(studentLee2)) {
			System.out.println("���뵵 ����!");
		}else {
			System.out.println("������ ���� �ʴ�");
		}
		
		// �ٸ� �ּҸ� ���� �ִ� ��ü�� ������ ���� ��
		if(studentLee==studentSang) {
			System.out.println("�ּҰ� ����!");
		}
		else {
			System.out.println("�ּҰ� ���� �ʴ�!");
		}
		if(studentLee.equals(studentSang)) {
			System.out.println("������ ����!");
		}else {
			System.out.println("������ ���� �ʴ�");
		}
		
		// �ν��Ͻ� ������ ��������� heap �޸� �ּ�
		System.out.println("studentLee�� hashcode ��: "+studentLee.hashCode());
		System.out.println("studentSang�� hashcode ��: "+studentSang.hashCode());
		// �ν��Ͻ� ���� �־����� ���� �ּ�
		System.out.println("studentLee�� �����ּ� ��: "+System.identityHashCode(studentLee));
		System.out.println("studentSang�� �����ּ� ��: "+System.identityHashCode(studentSang));
		
		
		
		
		
		
	}

}
