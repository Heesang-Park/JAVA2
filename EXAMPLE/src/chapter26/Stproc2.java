package chapter26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Stproc2 {

	public static void main(String[] args) {
		Student[] student =new Student[4];// fixed
		HashMap<String, Student> manage=new HashMap<String, Student>();
	//======================�� ��===================
		Scanner sc=new Scanner(System.in);
		System.out.println("�л��̸�, �а�, �й�, ������� �Է��ϼ���");
		for(int i=0;i<student.length;i++) {
			System.out.print(">>");
			//�Է�
			String text=sc.nextLine();
			StringTokenizer st=new StringTokenizer(text,",");
			String name=st.nextToken().trim();
			String depart=st.nextToken().trim();
			String number=st.nextToken().trim();
			Double grade= Double.parseDouble(st.nextToken().trim());
			//fixed-length �ް�
			student[i]=new Student(name, depart, number, grade);
			manage.put(name, student[i]);
			
		}	
	//========================���=========================
		Set<String> key=manage.keySet();
		Iterator<String> it=key.iterator();
		while(it.hasNext()) {
			String name=it.next();
		System.out.println("--------------------------");
		Student s=manage.get(name);
		System.out.println("�̸�: "+s.getName());
		System.out.println("�а�: "+s.getDepart());
		System.out.println("�й�: "+s.getNumber());
		System.out.println("�������: "+s.getGrade());
		}			
		System.out.println("--------------------------");
		while(true) {
			System.out.println("�л� �̸�>> ");
			String name=sc.next();
			if(name.equals("�׸�")) {
				break;
			}
			else {
				Student s=manage.get(name);
				s.findStudent(name);
			}
				
		}
		sc.close();
		
	}
	
}
