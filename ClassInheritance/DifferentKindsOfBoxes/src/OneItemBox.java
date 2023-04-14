import java.util.ArrayList;

public class OneItemBox extends Box {

    private int capacity;

    Item itemArr[];

    public OneItemBox() {
        this.capacity = 1;
    }

    @Override
    public void add(Item item) {
        if(this.itemArr == null){
            this.itemArr = new Item[1];
            this.itemArr[0] = item;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if(this.itemArr[0].equals(item)){
            return true;
        }
        return false;
    }
}
