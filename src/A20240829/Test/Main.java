package A20240829.Test;

public class Main {
    public static void main(String[] args) {
        Block cube = null;
        Block rectangle = null;
        try {
            cube = new Cube(-10);
            rectangle = new Rectangle(6,8);
        }catch (CubeException e){
            //System.out.println(e.getMessage());
            e.printStackTrace();
            return;
        }

        cube.megType();
        rectangle.megType();
    }
}
