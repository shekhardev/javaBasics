package streams.example;

import java.util.ArrayList;
import java.util.List;

public class SomeExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i=1;i<=10;i++){
            list.add(i);
           // System.out.println(i);
        }
        list.stream()
                .forEach(System.out::println);

    }
}
