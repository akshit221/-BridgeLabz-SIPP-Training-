
import java.util.Scanner;

class Solution3{
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
         String userString = scanner.nextLine();

        
        generateException();

        
        handleException();

        scanner.close();
    }


    public static void generateException() {
        
        System.out.println("Generating exception by accessing invalid index...");
        char ch = userString.charAt(userString.length() + 1);
        System.out.println("Character at invalid index: " + ch); 
    }

    
    public static void handleException() {
        try {
            System.out.println("Attempting to access invalid index within try-catch...");
            char ch = userString.charAt(1 + userString.length());
            System.out.println("Character at invalid index: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
        }
    


        
    }
}