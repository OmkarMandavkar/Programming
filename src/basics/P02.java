//WAP TO DISPLAY EVEN NUMBERS FROM 1 TO 10
package basics;

public class P02 {
	public static void main(String[] args) {
		
		System.out.print("Even numbers are: ");
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
	}
}
