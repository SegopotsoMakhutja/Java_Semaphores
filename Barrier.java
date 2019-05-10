import java.util.concurrent.Semaphore;

public class Barrier {
	// add missing variables
	Semaphore mutex, barrier;
	int size, count;

	Barrier(int n) {
		// add constructor
		this.size = n;
		count = 0;
		this.mutex = new Semaphore(1); 		// provides access to 1 thread at a time
		this.barrier = new Semaphore(0); 	// barrier is locked until threads arrive
	}
	
	public void b_wait() throws InterruptedException{
		// this is the only additional method you will need to complete
		mutex.acquire();
		count++;
		mutex.release();

		if(count == size)
		{
			// release all threads that have arrived
			barrier.release(size);
			count = 0;
		}
		barrier.acquire();
		barrier.release();
	}

}
