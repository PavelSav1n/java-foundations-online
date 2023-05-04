package ru.itsjava.experiments.voenmeh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TableConstructor {
    public static void main(String[] args) {
        File file = new File("src/main/resources/table.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null) {
//                // ENGLISH version EDITORS
//                String first = input.split(",", 2)[0];
//                String second = input.split(",", 2)[1];
//                System.out.println("<tr><td><strong>" + first + "</strong></td><td>" + second.trim() + "</td></tr>");

//                // RUSSIAN version редколлегия
//                String first = input.split(" ", 4)[0];
//                String second = input.split(" ", 4)[1];
//                String third = input.split(" ", 4)[2];
//                String text = input.split(" ", 4)[3].trim();
//
//                System.out.println("<tr><td><strong>" + first + " " + second + " " + third + "</strong></td><td>" + text + "</td></tr>");

//                //RU ver -- редакционный совет
//                String first = input.split(" ", 4)[0];
//                String second = input.split(" ", 4)[1];
//                String third = input.split(" ", 4)[2];
//                String text = input.split(" ", 4)[3].trim();
//
//                System.out.println("<tr><td><strong>" + first + " " + second + " " + third + "</strong></td><td>" + text + "</td></tr>");

                //EN ver -- Editorial Board
                String first = input.split(" ", 3)[0];
                String second = input.split(" ", 3)[1];
                String text = input.split(" ", 3)[2].trim();

                System.out.println("<tr><td><strong>" + first + " " + second + "</strong></td><td>" + text + "</td></tr>");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
