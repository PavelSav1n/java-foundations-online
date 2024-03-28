package ru.itsjava.iostreams;

import java.io.*;

public class IOStreamsPractice {
    public static void main(String[] args) {

//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//
//        try {
//            String input = console.readLine();
//            System.out.println("Ваш input = " + input);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                console.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        //                       в () скобках пишем поток, который будет закрыт при выходе из try/catch
        // try with resources -> try (...){}


        // BufferedReader наследуется от Closeable, который в свою очередь наследуется от AutoCloseable
        // Поэтому после try/catch стрим будет автоматически закрыт:
//        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
//            String input = console.readLine();
//            System.out.println("Ваш input = " + input);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //P.S.
        // От try/catch стараются отказаться, потому что много букав.
        // Можно throws наверх

        // Работа с файлами:
        File file = new File("src/main/resources/file.txt");

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.println("Row 1");
            printWriter.println("Row 2");
            printWriter.println("Row 3");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null) {
                System.out.println("bufferedReader.readLine() = " + input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        BufferedInputStream bufferedInputStream = new BufferedInputStream(System.in);
    }
}
