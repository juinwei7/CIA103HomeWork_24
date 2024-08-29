package Practise.PersonalProject;

public class Main {
    public static void main(String[] args) {

        PlayerType playerType = new PlayerType();
        Player player = new Player("玩家");
        Ai ai1 = new Ai("ai1");
        Ai ai2 = new Ai("ai2");

        player.Punch();
        ai1.Punch();
        ai2.Punch();



        playerType.whoWin(player, ai1, ai2);

    }
}
