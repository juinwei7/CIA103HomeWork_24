package A20240909;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunableTest("a"));
        Thread thread2 = new Thread(new RunableTest("a"));
        thread1.start();  // 啟動執行緒

//        try {
//            thread1.join();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
        System.out.println("恭喜執行完畢");

    }	}
