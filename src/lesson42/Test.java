package lesson42;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        //System.out.println(x==y);

        var animal1 = new Animal(1);
        var animal2 = new Animal(1);

        System.out.println(animal1.equals(animal2));

        String string1 = "Hello";
        String string2 = "Hello";

        System.out.println(string1.equals(string2));


    }
}

class Animal{
    private int id =1;

    public Animal(int id) {
        this.id = id;
    }

    /* public boolean equals(Objects obj){
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }*/
}
