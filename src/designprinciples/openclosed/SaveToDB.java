package designprinciples.openclosed;

public class SaveToDB implements SaveInvoice {
	Invoice invoice; // Composition (has - a relationship)

	public SaveToDB(Invoice invoice) {
		// Constructor Injection
		this.invoice = invoice;
	}

	@Override
	public void save() {
		System.out.println("Saved to DB");
	}
}
