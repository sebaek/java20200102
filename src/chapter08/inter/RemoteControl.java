package chapter08.inter;

public interface RemoteControl {
	public final static int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
