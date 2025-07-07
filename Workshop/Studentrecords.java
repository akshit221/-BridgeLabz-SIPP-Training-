
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class Studentrecords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        
        for(int i = 0;i < n; i++){  
            while(true){
                try {
                System.out.println("enter the marks of " + i +1 +"th student");
            double score = sc.nextDouble();
            if(score < 0 && score > 100) {
                System.out.println("please enter a valid score: ");
                continue;
                
            } 
            
                arr[i] = score;
                break;
                }
            
        
            catch(InputMismatchException e){
                System.err.println("enter the valid input: ");
                sc.next();
            

            }
            }
        }
            Arrays.sort(arr);
            System.out.println("the Highest score is: " + arr[n-1]);
            System.out.println("the Highest score is: " + arr[0]);
            double sum = 0.0;
            for(int k = 0; k< n; k++){
                sum = sum + arr[k];
            
            }
            double  average = sum / 5;
            System.out.println("the average score of the students is :" + average);
            for(int i = 0; i < n; i++){
                if(arr[i] > average){
                    System.err.println(" score above the average are: " +arr[i]);
                }
            }

            

            
            
          
            }
            }
    



    
