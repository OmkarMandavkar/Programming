//WAP TO FIND THE LARGEST NUMBER IN THE ARRAY
package array;

public class P4 {

	public static void main(String[] args) {

		int[] arr = { 6, 4, 7, 2, 5, 8 };
		int large = arr[0];

		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i] > large) {
				large = arr[i];
			}
		}
		
		System.out.println(large);
	}
}
