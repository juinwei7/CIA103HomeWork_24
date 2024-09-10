package HomeWork.Worl08;

import A20240829.Test.Getter;
import com.sun.source.tree.Tree;

import java.util.*;

public class Train {
    //請設計一個Train類別,並包含以下屬性:
    //- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
    //- 目的地 dest,型別為String - 票價 price,型別為double
    @Getter
    private int number;
    private String type;
    private String start;
    private String dest;
    private double price;

    public Train(int number, String type, String start, String dest, double price){
        this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;

    }
    public void seedMessage(){
        System.out.println("班次： " + number + "\t 車種： " + type + "\t出發地： " + start + "\t 目的地： " + dest + "\t 票價： " + price);

    }

//- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//- (1254, “區間”, “屏東”, “基隆”, 700)
//- (118, “自強”, “高雄”, “台北”, 500)
//- (1288, “區間”, “新竹”, “基隆”, 400)
//- (122, “自強”, “台中”, “花蓮”, 600)
//- (1222, “區間”, “樹林”, 七堵, 300)
//- (1254, “區間”, “屏東”, “基隆”, 700)
    public static void main(String[] args){

        Train[] trains = {
                new Train(202, "普悠瑪", "樹林", "花蓮", 400),
                new Train(1254, "區間", "屏東", "基隆", 700),
                new Train(118, "自強", "高雄", "台北", 500),
                new Train(1288, "區間", "新竹", "基隆", 400),
                new Train(122, "自強", "台中", "花蓮", 600),
                new Train(1222, "區間", "樹林", "七堵", 300),
                new Train(1254, "區間", "屏東", "基隆", 700)
        };

        TreeMap<Integer, Train> trainMap = new TreeMap();


        for (Train i : trains){
            trainMap.put(i.number, i);
        }

        //forEach
        for (Map.Entry<Integer, Train> mapInfo : trainMap.entrySet()) {
            Train train = mapInfo.getValue();
            train.seedMessage();
        }

        //傳統for
        List<Integer> keys = new ArrayList<>(trainMap.keySet());
        for (int i = 0; i<keys.size(); i++) {
            Train train = trainMap.get(keys.get(i));
                train.seedMessage();
        }




    }


}
