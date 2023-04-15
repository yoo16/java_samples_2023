package sample;

import java.util.Scanner;

public class CalculateSaving {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("預金額（円）：");
        float money = scanner.nextFloat();

        System.out.print("目標額（円）：");
        float target = scanner.nextFloat();

        System.out.print("金利（%）：");
        float interestRate = scanner.nextFloat() / 100.0f;

        int year = 0;
        while (money < target) {
            money *= (1 + interestRate);
            year++;
        }
        String message = year + "年後に" + money + "円になります。";
        System.out.println(message); 
    }

}
