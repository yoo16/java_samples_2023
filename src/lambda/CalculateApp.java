package lambda;

public class CalculateApp {

    public static void main(String[] args) {
        // ICalculate calculate = new ICalculate() {
        //     @Override
        //     public Integer calculateWithoutTaxPrice(Integer price) {
        //         Float totalPrice = price / 1.1f;
        //         return totalPrice.intValue();
        //     }
        // };
        ICalculate calculate = (price) -> {
            Float totalPrice = price / 1.1f;
            return totalPrice.intValue();
        };
        Integer price = calculate.calculateWithoutTaxPrice(1000);
        System.out.println(price);
    }

}
