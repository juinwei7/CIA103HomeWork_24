package A20240829.Test;

public class CubeException extends Exception{
    String message;
    public CubeException(String message) {
       // super(message);
        this.message = message;
        System.out.println(message);
    }
    public CubeException(String message, Throwable cause) {
        super(message, cause);
    }
    public void seedmessage(){
        System.out.println(message);
    }

}
