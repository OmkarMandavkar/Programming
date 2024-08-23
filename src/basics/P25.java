//WAP TO CALCULATE THE NUMBER RAISED TO POWER
package basics;

public class P25 {
	public static void main(String[] args) {
		
		int  n=5, p=3;
		double prod = 1;
		
		for(int i=1; i<=p; i++) {
			prod = prod * n;
		}
		
		System.out.println(prod);
		System.out.println(Math.pow(5, 3));
	}
}
