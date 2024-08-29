package A20240829.Ext.Pen;

public class Main {
    public static void main(String[] args){
        Pen pencil = new Pencil("無印", 100);
        Pen inkBrush = new InkBrush("文墨", 100);

        pencil.write();
        inkBrush.write();

    }
}
