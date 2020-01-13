package chapter08.inter;

public interface Pet {
	public static final int i = 3;
	int j = 3;
	static void staticMethod() {
		System.out.println("스태틱 메소드입니다.");
	}
	
	public abstract void sit();
	void roll();
	
	default void eat() {
		System.out.println("먹습니다.");
	}
}






