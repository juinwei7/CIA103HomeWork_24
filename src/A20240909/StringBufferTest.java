package A20240909;

public class StringBufferTest {
    public static void main(String[] args){

        StringBuffer stringBuffer = new StringBuffer("ddd");

        stringBuffer.append("rrr");
        stringBuffer.replace(3, 13, "iii");

        System.out.println(stringBuffer);

    }
}
