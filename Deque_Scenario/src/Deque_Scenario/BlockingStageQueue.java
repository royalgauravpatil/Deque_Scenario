package Deque_Scenario;



import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;


public class BlockingStageQueue {
	private final BlockingDeque<Item> queue;

	
	public BlockingStageQueue() {
		this.queue = new LinkedBlockingDeque<>();
	}

	public void addItem(Item item) throws InterruptedException {
		queue.put(item);
	}

	public Item pollItem() throws InterruptedException {
		return queue.take();
	}

	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
}