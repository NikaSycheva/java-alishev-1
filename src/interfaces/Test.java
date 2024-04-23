package interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Bob");
        animal.showInfo();
        person.showInfo();

        Info info1 = new Animal(1);
        Info info2 = new Person("Lola");
        info1.showInfo();
        info2.showInfo();

        outputInfo(person);
        outputInfo(animal);
    }

    public static void outputInfo(Info info){
        info.showInfo();
    }
}
