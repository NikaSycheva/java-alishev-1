import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        //String inputString = scanner.nextLine();
        int inputNumber = scanner.nextInt();
        System.out.println("Вы ввели: " + inputNumber);
    }
}
