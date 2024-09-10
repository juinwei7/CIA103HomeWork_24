package A20240909;

public class ThreadTset extends Thread {

    public static void main(String[] args){

        ThreadTset threadTset = new ThreadTset();
        threadTset.start();

    }

    @Override
    public void run(){
        int i = 0;
        while (i < 100){

            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("神秘數字： " + i);

            i++;
        };
    }

}
