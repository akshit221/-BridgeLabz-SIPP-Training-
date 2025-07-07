class Car{
     protected  String colour;
    int seats;
    public void stop(){
        System.out.println("car stop");
    }
    public void start(){
        System.err.println("start");

    }


    public static void main(String[] args) {
        mercedes car1 = new mercedes();
        car1.milage();
        car1.
        
    }
}
class mercedes extends Car{
    int doors;
    int price;
    public void milage(){
        System.out.println("100kmph");
    }
   

}