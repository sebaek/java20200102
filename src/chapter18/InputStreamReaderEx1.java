package chapter18;

import java.io.InputStreamReader;

public class InputStreamReaderEx1 {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		
		System.out.print("입력>");
		
		int i = 0;
		while ((i = isr.read()) != -1) {
			System.out.print((char) i);
		}
		
		isr.close();
	}
}
