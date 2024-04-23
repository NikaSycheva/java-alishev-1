package lesson48Enum;

public class Test2 {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        System.out.println(season.name());//возвр название энама в виде строки

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());

        System.out.println(season.ordinal());//индекс элемента енама 2

    }
}
