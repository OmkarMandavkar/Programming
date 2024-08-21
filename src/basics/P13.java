//WAP TO SWAP TWO NUMBERS USING 3RD VARIABLE
package basics;

public class P13 {
	public static void main(String[] args) {
		
		int a=5, b=7;
		
		System.out.println("Before Swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		int c = a;
		a = b;
		b = c;
		System.out.println("\nAfter Swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
			
	}
}
