package rpg.item;

public enum ItemType {
    WEAPON("weapon"), 
    ARMOR("armor"),
    SHIELD("shield");

    private String value;

    private ItemType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ItemType getByValue(String value) {
        for (ItemType itemType : ItemType.values()) {
            if (itemType.getValue().equals(value)) {
                return itemType;
            }
        }
        return null;
    }
}