package A20240829.Test;

public class Cube extends Block{

    @Getter
    private double length;

    public Cube(double length)throws CubeException{
        super("方形");
        if (length < 0){
            throw new CubeException("輸入錯誤，必須大於0");
        }
        this.length = length;
    }

    public void setLength(double length) throws CubeException {
        if (length < 0) {
            throw new CubeException("輸入錯誤，必須大於0");
        }
        this.length = length;
    }

}
