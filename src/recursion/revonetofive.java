package recursion;

public class revonetofive {

    public static void main(String[] args) {

        System.out.println();
        printNums(5);

    }
    public static void printNums(int num){
        if (num ==0){
            return;
        }else {
            System.out.println(num);
            printNums(num-1);
        }
    }
}
