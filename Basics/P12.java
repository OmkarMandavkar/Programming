//WAP TO PRINT FIBONACCI SERIES UPTO 10 NUMBERS
public class P12 {

	public static void main(String[] args) {
		int n=10;
		int a=0, b=1;
		
		System.out.print(a + " " + b + " ");
		for(int i=1; i<=n-2; i++) {
			int c = a+b;
			System.out.print(c + " ");
			a=b;
			b=c;
		}
	}
}
