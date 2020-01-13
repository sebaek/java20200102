package chapter08.inter;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl r1 = new SmartTelevision();
		r1.turnOn();
		r1.turnOff();
		r1.setVolume(99);
		
		Searchable s1 = new SmartTelevision();
		s1.search("abc");
		
		
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
