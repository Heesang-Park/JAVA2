package chapter23;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapNation {
	public static void main(String[] args) {
		
	HashMap<String, Integer> nations=new HashMap<String, Integer>();
	Scanner sc=new Scanner(System.in);
	// �Էº�
	System.out.println("���� �̸�, �α� >>(��: Korea 5000) "); 
	while(true) {
		System.out.println("���� �̸�, �α� >> "); //Korea 5000
		// scanner�� �Է¹��� ���� �����濡 ����
		String nation=sc.next();
		// �����濡 �׸��̶�� ���ڰ� ������ �극��ũ(equals)
		if(nation.equals("�׸�")) {
			break;
		}
		// �α��� �Է� �޾� population �����濡 ���� scanner.nextlnt();
			int population=sc.nextInt();
		// nations.put 	
		nations.put(nation, population); // �޸� �����̸��� �α� ����	
	}
	
	// �α� �˻���
	while(true) {
		System.out.print("�α��� �˻��� ������� �Է��ϼ���>> ");
		// scanncer�� �Է¹���
		String nation=sc.next();
		// �����濡 �׸��̶�� ���ڰ� ������ �극��ũ(equals)
		if(nation.equals("�׸�")) {
			System.out.println("���α׷� ��");
			break;
		}
		// nations.get(nation)���� �α� �����ؼ� �����濡 ����
		Integer value=nations.get(nation);
		if(value==null)
			System.out.println(nation+" ����� �����ϴ�");
		else
		System.out.println(nation+"�� �α��� "+value);
	}
		sc.close();

	
	}	
	
}
