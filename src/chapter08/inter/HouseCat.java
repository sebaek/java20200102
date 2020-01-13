package chapter08.inter;

public class HouseCat implements Pet {
	@Override
	public void sit() {
		System.out.println("집고양이가 앉지 않습니다.");
	}
}
