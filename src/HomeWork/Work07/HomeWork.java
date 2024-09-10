package HomeWork.Work07;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeWork {
    public static void main(String[] args) throws IOException {

//        File file01 = new File("src/HomeWork/Work07/txt/Sample.txt");
//        File file02 = new File("src/HomeWork/Work07/txt/copyFile.txt");


        //work04();
        work05();
        //work01();
    }

    private static void work01(){

        File file = new File("src/HomeWork/Work07/Sample.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

            System.out.println(bufferedReader.read());
            // 初始化計數變數
            int byteCount = 0;
            int charCount = 0;
            int lineCount = 0;


            // 讀取檔案的字元和行數
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    lineCount++;
                    charCount += line.length();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // 讀取檔案的位元組數
            if (file.exists() && file.isFile()) {
                byteCount = (int) file.length();  // 檔案的位元組數
            }

            // 輸出結果
            System.out.println(file.getName() + " 檔案共有 " + byteCount + " 個位元組, " + charCount + " 個字元, " + lineCount + " 列資料");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    //請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
    //append功能讓每次執行結果都能被保存起來)
    private static void work02(){

        Random random = new Random();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i<10; i++){
            ans.add(random.nextInt(1, 1000));
        }
        System.out.println(ans);
        try (FileOutputStream fos = new FileOutputStream("src/HomeWork/Work07/append.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             PrintStream ps = new PrintStream(bos)) {

            ps.append(ans.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    //請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
    //代表的檔案會複製到第二個參數代表的檔案
    private static void work03(File file1, File file2){

        if (file1 == null || file2 == null){
            System.out.println("file1讀取錯誤");
            return;
        }


        try (FileReader fileReader = new FileReader(file1);
             FileWriter writer = new FileWriter(file2)) {
            int read;
            while ((read = fileReader.read()) != -1){
                writer.write(read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("copy 完成");

    }

    //請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
    //意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
    private static void work04() {
        try (FileOutputStream fos = new FileOutputStream("src/HomeWork/Work07/txt/Object.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            animal dog = new Dog("小狗");
            animal cat = new Cat("小貓");
            oos.writeObject(dog);
            oos.writeObject(cat);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多
    //型簡化本題的程式設計)
    private static void work05() {
        try (FileInputStream fos = new FileInputStream("src/HomeWork/Work07/txt/Object.ser");
             ObjectInputStream oos = new ObjectInputStream(fos)) {


            animal dog = (animal) oos.readObject();
            animal cat = (animal) oos.readObject();
            //animal dog = (Dog) oos.readObject();
            cat.speak();
            dog.speak();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
