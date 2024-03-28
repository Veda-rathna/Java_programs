package Iterator;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Iterator_{
    public static void main(String[] args) {
        Collection <String> collection = new ConcurrentLinkedQueue<>();
        collection.add("Ram");
        collection.add("Sam");
        collection.add("Vam");

        Iterator <String> ic = collection.iterator();
        while (ic.hasNext()) {
            System.out.println(ic.next());
        }
    }
}