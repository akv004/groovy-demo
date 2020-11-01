package collections.sorting;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingMapDemo {
    public static void main(String args[]){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a",1);
        map.put("c",2);
        map.put("b",3);
        map.put("e",4);

        System.out.println(map);

        //Sorting map by key
        Map newMap = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)-> e1, LinkedHashMap::new));
        newMap.forEach((k,v) -> System.out.println(k+", " +v ));
    }
}
