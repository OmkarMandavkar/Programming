// WAP TO PRINT LARGEST OF EACH ROW

package array;

public class P19 {
	public static void main(String[] args) {
		
		int[][] arr = { { 12, 42, 3 }, 
						{ 114, 33, 61 }, 
						{ 71, 84, 94 } };
		
		
		for (int i = 0; i < arr.length; i++) {
			int large = Integer.MIN_VALUE;
//			int large = arr[i][0];
			
			
			for (int j = 0; j < arr[i].length; j++) {
				
				if(arr[i][j] > large) {
					large = arr[i][j] ;
				}
			}
			System.out.println(large);
		}	
	}
}