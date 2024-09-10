package A20240902;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("File/eee.yml");
        if (getFild(file)){
            int i = 0;
            while (i < 49) {
                reader();
                i++;
            }
            System.out.println("＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋");
            System.out.println("＋                                                    ＋");
            System.out.println("＋                                                    ＋");
            System.out.println("＋                完成 7749 次，功德圓滿                 ＋");
            System.out.println("＋                                                    ＋");
            System.out.println("＋                                                    ＋");
            System.out.println("＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋");
        }
    }

    public static void write(File file){
        try (FileWriter writer = new FileWriter("File/eee.yml", true)) {
            for (int i = 0; i<10; i++) {
                writer.write("這是一個使用 FileWriter 寫入的範例\n");
                writer.write("支援多字節字符，例如：中文\n");
                writer.write("值： " + i);

                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reader(){
        try (FileReader reader = new FileReader("File/eee.yml")) {
            int data;
            System.out.println();
            while ((data = reader.read()) != -1) {
                Thread.sleep(5);
                System.out.print((char) data);  // 將字符逐個輸出
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static boolean getFild(File file){
        if (file.exists()) { //檢查文件在不在
            return true;
        }
        return false;
    }

    public static void copyYml(File sourceFile, File targetFile) {
        try (FileReader fileReader = new FileReader(sourceFile);
             FileWriter fileWriter = new FileWriter(targetFile)) {

            int data;
            while ((data = fileReader.read()) != -1) {
                fileWriter.write(data);
            }

        } catch (IOException e) {
            System.out.println("複製文件時發生錯誤：" + e.getMessage());
        }
    }
}
