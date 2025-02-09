package thread;

import java.util.ArrayList;

public class OrderApp {
    
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("コーヒー"));
        items.add(new Item("紅茶"));
        items.add(new Item("ほうじ茶"));

        //通常の foreach
        System.out.println("--- normal ---");
        for (Item item : items) {
            OrderThread thread = new OrderThread(item);
            thread.start();
        }

        // ラムダ式
        System.out.println("--- lambda ---");
        items.forEach(item -> {
            OrderThread thread = new OrderThread(item);
            thread.start();
        });
    }

}