// write a method the takes a paragraph as input and return a corrected version with one sapce after pancuation capital letter after period quesuion and trimmed extra spaces
import  java.util.Scanner;
class Paragraph {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
          for(int i = 1; i  <= n; i++){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" " + "*" );
            }
            System.out.println("");
        }
      
            
        }

        }
        






        
    
