package designprinciples.singleresponsibility;

public class SaveInvoice {
	Invoice invoice; // Composition (has - a relationship)

	public SaveInvoice(Invoice invoice) {
		// Constructor Injection
		this.invoice = invoice;
	}

	void saveToDB() {
		System.out.println("Saved to DB");
	}
}
