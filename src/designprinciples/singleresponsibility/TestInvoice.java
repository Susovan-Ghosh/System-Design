package designprinciples.singleresponsibility;

public class TestInvoice {

	public static void main(String[] args) {
		Invoice invoice = new Invoice(2, 150);
		new SaveInvoice(invoice).saveToDB();
		new PrintInvoice(invoice).printInvoice();
	}

}
