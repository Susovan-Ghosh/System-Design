package designprinciples.dependencyinversion;

public class WiredKeyboard implements IKeyboard {

	@Override
	public void type() {
		System.out.println("Wired Keyboard is typing..");
	}

}
