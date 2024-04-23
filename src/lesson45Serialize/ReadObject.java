package lesson45Serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

//            Person person1 = (Person) ois.readObject();
//            Person person2 = (Person) ois.readObject();

            int personCount = ois.readInt();
            Person[] people = new Person[personCount];

            for(int i=0; i<personCount;i++){
                people[i] = (Person) ois.readObject();
            }

            //доп вариант почему-то не работает
            //Person[] people2 = (Person[]) ois.readInt();

            System.out.println(Arrays.toString(people));

//            System.out.println(person1);
//            System.out.println(person2);

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
