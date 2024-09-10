package A20240829.Test;

public class Rectangle extends Block{

    double width;
    double longe;

    public Rectangle(double width, double longe) throws CubeException{
        super("長方形");
        if (width < 0 || longe < 0){
            //CubeException cubeException = new CubeException()
            throw new CubeException("輸入錯誤，必須大於0");
        }
        this.width = width;
        this.longe = longe;
    }
}
