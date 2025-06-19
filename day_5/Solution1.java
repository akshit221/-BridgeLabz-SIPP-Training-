
import java.util.Scanner;

class Solution1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter the first string");
        String s1 = sc.next();
        System.err.println("enter the second string");
        String s2 = sc.next();
        boolean result = true;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(i)){
                result = true;

            }
            else{
                result = false;
            }

        }
        System.err.println(result);
        if(s1.equals(s2) == result){
            System.err.println("result are same");

        }
        else{
            System.err.println("result are not same");
        }


        
    }
}