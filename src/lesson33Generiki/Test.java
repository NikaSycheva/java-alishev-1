package lesson33Generiki;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List animals = new ArrayList();
        PrivetAnimal ourAnimal = new PrivetAnimal();
        animals.add("cat");
        animals.add("dog");//1
        animals.add("frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(1);
        String animal33 = (String) animals.get(3);
        System.out.println(animal);

        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
        //animals2.add(ourAnimal);

        String animal2 = animals2.get(1);
        System.out.println(animal);

        ///java 7///
        List<String> animals3 = new ArrayList<>();

    }

    static class PrivetAnimal{
    }
}
