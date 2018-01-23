package parallel.stream.example;

import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Timeit.code(()->
        System.out.println(
                list.stream()
                        .filter(e-> e %2 ==0)
                        .mapToInt(Sample::compute)
                        .sum()));
    }
    public static int compute(int list){
        return list *200;
    }
}
