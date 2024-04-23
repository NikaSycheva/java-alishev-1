public class Arrays {
    public static void main(String[] args) {
        //int number = 10; //примитив. хранится само значение в переменной
        int[] numbers = new int[5]; //массив с размером 5. переменная ссылается на массив
       // System.out.println(numbers[0]);//0 1 2 3 4 индексы массива
       // заполнили массив данными
        for(int i=0; i <numbers.length; i++){
            numbers[i] = i*10;
        }
        //выведем массив на экран
        for(int i =0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        int [] numbers2 = {1, 0, 58, 47};//инициируем массив с известными данными
        int[] numbers3 = new int[10];//инициализируем массив пустой с размером 5
    }
}
