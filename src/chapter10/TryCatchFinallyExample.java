package chapter10;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			System.out.println("try 시작");
			Class clazz = Class.forName("java.lang.String2");
			System.out.println("try 종료");
		} catch (ClassNotFoundException e) {
			System.out.println("catch 시작");
			System.out.println("exception 발생");
			System.out.println("catch 종료");
		}
		
		System.out.println("실행을 이어감.");
	}
}
