//WAP to find the sum of all the prime digits in the number.
//Sample Input = 567
//Sample Output = 12

package basics;

public class P19 {

	public static void main(String[] args) {

		int n = 123456789;
		int sum = 0;
		
/*		while(n != 0) {
			int digit = n%10;
			
			int count = 1;

			for(int i=1; i<=digit/2; i++) {
				if(digit%i == 0) {
					count++;
				}
			}
			
			if(count == 2) {
				sum = sum + digit;
			}
			
			n = n/10;
		}
*/		

		while(n != 0) {
			int digit = n%10;
			if(digit==2 || digit==3 || digit==5 || digit==7) {
				sum = sum + digit;
			}
			n = n/10;
		}
		
		System.out.println(sum);
	}
}
