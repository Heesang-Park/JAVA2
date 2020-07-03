package chapter23;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapNation {
	public static void main(String[] args) {
		
	HashMap<String, Integer> nations=new HashMap<String, Integer>();
	Scanner sc=new Scanner(System.in);
	// 입력부
	System.out.println("나라 이름, 인구 >>(예: Korea 5000) "); 
	while(true) {
		System.out.println("나라 이름, 인구 >> "); //Korea 5000
		// scanner로 입력받은 것을 변수방에 저장
		String nation=sc.next();
		// 변수방에 그만이라는 문자가 들어오면 브레이크(equals)
		if(nation.equals("그만")) {
			break;
		}
		// 인구를 입력 받아 population 변수방에 저장 scanner.nextlnt();
			int population=sc.nextInt();
		// nations.put 	
		nations.put(nation, population); // 햇맵 나라이름과 인구 저장	
	}
	
	// 인구 검색부
	while(true) {
		System.out.print("인구를 검색할 나라명을 입력하세요>> ");
		// scanncer로 입력받음
		String nation=sc.next();
		// 변수방에 그만이라는 문자가 들어오면 브레이크(equals)
		if(nation.equals("그만")) {
			System.out.println("프로그램 끝");
			break;
		}
		// nations.get(nation)으로 인구 추출해서 변수방에 저장
		Integer value=nations.get(nation);
		if(value==null)
			System.out.println(nation+" 나라는 없습니다");
		else
		System.out.println(nation+"의 인구는 "+value);
	}
		sc.close();

	
	}	
	
}
