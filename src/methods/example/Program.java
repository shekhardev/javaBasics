package methods.example;

public class Program {

    public static int addTwoNums(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        int add = addTwoNums(2,3);
        System.out.println(add);
    }
}
