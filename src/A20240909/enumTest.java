package A20240909;

public enum enumTest {
        RED("紅色"), GREEN("綠色"), BLUE("藍色");

        private final String chineseName; // 每個列舉常量的屬性

        // 私有的構造方法
        private enumTest(String chineseName) {
            this.chineseName = chineseName;
        }

        // 獲取中文名稱
        public String getChineseName() {
            return this.chineseName;
        }
    }

