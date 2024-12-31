package operatingsystem.producerconsumer;

public class Consumer implements Runnable {
	Buffer buffer;

	Consumer(Buffer buffer) {
		this.buffer = buffer;
		new Thread(this, "Consumer").start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			buffer.get();
		}
	}

}
