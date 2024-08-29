package A20240829;

import A20240829.Work04.MyRectangleMain;
import A20240829.work03.Work03;

public class HomeWork {
    public static void main(String[] args){
        work05();
    }

    //請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
    public static void work01(){
        System.out.println("請輸入長度：");
        int a = Fc.getscannerInt();
        System.out.println("請輸入寬度：");
        int b = Fc.getscannerInt();

        for (int i = 0; i<b; i++){
            for (int j = 0; j<a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
    public static void work02(){
        int[] regList = new int[10];
        for (int i = 0; i<regList.length; i++){
            regList[i] = Fc.getrang(100);
        }
        int toto = 0;
        for (int i : regList){
            System.out.print(i + ", ");
            toto += i;
        }
        System.out.println("\n" + "平均值： " + toto/regList.length);
    }

    //利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
    //可以找出二維陣列的最大值並回傳,如圖:
    public static void work03() {

        int[][] intArray = {
                {1, 6, 3},
                {9, 5, 2}
        };
        double[][] doubleArray = {
                {1.2, 3.5, 2.2},
                {7.4, 2.1, 8.2}
        };

        Work03 work03 = new Work03();
        System.out.println("int max: " + work03.Work03(intArray));
        System.out.println("double max: " + work03.Work03(doubleArray));

    }

    //請設計一個類別MyRectangle:
    public static void work04(){
        //在資料夾Work04.MyRectangleMain
        MyRectangleMain.stats();
    }

    //身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
    //genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
    public static void work05(){
        String nb = Fc.genAuthCode(8);
        System.out.println("本次隨機產生的驗證碼為： \n" + nb);
    }
}
