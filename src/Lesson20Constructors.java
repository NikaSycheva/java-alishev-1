public class Lesson20Constructors {
    public static void main(String[] args) {
        Human2 h1 = new Human2("Bob", 20);
        Human2 h2 = new Human2("Tom", 27);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Human2 h3 = new Human2("Oleg", 22);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();


        Human2.description = "Nice";
        h1.getAllField();
        h2.getAllField();

        Human2.description = "Sad";
        h1.getAllField();
        h2.getAllField();
        //Human2.getDescription();


    }
}

class Human2{
    private String name;
    private int age;

    private static int countPeople;
    public static String description;

    public Human2(String name, int age){
        //System.out.println("Привет из третьего конструктора!");
        this.name = name;
        this.age = age;
        countPeople++;
    }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    public void printNumberOfPeople(){
        System.out.println("Number of people is "+countPeople);
    }

    public static void getDescription(){
        System.out.println(description);
    }
    public void getAllField(){
        System.out.println(name+","+age+","+description);
    }

    public static void printAllFields(){
        System.out.println(","+description);
    }

    /*
    public Human2(){

        this.name = "Имя по умолчанию";
        this.age = 12;
    }
    public Human2(String name){
        System.out.println("Привет из второго конструктора!");
        this.name = name;
    }*/


}
