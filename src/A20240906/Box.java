package A20240906;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Box {
    public static void addNumber(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> ans = new ArrayList<>();

        while (ans.size() < 6){
            int a = random.nextInt(1, 49);
            if (!ans.contains(a)){
                ans.add(a);
            }
        }
        for (int i : ans){
            System.out.print(i + ", ");
        }


    }
}




