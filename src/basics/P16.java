//WAP TO FIND SUM OF ALL DIGITS IN THE NUMBER
//EG: 7456 --> 7+4+5+6 = 22
package basics;

public class P16 {

	public static void main(String[] args) {	
		int n = 7456;
		int sum = 0;

		while(n != 0){
			int digit = n%10;
			sum = sum + digit;
			n = n/10;
		}
		System.out.println(sum);
	}
}
