import java.util.Scanner;

class Solution3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the countdown");
        
         int countdown= sc.nextInt();
         for (int i = countdown; i >= 0; i--) {
            System.err.println("  the rocket is going to launch in --"+ i + " seconds");
             
         }
    
    }
}