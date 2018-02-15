package sumarrayequal;

public class SumEqualsTo {
    public static void main(String[] args) {
        int[] t = {4, 5, 7, 11, 9, 13, 8, 12};
        int d = 20;

        for (int i=0;i<t.length-1;i++){

            for (int j = i + 1; j < t.length; j++) {
                if ((t[i] + t[j]) == d) {

                    System.out.println(t[i] + ", " + t[j]);
                }
            }
        }
    }
}
