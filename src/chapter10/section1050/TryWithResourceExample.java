package chapter10.section1050;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try (MyFileInputStream fis = new MyFileInputStream("file.txt")) {
			fis.read();
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
