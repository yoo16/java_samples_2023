package cafe;

public class EnumApp {

    public static void main(String[] args) {
        Drink drink1 = new Drink("コーヒー", 350, Size.SMALL);
        Drink drink2 = new Drink("コーヒー", 400, Size.MEDIUM);
        Drink drink3 = new Drink("コーヒー", 450, Size.LARGE);

        System.out.println(drink1.size.getValue());
        System.out.println(drink2.size.getValue());
        System.out.println(drink3.size.getValue());

        System.out.println(Size.SMALL);
        System.out.println(Size.MEDIUM);
        System.out.println(Size.LARGE);

        String sizeString = "medium";
        String key = sizeString.toUpperCase();
        Size size = Size.valueOf(key);
        System.out.println(size);
    }
}
