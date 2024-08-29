package Practise.imp;

public class main {
    public static void main(String... args){
        Movable car = new car(10);
        Movable robot = new Robot(1);

        car.moveForward(10);
        car.turn("z");
        car.moveForward(20);
        car.turn("x");
        car.moveBackward(100);
        //car.moveForward(20);

        robot.moveBackward(10);
        robot.moveBackward(15);
        robot.turn("z");
        robot.moveBackward(20);
        robot.moveForward(100);

        car.Loc();
        robot.Loc();
    }
}
