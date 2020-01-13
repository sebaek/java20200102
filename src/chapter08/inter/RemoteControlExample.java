package chapter08.inter;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(99);
	}
}
