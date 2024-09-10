package HomeWork.Worl08;

import java.util.ArrayList;
import java.util.List;

public class w1 {
    //請建立一個Collection物件並將以下資料加入:
    //Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
    //Object物件、“Snoopy”、BigInteger(“1000”)

    public static void main(String[] args) {

        List world01 = new ArrayList<>();

        int a = 100;
        double b = 3.14;
        long c = 21L;
        short d = 100;
        double e = 5.1;
        String f = "Kitty";
        int g = 100;
        Object h = new Object();

        world01.add(a);
        world01.add(b);
        world01.add(c);
        world01.add(d);
        world01.add(e);
        world01.add(f);
        world01.add(g);
        world01.add(h);

        //傳統for
        for (int i = 0; i<world01.size(); i++){
            System.out.println(world01.get(i).toString());
        }

        //forEach
        for (Object i : world01){
            System.out.println(i.toString());
        }

        //移除不是java.lang.Number相關的物件
        for (int i = 0; i < world01.size(); i++) {
            if (!(world01.get(i) instanceof Number)) {
                world01.remove(i);
            }
       }
        //再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
        for (Object i : world01){
            System.out.println(i.toString());
       }


    }
}
