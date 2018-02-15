package hashmap.example;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();

        hashMap.put("Sekhar","12345");
        hashMap.put("kumar","54321");
       hashMap.put("103", "Data Communication and Networking");

        System.out.println("Values before remove: "+ hashMap);

        hashMap.remove("kumari");
        System.out.println("Values after remove: "+ hashMap);

        for(Map.Entry  m:hashMap.entrySet()){
            System.out.println(m.getKey()+"  " +m.getValue());
        }
    }
}
