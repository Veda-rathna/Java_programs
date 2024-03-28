package LinkedHashSet_;

import java.util.*;

public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashSet <String> lin = new LinkedHashSet<>();
        lin.add("Ravi");
        lin.add("Revi");
        lin.add("Hari");

        Iterator<String> ir = lin.iterator();
        while(ir.hasNext()){
            System.out.println(ir.next());
        }
    }    
}
