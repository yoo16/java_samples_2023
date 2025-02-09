package thread;

public class OrderThread extends Thread {

    private Item item;

    //Constructor
    OrderThread(Item item) {
        this.item = item;
    }
    
    @Override
    public void run() {
        item.order();
    }
}