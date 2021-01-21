package org.comstudy21.ch01;
import java.util.Scanner;
public class Ch01Ex01Gugudan {
	// 멤버 필드(변수)
	static Scanner scan = new Scanner(System.in);
	static final int MIN=2, MAX=9;
	// static은 클래스 멤버이다.
	// static이 없는것은 인스턴스 멤버이다.
	// 클래스, 객체
	// OOP (현실 세계에 있는 것들을 프로그램으로 만드는 것)
	// 추상화가 되어야 객체를 만들 수 있다.

	// 멤버 메소드

	// 과제 : 단 줄어들 때도 구현, 2~9단 사이만 출력쓰~
	
	public static void main(String[] args) {
		// 구구단 3행 3열
		// 시작단, 종료단 형태로 변경.
		int startDan = 0;
		int endDan = 0;
		System.out.print("몇 단부터 시작할까요 : ");
		startDan = scan.nextInt();
		while(startDan<MIN) {
			System.out.print("2~9사이 정수 입력 >>> ");
		}
		System.out.print("몇 단까지 출력할까요 : ");
		endDan = scan.nextInt();
		while(endDan>MAX) {
			System.out.print("2~9사이 정수 입력 >>> ");
		}
		// startDan이 endDan보다 크면 치환한다.
		if(startDan > endDan) {
			int tmp = startDan;
			startDan = endDan;
			endDan = tmp;
		}
		for(int i=startDan;i<=endDan;i+=3) {
			for(int j=1;j<=9;j++) {			
				for(int k=i;k<=(i+2);k++) {
					System.out.printf("%d X %d = %d\t",k,j,j*k);
				}
				System.out.println();
			}
			System.out.println();
		}
		scan.close();
	}
	public static void test02(String[] args) {
		int startDan = 0;
		int endDan = 0;
		System.out.print("몇 단부터 시작할까요 : ");
		startDan = scan.nextInt();
		System.out.print("몇 단까지 출력할까요 : ");
		endDan = scan.nextInt();
		// startDan이 endDan보다 크면 치환한다.
		if(startDan > endDan) {
			int tmp = startDan;
			startDan = endDan;
			endDan = tmp;
		}
		for (int cnt = 1; cnt <= 9; cnt++) {
			for (int dan = startDan; dan <= endDan; dan++) {
				System.out.printf("%d X %d = %d\t", dan, cnt, dan * cnt);
			}
			System.out.println();
		}
		scan.close();
	}
	public static void main02(String[] args) {
		System.out.print("몇단부터 출력할까요 : ");
		int startDan = scan.nextInt();
		System.out.print("몇단까지 출력할까요 : ");
		int endDan = scan.nextInt();

		for (int cnt = 1; cnt <= 9; cnt++) {
			if (startDan > endDan) { // 큰단 >> 작은단
				for (int dan = startDan; dan >= endDan; dan--) {
					if(dan > 9 || dan < 2)
						continue;
					System.out.printf("%d X %d = %d\t", dan, cnt, dan * cnt);
				}
			} else { // 작은단 >> 큰단
				for (int dan = startDan; dan <= endDan; dan++) {
					if(dan < 2 || dan > 9)
						continue;
					System.out.printf("%d X %d = %d\t", dan, cnt, dan * cnt);
				}
			}
			System.out.println();
		}
		scan.close();
	}

	public static void test3(String[] args) {
		// 특수문자 문자열 : \" \' \@ \\
		// 나는 "김윤진"이다
		// 나는 \"김윤진\"이다
		for (int cnt = 1; cnt <= 9; cnt++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.printf("%d X %d = %d\t", dan, cnt, dan * cnt);
			}
			System.out.println();
		}
	}			

	public static void test2(String[] args) {
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("***" + dan + "***");
			for (int cnt = 1; cnt <= 9; cnt++) {
				String str = String.format("%d X %d = %d", dan, cnt, dan * cnt);
				System.out.println(str);
			}
		}
	}

	public static void test(String[] args) {
		// 2단 출력
		int dan = 2;
		for (int cnt = 1; cnt <= 9; cnt++) {
//			System.out.println(dan + "*" + cnt + "=" + dan*cnt);
//			System.out.printf("%d X %d = %d\t",dan,cnt,dan*cnt);
			// 변환문자열기호 : %d, %o, %x, %s, %.3f ...
//			System.out.println(String.format("%d X %d = %d", dan,cnt,dan*cnt));
			String str = String.format("%d X %d = %d", dan, cnt, dan * cnt);
			System.out.println(str);
		}
//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d X %d = %2d",i,j,i*j);
//			}
//		}
	}
}
