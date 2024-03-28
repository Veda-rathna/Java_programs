package Hash_map;

import java.util.*;

public class Linked_Hash_Map {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        LinkedHashMap <Integer, String> map = new LinkedHashMap<>();
        map.put(1,"Arun");
        map.put(2,"Varun");
        map.put(3,"Tharun");

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
