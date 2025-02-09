package sample;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileLoadApp {

    public static void main(String[] args) {
        loadFile("./data/sample.txt");

        try {
            loadFile2("./data/sample.txt");
        } catch (IOException e) {
            System.out.println("ファイルエラー");
        } finally {
            System.out.println("ファイル読み込み処理を終了します");
        }
    }

    public static void loadFile(String path) {
        try {
            FileInputStream file = new FileInputStream(path);
            InputStreamReader reader = new InputStreamReader(file, "UTF-8");

            System.out.println("ファイルを開きました");

            BufferedReader buffer = new BufferedReader(reader);
            String line;
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }
            buffer.close();
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが開けませんでした");
        } catch (IOException e) {
            System.out.println("データエラー");
        }
    }

    public static void loadFile2(String path) throws IOException {
        FileReader reader = new FileReader(path);
        System.out.println("ファイルを読み込みました");

        BufferedReader buffer = new BufferedReader(reader);
        String line;
        while ((line = buffer.readLine()) != null) {
            System.out.println(line);
        }
        buffer.close();
        reader.close();
    }

}
