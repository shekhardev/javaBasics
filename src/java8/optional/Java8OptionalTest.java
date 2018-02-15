package java8.optional;

import java.util.Optional;

public class Java8OptionalTest {

    public static void main(String[] args) {
        Integer value = null;
        Integer value2 = new Integer(100);
        Optional<Integer> a = Optional.ofNullable(value);
        Optional<Integer> b = Optional.of(value2);
        sum(a,b);
    }
    private static void sum(Optional<Integer> a, Optional<Integer> b){
        System.out.println("First Parameter is Present: "+a.isPresent());
        System.out.println("Second Parameter is Presen: "+ b.isPresent());
    }
}
