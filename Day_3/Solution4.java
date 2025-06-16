import java.util.Scanner;
class  Solution4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  number");
        int n = sc.nextInt();
        if(n > 0){
            System.err.println("positive");

        }
        else if(n ==0){
            System.err.println("zero");
        }
        else{
            System.err.println("negative");
        }
            



        
    }
}
