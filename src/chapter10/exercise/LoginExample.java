package chapter10.exercise;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void login(String id, String password) throws Exception {
		if (!id.equals("blue")) {
			throw new NotExistIDException("");
		}
	}
}
