class solution1{
    public static void main(String[] args) {
        int c= 0;
        int res = 0;
        for(int i = 11; i > 0; i--){
            if(i%3==0){
                res = i/3;
                break;
            }
            else{
                c++;

            }
        }
        System.out.println(" The Pen Per Student is  " + res + " and the remaining pen not distributed is " + c);
    }
}