package Deque_Scenario;

import java.util.concurrent.ConcurrentLinkedDeque;


public class ConcurrentStageQueue {
	private final ConcurrentLinkedDeque<Item> queue;

	public ConcurrentStageQueue() {
		this.queue = new ConcurrentLinkedDeque<>();
	}
	public void addItem(Item item) {
		queue.add(item);
	}
	public Item pollItem() {
		return queue.poll();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}
}
