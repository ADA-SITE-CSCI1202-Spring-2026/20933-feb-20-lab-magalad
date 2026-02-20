import java.util.Scanner;

public class ReverseString {

    // b) Method that takes a String and returns its reverse
    public static String reverse(String str) {

        StringBuilder reversed = new StringBuilder();

        // Loop from last character to first
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // a) Reverse the string
        String result = reverse(input);

        System.out.println("Reversed string: " + result);

        scanner.close();
    }
}