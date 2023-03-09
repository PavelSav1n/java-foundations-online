package ru.itsjava.homeWork.iostreams;

import java.io.*;
import java.util.ArrayList;

public class IOStreamsHomeWork {
    public static void main(String[] args) {
        ArrayList<String> file1Array = new ArrayList<>();
        ArrayList<String> file2Array = new ArrayList<>();

        File file1 = new File("src/main/resources/IOStreamHomeworkFile1.txt");
        File file2 = new File("src/main/resources/IOStreamHomeworkFile2.txt");

        // Переменная для вызова readLine() и записи в ArrayList
        String input;

        // Копируем file1 в file1Array
        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            for (int i = 0; (input = reader.readLine()) != null; i++) {
                file1Array.add(i, input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Копируем file2 в file2Array
        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
            for (int i = 0; (input = reader.readLine()) != null; i++) {
                file2Array.add(i, input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Копируем file2Array в file1
        try (PrintWriter printWriter = new PrintWriter(file1)){
            for (int i = 0; i < file2Array.size(); i++) {
                printWriter.println(file2Array.get(i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Копируем file1Array в file2
        try (PrintWriter printWriter = new PrintWriter(file2)){
            for (int i = 0; i < file1Array.size(); i++) {
                printWriter.println(file1Array.get(i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("file1Array = " + file1Array);
        System.out.println("file2Array = " + file2Array);

    }
}
