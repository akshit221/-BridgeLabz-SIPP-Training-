import java.util.Scanner;

public class solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the Student Fee (INR): ");
        double fee = scanner.nextDouble();

        
        System.out.print("Enter the University Discount Percentage: ");
        double discountPercent = scanner.nextDouble();

        
        double discount = (discountPercent / 100) * fee;

        
        double discountedFee = fee - discount;

        
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", discount, discountedFee);

        scanner.close();
    }
}