import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{

    ArrayList<Item> items;

    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int itemWeight = item.getWeight();
        if(this.capacity >= itemWeight){
            this.items.add(item);
        }
        this.capacity -= itemWeight;
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
