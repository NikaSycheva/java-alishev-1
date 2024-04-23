public class GetSet {
    public static void main(String[] args) {
       Person2 person1 = new Person2();
       Person2 person2 = new Person2();
       person1.setName("Оксана");
       person1.setAge(15);
       System.out.println("Выводим значение в main методе: " + person1.getName());
       System.out.println("Выводим значение в main методе: " + person1.getAge());
       person1.speak();
    }
}

class Person2{
    private String name;
    private int age;

    public void setName(String userName) {
       if(userName.isEmpty()){
            System.out.println("Ты ввел пустое имени, так нельзя");
        }else{
           name = userName;}
    }
    public String getName(){
        return name;
    }
    public void setAge(int userAge) {
        if(userAge < 0){
            System.out.println("Некорреткно! Возраст должен быть положительным");
        }else{
            age = userAge;
        }
    }
    public int getAge(){
        return age;
    }

    void speak(){
        for(int i=0; i<3; i++){
            System.out.println("Меня зовут "+ name +", мне "+ age);
        }
    }
}
