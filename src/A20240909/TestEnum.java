package A20240909;

public class TestEnum {
        public static void main(String[] args) {
            enumTest color = enumTest.RED;

            // 獲取顏色的中文名稱
            System.out.println(color + " 的中文名稱是: " + color.getChineseName());
        }
}
