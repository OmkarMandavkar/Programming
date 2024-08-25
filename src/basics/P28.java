//WAP TO FIND ALL THE PERFECT NUMBER IN BETWEEN 1 TO 1000
package basics;

public class P28 {

	public static void main(String[] args) {
	
		for(int n=1; n<=1000; n++) {
		
			if(isPerfectNumber(n)) {
				System.out.println(n);
			}
		}
	}

	public static boolean isPerfectNumber(int n) {

		int sum = 0;

		for(int i=1; i<=n/2; i++) {
			if(n%i == 0) {
				sum = sum + i;
			}
		}

		return n == sum;
	}
}
