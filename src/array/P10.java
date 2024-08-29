/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8

Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

Constraints:
n == nums.length
1 <= n <= 104
0 <= numsi] <= n
All the numbers of nums are unique.  
*/

package array;

public class P10 {
	public static void main(String[] args) {

		int[] arr = { 9, 7, 6, 5, 4, 3, 2, 1, 0 };
		int n = 9;

		// int total = n * (n + 1) / 2;

		int total = 0;

		for (int i = 0; i <= n; i++) {
			total = total + i;
		}

		int sum = 0;
		for (int i : arr) {
			sum = sum + i;
		}

		System.out.println("Missing Number: " + (total - sum));
	}
}
