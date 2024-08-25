//WAP TO FIND ALL THE STRONG NUMBER IN BETWEEN 1 TO 1000
package basics;

public class P27 {

	public static void main(String[] args) {

		for(int n = 1; n <= 1000; n++) {
			if(isStrongNumber(n)) {
				System.out.println(n);
			}
		}
	}
	public static boolean isStrongNumber(int n) {
		int sum = 0, temp = n;

		while(n!=0) {
			int digit = n%10;
			int fact = 1;

			for(int i=1; i<=digit; i++) {
				fact = fact*i;
			}
			sum = sum + fact;
			n= n/10;
		}
		
		return sum == temp;
	}
}
