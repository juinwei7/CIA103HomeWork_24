package A20240821;

public class Student {
    String name;
    int score = 0;

    public Student(String name){
        this.name = name;
    }

    public void play(int hours){
        this.score = score-hours;
    }

    public void study(int hores){
        this.score = score+hores;
    }
}
