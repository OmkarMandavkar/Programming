//LINEAR SEARCH
package array;

public class P15 {
	public static void main(String[] args) {

		int[] a = { 7, 5, 1, 19, 6 };
		int search = 19;
		int index = -1;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == search) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			System.out.println("Element Present at: " + index);
		} 
		else {
			System.out.println("Element Not Present");
		}
	}
}
