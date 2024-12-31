package designprinciples.dependencyinversion;

public class TestMacbook {

	public static void main(String[] args) {
		Macbook macbookWithWiredKeyboard = new Macbook(new WiredKeyboard());
		Macbook macbookWithWirelessKeyboard = new Macbook(new WirelessKeyboard());
		macbookWithWiredKeyboard.type();
		macbookWithWirelessKeyboard.type();
	}

}
