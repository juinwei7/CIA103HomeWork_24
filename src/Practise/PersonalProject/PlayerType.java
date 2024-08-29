package Practise.PersonalProject;

import java.util.*;

public class PlayerType {

    private String name;
    private Object Type;
    private String push;


    public PlayerType(String name, Object object){
        this.Type = object;
    }

    public PlayerType(){
    }

    public String getPush() {
        return this.push;
    }


    public void Punch() {
        if (Type instanceof Player) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("請輸入您的選擇 (剪刀, 石頭, 布): ");
            String pu = scanner.next();
            scanner.close();
            this.push = pu;
        }

        if (Type instanceof Ai) {
            String[] choices = {"剪刀", "石頭", "布"};
            Random random = new Random();
            int randomIndex = random.nextInt(choices.length);
            this.push = choices[randomIndex];
        }
    }

    public void whoWin(PlayerType... playerTypes){
        Map<String, String> pushs = new HashMap<>();
        for (PlayerType playerType:playerTypes){
            pushs.put(playerType.name, playerType.getPush());
        }

        int scissorsCount = 0;
        int rockCount = 0;
        int paperCount = 0;
        String winner = "";

        for (String choice : pushs.values()) {
            switch (choice) {
                case "剪刀":
                    scissorsCount++;
                    break;
                case "石頭":
                    rockCount++;
                    break;
                case "布":
                    paperCount++;
                    break;
            }
        }

        // 判断胜负
        if (scissorsCount > 0 && rockCount > 0 && paperCount > 0) {
            System.out.println("平手");
        }else {

        }
        if (!winner.isEmpty()) {
            System.out.println("勝利者: " + winner);
        }
    }

}
