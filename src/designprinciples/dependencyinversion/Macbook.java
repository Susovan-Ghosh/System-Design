package designprinciples.dependencyinversion;

public class Macbook {
	IKeyboard keyboard; // Composition (has - a relationship)

	public Macbook(IKeyboard keyboard) {
		// Constructor Injection
		this.keyboard = keyboard;
	}

	void type() {
		keyboard.type();
	}
}
