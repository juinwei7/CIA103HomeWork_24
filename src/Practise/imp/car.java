package Practise.imp;

public class car implements Movable{

    private int[] loc;
    private int speed;
    private String direction;  // 車輛的方向

    public car(int speed) {
        this.speed = speed;
        this.direction = "x";  // 假設車輛初始方向為北
        this.loc = new int[] {0,0};;
    }

    @Override
    public void moveForward(int distance) {
        System.out.println("汽車走了 " + distance + " 速度 " + speed + ".");
        if (this.direction.equals("x")){
            this.loc[0] = loc[0] + distance*speed;
        }
        if (this.direction.equals("z")){
            this.loc[1] = loc[1] + distance*speed;
        }
    }

    @Override
    public void moveBackward(int distance) {
        System.out.println("汽車倒退 " + distance + " 速度 " + speed + ".");
        if (this.direction.equals("x")){
            this.loc[0] = loc[0] - distance*speed;
        }
        if (this.direction.equals("z")){
            this.loc[1] = loc[1] - distance*speed;
        }
    }

    @Override
    public void stop() {
        System.out.println("汽車停止.");
    }

    @Override
    public void turn(String xz){
        this.direction = xz;
    }

    @Override
    public void Loc() {
        System.out.printf("当前位置 - x: %d, z: %d%n", this.loc[0], this.loc[1]);
    }

}