package a2024_08_23;

import java.util.Arrays;
import java.util.Scanner;

public class a2024_08_23 {
    public static void main(String[] arg){
        work04();

    }

    //請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
    //三角形、其它三角形或不是三角形,如圖示結果:
    private static void work01(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入第一個值：");
        int s01 = scanner.nextInt();
        System.out.println("請輸入第二個值：");
        int s02 = scanner.nextInt();
        System.out.println("請輸入第三個值：");
        int s03 = scanner.nextInt();
        String ans = fc.isTr(s01,s02,s03);
        System.out.println(ans);
    }

    //請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
    //對則顯示正確訊息,如圖示結果:
    private static void work02(){
        Scanner scanner = new Scanner(System.in);

        int ans = (int) (Math.random() * 10);

        System.out.println(ans);

        System.out.println("請猜一個數字：");
        int qu = scanner.nextInt();

        while (true){
            if (ans == qu){
                System.out.println("恭喜猜對,遊戲結束");
                break;
            }else {
                System.out.println("猜錯囉，請猜一個數字：");
                qu = scanner.nextInt();
            }
        }


    }

    //阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
    //厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
    //的號碼與總數,如圖:
    private static void work03(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入你討厭的數字1~9：");
        int ig = scanner.nextInt();
        int leg = 0;

        for (int i = 1; i<50; i++){
            String whi = String.valueOf(i);
            if (!whi.contains(String.valueOf(ig))){
                System.out.print(i + " ");
                leg += 1;
            }
        }
        System.out.print( "\n" + "總共有：" + leg);
    }

    //透過Math類別的靜態方法random(),可以自動產生隨機的數字
    //• 用法參考如圖所示:
    private static void work04(){

    }
}
