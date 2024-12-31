package designprinciples.openclosed;

public class SaveToFile implements SaveInvoice {
	Invoice invoice; // Composition (has - a relationship)

	public SaveToFile(Invoice invoice) {
		// Constructor Injection
		this.invoice = invoice;
	}

	@Override
	public void save() {
		System.out.println("Saved to File");
	}
}
