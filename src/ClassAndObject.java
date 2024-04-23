import java.sql.SQLOutput;

public class ClassAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Роман", 30);
        //person1.name = "Roma";
        //person1.age = 34;
        person1.speak();
        int years1 = person1.calculateYearsToRetirement();
        System.out.println("Мне до пенсии "+years1);

        Person person2 = new Person();
        String name2 = "Рита";
        person2.setNameAndAge(name2, 30);
        person2.speak();

        //person2.name = "Vova";
        person2.age = 20;
        //person2.speak();
        int years2 = person2.calculateYearsToRetirement();
        System.out.println("Мне до пенсии "+years2);
    }
}

class Person{
    //У класса могут быть: данные(поля) и методы(действия)
    String name;
    int age;

    void setNameAndAge(String userName,  int userAge){
        name = userName;
        age = userAge;
    }
    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }
    void speak(){
        for(int i=0;  i<3; i++){
            System.out.println("Меня зовут " + name + "," + " мне "+age+" лет");
        }
    }
    void sayHello(){
        System.out.println("Hello!");
    }



}

