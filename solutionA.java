import java.util.Arrays;
class solutionA
{
    public static void main(String[] args) {
        int[] arr = {232, 4, -32, 89 , 6, 33 ,66};
        Arrays.sort(arr);
        int n = arr[arr.length-2];
        System.out.println(n);
        
    }
}