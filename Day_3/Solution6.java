import java.util.Scanner;
class Solution6{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the first   number");
        int n1 = sc.nextInt();
        System.out.println("enter the second  number");
        int n2 = sc.nextInt();
        System.out.println("enter the third  number");
        int n3 = sc.nextInt();
        if(n1 > n2 && n1 > n3){
            System.out.println(" the first number is largest");
        }
        else if(n2 > n2 && n2 > n3){
            System.out.println(" the second number is largest");
        }
        else {
            System.out.println(" the second is largest");

        
    }
    }
}