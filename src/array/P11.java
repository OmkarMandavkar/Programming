/*
 Array Operations: Total number of decrement operations performed
 You are given an array A of size N and an integer K.
 You have to make all the elements of the array divisible by K.
 You can decrease any element of the array by 1 in one operation.
 
 Find the total number of decrement operations required to make all the elements of the array divisible by K.
 
 Input: 5 6 -> denotes N & K
 	5 9 12 16 25 -> denotes N elements
 	
 Output: 13
 
 Explanation: The array is [5, 9, 12, 25, 16] and K = 6;
 1. To make 5 divisible by 6 we will subtract 5 from it. 
 	Therefore 5-5 = 0 which is divisible by 6. Therefore ans = 5.
 2. To make 9 divisible by 6 we will subtract 3 from it. 
 	Therefore 9-3 = 6 which is divisible by 6. Therefore ans = 5+3.
 3. Likewise the final ans will be ans = 5+3+0+4+1 = 13
 
 */

package array;

public class P11 {

	public static void main(String[] args) {

		int[] a = { 5, 9, 12, 25, 16 };
		int k = 6;
		int totalDecrement = 0;

		for (int i = 0; i < a.length; i++) {
			totalDecrement = totalDecrement + (a[i] % k);
		}

		System.out.println(totalDecrement);

		/* METHOD 2
		for (int i = 0; i < a.length; i++) {
			while (a[i] % k != 0) {
				a[i]--;
				totalDecrement++;
			}
		}
		System.out.println(totalDecrement);
		*/
	}
}
