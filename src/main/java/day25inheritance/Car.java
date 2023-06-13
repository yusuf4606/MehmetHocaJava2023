package day25inheritance;

public class Car extends Vehicle{
    public Car (){
                this("accord");
        System.out.println("Car 1");
    }
    public Car(String make){
            super();
        System.out.println("Car 2");
    }

}

