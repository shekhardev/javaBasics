package streams.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SampleStream {

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();
        items.add("one");
        items.add("two");
        items.add("three");

        System.out.println(IntStream.range(1, 3));


        Stream<String> stream = items.stream();
       // System.out.println(items.get(2));
//        for(int i=0; i<items.size(); i++){
//            System.out.println(items.get(i));
//        }

        List<String> filtered = items.stream()
                .filter( item -> item.startsWith("o") )
                .collect(Collectors.toList());
        System.out.println(filtered);

        Long count = items.stream()
                .filter( item -> item.startsWith("t"))
                .count();
        System.out.println(count);
    }


}
