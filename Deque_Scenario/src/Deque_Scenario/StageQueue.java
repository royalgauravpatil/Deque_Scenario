package Deque_Scenario;

import java.util.Deque;
import java.util.LinkedList;


public class StageQueue {
	private final Deque<Item> queue;

	
	public StageQueue() {
		this.queue = new LinkedList<>();
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

