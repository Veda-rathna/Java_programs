package Hash_map;

import java.util.*;

public class Hash_map {
    public static void main(String[] args) {
        HashMap <Integer, String> map = new HashMap<>();
        map.put(1,"Arun");
        map.put(2,"Varun");
        map.put(3,"Tharun");

        for(@SuppressWarnings("rawtypes") Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
