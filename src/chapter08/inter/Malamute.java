package chapter08.inter;

public class Malamute implements Pet {
	@Override
	public void sit() {
		System.out.println("말라뮤트가 앉습니다.");
	}
	
	@Override
	public void roll() {
		System.out.println("말라뮤트가 구릅니다.");
	}
}
