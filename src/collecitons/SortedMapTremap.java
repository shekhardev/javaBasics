package collecitons;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapTremap {

    public static void main(String[] args) {
        Map<Integer, String> hashmap = new HashMap<Integer, String>();
        Map<Integer,String> linkedhashMap = new LinkedHashMap<Integer, String>();
        Map<Integer,String > treeMap = new TreeMap<Integer, String>();

        testMap(hashmap);
        //testMap(linkedhashMap);
        //testMap(treeMap);
    }
    public static void testMap(Map<Integer,String> map){
        map.put(9,"fox");
        map.put(8,"cat");
        map.put(1,"dog");
        map.put(0,"rabbit");
        map.put(14,"bear");
        map.put(12,"rat");

        for (Integer key: map.keySet()){
            String value = map.get(key);
            System.out.println(key + " :" + value);
        }
    }
}
