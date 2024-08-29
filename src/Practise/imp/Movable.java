package Practise.imp;

import java.util.List;

public interface Movable {

   // void loc(int[] xz);
    void moveForward(int distance);
    void moveBackward(int distance);
    void stop();
    void turn(String xy);

    void Loc();
}
