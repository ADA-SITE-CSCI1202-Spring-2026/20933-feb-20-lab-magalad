import java.util.Scanner;

public class InvoiceArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many invoices? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        // Create array of Invoice objects
        Invoice[] invoices = new Invoice[n];

        // Take input from user
        for (int i = 0; i < n; i++) {

            System.out.println("\nInvoice " + (i + 1));

            System.out.print("Part number: ");
            String number = scanner.nextLine();

            System.out.print("Description: ");
            String description = scanner.nextLine();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Price per item: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // clear buffer

            invoices[i] = new Invoice(number, description, quantity, price);
        }

        // Display invoice amounts
        System.out.println("\n=== Invoice Summary ===");

        for (int i = 0; i < invoices.length; i++) {
            System.out.println("Invoice " + (i + 1));
            System.out.println("Part: " + invoices[i].getPartDescription());
            System.out.println("Amount: " + invoices[i].getInvoiceAmount());
            System.out.println();
        }

        scanner.close();
    }
}