package sample;

import java.util.Random;
import java.util.Scanner;

public class RspGame {
    final static int ROCK = 0;
    final static int SCISSORS = 1;
    final static int PAPER = 2;
    final static String[] HANDS = { "グー", "チョキ", "パー" };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = "";
        String playerHandLabel;
        String pcHandLabel;
        while (true) {
            System.out.print("じゃんけんの手を入力してください（0:グー, 1:チョキ, 2:パー）：");
            int playerHand = scanner.nextInt();

            if (playerHand < 0 || playerHand > 2) {
                System.out.println("不正な入力です。0から2の整数を入力してください。");
                continue;
            }

            Random random = new Random();
            int pcHand = random.nextInt(3);

            playerHandLabel = HANDS[playerHand];
            pcHandLabel = HANDS[pcHand];

            int result = (playerHand - pcHand + 3) % 3;
            if (result == 0) {
                message = "Draw!";
                System.out.println(message);
            } else if (result == 1) {
                message = "You lose...";
                break;
            } else {
                message = "You win!";
                break;
            }
        }
        System.out.println(message);
        System.out.println("Player: " + playerHandLabel);
        System.out.println("PC: " + pcHandLabel);
        scanner.close();
    }

}
