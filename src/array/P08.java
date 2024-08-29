/*	Given an array arr[]. The task is to find an element from arr[] which has the maximum count of set bits.
 	Input: { 10, 100, 1000, 10000 }
 	Output: 1000
 	
 	Binary(10) = 1010 (2 one bits)
	Binary(100) = 1100100 (3 one bits)
 	Binary(1000) = 1111101000 (6 one bits)
 	Binary(10000) = 10011100010000 (5 one bits)

	Input: arr[] = { 3, 2, 4, 7, 1, 10, 5, 8, 9, 6 }
	Output: 7

*/
package array;

public class P08 {

	/*
	  public static void main(String[] args) { 
	  	int[] arr = { 10, 100, 1000, 10000 };
	  
	  	int large = arr[0]; 
	  
	  	for (int i = 1; i < arr.length; i++) {
	  
	  		if (countSetBits(arr[i]) > countSetBits(large)) { 
	  			large = arr[i]; 
	  		} 
	  	}
	  	System.out.println(large);
	  }
	 */

	public static void main(String[] args) {
		int[] arr = { 10, 100, 1000, 10000 };
		int maxSetBits = 0;
		int maxNumber = 0;

		for (int i = 0; i < arr.length; i++) {
			// int setBitCount = Integer.bitCount(arr[i]);

			int setBitCount = countSetBits(arr[i]);
			if (setBitCount > maxSetBits) {
				maxSetBits = setBitCount;
				maxNumber = arr[i];
			}
		}
		System.out.println(maxNumber);
	}

	public static int countSetBits(int n) {
		int count = 0;

		while (n != 0) {
			int remainder = n % 2;

			if (remainder == 1) {
				count++;
			}
			n = n / 2;
		}
		return count;
	}
}