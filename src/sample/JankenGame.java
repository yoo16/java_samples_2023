package sample;

import java.util.Random;
import java.util.Scanner;

public class JankenGame {
    final static int ROCK = 0;
    final static int SCISSORS = 1;
    final static int PAPER = 2;
    final static String[] HANDS = { "グー", "チョキ", "パー" };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = "";

        while (true) {
            System.out.print("じゃんけんの手を入力してください（0:グー, 1:チョキ, 2:パー）：");
            int playerHand = scanner.nextInt();

            if (playerHand < 0 || playerHand > 2) {
                System.out.println("不正な入力です。0から2の整数を入力してください。");
                continue;
            }

            Random random = new Random();
            int pcHand = random.nextInt(3);

            System.out.println("あなたの手：" + handToString(playerHand));
            System.out.println("コンピュータの手：" + handToString(pcHand));

            int result = (playerHand - pcHand + 3) % 3;
            if (result == 0) {
                message = "あいこです！";
            } else if (result == 1) {
                message = "あなたの勝ちです！";
                break;
            } else {
                message = "コンピュータの勝ちです。！";
                break;
            }
        }
        System.out.println(message);
        scanner.close();
    }

    private static String handToString(int hand) {
        return (hand >= 0 && hand <= 2) ? HANDS[hand] : ""; 
    }
}
