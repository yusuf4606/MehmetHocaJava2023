package day25inheritance;

public class Car extends Vehicle{
    public Car(){
        System.out.println("Car 1");
    }
    public Car(String make){
        System.out.println("Car 2");
    }
    public String model="Accord";
    public int km=20000;

}
