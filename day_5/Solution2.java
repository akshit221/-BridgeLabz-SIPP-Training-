
import java.util.Scanner;

class Solution2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter the string");

        String s1 = sc.next();
        System.err.println("start: ");
        int start = sc.nextInt();
        System.err.println("end: ");
        int end = sc.nextInt();
    
        StringBuilder res =  new StringBuilder();
        for(int i = start; i < end; i++){
            res.append(s1.charAt(i));
            
        }
    String res2 = s1.substring(start , end);
    if(res2.equals(res.toString())){
        System.out.println(true);
        System.out.println( res + " = " + res2);
    }
    else{
        System.err.println(false);
    }

        }


}
