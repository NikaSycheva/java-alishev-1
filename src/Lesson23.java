public class Lesson23 {
    public static void main(String[] args) {
        String x = "Hello";
        x.toUpperCase();
        //System.out.println(x);
        x = x.toUpperCase();//тк строки имутабельны, то результат записывается в новую строку
        //System.out.println(x);

        String string1 = "Hello";
        String string2 = " my";
        String string3 = " friend";
        String stringAll = string1+string2+string3;
        //System.out.println(stringAll);

        StringBuilder sb = new StringBuilder("Hello");
        //System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        //System.out.println(sb.toString());

        System.out.printf("This is a string, %s", "NICE\n");
        System.out.printf("This is a string, %d\n", 20);
        System.out.printf("This is a string, %f\n", 66.2);
        System.out.printf("This is a string, %.2f\n", 66.21545158);
        System.out.printf("This is a string, %.2f\n", 66.2);

        System.out.printf("string %10d\n",532);
        System.out.printf("string %10d\n",5);
        System.out.printf("string %10d\n",10000);
        System.out.printf("string %10d\n",1000000000);
        System.out.printf("string %-10d\n",10000);


    }
}
