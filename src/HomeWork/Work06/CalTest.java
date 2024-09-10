package HomeWork.Work06;


public class CalTest {
    public static void main(String[] args) {
        fc();
    }

    public static void fc(){
        int x = 0;
        int y = 0;
        try {
            System.out.println("請輸入x值");
            x = Calculator.getInt();
            System.out.println("請輸入ｙ值");
            y = Calculator.getInt();
            int ans = Calculator.powerXY(x, y);
            System.out.println(x + "的" + y + "次方等於" + ans);
        } catch (CalException e) {
            System.out.println(e.getMessage());
            fc();
        }
    }

}
