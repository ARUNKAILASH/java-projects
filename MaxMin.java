package testpractice;
public class MaxMin {
    public static void main(String[] args) {
        int[] array = {3, 7, 2, 8, 5, 1, 9, 4, 6};

        // Find first maximum and minimum in the array
        int max = array[0], min = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }

        // Display the results
        System.out.println("First Maximum: " + max);
        System.out.println("First Minimum: " + min);
    }
}

