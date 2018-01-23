package typecasting;

public class DataTypeCasting {

    public static void main(String[] args) {
        int a= 90;
        double d= 9.8;
        long l =9;
        float f =0;
        short s =0;
        d =a;
        System.out.println(d);
        a=(int) d;
        System.out.println(a);
    }
}
