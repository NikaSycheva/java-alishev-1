public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        String[] stringArray = new String[3];
        stringArray[0] = "Привет";
        stringArray[1] = "Пока";
        stringArray[2] = "Джава";

        for(int i=0; i < stringArray.length; i++){
            System.out.println(stringArray[i]);
        }
        System.out.println("===================");
        for(String s:stringArray){
            System.out.println(s);
        }

        System.out.println("===================");

        int[] numbers3 = {1,13,5};
        int sum = 0;
        for(int i: numbers3){
            sum = sum + i;//1+13/14/14+5/19
        }
        System.out.println(sum);

        int value = 0;
        String s; //не выделяется памяти под строку указывает на null
        String s2 = "Строка"; //выделили память под строку

    }
}
