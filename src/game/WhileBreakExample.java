package game;

import java.util.Scanner;

public class WhileBreakExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("数値を入力してください（0を入力すると終了します）：");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
        }
        System.out.println("入力された数値の合計は " + sum + " です。");
        scanner.close();
    }
}