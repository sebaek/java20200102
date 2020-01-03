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

		String strVar2 = "유린기";
		String strVar3 = strVar1 + strVar2;
		System.out.println(strVar3);
		
		String strVar4 = strVar2 + 99;
		System.out.println(strVar4);
		
//		String strVar5 = "3" - "4"; // 안됨.
		
		
		
		
		
		
	}
}
