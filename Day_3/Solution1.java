import java.util.Scanner;

class Solution1{
    public static void main(String[] args) {
        int total_sum = 0;
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.err.println("enter the number");
            int n = sc.nextInt();
            if(n == 0 || n < 0){
                break;
            }
            total_sum += n;
            
        }
        System.err.println("total sum =  " + total_sum);



    }
}