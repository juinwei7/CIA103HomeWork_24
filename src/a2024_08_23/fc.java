package a2024_08_23;

import java.util.Arrays;

public class fc {
    public static String isTr(int a, int b, int c) {
        int[] abc = {a,b,c};
        Arrays.sort(abc);
        if (a + b <= c) {
            return "無法構成三角形";
        }
        if (a*a + b*b == c*c){
            return "直角三角形";
        }
        if (a == b && a==c){
            return "正三角形";
        }
        if (a == b || a==c || b==c){
            return "等腰三角形";
        }
        else {
            return "其他三角形";
        }
    }
}
