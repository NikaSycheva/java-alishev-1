package lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFileInProjectTree {
    public static void main(String[] args) throws FileNotFoundException {
        //File file = new File("lesson36/test2.txt");
        File file = new File("testFile3.txt");

        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        String[] stringNumbers = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;
        for(String stringNumber : stringNumbers ){
            numbers[counter++] = Integer.parseInt(stringNumber);
        }
        System.out.println(Arrays.toString(numbers));

        sc.close();
    }
}
