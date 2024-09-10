package A20240906;

import lombok.Value;

import java.io.Serializable;
import java.security.Key;
import java.util.*;

public class A20240906 implements Serializable {

    private static final long serialVersionUID = 1L;

    public A20240906(){

    }

    public static void main(String[] args){


        mapTest();

    }
    public static void seTest(){
        Set<String> stringSet = new HashSet<>();

        stringSet.add("拉拉");
        stringSet.add("多多");
        stringSet.add("卡立");

        stringSet.remove("拉拉");
        for (String i : stringSet){
            System.out.println(i);
        }
    }

    public static void mapTest(){
        Map<String, Integer> map = new HashMap();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);

//        for (String key : map.keySet()){
//            int a = map.get(key);
//            System.out.println(key + " = " + a);
//        }

//        for (Map.Entry<String, Integer> er : map.entrySet()){
//            System.out.println(er.getKey() + " = " + er.getValue());
//        }

        map.forEach((key, value) ->
                System.out.println(key + " = " + value));
        //System.out.println(map.keySet());

        Map<String, Integer> ex; //map鎖定 字串跟整數
        


    }

}
