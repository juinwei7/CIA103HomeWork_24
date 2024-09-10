package A20240906;

import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args){

        TreeMap<Integer, String> treeMap = new TreeMap();
        treeMap.put(1, "a");
        treeMap.put(2, "b");
        treeMap.put(3, "c");
        treeMap.put(4, "d");

        System.out.println(treeMap.lastKey());
        System.out.println(treeMap.firstEntry());

    }
}
