package assignment1;

import java.util.Scanner;

public class problem5 {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		System.out
				.println("Choose operation: 1 - addition, 2 - subtraction, 3 - multiplication");

		int choice = reader.nextInt();

		switch (choice) {
		case 1:
			addMatrices(1);
			break;
		case 2:
			addMatrices(-1);
			break;
		case 3:
			mulMatrices();
			break;
		default:
			System.out.println("Wrong input");
		}
	}

	static void addMatrices(int sign) {
		System.out.println("Enter the number of rows and columns");
		int m = reader.nextInt();
		int n = reader.nextInt();

		int[][] matrix1 = new int[m][n];
		int[][] matrix2 = new int[m][n];

		readMatrix(matrix1);
		readMatrix(matrix2);

		System.out.println();

		System.out.println("matrix 1");
		printMatrix(matrix1);
		System.out.println("matrix 2");
		printMatrix(matrix2);

		System.out.println("result: ");
		printMatrix(add(matrix1, matrix2, sign));
	}

	static void mulMatrices() {
		System.out
				.println("Enter the number of rows and columns of the first matrix");
		int m = reader.nextInt();
		int n = reader.nextInt();
		int[][] matrix1 = new int[m][n];

		System.out.println("Enter the number of columns of the second matrix");
		int[][] matrix2 = new int[n][reader.nextInt()];

		readMatrix(matrix1);
		readMatrix(matrix2);

		System.out.println();

		System.out.println("matrix 1");
		printMatrix(matrix1);
		System.out.println("matrix 2");
		printMatrix(matrix2);

		System.out.println("result: ");
		printMatrix(mul(matrix1, matrix2));
	}

	static void readMatrix(int[][] matrix) {
		int nValues = matrix.length * matrix[0].length;
		System.out.println("Enter the values for the matrix, in total "
				+ nValues + " values");
		for (int m = 0; m < matrix.length; m++) {
			for (int n = 0; n < matrix[0].length; n++) {
				matrix[m][n] = reader.nextInt();
			}
		}
	}

	static void printMatrix(int[][] matrix) {
		for (int m = 0; m < matrix.length; m++) {
			for (int n = 0; n < matrix[0].length; n++) {
				System.out.print(matrix[m][n] + " ");
			}

			System.out.println();
		}
		System.out.println();
	}

	static int[][] add(int[][] matrix1, int[][] matrix2, int sign) {
		// the resulting matrix has the same size
		int[][] result = new int[matrix1.length][matrix1[0].length];

		// iterate through rows of the first matrix
		for (int m = 0; m < result.length; m++) {
			// iterate through columns of the first matrix
			for (int n = 0; n < result[0].length; n++) {
				// add the corresponding values of first and second matrices
				result[m][n] = matrix1[m][n] + sign * matrix2[m][n];
			}
		}

		return result;
	}

	static int[][] mul(int[][] matrix1, int[][] matrix2) {
		// rows = number of rows of the first matrix
		// columns = number of the columns of the second matrix
		int[][] result = new int[matrix1.length][matrix2[0].length];

		// iterate through columns of the second matrix
		for (int n2 = 0; n2 < matrix2[0].length; n2++) {
			// iterate through the rows of the first matrix
			for (int m1 = 0; m1 < matrix1.length; m1++) {
				// keep track of the sum of dot product of the
				// corresponding rows of first matrix
				// and columns of the second matrix
				int sum = 0;

				// iterate through the columns of the first matrix
				for (int n1 = 0; n1 < matrix1[0].length; n1++) {
					sum += (matrix1[m1][n1] * matrix2[n1][n2]);
				}

				result[m1][n2] = sum;
			}
		}

		return result;
	}
}
