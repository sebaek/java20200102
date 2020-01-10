package chapter07.polymophism.section773;

public class AppEx1 {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.setPowerButton(new PowerButton());
		phone.setVolumeButton(new VolumeButton());
		
		phone.pushPowerButton();
		phone.pushVolumeButton();
	}
}
