package A20240829;

import java.util.Scanner;

public class Fc {

    public static String getscannerSt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static int getscannerInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int getrang(int rag){
       double reg0 = Math.random() * rag + 1;
       return (int) reg0;
    }

    public static String genAuthCode(int serialNumber) {
        StringBuilder sb = new StringBuilder(serialNumber);
        String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < serialNumber; i++) {
            int randomIndex = (int) (Math.random() * CHARACTERS.length() + 1);
            sb.append(CHARACTERS.charAt(randomIndex));
        }
        return sb.toString();
    }
}

