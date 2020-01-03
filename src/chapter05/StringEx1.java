package chapter05;

public class StringEx1 {
	public static void main(String[] args) {
		
		String strVar1 = "    유재석 재석 재석     ";
		System.out.println(strVar1);
		
		System.out.println(strVar1.length());
		System.out.println(strVar1.charAt(2));
		System.out.println(strVar1.indexOf("재석"));
		
		System.out.println(strVar1.replace("재석", "산슬"));
		System.out.println(strVar1.trim());
		
		System.out.println(strVar1.substring(4, 7));
		
		
		
		
		
	}
}
