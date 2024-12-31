package designprinciples.openclosed;

public class PrintInvoice {
	Invoice invoice; // Composition (has - a relationship)

	public PrintInvoice(Invoice invoice) {
		// Constructor Injection
		this.invoice = invoice;
	}

	void printInvoice() {
		System.out.println("Total: " + invoice.getTotal());
	}
}
