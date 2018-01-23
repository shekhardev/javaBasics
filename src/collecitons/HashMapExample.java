package collecitons;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(5,"five");
        map.put(4,"four");
        map.put(2,"two");
        map.put(8,"eight");

        String text = map.get(4);
        System.out.println(text);
        // what if key value does not exists
        String text1 = map.get(1);
        System.out.println(text1);

        for(Map.Entry<Integer,String> entry: map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + ":" +value);
        }

    }
}
