public class Lesson19This {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Артем");
        human1.setAge(25);
        human1.getInfo();
    }
}
class Human{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println(name+", "+age);
    }
}


