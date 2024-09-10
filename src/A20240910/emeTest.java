package A20240910;

public enum emeTest {
    user("用戶"),

    console("控制台"),

    other("其他");

    private final String chineseName;

    private emeTest(String s){
        this.chineseName = s;
    }

    public String getChineseName(){
        return this.chineseName;
    }
}
