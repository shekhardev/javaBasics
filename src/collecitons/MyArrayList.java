package collecitons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("IBM","GOOG","ORCL","APLE");

        List<String> list1 = new ArrayList<String>();
        list1.add("India");
        list1.add("US");
        list1.add("UK");
        list1.add("China");

        //list.forEach(System.out::println);
        list1.forEach(System.out::println);
    }
}
