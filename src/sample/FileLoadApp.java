package sample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
            FileReader reader = new FileReader(path);
            System.out.println("ファイルを読み込みました");

            BufferedReader buffer = new BufferedReader(reader);
            String line;
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }
            buffer.close();
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが存在しませんでした");
        } catch (IOException e) {
            System.out.println("ファイルエラー");
        } finally {
            System.out.println("ファイル読み込み処理を終了します");
        }
    }

    public static void loadFile2(String path) throws IOException  {
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
