package collecitons;

import java.util.HashSet;
import java.util.Set;

public class SetsExample {

    public static void main(String[] args) {

        Set<String>  set1 = new HashSet<String>();

        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("bear");
        set1.add("insect");


        set1.add("mouse");
        
        System.out.println(set1);
    }
}
