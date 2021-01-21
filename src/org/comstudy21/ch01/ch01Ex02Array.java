package org.comstudy21.ch01;
import java.util.Arrays;
public class ch01Ex02Array {
	public static void main(String[] args) {
		final int MAX = 45, SIZE = 6;
		int[] lotto = new int[SIZE];
		int cnt = 0;
		int num = 0;
		lotto[0] = 1 + (int)(Math.random() * MAX); // 비교를 위해 0번째 lotto에 값을 먼저 할당한 후
		for(cnt=1;cnt<SIZE;cnt++) {	// 2번째부터 6번째까지. SIZE대신 lotto.length써도 됨.
			num = 1 + (int)(Math.random() * MAX); // 랜덤값 1개 생성
			for(int j=0;j<cnt;j++) { // 방금 생성한 랜덤 값이랑 기존에 배열에 있는 값들 비교할 것
				if(lotto[j] != num) { // 같은 값이 있는지 먼저 비교후에 같은값이 아니면
					lotto[cnt] = num;	// 배열에 랜던값 할당
				} else { // 아닌 경우
					cnt--; // 랜덤 값 다시 뽑기 위해 돌아감
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
	
	public static void main02(String[] args) {
		final int MAX = 45, SIZE = 6;
		int[] lotto = new int[SIZE];
		int cnt = 0;	// 요소번호
		int num = 0;	// 랜덤값 생성해서 할당할 곳

		for(cnt=0;cnt<SIZE;cnt++) {	// 요소번호는 0~5까지. SIZE대신 lotto.length써도 됨.
			num = 1 + (int)(Math.random() * MAX); // 랜덤값 1개 생성
			lotto[cnt] = num;	// 배열에 랜던값 먼저 할당 한 후
			for(int j=0;j<cnt;j++) { // 0번째부터 현재 cnt번째까지 비교해줄거임
				if(lotto[cnt] == lotto[j]) { // 방금 할당된 배열값이랑 이전 값들이랑 같니?
					cnt--;	// 현재 배열에 랜덤값 다시 할당하기 위해 카운트 하나 줄여줌
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
	
	public static void main03(String[] args) {
		// 로또번호 검색기
		final int MAX = 45, SIZE = 6;
		int[] lotto = new int[SIZE];
		int cnt = 0;
		int num = 0;
		boolean check;
		while (cnt < SIZE) { // 현재 번째가 총 사이즈 보다 작을 동안 즉 0~5번째 까지
			num = 1 + (int) (Math.random() * MAX); // 1~45 사이의 랜덤값
			check = true;
			for (int j = 0; j < cnt; j++) { // lotto[0] ~ lotto[cnt] 까지 값 같은지 비교
				if (lotto[j] == num) { // 새로 뽑은 값을 기존배열들이랑 비교해서 같다면
					cnt--; // 요소 번호 하나 줄인다. 해당 요소번째를 다시 뽑을 수 있게...
					check = false; // 체크를 false로 돌려서 현재 배열에 랜던값 할당하는 if문 작동하지 않도록한다.
				}
			} // end for j
			if (check) {	// 새로 뽑은 값이 기존이랑 겹치는게 없을 경우 check값은 처음부터 지금까지 true인 상태
				lotto[cnt] = num; // 그 때 새로운 값을 할당한다.
			}
			cnt++;	// 다음 번호 뽑아야 되니까 요소번호 증가
		} // end while
		System.out.println(Arrays.toString(lotto));
	}
}
