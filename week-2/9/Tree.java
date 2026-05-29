// TreeMap in Java

// TreeMap is a class in the Java Collections Framework that stores data in key-value pairs like HashMap, but it automatically keeps the keys in sorted order.
import java.util.*;

public class Tree {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(103, "Sekhar");
        map.put(101, "Ravi");
        map.put(102, "Kiran");//The indexes are automatically sorted in ascending order based on the keys

        System.out.println(map);//That is the key advantage of using tree map.compared to hash map the keys are automatically sorted in tree map
        System.out.println(map.get(101));//get the value associated with key 101
        map.firstKey();//returns the first (lowest) key in the map
        System.out.println("The first key in the map is: " + map.firstKey());
        System.out.println("The last key in the map is: " + map.lastKey());//returns the last (highest) key in the map
        System.out.println("Does the map contain key 102? " + map.containsKey(102));//check if the map contains key 102
        System.out.println("Does the map contain value 'Ram'? " + map.containsValue("Ram"));//check if the map contains value "Ram"
    }
}