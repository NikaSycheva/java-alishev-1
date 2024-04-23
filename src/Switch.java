import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();
        switch (age){
            case 10:
                System.out.println("Учишься в школе");
                break;
            case 18:
                System.out.println("Учишься в университете");
                break;
            case 25:
                System.out.println("Работаешь на работе");
                break;
            default:
                System.out.println("В свободном поиске");
                break;
        }
    }
}
