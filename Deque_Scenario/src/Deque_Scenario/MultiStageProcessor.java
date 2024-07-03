package Deque_Scenario;


import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;



public class MultiStageProcessor {
	private final BlockingStageQueue[] stages;
	private final ExecutorService executor;

	
	public MultiStageProcessor(int stageCount) {
		stages = new BlockingStageQueue[stageCount];
		for (int i = 0; i < stageCount; i++) {
			stages[i] = new BlockingStageQueue();
		}
		executor = Executors.newFixedThreadPool(stageCount);
	}

	
	public void addItem(Item item) throws InterruptedException {
		stages[0].addItem(item);
	}


	public void startProcessing() {
		for (int i = 0; i < stages.length; i++) {
			final int stageIndex = i;
			executor.submit(() -> processStage(stageIndex));
		}
	}

	private void processStage(int stageIndex) {
		try {
			while (true) {
				Item item = stages[stageIndex].pollItem();
				System.out.println("item Processing :- " + item.getItemId() + " stage :- " + stageIndex);
				if (stageIndex < stages.length - 1) {
					item.setStage(stageIndex + 1);
					stages[stageIndex + 1].addItem(item);
				}
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	
	public void shutdown() {
		executor.shutdownNow();
	}
}