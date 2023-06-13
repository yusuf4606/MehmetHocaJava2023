package day25inheritance;

public class Honda extends Car {
    public Honda (){
        super();
        System.out.println("Honda 1");
    }
    public Honda(String model, int year){
        super();//superi parametresiz kullunacaksaniz yazmayadabilirsiniz
        System.out.println("Honda 2");
    }
}
