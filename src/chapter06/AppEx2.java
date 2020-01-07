package chapter06;

import chapter06.exercise.Member;

public class AppEx2 {
	public static void main(String[] args) {
		Member u = new Member("홍길동", "hong");
		
		User user1 = new User();
		System.out.println(user1.userId);
		System.out.println(user1.level);
		
		User user2 = new User("computer");
		System.out.println(user2.userId);
		System.out.println(user2.level);
		
		User user3 = new User("java", 99);
		System.out.println(user3.userId);
		System.out.println(user3.level);
		
		ConstructorEx1 ce1 = new ConstructorEx1(5);
		ConstructorEx1 ce2 = new ConstructorEx1(7);
		
		ConstructorEx1 ce3 = new ConstructorEx1();
		ConstructorEx1 ce4 = new ConstructorEx1(8, 9);
		
	}
}
