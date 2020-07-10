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
	//======================입 력===================
		Scanner sc=new Scanner(System.in);
		System.out.println("학생이름, 학과, 학번, 학점평균 입력하세요");
		for(int i=0;i<student.length;i++) {
			System.out.print(">>");
			//입력
			String text=sc.nextLine();
			StringTokenizer st=new StringTokenizer(text,",");
			String name=st.nextToken().trim();
			String depart=st.nextToken().trim();
			String number=st.nextToken().trim();
			Double grade= Double.parseDouble(st.nextToken().trim());
			//fixed-length 받고
			student[i]=new Student(name, depart, number, grade);
			manage.put(name, student[i]);
			
		}	
	//========================출력=========================
		Set<String> key=manage.keySet();
		Iterator<String> it=key.iterator();
		while(it.hasNext()) {
			String name=it.next();
		System.out.println("--------------------------");
		Student s=manage.get(name);
		System.out.println("이름: "+s.getName());
		System.out.println("학과: "+s.getDepart());
		System.out.println("학번: "+s.getNumber());
		System.out.println("학점평균: "+s.getGrade());
		}			
		System.out.println("--------------------------");
		while(true) {
			System.out.println("학생 이름>> ");
			String name=sc.next();
			if(name.equals("그만")) {
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
