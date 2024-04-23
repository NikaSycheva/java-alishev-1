package lesson30PrivedenieTipov;

public class Test {
    public static void main(String[] args) {
        int x1 = 1;
        Integer x2 = 123;
        int x3 = Integer.parseInt("x1");
        var t = x2.toString();

        var bool = Boolean.TRUE;

        byte a = 123;
        short b;
        int c = 45;
        long l = 224343254353L;
        double e = 31.4;
        float f= 452.3F;
        char ch = 'd';
        boolean d = true;

        //Привидение типов
        long s = c; //неявное
        int x = (int)l; //явное

        double ew = 123.5;
        int y = (int)ew;
        System.out.println("y="+y);
        System.out.println(Math.round(ew));



    }
}
