package org.comstudy21.ch01_2;

import java.util.Arrays;

public class Ex02Ex01 {

	public static void main(String[] args) {
		int[] arr = new int[] {100,150};
		System.out.println(Arrays.toString(arr));
		swapElement(arr);
		System.out.println(Arrays.toString(arr));
	}

	static int[] swapElement(int[] arr) {
		int tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;
		return arr;
	}
}
