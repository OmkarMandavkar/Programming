package array;

import java.util.Scanner;

public class P21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();
		System.out.print("Enter the number of columns: ");
		int cols = scanner.nextInt();

		// Declare a 2D array
		int[][] array = new int[rows][cols];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				array[i][j] = scanner.nextInt();
			}
		}

		// Display the 2D array
		System.out.println("The 2D array is:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		scanner.close();
	}
}
