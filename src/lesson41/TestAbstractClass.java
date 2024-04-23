package lesson41;

public class TestAbstractClass {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();
        cat.eat();
        dog.eat();
    }
}
