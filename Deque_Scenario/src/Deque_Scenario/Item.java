package Deque_Scenario;


public class Item {
    private final int itemId;
    private int stage;
    private final int priority;
    private final String description;

 
    public Item(int itemId, int stage, int priority, String description) {
        this.itemId = itemId;
        this.stage = stage;
        this.priority = priority;
        this.description = description;
    }

    public int getItemId() {
        return itemId;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }
}