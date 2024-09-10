package HomeWork;

import java.util.*;

public class Work04 {
    public static void main(String... args){
        work06();
    }


    //有個一維陣列如下:
    //{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
    //請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
    public static void work01(){
        int[] fat = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};

        int toto = 0;
        for (int i : fat){toto += i;}
        System.out.println("平均值： " + toto/fat.length);
        System.out.print("大於平均： ");
        for (int i : fat){
            if (i>toto/fat.length){
                System.out.print(i + ", ");
            }
        }
    }

    //請建立一個字串,經過程式執行後,輸入結果是反過來的
    //例如String s = “Hello World”,執行結果即為dlroW olleH
    public static void work02() {
        String s = "Hello World";
        for (int i = s.length(); i > 0; i--) {
            System.out.print(s.charAt(i - 1));
        }
    }

    //有個字串陣列如下 (八大行星):
    //{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
    //請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
    public static void work03() {
        String[] ae = {"a", "e", "i", "o", "u"};
        String[] sList = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
        int toto = 0;
        for (String s : sList){
            for (int i = 0; i<s.length(); i++){
                String m = String.valueOf(s.charAt(i));
                if(m.equals("a") ||  m.equals("e") || m.equals("i") || m.equals("o") || m.equals("u")){
                    toto += 1;
                }
            }
        }
        System.out.println("共有：" + toto);
    }

    //阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
    //表如下:
    //
    //請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
    //有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
    //員工編號: 25 19 27 共 3 人!」
    public static void work04(){
        Map<Integer, Integer> colleagueMoney = new HashMap<>();
        colleagueMoney.put(25, 2500);
        colleagueMoney.put(32, 800);
        colleagueMoney.put(8, 500);
        colleagueMoney.put(19, 1000);
        colleagueMoney.put(27, 1200);
        int toto = 0;
        System.out.println("輸入想借多少錢：");
        int scanner = Integer.parseInt(getscanner());

        System.out.println("有錢可借的員工編號: ");
        for (Integer key : colleagueMoney.keySet()){
            if (colleagueMoney.get(key) >= scanner){
                System.out.println(key);
                toto += 1;
            }
        }
        System.out.println("共有： " + toto + " 人");

    }

    //請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
    //
    //例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
    public static void work05(){

        int[] mmdd = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totoDay = 0;

        System.out.println("請輸入年份：");
        int yy = scannerConvert();
        System.out.println("請輸入月份：");
        int mm = scannerConvert();
        System.out.println("請輸入幾號：");
        int dd = scannerConvert();

        if (isLeapYear(yy)){
            mmdd[1] = 29;
        }

        for (int i = 1; i<mm; i++){
            totoDay += mmdd[i-1];
        }

        totoDay += dd;

        System.out.println("輸入的日期為該年第 " + totoDay + " 天");
    }

    //班上有8位同學,他們進行了6次考試結果如下:
    public static void work06() {
        int[][] classExam = new int[8][];

        classExam[0] = new int[]{10, 37, 100, 77, 98, 90};
        classExam[1] = new int[]{35, 75, 70, 95, 70, 80};
        classExam[2] = new int[]{40, 77, 79, 70, 89, 100};
        classExam[3] = new int[]{100, 89, 90, 89, 90, 75};
        classExam[4] = new int[]{90, 64, 75, 60, 75, 50};
        classExam[5] = new int[]{85, 75, 70, 75, 90, 20};
        classExam[6] = new int[]{75, 70, 79, 85, 89, 99};
        classExam[7] = new int[]{70, 95, 90, 89, 90, 75};

        int[] sc = new int[8];

        for (int j = 0; j < 6; j++) {
            int maxAm = -1;
            int maxIndex = -1;
            for (int i = 0; i < 8; i++) {
                if (classExam[i][j] > maxAm) {
                    maxAm = classExam[i][j];
                    maxIndex = i;
                }
            }
            sc[maxIndex] += 1;
        }

        int am = 1;
        for (int i = 0; i < sc.length; i++) {
            System.out.println("第" + am + "位， 最高次數: " + sc[i]);
            am++;
        }
    }
    public static void ff(Object object){
        if (object instanceof String){
            String.valueOf(object);
        }
    }




    /*===============================

                    FC

    ===============================*/
    public static String getscanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static int scannerConvert(){
        String s = getscanner();
        int i;
        try {
            i = Integer.getInteger(s);
            return i;
        } catch (Exception e) {
            System.out.println("您輸入的不是數字");
            throw new RuntimeException(e);
        }
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
}
