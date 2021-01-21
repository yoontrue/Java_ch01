package org.comstudy21.ch01;
import java.util.Scanner;
public class HwGugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = 0, end = 0;
		System.out.print("몇 단 부터?");
		while(start < 2 || start > 9) {
			start = sc.nextInt();
			System.out.println("2~9사이의 수만 입력해주세요");
		}
		System.out.print("몇 단 까지?");
		while(end < 2 || end > 9) {
			end = sc.nextInt();
			System.out.println("2~9사이의 수만 입력해주세요");
		}
		if(start > end) {	// 시작>끝 이면 스위치해준다.
			int abc = start;
			start = end;
			end = abc;
		}
		for (int k = start; k <= end; k += 3) {
			for (int j = 1; j <= 9; j++) {
				for (int i = k; i <= k + 2; i++) {
					if(i<=end) { // end단 보다 큰 단이 나오지 않게 막기. 이걸 안하면 3,6 입력했을때 3단부터 8단까지 나옴.
						System.out.printf("%d X %d = %d\t",i,j,i*j);
					}
				}
				System.out.println();
			}
			System.out.println();
		}
		sc.close();
	}
}
