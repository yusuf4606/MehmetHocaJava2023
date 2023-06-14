package day26polymorhphism;

public class Cat extends Animal {
    public void meow(){
        System.out.println("Cats meow....");
    }
    @Override
    public void eat(){
    //Child daki override edilmis eat() methoduna "Overriding Method"denir
        System.out.println("Cats eat ..");
    }

    //Override Annotation: Override kurallarinin java tarafindan kontrol edilmesini saglar
    @Override
    public void drink() {
        System.out.println("Cats drink");
    }

    @Override
    public Cat create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a*b;
    }




}
