package rpg;

import rpg.item.Item;
import rpg.item.ItemList;

public class ItemApp {
    
    public static void main(String[] args) {
        ItemList itemList = new ItemList();
        Item selectItem;

        selectItem = itemList.list.get(0);
        System.out.println(selectItem.getName());

        selectItem = itemList.map.get(3l);
        System.out.println(selectItem.getName());

    }
}
