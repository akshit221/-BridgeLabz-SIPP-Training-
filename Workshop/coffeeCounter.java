import java.util.Scanner;

public class coffeeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double GST_RATE = 0.18; 

        while (true) {
            System.out.println("Welcome to The Coffee Counter Chronicles!");
            System.out.println("Please select a coffee type:");
            System.out.println("1. Espresso");
            System.out.println("2. Cappuccino");
            System.out.println("3. Latte");
            System.out.println("4. Mocha");
            System.out.println("Type 'exit' to quit");
            System.out.print("Your choice: ");
            String choice = scanner.nextLine().trim();

            if (choice.equalsIgnoreCase("exit")) {
                break;
            }

            String coffeeType = "";
            double pricePerUnit = 0.0;

            switch (choice) {
                case "1":
                case "Espresso":
                    coffeeType = "Espresso";
                    pricePerUnit = 3.00; 
                    break;
                case "2":
                case "Cappuccino":
                    coffeeType = "Cappuccino";
                    pricePerUnit = 3.50;
                    break;
                case "3":
                case "Latte":
                    coffeeType = "Latte";
                    pricePerUnit = 4.00;
                    break;
                case "4":
                case "Mocha":
                    coffeeType = "Mocha";
                    pricePerUnit = 4.50;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            int quantity = 0;
            while (true) {
                System.out.print("Enter the quantity: ");
                String qtyInput = scanner.nextLine();
                try {
                    quantity = Integer.parseInt(qtyInput);
                    if (quantity <= 0) {
                        System.out.println("Quantity should be positive. Try again.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Please enter a valid quantity.");
                }
            }

            double totalBill = pricePerUnit * quantity;
            double gstAmount = totalBill * GST_RATE;
            double totalWithGST = totalBill + gstAmount;

            System.out.println("\nOrder Summary:");
            System.out.println("Coffee Type: " + coffeeType);
            System.out.println("Quantity: " + quantity);
            System.out.printf("Price per unit: %.2f\n", pricePerUnit);
            System.out.printf("Total before GST: %.2f\n", totalBill);
            System.out.printf("GST (@ %.0f%%): %.2f\n", GST_RATE * 100, gstAmount);
            System.out.printf("Total after GST: %.2f\n", totalWithGST);
            System.out.println("----------------------------------\n");
        }

        scanner.close();
        System.out.println("Thank you for visiting!");
    }
}
