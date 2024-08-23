//WAP TO COUNT THE NUMBER IF DIGITS PRESENT
package basics;

public class P24 {
	public static void main(String[] args) {
		int n = 1634;
		int count = 0;
		
		while(n != 0) {
			count++;
			n = n/10;
		}
		System.out.println(count);
		
		
		//WAP TO COUNT THE NUMBER IF DIGITS PRESENT USING INBUILT METHODS
		int num = 7654;
		int count1 = (int) (Math.log10(num) + 1);
		System.out.println(count1);
	}
}
