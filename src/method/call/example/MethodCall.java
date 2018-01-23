package method.call.example;

public class MethodCall {
    public static void main(String[] args) {
        int m = tottalMinutes(2,30);
        System.out.println(m);
    }
    public static int tottalMinutes(int hours, int min){
        return (hours *60) + min;
    }
}
