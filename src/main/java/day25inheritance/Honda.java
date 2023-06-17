package day25inheritance;

public class Honda extends Car {
    public Honda(String make, int year){
        System.out.println("Honda 2");
    }
    public Honda(){
        System.out.println("Honda 1");
        System.out.println("this.km = " + this.km);
        System.out.println("this.model = " + this.model);
        System.out.println("super.km = " + super.km);
        System.out.println("super.model = " + super.model);
    }
    public String model="Civic";
    public int km=10000;

}
