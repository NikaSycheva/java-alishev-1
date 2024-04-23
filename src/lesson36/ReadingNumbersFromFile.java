package lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingNumbersFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String pathToFile = "C:"+separator+"Users"+separator+"user"+separator+"OneDrive"+separator+"Рабочий стол"+separator+"testNumbersFile.txt";
        File file = new File(pathToFile);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] stringNumbers = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;
        for(String number : stringNumbers ){
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));

        scanner.close();


    }
}
