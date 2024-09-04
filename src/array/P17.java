//BINARY SEARCH
package array;

public class P17 {

	public static void main(String[] args) {

		int[] a = { 5, 9, 4, 1, 6, 3 };

		sort(a);	//1 3 4 5 6 9
		
		int search = 3;
		int sp = 0, ep = a.length - 1;

		while (sp <= ep) {
			int mp = (sp + ep) / 2;

			if (search == a[mp]) {
				System.out.println("Element Present at: " + mp);
				break;
			} 
			
			else if (search > a[mp]) {
				sp = mp + 1;

			} 
			
			else if (search < a[mp]) {
				ep = mp - 1;
			}
		}
		
		if(sp>ep) {
			System.out.println("Element is not Present");
		}
	}

	public static void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i;

			while (j > 0 && a[j - 1] > temp) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = temp;
		}
	}
}