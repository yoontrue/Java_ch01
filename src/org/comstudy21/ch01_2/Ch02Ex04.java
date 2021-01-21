package org.comstudy21.ch01_2;

public class Ch02Ex04 {
	static int[][] arr = new int[5][5];
	static int number = 1;
	
	public static void homework01() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = number++;
			}
		}
	} // end of homework01
	
	static void print(int[][] arr2) {
		// 출력하는 부분 외부 함수로 빼보기
		// arr 배열을 인자로 전달 받아서 출력하도록 구현.
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		homework01();
		print(arr);
	}
}
