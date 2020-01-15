package chapter15.arraylist;

import java.util.ArrayList;
import java.util.List;

import chapter15.array.Student;

public class ArrayListEx4 {
	public static List<Student> listStudents() {
		List<Student> list = new ArrayList<>();
		
		Student s1 = new Student();
		s1.setName("안나");
		s1.setMath(80);
		
		Student s2 = new Student();
		s2.setName("엘사");
		s2.setMath(85);
		
		Student s3 = new Student();
		s3.setName("올라프");
		s3.setMath(75);
		
		Student s4 = new Student();
		s4.setName("스벤");
		s4.setMath(60);
		
		Student s5 = new Student();
		s5.setName("크리스토퍼");
		s5.setMath(73);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		
		return list;
	}
	
	public static void main(String[] args) {
		List<Student> sList = listStudents();
		
		// 최고 점수를 얻은 학생이름과 점수
		// 최저 점수를 얻은 학생이름과 점수
		// 평균 점수를 출력
		
	}
}
