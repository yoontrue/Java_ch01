package org.comstudy21.ch01_2;

import java.util.Scanner;

/**
 * 메소드 호출부
 * 
 * @author yoonj
 *
 */
public class Ch01Ex03 {
	// 멤버필드 - 자동 초기화된다. (숫자형은 0, 객체형은 null로)
	static int[] days;
	static int total;
	static Scanner scan;
	// static 초기화 블럭 - 생성자보다 먼저 실행된다.
	static {
		// 필드에서 선언 후에 초기화 할 때는 new 붙여줘야 함
		days = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		total = 0;
		scan = new Scanner(System.in);
	}
	// 초기화 블럭은 대괄호만 사용 - 객체 생성 전에 호출됨.
	{
		total = 0;
	}

	// 생성자 - 객체를 생성할 때 호출 되는 메소드
	public Ch01Ex03() {
		// 멤버 필드를 초기화하는 목적으로 호출된다.
	}

	public static void main(String[] args) {
		int day = 0;
		int month = 0;
		System.out.print("월 입력>>> ");
		month = scan.nextInt();
		while(month < 1 || month > 12) {	// 유효성 검사
			System.out.print("유효한 달 입력(1~12사이) : ");	 //유효값이 아니라면?
			month = scan.nextInt();// 다시 입력받음
		}
		System.out.print("일 입력>>> ");
		day = scan.nextInt();
		while(day < 1 || day > days[month-1]) {	// 유효성 검사
			System.out.printf("유효한 일 입력(1~%d사이) : ",days[month-1]); // 유효값 아니면?
			day = scan.nextInt();	// 다시 입력 받으슈
		}	
		int oriMonth = month;
		int oriDay = day;
		for(int i=0;i<100;i++) {
			day++;
			if(day>days[month-1]) {
				day=1;
				month++;
				if(month>12) {
					month=1;
				}
			}
		}
		System.out.printf("%d월 %d일의 100일 후의 날짜는 %d월 %d일입니다.", oriMonth, oriDay, month, day);
	}

	public static void main1(String[] args) {
		int day = 0;
		int month = 0;
		int newDay = 0;
		int newMonth = 0;
		int countDay = 0;
		System.out.print("월 입력>>> ");
		month = scan.nextInt();
		System.out.print("일 입력>>> ");
		day = scan.nextInt();

		countDay = days[month - 1] - day; // 입력받은 month에 해당 하는 달의 총 일수에서 입력받은 day만큼의 날짜를 뺀다.
		// 즉 현재 n월m일 에서부터 n월의 마지막 일까지의 값.
		int i = month; // 가상으로 월을 세어주는 변수
		while (countDay < 100) {
			countDay += days[i]; // 입력받은 월 다음 달부터의 월에 해당하는 일수를 더해 줌
			i++;
		}
		newMonth = i; // 가상으로 세어줬던 월을 newMonth에 할당
		newDay = days[newMonth] - (countDay - 99);
		// while문에서 i++로 끝났기때문에 newMonth-1이 아닌 newMonth넣은거
		System.out.printf("%d월 %d일의 100일 후의 날짜는 %d월 %d일입니다.", month, day, newMonth, newDay);
	}

	public static void test04(String[] args) {
		// 월, 일을 입력받고 1월1일부터 월,일까지 몇일 인지
		int addDay = 0;
		int month = 0;
		System.out.print("월 입력>>> ");
		month = scan.nextInt();
		System.out.print("일 입력>>> ");
		addDay = scan.nextInt();
		int total = 0;
		for (int i = 0; i < month - 1; i++) {
			total += days[i]; // 31
		}
		total += addDay;
		System.out.printf("1월1일부터 %d월%d일까지 %d일째 입니다.", month, addDay, total);
	}

	public static void test03(String[] args) {
		// 월을 입력 받아서 해당 월은 몇일까지 있는지 출력
		// 지역변수(local variable)은 초기화 필수
		int month = 0;
		System.out.print("월 입력>>> ");
		month = scan.nextInt();

		System.out.printf("%d월은 %d일까지 있습니다.", month, days[month - 1]);

	}

	public static void test02(String[] args) {
		System.out.println("100일 후 날짜를 구하는 프로그램");
		// 선언된 메소드는 다른 메소드에서 호출 가능
		test();
	}

	/**
	 * 메소드 선언부
	 */
	public static void test() {
		for (int i = 0; i < 12; i++) {
			total += days[i];
		}
		System.out.printf("1년은 %d일 입니다\n", total);
	}
}
