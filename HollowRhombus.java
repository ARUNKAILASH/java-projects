package testpractice;
import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows for the rhombus
        System.out.print("Enter the number of rows for the hollow rhombus: ");
        int rows = scanner.nextInt();

        // Print the hollow rhombus pattern
        for (int i = 1; i <= rows; i++) {
            // Print spaces for the current row
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars for the first and last rows
            if (i == 1 || i == rows) {
                for (int j = 1; j <= rows; j++) {
                    System.out.print("*");
                }
            } else {
                // Print stars and spaces for the middle rows
                for (int j = 1; j <= rows; j++) {
                    if (j == 1 || j == rows) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}

