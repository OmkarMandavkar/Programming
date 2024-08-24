//WAP TO PRINT THE LARGEST DIGIT OF A NUMBER 
package basics;

public class P18 {

	public static void main(String[] args) {
		int n = 1167414;

		int largestDigit = 0;
		while(n != 0) {
			int digit = n % 10;

			if(digit>largestDigit) {
				largestDigit = digit;
			}
			n=n/10;
		}
		System.out.println(largestDigit);
	}
}
