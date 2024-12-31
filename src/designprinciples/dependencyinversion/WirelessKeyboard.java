package designprinciples.dependencyinversion;

public class WirelessKeyboard implements IKeyboard {

	@Override
	public void type() {
		System.out.println("Wireless Keyboard is typing..");
	}

}
