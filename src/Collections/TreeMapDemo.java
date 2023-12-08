package Collections;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;


public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("Hello",1);
        treeMap.put("Bye",2);
        treeMap.put("Hi",1);
        treeMap.put("Hello",10);



        System.out.println(treeMap+"\n");//It will print in the alphabetical order of the keys in treemap
        System.out.println(treeMap.ceilingEntry("Hello"));
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.headMap("Hi"));
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.containsKey("Hello"));
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.containsValue(5));
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.firstKey());
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.floorEntry("Bye"));
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.floorKey("Hi"));
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.entrySet());
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.get("Hello"));
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.higherEntry("Bye"));
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.higherKey("Hello"));
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.keySet());
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.lastKey());
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.lowerEntry("Hi"));
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.lowerKey("Bye"));
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.replace("Bye",2,10));
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.values());
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.subMap("","Hi"));
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.pollFirstEntry());
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.pollLastEntry());
        System.out.println(treeMap+"\n");

        System.out.println(treeMap.remove("Hello",10));
        System.out.println(treeMap+"\n");

    }
}
