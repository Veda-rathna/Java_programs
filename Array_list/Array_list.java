package Array_list;

import java.util.*;
public class Array_list {
    //ArrayList <data_type> obj_name = new ArryaList <data_type>(); 
    //To add elements, we use obj.add("String");
    public static void main(String[] args) {
        ArrayList <String> arr = new ArrayList <String> ();
        arr.add("Arun");
        arr.add("Varun");
        arr.add("Tharun");
        Iterator<String> itr = arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
