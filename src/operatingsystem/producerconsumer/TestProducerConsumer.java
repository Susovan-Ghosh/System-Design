package operatingsystem.producerconsumer;

public class TestProducerConsumer {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		new Producer(buffer);
		new Consumer(buffer);
	}

}
