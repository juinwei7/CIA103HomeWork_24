package module27_33;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class TestNumber {
	
	public static void main(String[] args) {
//		System.out.println(1 / 0);     // ArithmeticException (整數相除分母為0的時候)
//		System.out.println(1 / 0.0);   // Java對浮點數處理是參考IEEE754標準, 浮點數相除分母為0時會得到Infinity或-Infinity
//		System.out.println(1.0 / 0);   // 同上
//		System.out.println(1.0 / 0.0); // 同上
//		
//		System.out.println(0 / 0);     // ArithmeticException (整數相除分母為0的時候)
//		System.out.println(0 / 0.0);   // Java對浮點數處理是參考IEEE754標準, 浮點數相除分母分子都為0時會得到NaN
//		System.out.println(0.0 / 0);   // 同上
//		System.out.println(0.0 / 0.0); // 同上
		
//		System.out.println(0.1 + 0.1 + 0.1); // IEEE754對小數值是採二進制的分數與指數作為表示, 所以無法精準處理我們數學上的數值運算
		
//		System.out.println(Long.MAX_VALUE);
		
//		long test = 9223372036854775808L;  // 編譯器會檢查出資料已超過long最大上限
		
//		BigInteger bi = new BigInteger("9223372036854775808"); // 使用BigInteger可以處理超過long的整數
//		System.out.println(bi.add(new BigInteger("2")));       // Immutable物件, 運算後得到的都是新的物件
		
		
//		BigDecimal bd2 = new BigDecimal(String.valueOf(0.1));  // 請用字串建構BigDecimal物件來處理小數資料在商業計算上
//		System.out.println(bd2.add(bd2).add(bd2));
		
//		// divide(除)若是結果會是無限循環小數會有例外
//		BigDecimal rate = new BigDecimal(1).divide(new BigDecimal(3));
//		System.out.println(rate);
//		
//		// 解決: 設定進位即可 (HALF_UP即為四捨五入, 捨棄的部分>= 5才進位)
//		BigDecimal rate2 = new BigDecimal(1).divide(new BigDecimal(3),6,RoundingMode.HALF_UP);
//		System.out.println(rate2);
	}
}
