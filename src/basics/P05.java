//WAP TO PRINT THE SUM OF NUMBER IN RANGE 1-5
package basics;

public class P05 {

	public static void main(String[] args) {

		int sum=0;
		
		for(int i=1; i<=5; i++) {
			sum = sum + i;
		}
		
		System.out.println("Sum: "+sum);
	}

}
