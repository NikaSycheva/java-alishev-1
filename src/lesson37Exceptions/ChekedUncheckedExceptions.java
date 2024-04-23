package lesson37Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChekedUncheckedExceptions {
    public static void main(String[] args) {
        //Сheked - нужно обрабатывать, исключительгные случаи в работе программы
        //Uncheked - не нужно обрабатывать, такие ошибки нужно устранять
        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);//Checked Exceptions
        } catch (FileNotFoundException e) {
            System.out.println("Как-то решаем проблему");
        }

        //int x = 1/0;//ArithmeticException Uncheked появ в ходе выполнения программы

        String name = null;
        //name.length();//NullPointerException

        int[] arr = new int[2];
        System.out.println(arr[2]);//ArrayIndexOutOfBoundsException

    }
}
