package Deque_Scenario;
import java.util.ArrayDeque;


public class SimpleStageQueue {
	private final ArrayDeque<Item> queue;

	
	public SimpleStageQueue() {
		this.queue = new ArrayDeque<>();
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
