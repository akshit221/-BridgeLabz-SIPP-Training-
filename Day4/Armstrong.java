
import java.util.Scanner;

class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        
        while(temp!=0){
            int k = temp/10;
            sum += k*k*k;
            temp = temp%10;
            
        }   
        if(sum == n){
            System.err.println("number is armstrong ");
        }
        else{
            System.err.println("not armstrong");
        }
    }
}