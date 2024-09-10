package A20240909;

public class RunableTest implements Runnable{

    private String threadName;

    public RunableTest(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        // 執行緒的工作內容
        for (int i = 1; i <= 8; i++) {
            System.out.println(threadName + " - 執行次數: " + i);
            try {
                // 暫停執行緒 500 毫秒
                Thread.sleep(500);
                //Thread.yield();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadName + " 完成任務");
    }
}
