//WAP TO SWAP TWO NUMBERS WITHOUT USING 3RD VARIABLE
public class P14 {

	public static void main(String[] args) {

		int a=-5, b=7;

		System.out.println("Before Swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("\nAfter Swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);


	}

}


