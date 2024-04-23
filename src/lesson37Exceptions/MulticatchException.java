package lesson37Exceptions;

import java.io.IOException;
import java.text.ParseException;

public class MulticatchException {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException | ParseException e) {
            System.out.println("Общая обработка исключения");
        }
    }

    public static void run() throws IOException, ParseException, IllegalArgumentException{
    }
}
