package org.comstudy21.ch01_2;
import java.util.Arrays;
public class Ch02Ex03 {
	//과제1
	static int[] joinArr(int[] arr1, int[] arr2) {
		int[] newArr = new int[arr1.length + arr2.length];	// newArr배열의 크기를 arr1+arr2만큼으로 만들어
		
		System.arraycopy(arr1, 0, newArr, 0, arr1.length);
		System.arraycopy(arr2, 0, newArr, arr1.length, arr2.length);
		
		// 노가다방법.
//		for(int i = 0; i < newArr.length; i++) {
//			if(i < arr1.length) {
//				newArr[i] = arr1[i];
//			}else {
//				newArr[i] = arr2[i-arr1.length];
//			}
//		}
		
		// 노가다방법.
//		int i = 0;		// newArr인덱스 값
//		for(int add :arr1 ) {
//			newArr[i++] = add;			// newArr 의 인덱스 0~2까지 arr1의 값을 차례로 넣어줌.
//		}
//		// i 값이 3이 된 상태임 
//		for(int add :arr2 ) { 
//			newArr[i++] = add;		// newArr의 인덱스 3~6까지 arr2의 값을 차례대로 넣어줌.
//		}
//		// i 값은 7인 상태(별로 중요하진 않음...)
		return newArr;
	}
	
	static int[][] joinArr2(int[] arr1, int[] arr2) { 
		int[][] arr4 = new int[2][];		
		arr4[0] = new int[arr1.length];		// arr1과 배열의 참조를 끊어주기 위해 새로운 공간 만들기.
		arr4[1] = new int[arr2.length];		// arr2와 배열의 참조를 끊어주기 위해 새로운 공간 만들기.
		
		// 기존에 내가 했던거.
//		for(int idx=0;idx<arr4.length;idx++) {		// idx 행번호 
//			for(int jdx=0;jdx<arr4[idx].length;jdx++) {		// jdx 열번호 
//				if(idx==0)arr4[idx][jdx] = arr1[jdx];		// idx==0일 땐 첫번째 행에 arr1 값 넣어주기.
//				if(idx==1)arr4[idx][jdx] = arr2[jdx];		// idx==1일 땐 첫번째 행에 arr1 값 넣어주기.
//			}
//		}
		
		// 쌤이 알려주신거.
		System.arraycopy(arr1, 0, arr4[0], 0,arr1.length);
		System.arraycopy(arr2, 0, arr4[1], 0,arr2.length);
		
		return arr4;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {10,20,30};
		int[] arr2 = {40,50,60,70};
		int[] arr3 = joinArr(arr1,arr2);
		System.out.println(Arrays.toString(arr3));		// [10,20,30,40,50,60,70]
		
		// 과제2
		int[][] arr4 = joinArr2(arr1, arr2);
		arr1[0] = 100;	 // arr1의 내용을 바꿔도 출력될 때 arr4는 변경되지 않아야 한다.
		for(int i=0;i<arr4.length;i++) { // 2행.
			for(int j=0;j<arr4[i].length;j++) { // 0행은 3열,1행은 4열 나올거.
				System.out.print(arr4[i][j] + "\t");
			}
			System.out.println();
		}
	}
}