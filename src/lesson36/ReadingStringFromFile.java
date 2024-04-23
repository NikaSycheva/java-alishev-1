package lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingStringFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String pathToFile = "C:"+separator+"Users"+separator+"user"+separator+"OneDrive"+separator+"Рабочий стол"+separator+"testStringsFile.txt";
        File file = new File(pathToFile);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}