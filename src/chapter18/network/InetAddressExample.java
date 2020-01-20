package chapter18.network;

import java.net.InetAddress;

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 ip주소: " + local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			
			for (InetAddress remote : iaArr) {
				System.out.println(remote.getHostAddress());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
