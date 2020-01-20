package chapter18.network;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientEx1 {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket();
		System.out.println("연결 요청");
		socket.connect(new InetSocketAddress("211.183.2.21", 9000));
		System.out.println("연결 성공");

		OutputStream os = socket.getOutputStream();
		PrintStream ps = new PrintStream(os);
		
		for (int i = 0; i < 10; i++) {
			ps.println("메시지 보냄" + i);
		}
		
		
		ps.close();
		if (!socket.isClosed()) {
			socket.close();
		}

	}
}




