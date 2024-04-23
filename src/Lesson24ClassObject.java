public class Lesson24ClassObject {
    public static void main(String[] args) {
        Woman w = new Woman("Alla", 40);
        System.out.println(w);
    }
}

class Woman {
    private String name;
    private int age;

    public Woman(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name+","+age;
    }
}
