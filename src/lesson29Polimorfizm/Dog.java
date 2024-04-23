package lesson29Polimorfizm;

public class Dog extends Animal {

    @Override
    public void eat(){
        System.out.println("dog is eating");
    }

    public void bark(){
        System.out.println("Собака лает");
    }
}
