package A20240905;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamChain {
	public static void main(String args[]) {
		int i;
		try {
			long startTime = System.currentTimeMillis();
			

//			FileInputStream fis = new FileInputStream("/Users/weiwei/Desktop/JAVA課程/JAVA程式/基礎Java.pdf");
//			while ((i = fis.read()) != -1)
//				System.out.print((char) i);
//			fis.close();

			FileInputStream fis = new FileInputStream("/Users/weiwei/Desktop/JAVA課程/JAVA程式/基礎Java.pdf");
			BufferedInputStream bis = new BufferedInputStream(fis);
			while ((i = bis.read()) != -1)
				System.out.print((char) i);

			bis.close();
			fis.close();

			long endTime = System.currentTimeMillis();
			System.out.println((endTime - startTime) / 1000);
		} catch (IOException e) {
		}
	}
}
