package HomeWork;

public class Work02 {

    public static void main(String[] args) {

        work_07();

    }

    //請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
    private static void work_01(){
        int ans = 0;
        int rag = 1000;
        for (int i = 0; i<=rag; i++){
            if (i%2==0){
                ans += i;
            }
        }
        System.out.println("加總: " + ans);
    }

    //請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
    private static void work_02(){
        int ans = 1;
        int reg = 10;
        for (int i = 1; i<=reg; i++){
            ans *= i;
        }
        System.out.println("乘積: " + ans);
    }

    //請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
    private static void work_03(){
        int ans = 1;
        int i = 1;
        while (true){
            if (i>10){break;}
            ans *= i;
            i++;
        }
        System.out.println("乘積: " + ans);
    }

    //請設計一隻Java程式,輸出結果為以下:
    //1 4 9 16 25 36 49 64 81 100
    private static void work_04(){
        for (int i = 1; i<=10; i++){

            System.out.print(i*i + " ");
        }
    }

    //阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
    //輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
    private static void work_05(){

        int am = 0;
        for (int i = 1; i<=49; i++){
            String i_st = String.valueOf(i);
            if (!i_st.contains("4")){
                am +=1;
                System.out.print(i + ", ");
            }
        }
        System.out.println( "\n" + "可用個數" + am);
    }

    //請設計一隻Java程式,輸出結果為以下:
    private static void work_06(){

        for (int j = 10;j>=1; j--){
             for (int i = 1; i<=j; i++){
                System.out.print(i + "\t");

            }
             System.out.println();
        }
    }

    //請設計一隻Java程式,輸出結果為以下:
    private static void work_07(){

        for (int j = 1;j<=6; j++){
            for (int i = 1; i<=j; i++){
                String x = null;
                switch (j) {
                    case 1:
                        x = "A";
                        break;
                    case  2:
                        x = "B";
                        break;
                    case 3:
                        x = "C";
                        break;
                    case 4:
                        x = "D";
                        break;
                    case 5:
                        x = "E";
                        break;
                    case 6:
                        x = "F";
                        break;
                }
                System.out.print(x + "\t");

            }
            System.out.println();
        }
    }

}
