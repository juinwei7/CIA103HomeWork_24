package HomeWork.Work06;

import java.util.Scanner;

public class Calculator {


    public static int powerXY(int x, int y) throws CalException{
        if (x==0 || y==0){
            throw new CalException("0的0次方沒有意義");
        }
        if (y<0){
            throw new CalException("輸入錯誤，必須大於0");
        }
        return (int) Math.pow(x, y);
    }

    public static int getInt() throws CalException {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            throw new CalException("輸入的格式不正確");
        }
    }
}
