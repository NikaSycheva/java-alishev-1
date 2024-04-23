package lesson45Serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Objects;

public class WriteObject {
    public static void main(String[] args) {
        //Person person1 = new Person(1, "Klim");
        //Person person2 = new Person(2, "Katya");

        Person[] people = {new Person(1, "Klim"),
                           new Person(2, "Katya"),
                           new Person(3, "Gena")};

        try {
            FileOutputStream fos = new FileOutputStream("people.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //oos.writeObject(person1);
            //oos.writeObject(person2);

            oos.writeInt(people.length);

            for(Person person : people){
                oos.writeObject(person);
            }

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
