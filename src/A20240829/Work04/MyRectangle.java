package A20240829.Work04;

public class MyRectangle {
    double width, depth;

    public MyRectangle(double width, double depth){
        this.width = width;
        this.depth = depth;
    }

    public MyRectangle(){}


    void setWidth(double width){
        this.width = width;
    }

    void setDepth(double depth){
        this.depth = depth;
    }

    double getArea(){
        return width * depth;
    }
}
