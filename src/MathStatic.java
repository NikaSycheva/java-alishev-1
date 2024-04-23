public class MathStatic {
    public static void main(String[] args) {
        int x = Math2.summ(4,7);
        System.out.println(x);
        Math2.x = 30;
    }
}

class Math2{
    public static int x =12;

    public static int summ(int a, int b){
        return a+b;
    }
    public int mult(int a, int b){
        return a*b;
    }
}


