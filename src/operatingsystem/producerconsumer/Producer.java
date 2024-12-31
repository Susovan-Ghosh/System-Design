package operatingsystem.producerconsumer;

public class Producer implements Runnable {
	Buffer buffer;

	Producer(Buffer buffer) {
		this.buffer = buffer;
		new Thread(this, "Producer").start();
	}

	@Override
	public void run() {
		for (int item = 0; item < 5; item++) {
			buffer.put(item);
		}
	}

}
