package Vector;

import java.util.*;

public class Vector_example {
    public static void main(String[] args) {
        Vector <String> v1 = new Vector <String> ();
        v1.add("Anil");
        v1.add("Sunil");
        v1.add("Nikil");
        Iterator <String> ir = v1.iterator();
        while(ir.hasNext()){
            System.out.print(ir.next()+" ");
        }
    }    
}
