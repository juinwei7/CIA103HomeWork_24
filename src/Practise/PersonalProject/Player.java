package Practise.PersonalProject;

public class Player extends PlayerType{

    public Player(String name) {
        super(name, new Player());
    }

    public Player() {}

}


