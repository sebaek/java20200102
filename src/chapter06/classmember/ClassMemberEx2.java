package chapter06.classmember;

public class ClassMemberEx2 {
	int instanceVar;
	
	static int classVar;
	
	void instanceMethod() {
		System.out.println(classVar);
	}
	
	static void classMethod() {
//		System.out.println(instanceVar);
	}
	
}
