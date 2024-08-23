//STRONG NUMBER: SUM OF FACTORIAL OF EACH DIGIT SHOULD BE EQUAL TO THE NUMBER ITSELF

package basics;

public class P23 {

	public static void main(String[] args) {

		int n = 145;
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
	
		if(temp == sum) {
			System.out.println("Strong Number");
		}
		else {
			System.out.println("Not a Strong Number");
		}
	}
}
