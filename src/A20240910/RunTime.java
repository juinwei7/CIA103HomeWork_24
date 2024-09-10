package A20240910;

import imp.Powder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunTime {

    public static void main(String[] args) {
        String command = "open Applications/Chrome\\ Apps.localized/Chrome\\ 遠端桌面.app";
        try {
            // 執行 macOS 的 open 命令來打開 Chrome 遠端桌面
            Runtime.getRuntime().exec(command);

            System.out.println("Chrome 遠端桌面應用程序已打開");

        } catch (IOException e) {
            e.printStackTrace();  // 如果打開失敗，輸出錯誤
        }
    }
    }
