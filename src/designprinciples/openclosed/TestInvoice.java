package designprinciples.openclosed;

public class TestInvoice {

	public static void main(String[] args) {
		Invoice invoice = new Invoice(2, 150);
		SaveInvoice saveInvoice = new SaveToDB(invoice);
		saveInvoice.save();
		saveInvoice = new SaveToFile(invoice);
		saveInvoice.save();
		new PrintInvoice(invoice).printInvoice();
	}

}
