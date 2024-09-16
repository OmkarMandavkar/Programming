/*
 INPUT: ARRAY1: [ 1 2 3 ]
  		ARRAY2: [ 4 5 6 ]
  		
 OUTPUT: [ 1 4 2 5 3 6 ]
 */

package array;

import java.util.Scanner;

public class P23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		int[] arr1 = new int[m];
		for (int i = 0; i < m; i++) {
			arr1[i] = sc.nextInt();
		}

		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}

		int[] arr3 = new int[m + n];

		for (int i = 0; i < m; i++) {

			arr3[2 * i] = arr1[i];
			arr3[2 * i + 1] = arr2[i];
		}
		
		System.out.print("Array1: ");
		printArray(arr1);
		
		System.out.print("Array2: ");
		printArray(arr2);		
		
		System.out.print("Array3: ");
		printArray(arr3);

	}

	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
