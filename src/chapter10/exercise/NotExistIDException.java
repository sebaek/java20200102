package chapter10.exercise;

public class NotExistIDException extends Exception {
	public NotExistIDException() {
		
	}
	public NotExistIDException(String message) {
		super("아이디가 존재하지 않습니다.");
	}
}
