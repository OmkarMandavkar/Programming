//WAP TO PRINT IF THE NUMBER IS A PRIME NUMBER OR NOT
public class P8 {

	public static void main(String[] args) {
		int n=5;
		int count=1;
		
		for(int i=1; i<=n/2; i++) {
			if(n%i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}

	}

}
