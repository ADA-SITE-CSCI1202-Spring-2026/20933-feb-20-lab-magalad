import java.util.Scanner;

public class lab03_exc02 {
    // a) Method to calculate minimum
    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    // b) Method to calculate maximum
    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    // c) Method to calculate BOTH at the same time
    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {

        // ===============================
        // i) Array from Command Line
        // ===============================
        if (args.length > 0) {
            int[] cmdArray = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                cmdArray[i] = Integer.parseInt(args[i]);
            }

            System.out.println("Command Line Array:");
            System.out.println("Minimum: " + findMin(cmdArray));
            System.out.println("Maximum: " + findMax(cmdArray));

            int[] result = findMinMax(cmdArray);
            System.out.println("Both (Min, Max): " + result[0] + ", " + result[1]);
        }

        // ===============================
        // ii) Array using Scanner
        // ===============================
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter number of elements: ");
        int n = scanner.nextInt();

        int[] scanArray = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            scanArray[i] = scanner.nextInt();
        }

        System.out.println("Scanner Array:");
        System.out.println("Minimum: " + findMin(scanArray));
        System.out.println("Maximum: " + findMax(scanArray));

        int[] result2 = findMinMax(scanArray);
        System.out.println("Both (Min, Max): " + result2[0] + ", " + result2[1]);

        scanner.close();

}
}