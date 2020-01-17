package chapter18;

import java.io.FileInputStream;
import java.io.InputStream;


public class InputStreamEx2 {
	public static void main(String[] args) {
		try (InputStream is = new FileInputStream("다형성1.png");) {
			
			int cnt = 0;
			
			while (is.read() != -1) {
				cnt++;
			}
			
			System.out.println(cnt + "bytes 크기의 파일");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
