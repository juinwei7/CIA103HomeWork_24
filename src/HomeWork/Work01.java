package HomeWork;

public class Work01 {
    public static void main(String[] args) {

        work_06();

    }

    //請設計一隻Java程式,計算12,6這兩個數值的和與積
    private static void work_01(){
                int a = 12;
                int b = 6;

                int sum = a + b;
                int product = a * b;

                System.out.println("總和: " + sum);
                System.out.println("積分: " + product);
    }

    //請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
    private static void work_02(){
        int am = 200;
        int ans = (int) am/12;
        int p = am%12;

        System.out.println("200顆雞蛋共計: " + ans + " 打 ，" + "剩餘 " + p + "顆");
    }

    //請由程式算出256559秒為多少天、多少小時、多少分與多少秒
    private static void work_03(){
        int total = 256559;

        int d = total / (24 * 3600);
        int day_toto = total % (24 * 3600);

        int h = day_toto / 3600;
        int h_toto = day_toto % 3600;

        int m = h_toto / 60;
        int s = h_toto % 60;

        System.out.println(d + " 天 " + h + " 小時 " + m + " 分 "  + s + " 秒 " );
        }

    //請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
    private static void work_04(){
        double rag = 3.1415;
        int r = 5;

        double area = r * r * rag;
        double Circumference = r * 2 * rag;

        System.out.println("園面積: " + area);
        System.out.println("園周長: " + Circumference);
    }

    //某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
    //金加利息共有多少錢 (用複利計算,公式請自行google)
    private static void work_05(){
        int money = 1500000;
        int year = 10;
        double f = 1;

        for (int i = 1; i<=year; i++){
            f = f * 1.02;
        }
        double toto_money = money * f;

        System.out.println("總金額: " + toto_money);
    }


    //請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
    private static void work_06(){

        System.out.println( 5 + 5  + " 普通數字加總");
        System.out.println( 5 + '5' + " 數字加char");
        System.out.println( 5 + "5" + " 數字加 char");
    }


}