package rpg;

import rpg.item.Item;

public class EquipApp {
    
    public static void main(String[] args) {
        Wizard wizard1 = new Wizard("アリス");
        Item weapon = new Item("ブロンズナイフ", 300, 5, 0);
        Item armor = new Item("ブロンズアーマー", 400, 0, 6);

        System.out.println("--- before ---");
        System.out.println(wizard1.attackPower);
        System.out.println(wizard1.defencePower);

        wizard1.equip(weapon);
        wizard1.equip(armor);

        System.out.println("--- after ---");
        System.out.println(wizard1.attackPower);
        System.out.println(wizard1.defencePower);
    }
}
