
import java.util.Scanner;

class  calculater{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        
        System.out.print(" Enter your operation ");
        char choice = sc.next().charAt(0);
        
        switch (choice) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case  '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                }
                break;
           
        }
    
    }
}