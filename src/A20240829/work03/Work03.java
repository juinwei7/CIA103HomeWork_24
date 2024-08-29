package A20240829.work03;

public class Work03 {

    public static int Work03(int[][] arry){
        int max = -1;
        for (int i = 0; i<arry.length; i++){
            for (int j : arry[i]){
                max = Math.max(max, j);
            }
        }

        return max;
    }

    public static double Work03(double[][] arry){
        double max = -1;
        for (int i = 0; i<arry.length; i++){
            for (double j : arry[i]){
                max = Math.max(max, j);
            }
        }
        return max;
    }
}
