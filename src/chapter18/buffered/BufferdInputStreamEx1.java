package chapter18.buffered;

import java.io.FileInputStream;

public class BufferdInputStreamEx1 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("다형성1.png");

		long start = System.currentTimeMillis();
		while (fis.read() != -1) {
			
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println((end-start) + "밀리초");
		
		System.out.println("읽기 완료.");
		
		fis.close();
	}
}
