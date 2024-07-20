package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Implementation {
    public static void main(String[] args) {
        HashMap<Integer,String> mymap=new HashMap<>();
        mymap.put(1,"jholu");
        mymap.put(2,"tolu");
        mymap.put(3,"molu");
        mymap.put(4,"golu");
        System.out.println(mymap);
        mymap.put(2,"shivam");
        System.out.println(mymap);
        System.out.println(mymap.get(5));
        System.out.println(mymap.containsKey(1));
        System.out.println(mymap.getOrDefault(5,"Not present"));
        mymap.replace(2,"tolu");
        System.out.println(mymap);
//        for(Map.Entry<Integer,String> entry: mymap.entrySet()){
//            System.out.println("Key -> " +entry.getKey());
//            System.out.println("Value -> " +entry.getValue());
//        }

        for(Integer key:mymap.keySet()){
            System.out.println("Key -> "+key);
            System.out.println("Value -> "+mymap.get(key));
        }
    }
}
