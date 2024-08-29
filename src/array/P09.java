// WAP to arrange the elements in ascending order by using BUBBLE SORTING METHOD

package array;

public class P09 {
	public static void main(String[] args) {

		int[] a = { 7, 5, 8, 1, 3, 4 };

		for (int i = 0; i < a.length; i++) {	//TO PERFORM ITERATION
			for (int j = 0; j < a.length - 1 - i; j++) {

				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}

//a.length - 1 - i --> condition is added to reduce the time complexity or 
//to remove the waste iterations