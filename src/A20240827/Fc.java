package A20240827;

import java.util.Scanner;

public class Fc {

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
