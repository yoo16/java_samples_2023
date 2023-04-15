package sample;

import java.util.Scanner;

public class CalculateSubject {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("国語の点数を入力してください: ");
    int japanese = sc.nextInt();

    System.out.print("数学の点数を入力してください: ");
    int math = sc.nextInt();

    System.out.print("理科の点数を入力してください: ");
    int science = sc.nextInt();

    System.out.print("社会の点数を入力してください: ");
    int socialStudies = sc.nextInt();

    double average = (japanese + math + science + socialStudies) / 4.0;
    System.out.println("全体の平均点は" + average + "です。");

    sc.close();
  }
}