package operatingsystem.producerconsumer;

import java.util.concurrent.Semaphore;

public class Buffer {
	int item;
	static Semaphore producerSemaphore;
	static Semaphore consumerSemaphore;

	static {
		producerSemaphore = new Semaphore(1);
		consumerSemaphore = new Semaphore(0);
	}

	void put(int item) {
		// Producer uses this function
		try {
			producerSemaphore.acquire();
		} catch (Exception e) {
			System.out.println("Exception while acquiring lock by the Producer : " + e.getMessage());
		}
		this.item = item;
		System.out.println(item + " has been produced by the Producer");
		consumerSemaphore.release();
	}

	void get() {
		// Consumer uses this function
		try {
			consumerSemaphore.acquire();
		} catch (Exception e) {
			System.out.println("Exception while acquiring lock by the Consumer : " + e.getMessage());
		}
		System.out.println(item + " has been consumed by the Consumer");
		producerSemaphore.release();
	}
}
