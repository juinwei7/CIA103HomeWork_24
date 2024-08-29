package A20240829.Work04;

public class MyRectangleMain {
    public static void main(String[] args){
        stats();
    }
    public static void stats(){
        MyRectangle myRectangle01 = new MyRectangle();
        myRectangle01.setWidth(10);
        myRectangle01.setDepth(20);

        System.out.println("面積： " + myRectangle01.getArea());

        MyRectangle myRectangle02 = new MyRectangle(10, 20);
        System.out.println("面積： " + myRectangle02.getArea());
    }
}
