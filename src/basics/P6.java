//WAP TO PRINT PRODUCT OF ALL ODD NUMBER IN RANGE 1-10
package basics;

public class P6 {
	public static void main(String[] args) {
		
		int product = 1;
		
		for(int i=1; i<=10; i++) {
			if(i%2!=0) {
				product = product * i;
			}
		}
		
		System.out.println("Product: " +product);
	}
	
	
}
