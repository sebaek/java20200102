package chapter02;

public class PrimitiveType {
	public static void main(String[] args) {
		// 정수형
		// byte, short, int, long
		
		// 실수형
		// float, double
		
		// 문자형
		// char
		
		// 논리형
		// boolean

		/*****************************************/
		// byte 
		System.out.println("byte형의 범위");
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		byte byteVar1 = -128;
		System.out.println(byteVar1);
		
		byteVar1 = 127;
		System.out.println(byteVar1);
		
//		byteVar1 = 128;
		
		/*****************************************/
		// short 
		System.out.println("short형의 범위");
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		short shortVar1 = -30000;
//		shortVar1 = -40000;
		
		/*****************************************/
		// int 
		System.out.println("int형의 범위");
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		int intVar1 = 2100000000;
		
		/*****************************************/
		// long 
		System.out.println("long형의 범위");
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		long longVar1 = 220000000000L;

	}
}












