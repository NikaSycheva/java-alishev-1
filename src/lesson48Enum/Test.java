package lesson48Enum;

public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.DOG;
        System.out.println(animal);

        Season season = Season.WINTER;
        System.out.println(season.getTemperature());


       /* switch(animal){
            case CAT:
                System.out.println("Я кошка");
                break;
            case DOG:
                System.out.println("Я собака");
                break;
            default:
                System.out.println("иное");
                break;
        }*/



    }

}

