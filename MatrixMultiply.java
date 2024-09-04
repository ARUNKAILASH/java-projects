package testpractice;
import java.util.Scanner;
public class MatrixMultiply {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows for the first matrix: ");
        int rowsA = input.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int colsA = input.nextInt();

        System.out.print("Enter the number of rows for the second matrix: ");
        int rowsB = input.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int colsB = input.nextInt();

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible. Number of columns in the first matrix must be equal to the number of rows in the second matrix.");
            input.close();
            return;
        }

        int[][] firstMatrix = new int[rowsA][colsA];
        int[][] secondMatrix = new int[rowsB][colsB];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                firstMatrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                secondMatrix[i][j] = input.nextInt();
            }
        }

        input.close();

        // Check if multiplication is possible and multiply matrices
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible.");
        } else {
            int[][] resultMatrix = multiplyMatrices(firstMatrix, secondMatrix);

            // Display the result
            System.out.println("Result Matrix:");
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
    int rowsA = firstMatrix.length;
    int colsA = firstMatrix[0].length;
    int colsB = secondMatrix[0].length;

    int[][] resultMatrix = new int[rowsA][colsB];

    for (int i = 0; i < rowsA; i++) {
        for (int j = 0; j < colsB; j++) {
            for (int k = 0; k < colsA; k++) {
                resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
            }
        }
    }

    return resultMatrix;
}
}

