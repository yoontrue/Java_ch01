package org.comstudy21.ch01_2;
import java.util.Scanner;
/**
 * 월과 일을 입력받아
 * 100일 뒤의 날짜가
 * 몇월 몇일 인지 출력하시오.
 * @author yoonj
 *
 */
public class HDays {
	static int[] days;
	static Scanner scan;
	static {
		days = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		scan = new Scanner(System.in);
	}
	public static void main(String[] args) {
		int day,month = 0;
		System.out.print("월 입력>>> ");
		month = scan.nextInt();
		while(month < 1 || month > 12) {	// 유효성 검사
			System.out.print("유효한 달 입력(1~12사이) : ");	 //유효값이 아니라면?
			month = scan.nextInt();// 다시 입력받음
		}
		System.out.print("일 입력>>> ");
		day = scan.nextInt();
		while(day < 1 || day > days[month-1]) {	// 유효성 검사
			System.out.printf("유효한 일 입력(1~%d사이) : ", days[month-1]); // 유효값 아니면?
			day = scan.nextInt();	// 다시 입력 받으슈
		}
		int oriMonth = month;	// 나중에 출력하기 위해 원래 날짜 저장
		int oriDay = day;	// 여기까지는 첫번째 방법과 똑같음.
		// 100일 후의 날짜를 D-day라고 생각하고 오늘을 D-100라고 생각하고 줄여나가기
		int remain = days[month-1] - day;// 입력받은 월의 남은 일자 계산
		remain = 100 - remain;	// 총 100일 후의 날짜를 구해야하는데, 100에서 현재 달의 남은 날짜를 빼고 남은 값.
		do {
			if(month>11) {	// 12월이후니?
				month=0;	// 후년 1월로 넘기기. 12월이 넘어가면 1월달 날짜부터 빼야하니 0으로 셋팅.
			}
			remain -= days[month];	// 현재달의 남은 일자는 아까 뺏으니 다음달 부터 뺀다.
			month++;
		}while(remain > 0); 	// 여전히 D-day가 아니니?
		// do~while문을 거치면서 원하는 달의 다음달까지 - 시키기 때문에 remain에는 음수값만 남음.
		day = days[month-1] + remain;	// 100일 후에 해당하는 월 + (-남은값)
		System.out.printf("%d월 %d일의 100일 후의 날짜는 %d월 %d일입니다.", oriMonth, oriDay, month, day);
	}
	public static void main02(String[] args) {
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
		int oriMonth = month;	// 나중에 출력하기 위해 원래 날짜 저장
		int oriDay = day;
		for(int i=0;i<100;i++) {	// 날짜에 하루씩 총 100일을 더해줄 것.
			day++;	// 날짜를 증가시키고
			if(day>days[month-1]) {	// 해당월의 마지막 날짜보다 크다면
				day=1;	// 다음달의 첫째날로 리셋하고
				month++;	// 달을 넘겨준다
				if(month>12) {	// 12월이 넘어갈 땐
					month=1;	// 후년 1월로 넘기기
				}
			}
		}
		System.out.printf("%d월 %d일의 100일 후의 날짜는 %d월 %d일입니다.", oriMonth, oriDay, month, day);
	}
}
